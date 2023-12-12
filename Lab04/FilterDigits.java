public class FilterDigits {
    public void filter_digits(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even digit is :" + arr[i]);
            }
            if (arr[i] % 2 != 0) {
                System.out.println("Odd digits is: " + arr[i]);
            }
        }
    }
}
