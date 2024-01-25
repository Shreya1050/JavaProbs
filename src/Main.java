import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The second smallest element in array is:"+secondSmallest(arr));

    }
    public static int secondSmallest(int[] arr){
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MIN_VALUE;
        if(arr.length<2){
            return -1;
        }
        for(int element: arr){
            if(element<small){
                secondSmall=small;
                small=element;
            }
            else if(element<secondSmall && small!=element) {
                secondSmall = element;
            }
        }
        if(secondSmall<=small){
            return -1;
        }
        return secondSmall;

    }
}