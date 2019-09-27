package jUnit;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class jUnitTest {
		
	//Test sum
    @Test
    public void testSum() {
    	int val = jUnit.sum("7","5");
        assertEquals(val, 12);
    }
    
    @Test
    public void testSum1() {
    	int val = jUnit.sum("A","5");
        assertEquals(val, 0);
    }
    
    @Test
    public void testSum2() {
    	int val = jUnit.sum("7","A");
        assertEquals(val, 0);
    }
    
    @Test
    public void testSum3() {
    	int val = jUnit.sum("A","B");
        assertEquals(val, 0);
    }
    

    
    //Test sub
    @Test
    public void testSub() {
    	int val = jUnit.sub("7","5");
        assertEquals(val,2);
    }
    
    public void testSub1() {
    	int val = jUnit.sub("A","5");
        assertEquals(val,0);
    }
    
    public void testSub2() {
    	int val = jUnit.sub("7","A");
        assertEquals(val,0);
    }
    
    public void testSub3() {
    	int val = jUnit.sub("A","B");
        assertEquals(val,0);
    }
        
    
    //Test multiply
    @Test
    public void testMultiply() {
    	int val = jUnit.multiply("5","5");
        assertEquals(val,25);
    }
    
    @Test
    public void testMultiply1() {
    	int val = jUnit.multiply("A","5");
    	assertEquals(val,0);
    }
    
    @Test
    public void testMultiply2() {
    	int val = jUnit.multiply("5","B");
    	assertEquals(val,0);
    }
    
    @Test
    public void testMultiply3() {
    	int val = jUnit.multiply("A","B");
    	assertEquals(val,0);
    }
            
    //Test Divide
    @Test
    public void testDivideZero() {
    	int val = jUnit.divide("6","0");
        assertEquals(val,0);
    }
    
    @Test
    public void testDivide() {
    	int val = jUnit.divide("6","2");
        assertEquals(val,3);
    }
         
    @Test
    public void testDivide1() {
    	int val = jUnit.divide("A","1");
        assertEquals(val,0);
    }
    
    @Test
    public void testDivide2() {
    	int val = jUnit.divide("6","A");
        assertEquals(val,0);
    }
	
    @Test
    public void testDivide3() {
    	int val = jUnit.divide("B","A");
        assertEquals(val,0);
    }
    
    //Test checkInt
    @Test
    public void testCheckIntTrue() {
    	boolean val = jUnit.checkInt("6");
        assertTrue(val);
    }
    
    @Test
    public void testCheckIntFalse() {
    	boolean val = jUnit.checkInt("a");
        assertFalse(val);
    }
	
	@Test
	public void testArrayEquals() {
		Integer[] testArray = {2,4};
		assertArrayEquals(testArray, jUnit.array(testArray));
	}
	
    @Test
    public void testAssertNotNull() {
    	String A = "Hello";
    	assertNotNull(jUnit.string(A));
    }
	
    @Test
    public void testAssertNull() {
    	String A = null;
    	assertNull(jUnit.string(A));
    }
    
    @Test
    public void testNotSame() {
    	int val = jUnit.sum("7","5");
        assertNotSame(val, 5);
    }

    @Test
    public void testAssertSame() {
    	int val = jUnit.sum("7","5");
        assertSame(val, 12);
    }
    
    @Test
    public void testAssertThat() {
    	int val = jUnit.sum("7","5");
        assertThat(val, is (equalTo(12)));
    }

    //Test divideByZero
    @Test
    public void testDivideByZeroTrue() {
    	boolean val = jUnit.divideByZero(1);
        assertTrue(val);
    }
    
    @Test
    public void testDivideByZeroFalse() {
    	boolean val = jUnit.divideByZero(0);
        assertFalse(val);
    }
    
}
