public class BankAccount {
    double getInterestrate() {
        return 0.05;
    }
}

class Savingaccount extends BankAccount {
    @Override
    public double getInterestrate() {
        return 0.01;
    }
}

class dk {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Savingaccount s = new Savingaccount();

        System.out.println("Bank Account Interest Rate: " + b.getInterestrate());
        System.out.println("Saving Account Interest Rate: " + s.getInterestrate());
    }
}
