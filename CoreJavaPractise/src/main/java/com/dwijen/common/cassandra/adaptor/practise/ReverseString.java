package com.dwijen.common.cassandra.adaptor.practise;

import java.util.Arrays;

/**
 * Created by dkirtan on 6/27/17.
 */
public class ReverseString {

    public static void main(String[] args){
        System.out.print(reverse("a a"));
        //System.out.print(reverseString("."));
    }
    public static String reverse(String input){

            int input_length = input.length() -1;
            //char[]  reverse= new char[input.length()];

        char[]  reverse = input.toCharArray();
            for(int i =0; i<reverse.length/2; i++){
                char tmp = reverse[i];
                reverse[i]= reverse[input_length - i];
                reverse[input_length - i]= tmp;
                if((reverse.length%2) != 0){
                    reverse[input.length()/2]=reverse[input.length()/2];
                }
            }
            return new String(reverse);

    }

    public static String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }

}
