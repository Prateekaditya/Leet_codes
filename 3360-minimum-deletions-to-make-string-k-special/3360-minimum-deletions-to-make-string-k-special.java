class Solution {
    public int minimumDeletions(String word, int k) {
        // Step 1: Count frequency of each character
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Step 2: Collect all non-zero frequencies
        List<Integer> frequencies = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) {
                frequencies.add(f);
            }
        }
        
        // Step 3: Try every possible minimum frequency (L)
        int minDeletions = Integer.MAX_VALUE;
        
        for (int L : frequencies) {
            int deletions = 0;
            
            // Step 4: Calculate deletions for current L
            for (int currentFreq : frequencies) {
                if (currentFreq < L) {
                    // Delete all occurrences of this character
                    deletions += currentFreq;
                } else if (currentFreq > L + k) {
                    // Delete excess to bring it down to L + k
                    deletions += currentFreq - (L + k);
                }
                // If L <= currentFreq <= L + k, no deletion needed
            }
            
            minDeletions = Math.min(minDeletions, deletions);
        }
        
        return minDeletions;
    }
}
