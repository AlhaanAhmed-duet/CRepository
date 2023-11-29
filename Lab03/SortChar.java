import java.util.Arrays;
public class SortChar {
    public static void main(String args[]) {

        String string = "Computer";
        char charArray[] = string.toCharArray();
        System.out.println(string + " just a normal string");
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }

        }
        String newtext = Arrays.toString(charArray);
        System.out.print(newtext + " in alphabetical (sorted) order");
        System.out.println();

    }
}
