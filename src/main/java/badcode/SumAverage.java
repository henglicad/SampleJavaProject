package badcode;


public class SumAverage {
    private Integer sum;
    private Integer average;

    SumAverage(Integer sum, Integer average) {
        this.sum = sum;
        this.average = average;
    }

    public Integer getAverage() {
        return average;
    }

    public Integer getSum() {
        return sum;
    }
}
