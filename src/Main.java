public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж: 1 год ");
        System.out.println(service.calculate(12)); // 1 год

        System.out.println();
        System.out.println("Ежемесячный платеж: 2 года ");
        System.out.println(service.calculate(24)); // 2 года

        System.out.println();
        System.out.println("Ежемесячный платеж: 3 года ");
        System.out.println(service.calculate(36)); // 3 года

    }
}