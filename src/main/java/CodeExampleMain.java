import badcode.BadCode;
import badcode.SumAverage;

public class CodeExampleMain {

    public static void main(String argv[]) {
        // Some testing data
        int array[] = {1, 2, 3};

        BadCode bc = new BadCode();
        SumAverage sumAverage = bc.getSumAndAverage(array);

        
        System.out.println("Sum: " + sumAverage.getSum());
        System.out.println("Average: " + sumAverage.getAverage());
    }
}
