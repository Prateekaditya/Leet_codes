class Solution {
    public String baseNeg2(int n) {
        if(n==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            int rem=n%-2;
            int quo=n/-2;
            if(rem<0){
                rem+=2;
                quo+=1;
            }
            sb.append(rem);
            n=quo;
        }
        return sb.reverse().toString();
    }
}