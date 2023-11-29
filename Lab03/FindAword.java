import java.util.*;
public class FindAword {
    public static void main(String[] args) {
        String str = "Cristiano Ronaldo is the best footballer and always perform in FIFA Worldcups";
        Scanner sc = new Scanner(System.in);
        String findStr;
        System.out.println("Here is some text: ");
        System.out.println(str);
        System.out.print("Enter the word you want to find here: ");
        findStr = sc.nextLine();
        boolean cond = str.contains(findStr);
        if (cond == true) {
            System.out.println("String found: " + findStr + " at " + str.indexOf(findStr));
        }
        else {
            System.err.println("String Not Found !");
        }
        sc.close();
        }
    }

