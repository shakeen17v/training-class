public class aero2 {
    public static void main(String[] args) {
        int arr[] = {7, 8, 15, 17, 91};
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println(sorted);
    }
}           
        