import java.util.*;

public class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];

        // Initialize adjacency list
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Build graph and indegree array
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }

        // colorCount[i][c] is max count of color c at node i
        int[][] colorCount = new int[n][26];

        Queue<Integer> queue = new LinkedList<>();
        
        // Add nodes with zero indegree
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        int visited = 0;
        int maxColorValue = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            visited++;

            // Convert character to index (0-25)
            int colorIndex = colors.charAt(node) - 'a';

            // Increase count of current color for this node
            colorCount[node][colorIndex]++;
            maxColorValue = Math.max(maxColorValue, colorCount[node][colorIndex]);

            // Visit all neighbors
            for (int neighbor : graph.get(node)) {
                // Update neighbor’s colorCount
                for (int c = 0; c < 26; c++) {
                    colorCount[neighbor][c] = Math.max(colorCount[neighbor][c], colorCount[node][c]);
                }

                // Reduce indegree
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If not all nodes visited → cycle
        return visited == n ? maxColorValue : -1;
    }
}
