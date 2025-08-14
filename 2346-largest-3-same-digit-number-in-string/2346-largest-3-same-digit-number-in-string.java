class Solution {
    public String largestGoodInteger(String num) {
        String maxGood= "";
        int count =1;
        for(int i=1;i<num.length();i++){
            if(num.charAt(i)==num.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            if(count==3){
                String store = "" + num.charAt(i) + num.charAt(i) + num.charAt(i);
                if(maxGood.equals("") || store.compareTo(maxGood)>0){
                    maxGood=store;
                } // store is bigger the maxGood this check
            }
        }
        return maxGood;
    }
}