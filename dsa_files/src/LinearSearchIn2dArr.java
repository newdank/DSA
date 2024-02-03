import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2dArr {
    public static void main(String[] args) {
        System.out.println("Enter the row size.");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter the column size");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        System.out.println("Enter the value to search in the array");
//        int target = sc.nextInt();
//       int answer = isTrue(arr, target);

//        int ans = search(arr,50);
        System.out.println(Arrays.toString(search(arr, 20)));
    }

    //    static int search(int[][] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (target == arr[i][j]) {
//                    return new int[][]{i,j};
//                }
//            }
//        }
//        return -1;
//    }
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}