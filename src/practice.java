public class practice {
    public static void main(String[] args) {
    int zahl = 3;
    double zahl2 = 56_773.4567;
    boolean wahrOderFalsch = true;
    char Buchstabe = 'r';
    String Wort = "Carina";

        System.out.println(zahl +" "+zahl2+" "+wahrOderFalsch+" "+Buchstabe+" "+Wort);

        int a = 9;
        int b = 4;
        int addResult = add(a, b);
        printResult(addResult);
        int subtractResult = subtract(a, b);
        printResult(subtractResult);
        int multiplyResult = mulitply(a, b);
        printResult(multiplyResult);
        int divideResult = divide(a, b);
        printResult(divideResult);
        int moduloResult = modulo(a, b);
        printResult(moduloResult);
    }

    public static int add(int a, int b) {
        int erg;
        erg = a + b;
        return erg;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int mulitply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        if (b !=0) {
            return a / b;
        }
        return 0;
    }
    public static int modulo( int a, int mod) {
        return a % mod;
    }
    public static void printResult(int result) {
        System.out.println("The result is: " + result);

    }
}
