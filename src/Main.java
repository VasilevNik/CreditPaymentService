public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1_000_000;
        int creditTerm = 1;
        double percent = 9.99;
        int creditPayment1 = service.calculate(creditAmount, creditTerm, percent);
        System.out.println("Ежемесячный платёж - " + creditPayment1 + " руб.");

        creditTerm = 2;
        creditPayment1 = service.calculate(creditAmount, creditTerm, percent);
        System.out.println("Ежемесячный платёж - " + creditPayment1 + " руб.");

        creditTerm = 3;
        creditPayment1 = service.calculate(creditAmount, creditTerm, percent);
        System.out.println("Ежемесячный платёж - " + creditPayment1 + " руб.");

    }
}