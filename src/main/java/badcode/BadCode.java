package badcode;

public class BadCode {

    // Print the average and the sum of an array of integers
    public SumAverage getSumAndAverage(int x[]) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        average = sum / x.length;

        return new SumAverage(sum, average);
    }
}
