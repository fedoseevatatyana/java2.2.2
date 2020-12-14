public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60.3;
        double height = 1.8;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}