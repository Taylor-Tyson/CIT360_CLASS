package jUnit;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class jUnitTest {
     
    @Test
    public void testSum() {
    	int val = jUnit.sum(7,5);
        assertEquals(val, 12);
    }
	
    @Test
    public void testSub() {
    	int val = jUnit.sub(7,5);
        assertEquals(val,2);
    }
    
    @Test
    public void testMultiply() {
    	int val = jUnit.multiply(5,5);
        assertEquals(val,25);
    }
    
    @Test
    public void testDivide() {
    	int val = jUnit.divide(6,2);
        assertEquals(val,3);
    }
	
}
