package badcode;

public class BadCode {

    // Print the average and the sum of an array of integers
    public int PRINTsumandAVERAGE(int x[]) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        if (x.length != 0){
            average = sum / x.length;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        return 0;
    }
}
