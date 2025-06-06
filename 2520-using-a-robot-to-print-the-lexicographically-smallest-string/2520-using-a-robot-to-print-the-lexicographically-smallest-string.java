class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        
        // Step 1: Precompute minimum character from each position to end
        char[] minSuffix = new char[n];
        minSuffix[n-1] = s.charAt(n-1);
        
        for (int i = n-2; i >= 0; i--) {
            minSuffix[i] = (char) Math.min(s.charAt(i), minSuffix[i+1]);
        }
        
        // Step 2: Process string using stack simulation
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();  // Robot's string 't'
        int i = 0;  // Pointer for string 's'
        
        while (i < n || !stack.isEmpty()) {
            // Write from stack if:
            // 1. No more characters in s, OR
            // 2. Top of stack <= minimum remaining character in s
            while (!stack.isEmpty() && (i >= n || stack.peek() <= minSuffix[i])) {
                result.append(stack.pop());
            }
            
            // Take character from s to stack (if available)
            if (i < n) {
                stack.push(s.charAt(i));
                i++;
            }
        }
        
        return result.toString();
    }
}
