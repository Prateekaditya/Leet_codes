class Solution {
    static final int MAX_CHAR=26;
    static String getHash(String s){
        StringBuilder hash=new StringBuilder();
        int []freq= new int[MAX_CHAR];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<MAX_CHAR;i++){
            hash.append(freq[i]);
            hash.append("$");
        }
        return hash.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,Integer> map =new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String key=getHash(strs[i]);
            if(!map.containsKey(key)){
                map.put(key,res.size());
                res.add(new ArrayList<>());
            }
            res.get(map.get(key)).add(strs[i]);
        }
        return res;
    }
}