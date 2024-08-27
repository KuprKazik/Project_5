public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(1.68, 58);
        System.out.println(index);
    }
}
