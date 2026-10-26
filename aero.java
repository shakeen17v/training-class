import java.util.Scanner;
public class aero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n=");
        int n=sc.nextInt();
        int mark[]=new int[n];
        int sum;
        for(int i =0; i<mark.length; i++){
            System.out.println("enter "+i+" index");
            mark[i]=sc.nextInt();      
        }
        sum=0;
        for(int i =0; i<mark.length; i++){
            sum+=mark[i];   
        }
        System.out.println("sum =" +sum);
   
    }
}
