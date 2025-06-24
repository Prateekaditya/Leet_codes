class Solution {
    public String[] divideString(String s, int k, char fill) {
       int tg= (s.length()+k-1)/k;
       String []res = new String[tg];
       for(int i=0;i<tg;i++){
        int si=i*k;
        int end=Math.min(si+k,s.length());
        String group = s.substring(si,end);
        if(group.length()<k){
            StringBuilder sb=new StringBuilder(group);
            while(sb.length()<k){
                sb.append(fill);
            }
            group=sb.toString();
        }
        res[i]=group;
       }
       return res;
    }
}
