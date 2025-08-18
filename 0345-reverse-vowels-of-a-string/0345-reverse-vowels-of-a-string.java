class Solution {
    public String reverseVowels(String s) {
        char []c=s.toCharArray();
        int start=0;
        int last=c.length-1;
        while(start<last){
            if(!isVowel(c[start])){
                start++;
            }
            else if(!isVowel(c[last])){
                last--; 
            }
            else{
              char temp=c[start];
                c[start]=c[last];
                c[last]=temp;
                start++;
                last--;  
            }
        }
        return String.valueOf(c);
    }
    private static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}