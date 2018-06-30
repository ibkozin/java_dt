package ibkozin.java_dt.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

    @Test (enabled = false)
    public void testPrimes(){
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }
    @Test
    public void testPrimesFast(){
        Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
    }
    @Test
    public void testPrimesFastEven(){
        Assert.assertTrue(Primes.isPrimeFastEven(Integer.MAX_VALUE));
    }


    @Test (enabled = false)
    public void testPrimeLong(){
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrimeLong(n));

    }

    @Test
    public void testNonPrimes(){
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE-2));

    }
    @Test
    public void testPrimeEven(){
        Assert.assertTrue(Primes.isPrimeEven(Integer.MAX_VALUE));
    }
    @Test
    public void isPrimeSqrtEven(){
        Assert.assertTrue(Primes.isPrimeSqrtEven(Integer.MAX_VALUE));
    }
    @Test
    public void isPrimeSqrt(){
        Assert.assertTrue(Primes.isPrimeSqrt(Integer.MAX_VALUE));

    }
}
