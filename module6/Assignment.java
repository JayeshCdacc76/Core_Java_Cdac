package module6;

public class Assignment {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int max = a[0]; 
        int sum = 0;

        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        
        for (int i : a) {
            sum += i;
        }

       
        double avg = (double) sum / a.length;

  
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);
    }
}
