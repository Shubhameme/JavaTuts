public class Main {
    public static void main(String[] args) {

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestamount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestamount); // example 01
        }

        for (double i = 7.5; i <= 10; i += 0.25) { // example 02
            double interestamount = calculateInterest(100.00, i); // this will show you the  different intrest rates on 100$
            if (interestamount > 8.5) {
                break; // this break statement will stop when the intrest value is 8.5 by using this break statement
            }

            System.out.println("100$.00 " + i + "% interest = $" + interestamount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}