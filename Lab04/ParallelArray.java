public class ParallelArray {
    public void parallel_array_operation(int a[], int b[], int n) {
        int c[] = new int[n];
        for (int i = 0; i < c.length; i++) {
                c[i] = a[i] + b[i]; 
                System.out.print(c[i] + ",");
            
                
        }
        System.out.println("is the addition of two parallel arrays: ");    
        }
        
    }

