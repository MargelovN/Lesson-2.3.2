public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 75.0;
        double height = 1.79;
        double bmi = service.calculate(bodyWeight, height);
        System.out.printf("Индекс массы тела: %.1f", + bmi);
    }
}