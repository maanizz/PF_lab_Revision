public class SecretAgentEncryption {

    public static int encryptNumber(int n) {
        int result = 0;
        int multiplier = 1;

        while (n > 0) {
            int digit = n % 10;
            int square = digit * digit;


            int temp = square;
            int tempMultiplier = 1;

            while (temp > 0) {
                int d = temp % 10;
                result = result * 10 + d;
                temp /= 10;
                tempMultiplier *= 10;
            }

            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int input = 675;
        int encrypted = encryptNumber(input);
        System.out.println("Encrypted code: " + encrypted);
    }
}
