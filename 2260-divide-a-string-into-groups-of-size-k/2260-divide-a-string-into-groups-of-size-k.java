class Solution {
    public String[] divideString(String s, int k, char fill) {
        // Calculate how many groups we need
        int totalGroups = (s.length() + k - 1) / k;
        
        // Create result array to store all groups
        String[] result = new String[totalGroups];
        
        // Process each group
        for (int i = 0; i < totalGroups; i++) {
            // Calculate start index for current group
            int startIndex = i * k;
            
            // Calculate end index for current group
            int endIndex = Math.min(startIndex + k, s.length());
            
            // Extract substring for current group
            String group = s.substring(startIndex, endIndex);
            
            // If this is the last group and it's incomplete, add fill characters
            if (group.length() < k) {
                StringBuilder sb = new StringBuilder(group);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                group = sb.toString();
            }
            
            // Store the group in result array
            result[i] = group;
        }
        
        return result;
    }
}
