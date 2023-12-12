import java.util.Scanner;

public class CalcPosNegArr {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        PositiveNegativeArray pos_neg_Operation = new PositiveNegativeArray();
        System.out.println("Enter size of an array: ");
        n = sc.nextInt();
        int array[] = new int[n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            System.out.println("Enter elements in array: This is no. " + count);
            array[i] = sc.nextInt();

        }
        sc.close();
        pos_neg_Operation.additionOfPosNeg(array);

    }
}
