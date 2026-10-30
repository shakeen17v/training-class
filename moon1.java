public class moon1{
    public static void main(String[] args) {
        String s="Hello World";
        int vowel=0;
        int cons=0;
        String str=s.toLowerCase();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a'&& c<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowel++;

                }
                else{
                    cons++;
                }
            }
            
        }
        System.err.println("vowel:"+vowel);
        System.err.println("cons:"+cons);
        
    }

}
