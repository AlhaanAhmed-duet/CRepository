import java.util.*;
public class CompareStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1;
        String text2;
        System.out.println("Enter text 1:");
        text1 = sc.nextLine();
        System.out.println("Enter text 2");
        text2 = sc.nextLine();
        System.out.println(text1);
        System.out.println(text2);
        System.out.println("There are two strings above");
        boolean cond = text1.equals(text2);
        if (cond == true) {
            System.out.println("The strings are equal");
        }
        else {
            System.err.println("Not equal");
        }
    }
}
