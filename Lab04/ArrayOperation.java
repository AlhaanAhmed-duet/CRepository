public class ArrayOperation {
    public void greaterElement(int arr[]) {
        int max = arr[0];
        int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Largest Value: " + max);
            System.out.println("Smallest Value: " + min);

        }
        

    }

