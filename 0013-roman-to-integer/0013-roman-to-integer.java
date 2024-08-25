class Solution {
    public int romanToInt(String s) {
        int n= s.length();
        if(s==null && s.length()==0){
            return 0;
        }
          int ans= 0;
          int prev = getValue(s.charAt(0));
        for(int i=1;i<n; i++){
            int curr= getValue(s.charAt(i));
            if(prev<curr){
                ans-=prev;
            }
            else{
                ans+=prev;
            }
            prev= curr;
        }
        ans+=prev;
        return ans;
    }
     private int getValue(char romanChar) {
     switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
           default:throw new IllegalArgumentException("Invalid Roman numeral: " + romanChar);
     }
     }   
}
       