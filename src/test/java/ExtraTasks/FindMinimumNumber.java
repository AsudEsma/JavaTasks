package ExtraTasks;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] numbeers={12,25,26,2,36,78,5};
        System.out.println(minNumber(numbeers));

    }
    public static int minNumber(int[] n){
        int num= Integer.MAX_VALUE;

        for (int each : n) {
            if(each<num)
                num=each;
        }

        return num;
    }
}
