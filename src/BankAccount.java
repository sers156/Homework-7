public class BankAccount {

    double balanc = 1000;

    void popolnenieScheta(double summaPopolnenie){
        System.out.println("Баланс до пополнения:" + balanc);
        System.out.println("Баланс пополнится на:" + summaPopolnenie);
        balanc+=summaPopolnenie;
        System.out.println("Баланс после пополнения:" + balanc);
    }

    void snyatieSoscheta(double summaSnyatie){
        System.out.println("Баланс до снятия:" + balanc);
        System.out.println("С баланса снимется:" + summaSnyatie);
        balanc-=summaSnyatie;
        System.out.println("Баланс после снятия:" + balanc);

    }
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyBalac= new BankAccount();
        MyBalac.popolnenieScheta(80);
        MyBalac.snyatieSoscheta(50);

    }
}

