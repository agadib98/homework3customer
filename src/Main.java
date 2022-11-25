import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        customer c = new customer(123234, "adib", 1223557, 4354545, 200000);

        for (;true;) {
            System.out.println(" press 1  to deposit");
            System.out.println(" press 2  to Withdraw");
            int a = s.nextInt();

            if (a == 1) {
                System.out.println("enter the amount");
                double b = s.nextInt();
                c.DepositMoney(b);
                c.ApplyForLoan();
                c.RequestCard();


            } else if (a == 2) {
                System.out.println("enter the amount");
                double b = s.nextInt();
                c.WithdrawMoney(b);
                c.ApplyForLoan();
                c.RequestCard();

            } else
                System.out.println("plase enter only 1 or 2");

        }
    }
}