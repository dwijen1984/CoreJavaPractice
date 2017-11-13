package hackerRank;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRank {

    public int[] solve(int[] grades){
        // Complete this function
        int[] finalGrades = new int[grades.length]; int size = grades.length;
        int column = 0;
        for(int grade :grades){
            if(grade < 38){
                finalGrades[column] = grade;
                column++;
            }else{
                if(grade%5 >2){
                    grade+=(5 - grade%5);
                    finalGrades[column] = grade;
                    column++;
                }else{
                    finalGrades[column] = grade;
                    column++;
                }
            }
        }

        return finalGrades;
    }

    @Test
    public void test(){
        int[] scores = {28, 35, 49, 57, 99, 100};
        int[] result = solve(scores);
        System.out.println(Arrays.toString(result));

    }
}
