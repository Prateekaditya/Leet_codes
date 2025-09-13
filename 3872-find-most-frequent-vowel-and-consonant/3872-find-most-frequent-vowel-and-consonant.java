class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxC=0;
        int maxV=0;
        for(char k:map.keySet()){
           if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u'){
            maxV=Math.max(maxV,map.get(k));
           }
           else{
            maxC=Math.max(maxC,map.get(k));
           } 
        }
        return maxV+maxC;
    }
}