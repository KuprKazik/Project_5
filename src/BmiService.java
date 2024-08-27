public class BmiService {

    public int calculate(double metres, double kg) {
        double index = kg / (metres * metres);
        int bmi = (int) index;

        return bmi;
    }
}
