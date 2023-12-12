import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Using linear search algortihm

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = scan.nextInt();
        int count = 0;
        int nums[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter elements of an array: ");
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the desired number you want: ");
        int desNum = scan.nextInt();

        // Now using the linear search algorithm
        for (int j = 0; j < nums.length; j++) {


        if (desNum == nums[j]) {
            count++;
            System.out.println("But here! It's available in " + (j + 1) + "th location");
            break;
        }
        
        }



        scan.close();
    }
}
