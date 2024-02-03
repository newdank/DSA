import java.util.Scanner;

public class SmallestNoInArray {
    public static void main(String[] args) {
        System.out.println("Enter the row size.");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[] arr = new int[row];
        System.out.println("Enter the array elements : ");
        for (int i =0; i<arr.length;i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Smallest number is : "+min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ans>arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
