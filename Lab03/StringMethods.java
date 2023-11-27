package Lab03;


public class StringMethods {
    public static void main(String args[]) {
       String text = "Cristiano Ronaldo";

       int textLength = text.length() - 1;

       System.out.println("The Original Text is : " + text);
       for (int i = textLength; i >= 0; i-- ) {
            char reverseText = text.charAt(i);
            System.out.print(reverseText);
       } 
        System.out.println("\nThis is the reverse of a string ");

        
    }

}