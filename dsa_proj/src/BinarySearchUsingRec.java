public class BinarySearchUsingRec {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int ans=sort(arr,60,0,arr.length-1);
        System.out.println(ans);
    }

    public static int sort(int[] arr,int target,int s,int e){
        int mid = s + (e-s) / 2;

        while(s<=e) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return sort(arr, target, s, mid - 1);
            } else if (arr[mid] < target) {
                return sort(arr, target, mid + 1, e);
            }
        }
        return -1;
    }

}
