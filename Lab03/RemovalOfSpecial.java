

public class RemovalOfSpecial {
    public static void main(String args[]) {
        String someText = "Hello!This@is*some#text";

        String textReplacement = someText.replaceAll("[^a-zA-Z-0-9]", " ");

        System.out.println("Original Text :" + someText);
        System.out.println("Text with Special Characters Removed: " + textReplacement);

        



    }



}