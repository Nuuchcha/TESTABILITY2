public class BmiService {
    public int calculate(int massKg, double heightMeter) {
        double bmi =  massKg / (Math.pow(heightMeter, 2));
        return (int) bmi;
    }
}
