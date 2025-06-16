
public class Solution {
    public int maxDiff(int num) {
       String numStr = String.valueOf(num);
       Set<Character> st =new HashSet<>();
       int maxVal=num;
       int minVal=num;
       for(char ch :numStr.toCharArray()){
        st.add(ch);
       }
       for(char dg :st ){
        for(char i='0';i<='9';i++){
            if(numStr.charAt(0)==dg && i=='0'){ continue;}
            String newStr=numStr.replace(dg,i);
            int newNum = Integer.parseInt(newStr);
            maxVal=Math.max(maxVal,newNum);
            minVal=Math.min(minVal,newNum);
        }
       }
       return maxVal-minVal;

    }
}