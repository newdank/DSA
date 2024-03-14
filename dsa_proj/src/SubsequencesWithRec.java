import java.util.ArrayList;

public class SubsequencesWithRec {
    public static void main(String[] args) {
        String yeh = "abc";
//        subseq("",yeh);
        ArrayList<String> list = new ArrayList<>();
        list = subseqret("",yeh);
        System.out.println(list);
    }

    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    public static ArrayList<String> subseqret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();s
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqret(p+ch,up.substring(1));
        ArrayList<String> right = subseqret(p,up.substring(1));
        left.addAll(right);
        return left;
    }


}
