class LastWordLength {
    public int lengthOfLastWord(String s) {
        int count=0;
       boolean counting=false;
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' '){
            count++;
            
            counting=true;
        }else if (counting){
            break;
        }
       }
       return count;
    }
}
