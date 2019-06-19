
package christmas;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josecovarrubias
 */
public class ToChristmasTest {
    
    public ToChristmasTest() {
    }
    /*
     * Test of countMounths method, of class ToChristmas.
     * assertArrayEquals
     * assertEquals
     * assertFalse
     * assertNotNull
     * assertNotSame
     * assertNull
     * assertSame
     * assertThat
     * assertTrue 
     */
    @Test
    public void testCountMounths() {
        System.out.println("Test assertEquals");
        Integer currentMonth = 7;
        Integer monthsOfTheYear = 12;
        ToChristmas instance = new ToChristmas();
        Integer expResult = 5;
        Integer result = instance.countMounths(currentMonth, monthsOfTheYear);
        //Pass the test because the results are equal.
        assertEquals(expResult, result);
        System.out.println("Expected Result " + expResult 
                          + " = assertEquals " + result);
        
        System.out.println("Test assertFalse");
        Integer currentMonth2 = 10;
        Integer monthsOfTheYear2 = 12;
        ToChristmas instance2 = new ToChristmas();
        Integer expResult2 = 3;
        Integer result2 = instance2.countMounths(currentMonth2, monthsOfTheYear2);
        //Pass the test because the expected is not (false) less than the result.
        assertFalse(expResult2 < result2);
        System.out.println("Expected Result " + expResult2 
                          + " = assertFalse " + result2);
        
        System.out.println("Test assertNotNull");
        Integer currentMonth3 = 7;
        Integer monthsOfTheYear3 = 12;
        ToChristmas instance3 = new ToChristmas();
        String expResult3 = "5";
        Integer result3 = instance3.countMounths(currentMonth3, monthsOfTheYear3);
        //Pass the test because it is not null.
        assertNotNull(expResult3, result3);
        System.out.println("Expected Result " + expResult3 
                          + " = assertNotNull " + result3);
        
        System.out.println("Test assertNotSame");
        Integer currentMonth4 = 7;
        Integer monthsOfTheYear4 = 12;
        ToChristmas instance4 = new ToChristmas();
        //False expected to confirm that they are not the same
        Integer expResult4 = 520;
        Integer result4 = instance4.countMounths(currentMonth4, monthsOfTheYear4);
        //Pass the test because the expected is not the same as the result.
        assertNotSame(expResult4, result4);
        System.out.println("Expected Result " + expResult4 
                          + " = assertNotSame " + result4);
        
        System.out.println("Test assertNull");
        ToChristmas instance5 = new ToChristmas();
        String expResult5 = "\"Nothing expected\"";
        String result5 = instance5.countWithString();
        //Pass the test because it is null. 
        assertNull(result5); 
        System.out.println("Expected Result " + expResult5
                          + " = assertNull " + result5);
        
        System.out.println("Test assertSame");
        Integer currentMonth6 = 7;
        Integer monthsOfTheYear6 = 12;
        ToChristmas instance6 = new ToChristmas();
        Integer expResult6 = 5;
        Integer result6 = instance6.countMounths(currentMonth6, monthsOfTheYear6);
        //Pass the test because they are the same.
        assertSame(expResult6, result6);
        System.out.println("Expected Result " + expResult6 
                          + " = assertSame " + result6);
        
        System.out.println("Test assertThat");
        Integer currentMonth7 = 7;
        Integer monthsOfTheYear7 = 12;
        ToChristmas instance7 = new ToChristmas();
        Integer expResult7 = 5;
        Integer result7 = instance7.countMounths(currentMonth7, monthsOfTheYear7);
        //Pass the test because it meets the condition of the matcher. 
        assertThat(result7.toString(), is(expResult7.toString()) );
        System.out.println("Expected Result " + expResult7 
                          + " = assertThat " + result7);
        
        System.out.println("Test assertTrue");
        Integer currentMonth8 = 7;
        Integer monthsOfTheYear8 = 12;
        ToChristmas instance8 = new ToChristmas();
        Integer expResult8 = 5;
        Integer result8 = instance8.countMounths(currentMonth8, monthsOfTheYear8);
        //Pass the test because the condition is true.
        assertTrue(expResult8 == result8);
        System.out.println("Expected Result " + expResult8 
                          + " = assertTrue " + result8);
       
        System.out.println("Test assertArrayEquals");
        ToChristmas instance9 = new ToChristmas();
        String[] expResult9 = {"Christmas"," is", " in", " December."};
        String[] result9 = instance9.ChristmasMonth();
        //Pass the test because the condition is true.
        assertArrayEquals(expResult9, result9);
        System.out.println("Expected Result \n" 
                          + Arrays.toString(expResult9).replace(",", "")
                          + "\n= assertArrayEquals\n" 
                          + Arrays.toString(result9).replace(",", ""));
    }
    
}
