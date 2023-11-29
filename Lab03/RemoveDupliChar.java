// This lab work is not done using chatgpt but by using logics and tutorials on youtube or website docs

import java.util.Scanner;
public class RemoveDupliChar {
    public static void main(String[] args) {
        String text;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string with duplicate characters: ");
        text = scan.nextLine();

        System.out.println("Your string : " + text);
        int count = 0;
        char chars[] = text.toCharArray();

        char charNew[] = new char[256];
        char temp[] = new char[10];
        for (int i = 0; i < text.length() - 1; i++) {
            if (chars[i] == chars[i+1]) {
                System.out.println("Duplicate characters are : " + chars[i]);
                count++;
                // Swap the character into another array ;)
                temp[i] = chars[i];
                chars[i] = charNew[i];
                charNew[i] = temp[i];
                // Break the loop :)
                break;
               
            }
        
        }
            System.out.print("Corrected Text Version : ");
            for (int j = 0; j < text.length(); j++) {
             System.out.print(chars[j]);
            }
            System.out.println("\n");
      
        scan.close();
    }
}
