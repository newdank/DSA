import java.util.Arrays;
import java.util.Scanner;

public class SwapArr {
    public static void main(String[] args) {
        System.out.println("Enter rows : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[] arr = new int[row];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array elements are : ");
        for(int a : arr){
            System.out.println(a);
        }
        System.out.println("===============");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//        swap (arr);
//        swap1(arr,1,2);
    }
    static void swap(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 index value you want to swap with");
        int index1= sc.nextInt();
        int index2= sc.nextInt();
        System.out.println("After swapping the array at index "+index1+" and "+index2+" The array is : ");

        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println(Arrays.toString(arr));
    }
    static void swap1(int[] arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap1(arr, start, end);
            start++;
            end--;
        }
    }
}
