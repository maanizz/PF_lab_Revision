public class TwinPrimes {
    
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Twin primes less than 1000:");

        for (int i = 2; i < 1000 - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.print("(" + i + ", " + (i + 2) + ") ");
            }
        }
    }
}
