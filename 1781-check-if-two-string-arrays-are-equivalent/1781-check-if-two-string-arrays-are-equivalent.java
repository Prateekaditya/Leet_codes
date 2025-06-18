class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String word:word1){
            s1.append(word);
        }
        for(String word:word2){
            s2.append(word);
        }
        String str1 = s1.toString();
        String str2 = s2.toString();
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}