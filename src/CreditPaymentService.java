public class CreditPaymentService {
    double percent = 0.0999; // процентная ставка 9.99%
    int credit = 1_000_000; // сумма кредита

    public double calculate(int a) {
        double result;
        double monthRate = percent / a;
        double top = credit * monthRate ;
        double bottom = 1 - (1 / Math.pow(monthRate + 1, a));
        result = top / bottom;
        return result;
    }
}
