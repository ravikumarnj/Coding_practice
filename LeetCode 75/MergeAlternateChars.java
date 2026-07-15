class MergeAlternateChars{
    public static void main(String[] args) {
        String word1 = "ape";
        String word2  = "pl";

        String result = mergeAlternate(word1,word2);

        System.out.println(result);
    }

    static String mergeAlternate(String word1,String word2){
        StringBuffer sb = new StringBuffer();

        int one = 0;
        int two = 0;
        
        while(one<word1.length()|| two<word2.length()){
            if(one!=word1.length()){
                sb.append(word1.charAt(one++));
            }
            if(two!=word2.length()){
                sb.append(word2.charAt(two++));
            }
        }

        return new String(sb);
    }
    
}