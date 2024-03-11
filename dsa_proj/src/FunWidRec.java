public class FunWidRec {
    public static void main(String[] args) {
//        System.out.println(rev(1234));
//        System.out.println(palen(7070722));
//        System.out.println(zeroCount(100900900));
        System.out.println(stepCheck(51));

    }


    public static int rev(int n){
        int digits = (int) Math.log10(n)+1;
        return helperRev(n,digits);
    }

    public static int helperRev(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1)) + helperRev(n/10,digits-1);
    }

    public static boolean palen(int n){
        return n==rev(n);
    }

    public static int zeroCount(int n){
        return helperCount(n,0);
    }

    public static int helperCount(int n,int count){
        if(n==0)
            return count;

        int rem = n%10;
        if(rem==0){
            return helperCount(n/10,count+1);
        }
        return helperCount(n/10,count);
  }

    public static int stepCheck(int n){
        return helperStepCount(n,0);
    }

    public static int helperStepCount(int n,int steps){
        if(n==0)
            return steps;

        if(n%2 == 0)
            return helperStepCount(n/2,steps+1);
        else
            return helperStepCount(n-1,steps+1);
        }
    }

