public class moon2 {
    public static void main(String[] args) {
        String a = "amma";
        a = a.toLowerCase();
        int j=a.length() - 1;

        boolean out = true;

        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);

            if (c == a.charAt(j - i)) {
                out = true;
            } else {
                out = false;
                break;
            }
        }

        System.out.println(out);
    }
}
