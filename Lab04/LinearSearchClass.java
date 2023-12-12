public class LinearSearchClass {
    public void detectNumber(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("The Number is found at location no." + (i + 1));
                break;
            }
            else {
                System.out.println("Not found! at location no." + (i+1));
                
            }
        }
        
    }
}
