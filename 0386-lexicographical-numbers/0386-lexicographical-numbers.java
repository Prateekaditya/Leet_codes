class Solution {
   public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        int current = 1;
        
        for (int i = 0; i < n; i++) {
            result.add(current);
            
            if (current * 10 <= n) {
                current *= 10;  // Go deeper (1 -> 10, 10 -> 100)
            } else {
                if (current >= n) {
                    current /= 10;  // Move back up if current exceeds n
                }
                current++;
                while (current % 10 == 0) {
                    current /= 10;  // Remove trailing zeros
                }
            }
        }
        return result;
    }
}