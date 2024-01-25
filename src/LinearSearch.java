import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        int pos=linearSearch(arr,target);
        if(pos>=0){
            System.out.println(target+" found at position "+pos);
        }
        else{
            System.out.println(target+" not found");
        }

    }
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
