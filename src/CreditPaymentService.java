public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm, double percent) {
        int a = 12 * creditTerm; // количество месяцев
        double b = percent / 12 / 100; // сумма процента в месяц
        double c = Math.pow((1 + b), a);
        double result = creditAmount * (b + (b / (c - 1)));
        return (int) result;

    }
}
