package ibkozin.java_dt.sandbox;

public class Primes {
    public static boolean isPrimeEven(int n){
        if (n % 2 == 0) return false;
        for (int i = 3; i < n; i += 2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeWhile(int n){
        int i = 2;
        while (i < n && n % i != 0){
            i++;
        }
        return i == n;
    }

    public static boolean isPrimeFastEven(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i < n / 2; i += 2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeFast(int n) {
        for (int i = 2; i < n / 2; i ++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i ++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeLong(long n) {
        for (long i = 2; i < n; i ++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeSqrtEven(int n){
        if (n % 2 == 0) return false;
        int m = (int)Math.sqrt(n);
        for ( int i = 3; i < m; i += 2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static boolean isPrimeSqrt(int n) {
        int m = (int)Math.sqrt(n);
        for (int i = 2; i < m; i ++){
            if (n % i == 0){
                return false;
            }
        }
        return true;

    }
}

