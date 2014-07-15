package testtravis;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.ci.NumberUtility;

public class NumberUtilityTest {

    @Test
    public void testEvenOrOdd() {
        NumberUtility nu = new NumberUtility();
        assertTrue(nu.isEven(2));
        assertFalse(nu.isEven(3));
        assertFalse(nu.isEven(-1));
    }

    
    @Test
    public void testCountEvens() {
        NumberUtility nu = new NumberUtility();
        int[] arr = new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        assertEquals(2, nu.countEvens(arr));
    }

}
