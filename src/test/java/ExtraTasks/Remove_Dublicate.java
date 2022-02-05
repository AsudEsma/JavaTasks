package ExtraTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Dublicate {
    public static void main(String[] args) {

        int [] arr={1,1,2,2,3,4,5,6,6,7,7,8,9};

        System.out.println(Arrays.toString(removeDublicate(arr)));

    }

     /*
    Write a function that can remove the duplicates from an array of integers
     */

    public static int [] removeDublicate (int [] array){

        ArrayList<Integer> list=new ArrayList<>();
        for (Integer each : array) {
            if(!list.contains(each)){
                list.add(each);
            }
        }

        int [] arr= new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
           arr[i]=list.get(i);
        }

        return arr;

    }
}
