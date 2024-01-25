import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target=sc.nextInt();
        sortedArr(arr);
        System.out.println("Pairs are:"+sumPair(arr,target));
    }
    public static void sortedArr(int[] arr){
        int n=arr.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static List<List<Integer>> sumPair(int[] arr,int target){
        List<List<Integer>> list=new ArrayList<>();
        int i=0,j=arr.length-1;
        int sum;
        while(i<j){
            sum=arr[i]+arr[j];
            if(sum==target){
                List<Integer> Pair=new ArrayList<>(2);
                Pair.add(arr[i]);
                Pair.add(arr[j]);
                list.add(Pair);
                i++;
                j--;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return list;
    }
}
