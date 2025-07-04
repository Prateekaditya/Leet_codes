class Solution {
    public char kthCharacter(long k, int[] operations) {
        int shift = 0; // Keep track of how many times we've shifted the alphabet
        long len = 1;  // The current length of the "word" (starts with just "a")

        // Loop through the operations to find the operation where word gets K or more
        for (int i = 0; i < operations.length; i++) {
            len *= 2; // Each operation doubles the length
            if (len >= k) {
                // If the length is now big enough to contain the kth character...

                // Start going backwards through the operations
                for (int j = i; j >= 0; j--) {
                    long half = len / 2; // Length of the word *before* this operation
                    if (k > half) { // Is the kth character in the *second* half?
                        k -= half;      // Shift k so it references index within this second half
                        if (operations[j] == 1) shift++; // Shift the alphabet +1 if k came from shifted alphabet
                    }
                     //Otherwise the character is in the first half

                    len /= 2; // go back to half length
                }
                break; // Break: K < len, we went as deep as we had to go
            }
        }

        // Calculate result: Applying the total shift from 'a' and use modulo.
        return (char) ((shift % 26) + 'a');
    }
}