public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println("getReverse(str) = " + getReverse(str));

    }

    public static String getReverse(String str){ //Hello World

        String temp = "";

        for(int i=str.length()-1; i>=0; i--){

            temp += str.toCharArray()[i];

        }

        return temp;
    }
}
