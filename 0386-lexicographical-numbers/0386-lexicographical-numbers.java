public class Solution 
{
    public List<Integer> lexicalOrder(int n) 
    {
        // Step 1: Create priority queue with custom comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> String.valueOf(a).compareTo(String.valueOf(b)));

        // Step 2: Insert numbers 1 to n using their string form for comparison
        for (int i = 1; i <= n; i++) 
        {
            pq.offer(i);
        }

        // Step 3: Prepare result list
        List<Integer> result = new ArrayList<>();

        // Step 4: Poll from priority queue to get lexicographically sorted numbers
        while (!pq.isEmpty()) 
        {
            result.add(pq.poll());
        }

        // Step 5: Return the result
        return result;
    }
}