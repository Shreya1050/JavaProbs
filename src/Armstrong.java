import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n=sc.nextInt();
        if(checkArmstrong(n)){
            System.out.println(n+" is Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
    }
    public static boolean checkArmstrong(int n){
        int temp=n,r;
        int sum=0;
        while(temp>0){
            r=temp%10;
            temp/=10;
            sum=sum + r*r*r;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
//comment
