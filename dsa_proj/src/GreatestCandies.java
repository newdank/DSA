import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
//        List<Boolean> list = new ArrayList<>();
        List<Boolean> ans = kidsWithCandies(candies,3);
        for(boolean value : ans){
            System.out.println(value);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i = 0 ; i < candies.length;i++){
            if(candies[i]+extraCandies>=candies.length){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }

}
