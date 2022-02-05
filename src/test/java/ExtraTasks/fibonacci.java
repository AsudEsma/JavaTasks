package ExtraTasks;

public class fibonacci {
// 1,1,2,3,5,8,13,21
    public static void main(String[] args) {

        System.out.println(fibonacci(2));


    }
    public static int fibonacci(int num){

        int sum = 0;
        int first = 0;
        int second = 1;

        for(int i = 1; i<num; i++){

            sum = first+second;
            first = second;
            second = sum;
        }

        return sum;
    }
}
