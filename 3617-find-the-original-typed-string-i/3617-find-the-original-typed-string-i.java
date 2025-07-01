class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        if (n == 0) return 0;
        int count = 1;
        int runLength = 1;
        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                runLength++;
            } else {
                if (runLength >= 2) {
                    count += runLength - 1;
                }
                runLength = 1;
            }
        }
        if (runLength >= 2) {
            count += runLength - 1;
        }
        return count;
    }
}
