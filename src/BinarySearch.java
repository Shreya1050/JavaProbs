import java.util.Scanner;

public class BinarySearch {
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
        SumPairs.sortedArr(arr);
        int pos=binSearch(arr,target);
        if(pos>=0){
            System.out.println(target+" found at position "+pos);
        }
        else{
            System.out.println(target+" not found");
        }
    }

    public static int binSearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
