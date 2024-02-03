import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        System.out.println("Enter the row size.");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[] arr = new int[row];
        System.out.println("Enter the array elements : ");
        for (int i =0; i<arr.length;i++) {
            arr[i] = sc.nextInt();

        }
//        System.out.println("Enter the target element of array to be searched.");
//        int target = sc.nextInt();
//       int answer = isTrue(arr, target);
//        System.out.println(answer);
        int answer = returnWithRange(arr,30,2,4);
        System.out.println(answer);

    }

    public static int isTrue(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Invalid");
        }

        for (int i = 0; i < arr.length; i++) {
                if (target == arr[i]) {
                    System.out.println("Target : " + " found at index " + i);
                    return target;
                }
        }
        return -1;
    }
    public static int returnValue(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return target;
            }
        }
        return -1;
    }
    public static int returnWithRange(int[] arr, int target,int start, int end){
//        start=0;
//        end = arr.length-1;
        for(int i = start;i<=end;i++){
            if(target==arr[i])
                return i;
        }
        return -1;
    }
}

