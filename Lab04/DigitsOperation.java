import java.util.Scanner;
public class DigitsOperation {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            FilterDigits filDigits = new FilterDigits();
            int count = 0;
            int nums[] = new int[10];
            System.out.println("Note: The size of array is 10");
            for (int i = 0; i < nums.length; i++) {
                
                count++;
                System.out.println("Enter digit no" + count + " : ");
                nums[i] = sc.nextInt();
            }
            filDigits.filter_digits(nums);
            sc.close();
        }
}
