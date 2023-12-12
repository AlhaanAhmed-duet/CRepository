import java.util.Scanner;
public class LinearSearchExam {
    public static void main(String args[]) {
        LinearSearchClass linear_search = new LinearSearchClass();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element: no. " + (i+1));
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the desired Number you want to find :");
        int find = sc.nextInt();
        linear_search.detectNumber(array, find);
        sc.close();
    }
}
