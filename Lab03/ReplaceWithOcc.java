public class ReplaceWithOcc {
    public static void main(String args[]) {
        String sentence = "The ice cream is so awesome!";
        String str = sentence.replaceAll("is",  "was");
        System.out.println("The sentence : " + sentence);
        System.out.println("The sentence with a change: " + str);
    }
}
