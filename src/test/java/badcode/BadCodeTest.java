package badcode;

import static org.junit.jupiter.api.Assertions.*;

class BadCodeTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void printSumAndAverage() {
        int array[] = {2, 3, 4};
        int sum = 9;
        int average = 3;

        BadCode bc = new BadCode();
        SumAverage sumAverage = bc.getSumAndAverage(array);
        
        assertEquals(sumAverage.getSum(), sum);
        assertEquals(sumAverage.getAverage(), average);

    }
}
