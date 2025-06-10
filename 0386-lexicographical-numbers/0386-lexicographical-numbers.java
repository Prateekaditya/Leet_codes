class Solution {
    public List<Integer> lexicalOrder(int n) {
    List<Integer> res = new ArrayList<>();
    int current =1;
    for(int i=0;i<n;i++){
        res.add(current);
        if(current *10 <=n){
            current*=10;
        }
        else{
            if(current >=n){
                current /=10;
            }
            current++;
            while(current %10==0){
                current /=10;
            }
        }
    }
    return res;
    }
}