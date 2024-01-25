import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        fibonacci(num);
    }
    public static void fibonacci(int n){
        int t1=0;
        int t2=1;
        int f=t1+t2;
        while(f<=n){
            System.out.print(f+" ");
            t1=t2;
            t2=f;
            f=t1+t2;
        }
    }
}
