class Solution {
    public long kMirror(int k, int n) {
        int count=0;
        long sum=0;
        int length=1;
        while(count<n){
            long start = (long) Math.pow(10,(length-1)/2);
            long end = (long) Math.pow(10,(length+1)/2);
            for(long i=start ;i<end && count<n ;i++){
                long palindrome =generatePalindrome(i,length%2==0);
                if(isPalindromeInBaseK(palindrome,k)){
                    sum+=palindrome;
                    count++;
                }
            }
            length++;
        }
        return sum;
    }
    private long generatePalindrome(long root,boolean evenLength){
        String rootStr= String.valueOf(root);
        StringBuilder sb= new StringBuilder(rootStr);
        if(evenLength){
            sb.append(new StringBuilder(rootStr).reverse());
        }
        else{
            sb.append(new StringBuilder(rootStr.substring(0,rootStr.length()-1)).reverse());
        }
        return Long.parseLong(sb.toString());
    }
    private boolean isPalindromeInBaseK(long num,int k){
        String sr = convertTobaseK(num,k);
        return isPlaindrome(sr);
    }
    private String convertTobaseK(long num,int k){
        if(num==0){
            return "0";
        }
        StringBuilder sb= new StringBuilder();
        while(num>0){
            sb.append(num%k);
            num/=k;
        }
        return sb.reverse().toString();
    }
    private boolean isPlaindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
