public class Main {
    public static void main(String[] args) {
        int massKg = 98;
        double heightMeter = 1.87;
        BmiService service = new BmiService();
        int bmi = service.calculate(massKg, heightMeter);
        System.out.println("Индекс массы тела: " + bmi);
    }
}