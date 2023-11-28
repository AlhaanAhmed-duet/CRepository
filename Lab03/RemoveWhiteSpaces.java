public class RemoveWhiteSpaces {
    public static void main(String args[]) {

        String someTextField = "Hello This is a String!";
        String textWithRemovedSpaces = someTextField.replaceAll(" ", "");

        System.out.println("String with Spaces: " + someTextField);
        System.out.println("Without White Spaces: " + textWithRemovedSpaces);


    }


}