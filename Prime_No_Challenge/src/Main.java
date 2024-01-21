import com.sun.source.tree.BreakTree;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
                if (count == 3) { // this will break after found out first 3 prime numbers between 10 and 50
                    System.out.println("Found 3 exiting for loop");
                    break; // this will break after found out first 3 prime numbers between 10 and 50
                }
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is " + count);
    }

    public static boolean isPrime(int wholenumber) {
        if (wholenumber <= 2) {
            return (wholenumber == 2);
        }
        for (int divisor = 2; divisor <= wholenumber / 2; divisor++) {
            if (wholenumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}