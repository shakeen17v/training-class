public class moon3{
    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        boolean r = true;
        int[] a = new int[26];

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            a[t.charAt(i) - 'a']--;
        }

        

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                r = false;
                
                break;
            }
        }

        System.out.println(r);
    }
}
