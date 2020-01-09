package TDD.Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @org.junit.jupiter.api.Test
    void sum() {
        int a = 1;
        int b = 2;
        int exp = 3;
        Sum s1 = new Sum();
        int result = s1.Sum(a,b);
        assertEquals(exp,result);
    }

    @Test
    void testSum2() {
        int a = Integer.MAX_VALUE;
        int b = 2;
        Sum sum2 = new Sum();
        try{
            int result = sum2.Sum(a,b);
            assertFalse(true);
        }catch (Exception x){
            assertTrue(true);
        }
    }

    @Test
    void testSum3() {
        int a = Integer.MIN_VALUE;
        int b = -1;
        Sum sum3 = new Sum();
        try {
            int result = sum3.Sum(a,b);
            assertFalse(true);
        }catch (Exception x){
            assertTrue(true);
            System.out.println("test");
        }
    }
}