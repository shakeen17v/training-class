public class aero1 {
    public static void main(String[] args) {
        int arr[] = {7, 8, 15, 17, 91, 51};
        int min = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                second = min;
                min = arr[i];
            } else if (second == min || arr[i] < second) {
                if (arr[i] > min) {
                    second = arr[i];
                }
            }
        }

        System.out.println("min=" + min);
        System.out.println("sec min=" + second);
        int sum=0;
        for(int j:arr){
            sum+=j;
            
        }
        System.out.println(+sum);
    }
    
    
}