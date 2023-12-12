import java.util.Scanner;
public class ArrayMain {
    public static void main(String args[]) {
        int array[] = new int[5];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayOperation arrOp = new ArrayOperation();
        for (int i = 0; i < array.length; i++) {
            count++;
            System.out.println("Enter elements: " + count + "th");
            array[i] = scanner.nextInt();
        }
        arrOp.greaterElement(array);


        scanner.close();
    }
}