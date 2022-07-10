public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.75;
        double mass = 85;
        double index = service.calculate(mass, height);
        System.out.println(index);
    }
}
