import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        int[] arr = new int[row];

        System.out.println("Enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for( int a : arr){
//            System.out.println("arr is : ");
            System.out.println(a);
        }
        System.out.println("--------------");

        System.out.println(Arrays.toString(arr));
        System.out.println(" The max value of this is : ");
//        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,4));

    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr,int start,int end){
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


}
