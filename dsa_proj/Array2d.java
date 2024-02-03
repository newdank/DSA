import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Array2d {
    public static void main(String[] args) {
        System.out.println("Enter rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];

        //taking input into the array

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //for printing out the array

//        for(int i=0;i<arr.length;i++){
//            System.out.print("[ ");
//            for(int j=0;j<arr.length;j++){
//                System.out.print(+arr[i][j] + " ");
//
//
//            }
//            System.out.print("]");
//            System.out.println();
//
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
