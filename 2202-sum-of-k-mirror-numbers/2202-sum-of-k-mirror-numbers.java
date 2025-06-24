class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int length = 1;
        
        // Generate palindromes by length until we find n k-mirror numbers
        while (count < n) {
            // Generate all palindromes of current length
            long start = (long) Math.pow(10, (length - 1) / 2);
            long end = (long) Math.pow(10, (length + 1) / 2);
            
            for (long i = start; i < end && count < n; i++) {
                long palindrome = generatePalindrome(i, length % 2 == 0);
                
                if (isPalindromeInBaseK(palindrome, k)) {
                    sum += palindrome;
                    count++;
                }
            }
            length++;
        }
        
        return sum;
    }
    
    // Generate palindrome from a given number
    private long generatePalindrome(long root, boolean evenLength) {
        String rootStr = String.valueOf(root);
        StringBuilder sb = new StringBuilder(rootStr);
        
        if (evenLength) {
            // For even length, mirror the entire root
            sb.append(new StringBuilder(rootStr).reverse());
        } else {
            // For odd length, mirror all except the last digit
            sb.append(new StringBuilder(rootStr.substring(0, rootStr.length() - 1)).reverse());
        }
        
        return Long.parseLong(sb.toString());
    }
    
    // Check if number is palindrome in base k
    private boolean isPalindromeInBaseK(long num, int k) {
        String baseKRepresentation = convertToBaseK(num, k);
        return isPalindrome(baseKRepresentation);
    }
    
    // Convert number to base k representation
    private String convertToBaseK(long num, int k) {
        if (num == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % k);
            num /= k;
        }
        
        return sb.reverse().toString();
    }
    
    // Check if string is palindrome
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
