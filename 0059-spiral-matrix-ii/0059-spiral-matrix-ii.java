class Solution {
    public int[][] generateMatrix(int n) {
       int [][] ans = new int [n][n];
       int sR=0;
       int sC=0;
       int eR=ans.length-1;
       int eC=ans[0].length-1;
       int value=1;
       while(sR<=eR && sC <= eC){
        for(int j=sC ;j<=eC;j++){
            ans[sR][j]=value;
            value++;
        }
        for(int i=sR+1 ;i<=eR;i++){
            ans[i][eC]=value;
            value++;
        }
        for(int j=eC-1 ;j>=sC;j--){
            if(sR==eR){
                break;
            }
            ans[eR][j]=value;
            value++;
        }
        for(int i=eR-1 ;i>sR;i--){
            if(sC==eC){
                break;
            }
            ans[i][sC]=value;
            value++;
        }
        sR++;
        sC++;
        eR--;
        eC--;
       }
       return ans;
    }
}