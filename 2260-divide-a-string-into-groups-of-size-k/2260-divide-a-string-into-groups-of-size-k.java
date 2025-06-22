import java.util.*;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i += k) {
            StringBuilder chunk = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                if (j < n)
                    chunk.append(s.charAt(j));
                else
                    chunk.append(fill);
            }
            result.add(chunk.toString());
        }

        return result.toArray(new String[0]); 
    }
}