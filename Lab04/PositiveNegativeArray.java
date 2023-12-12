/* This is actually a class file for CalcPosNegArr program where it contains main method 
and this class file contains an method which receives an argument */

public class PositiveNegativeArray {
    int sumOfNeg;
    int sumOfPos;
    int countPos;
    int countNeg;
    public void additionOfPosNeg(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                sumOfNeg += arr[i];
                countPos++;
            }
            if (arr[i] >= 0) {
                sumOfPos += arr[i];
                countNeg++;
            }
    
            
        }
        System.out.println("Sum of positive numbers: " + sumOfNeg);
        System.out.println("Sum of negative numbers: " + sumOfPos);
        System.out.println("Average of Positive Numbers are : " + sumOfPos/countPos);
        System.out.println("Average of Negative Numbers are : " + sumOfNeg/countNeg);


    }
}
