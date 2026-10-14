import java.util.Scanner;
public class sample4 {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int day=sca.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("invalid");
        }
    }
    
}
