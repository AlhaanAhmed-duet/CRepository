import java.util.Scanner;
public class DupliNum {
    public static void main(String args[]) {
        String str;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Input your Text: ");
        str = scanf.next();
        System.out.println("Your Text: " + str);
        int count = 0;
        char charSet[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) { 
            for (int j = i + 1;j < str.length(); j++) {

                if (charSet[i] == charSet[j]) {
                    System.out.println("Duplicate characters are: " + charSet[j]);
                    count++;
                    // System.out.println(count);
                    break;

                }
            }
        }
    
      
        

        scanf.close();
    }
}
