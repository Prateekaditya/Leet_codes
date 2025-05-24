class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> store = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int size = words[i].length();
            String word =words[i];
            for(int j=0;j<size;j++){
                char ch = word.charAt(j);
                if(ch ==x){
                    store.add(i);
                    break ;
                }
            }
        }
        return store;
    }
}