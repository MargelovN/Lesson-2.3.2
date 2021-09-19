public class BmiService {
    public double calculate(double bodyWeight, double height) {
        return bodyWeight / (height * height);
    }
}