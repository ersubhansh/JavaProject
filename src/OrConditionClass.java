public class OrConditionClass {
    public static void main (String[] args) {
        double account_balance = 900000.84;
        int age = 55;
        if (account_balance >= 1000000 || age >= 65) {
            System.out.println("You can retire");
        }else {
            System.out.println("You Still need to save money for retirement.");
        }

    }
}
