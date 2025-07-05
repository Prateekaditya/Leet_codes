class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
            int store=-1;

        for(int k:map.keySet()){
            if( k==map.get(k)){
                store=Math.max(store,k);
            }
        }
        return store;
    }
}