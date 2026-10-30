public class sun1 {
    public static void main(String[] args) {
        int a[] = {6,5,4,3,1,2,7,8,15};
        int out = 1;

        for (int i = 1; i <= a.length + 1; i++) {
            boolean found = false;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                out = i;
                break;
            }
        }

        System.out.println(out);
    }
}