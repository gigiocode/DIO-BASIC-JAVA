public class ATM {

    public static void main(String[] args) {
        double balance = 25.0;
        double withdrawal = 26.0;

        if (withdrawal < balance) {
            balance -= withdrawal;
            System.out.println("Withdrawal of U$ " + withdrawal + " concluded. New balance = U$ " + balance + " .");
        } else if (balance == withdrawal) {
            balance -= withdrawal;
            System.out.println("Withdrawal of U$ " + withdrawal + " concluded. CAREFUL, your balance is " + balance + " .");
        } else
            System.out.println("No credit for withdrawal ... Your balance is $ " + balance);
    }
}
