package ExtraTasks;

import java.util.Locale;

public class String_Anagram {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */

    public static void main(String[] args) {

        String str1 = "abbd";
        String str2 = "bbac";

        System.out.println(isAnagram(str1, str2));

    }
    //str1 = abac;
    //str2 =caba; -> b =cba; -> b =cb -> b = c - b=""
    public static boolean isAnagram(String a, String b){

        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){
            return false;
        }else{
            for (int i = 0; i < a.length(); i++){
                if (b.indexOf(a.charAt(i)) == -1){
                    return false;
                }else {
                    b = b.replaceFirst(""+a.charAt(i), "");
                }
            }
        }

        return true;

    }



}
