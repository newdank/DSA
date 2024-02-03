public class GreatestLetter {
    public static void main(String[] args) {
    char[] letters = {'c','f','l','p','u','x'};
    char ans = greatestLetter(letters,'c');
        System.out.println(ans);
    }
    public static char greatestLetter(char[] letters,char target){
        int start = 0;
        int end= letters.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        if(target == letters[letters.length-1] || target > letters[letters.length-1])
            return letters[0];
//        return letters[start % letters.length];
        return letters[start];
    }
}
