import java.util.Scanner;

public class CropString {
    public String crop(String input, Integer k) {
        StringBuffer convStr = new StringBuffer();
        String[] str = input.split("");
        String newStr = "";
        for (int i = 0; i < str.length; i++) {
            convStr.append(str[i]);
        }
        if (convStr.length() <= k - 1) {
            newStr = convStr.toString().strip();
            System.out.println("inside thloop " + newStr);
        } else {
            for (int i = k; i >= 0; i--) {
                if (convStr.charAt(i) == ' ') {
                    newStr = input.substring(0, (i)).strip();
                    System.out.println("return string " + newStr);
                    break;
                }
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Scanner inInt = new Scanner(System.in);
        Integer inputInt = inInt.nextInt();
        CropString crop = new CropString();
        crop.crop(input, inputInt);
    }

}
