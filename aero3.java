
import java.util.Arrays;

public class aero3 {
    public static void main(String[] args) {
        int arr[] = {7, 8, 15, 17, 91};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
