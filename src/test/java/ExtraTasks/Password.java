package ExtraTasks;

public class Password {
    /*
  Write a function that can verify if a password is valid or not. requirements:
              1. Password MUST be at least have 6 characters and should not contain space
              2. PassWord should at least contain one upper case letter
              3. PassWord should at least contain one lowercase letter
              4. Password should at least contain one special characters
              5. Password should at least contain a digit
      if all requirements above are met, the method returns true, otherwise returns false
   */
    public static void main(String[] args) {
        String a= "Cybertek£1547";
        System.out.println(password(a));

    }

    public static boolean password(String str){
        boolean flag= true;
        int upper = 0;
        int lower = 0;
        int special = 0;
        int digit = 0;
        int space=0;

        if(str.length()<6 ) flag=false;

       for (int i=0; i< str.length();i++){

           if(Character.isUpperCase(str.charAt(i))){
               upper++;
           }
           if(Character.isWhitespace(str.charAt(i))){
               space++;
           }
           if(Character.isLowerCase(str.charAt(i))){
               lower++;
           }
           if(!Character.isLetterOrDigit(str.charAt(i))){
               special++;
           }
           if(Character.isDigit(str.charAt(i))){
               digit++;
           }
       }

       if(upper==0 | lower==0 | special==0 | digit==0 | space!=0){
           flag=false;
       }

        return flag;
    }
}
