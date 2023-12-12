import java.util.*;
public class NonRepeated {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.println("Enter text: ");
        text = sc.nextLine();
        System.out.println("Your text : " + text) ;
        boolean nonrepeat;
        for (int i = 0; i < text.length(); i++) {
            nonrepeat = true;
            for (int j = 0; j < text.length(); j++) {
                if (i != j && text.charAt(i) == text.charAt(j)) {
                    nonrepeat = false;
                    break;  
                }
               
            }
             if (nonrepeat) {
                    System.out.println("The first char non repeated is : " + text.charAt(i));
                    break;
                }

        }
        sc.close();
    }
}
