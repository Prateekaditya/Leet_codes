class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer ,Integer> map=new HashMap<>();
        for(int i=0;i<answers.length;i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int total=0;
        for(int k :map.keySet()){
            int count =map.get(k);
            int groupSize=k+1;
            int groups =(int) Math.ceil( (double) count/groupSize);
            total+= groups*groupSize;
        }
        return total;
    }
}