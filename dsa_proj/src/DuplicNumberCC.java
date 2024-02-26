public class DuplicNumberCC {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3,2};
        int ans = sort(arr);
        System.out.println(ans);
    }

    public static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        int digit = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return arr[j];
            }
//            else{
//                digit = -1;
//            }
        }
        return -1;

    }

    public static void swap (int[] arr, int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
