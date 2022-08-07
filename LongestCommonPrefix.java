import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

    public String longestPrefix(String[] arr1){
        Integer len = 0;
        String shWord = arr1[0];
        for(int i=1; i < arr1.length; i++){
          if(arr1[i].length()< shWord.length()){
              shWord = arr1[i];
              len = shWord.length();
              System.out.println("length "+len);
          }
        }
        for(int j=0; j < arr1.length; j++){
            while(arr1[j].indexOf(shWord)!=0){
                shWord = shWord.substring(0,shWord.length()-1);
                System.out.println("ele j "+arr1[j]+ " shWord "+shWord);
                System.out.println("indexof working for element of j "+arr1[j].indexOf(shWord));
                if (shWord.isEmpty()){
                    return "";
                }
            }
        }
        System.out.println("final shWord 2 "+shWord);
        return shWord;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputArr = input.split(" ");
        LongestCommonPrefix loPrefix = new LongestCommonPrefix();
        loPrefix.longestPrefix(inputArr);
    }
}
