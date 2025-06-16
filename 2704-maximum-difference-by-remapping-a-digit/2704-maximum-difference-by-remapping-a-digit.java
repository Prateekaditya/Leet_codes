class Solution {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        int maxVal=num;
        for(int i=0;i<numStr.length();i++){
            char digit =numStr.charAt(i);
            if(digit!='9'){
                String maxStr=numStr.replace(digit,'9');
                maxVal = Integer.parseInt(maxStr);
                break;
            }
        }
        char fd=numStr.charAt(0);
        String minStr=numStr.replace(fd,'0');
        int minVal = Integer.parseInt(minStr);
        return maxVal-minVal;
    }
}