class Solution {
    public int maxDifference(String s) {
        int n =s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(Character k:map.keySet()){
            if(map.get(k)%2==1){
                maxOdd = Math.max(maxOdd,map.get(k));
            }
            else{
                minEven =Math.min(minEven,map.get(k));
            }
        }
        return (maxOdd-minEven);
    }
}