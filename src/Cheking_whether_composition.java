//Problem 3
public class Cheking_whether_composition {
    public static String checkPrime(int n) {
        if (n <= 1) {
            return "Composite";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(7));  // "Prime"
        System.out.println(checkPrime(10)); // "Composite"
    }
}
//returns the number after determining whether it is prime or composite.