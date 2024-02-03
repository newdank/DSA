import java.util.Scanner;
import java.util.Arrays;

public class Arrays1d {
    public static void main(String[] args) {
        System.out.println("rows : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[] arr1d = new int[rows];
        // input in the array
        System.out.println("enter the array elemtns : ");
        for(int i=0;i<arr1d.length;i++){
            arr1d[i]=sc.nextInt();
        }
        //output of the array
        System.out.println(Arrays.toString(arr1d));
    }
}
