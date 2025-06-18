class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int k:map.keySet()){
            set.add(map.get(k));
        }
        if(map.size()!=set.size()){
            return false;
        }
        return true;
    }
}