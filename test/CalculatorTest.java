import org.junit.Assert;
import org.junit.Test;

/**
 * Created by employee on 11/3/16.
 */
public class CalculatorTest {


    @Test
    public void whenInputMoreArgumentsWithDoubleSlash(){
        Assert.assertEquals(24, Calculator.add("//;n 3;     6;15"));
    }

    @Test
    public void whenInputMoreArgumentsWithSpace(){
        Assert.assertEquals(36, Calculator.add("13, 6, 7,          ,10"));
    }

    @Test
    public void whenInputMoreArgumentsWithSpaceAndNewLine(){
        Assert.assertEquals(26, Calculator.add("3, \t,6, 7,     \n     ,10"));
    }
    @Test
    public void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Assert.assertEquals(3 + 6, Calculator.add("3,6"));
    }

    @Test
    public void whenInput3Numbers() {
        Assert.assertEquals(16, Calculator.add("3,6,7"));

    }

    @Test
    public void whenInput5Numbers() {
        Assert.assertEquals(40, Calculator.add("3,6,7,10,14"));
    }

    @Test
    public void whenInputNull() {
        Assert.assertEquals(0, Calculator.add(""));
    }

    @Test(expected = RuntimeException.class)
    public void whenInputNumberAndSymbol() {
        Calculator.add("1,b");
    }
}