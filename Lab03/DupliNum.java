import java.util.Scanner;
public class DupliNum {
    public static void main(String args[]) {
        String str;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Input your Text: ");
        str = scanf.next();
        System.out.println("Your Text: " + str);
        int count = 0;
        char chars[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == chars[i+1]) {
                System.out.println("Duplicate character is : " + chars[i]);
                count++;
                break;
            }
        }
        scanf.close();
    }
}
