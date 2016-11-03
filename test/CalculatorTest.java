import org.junit.Assert;
import org.junit.Test;

/**
 * Created by employee on 11/3/16.
 */
public class CalculatorTest {

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public void whenInput3Numbers(){
        Calculator.add("1,2,3");
    }

    @Test
    public void whenInputNull(){
        Calculator.add("");
    }

    @Test(expected = RuntimeException.class)
    public void whenInputNumberAndSymbol(){
        Calculator.add("1,b");
    }
}