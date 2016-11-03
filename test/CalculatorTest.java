import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by employee on 11/3/16.
 */
public class CalculatorTest {

    @Test
    public void whenInputMoreArgumentsWithMultipleDelimiters() {
        assertThat(43, is(Calculator.add("//[-][%]\n1-2%25-15")));
    }

    @Test
    public void whenInputMoreArgumentsWithSquareBrackets() {
        assertThat(28, is(Calculator.add("//[——————]\n1—2—25")));
    }

    @Test
    public void whenInputOneHundred() {
        assertThat(80, is(Calculator.add("10,20,100,50")));
    }
    @Ignore
    @Test
    public void whenRuntimeExceptionWithNegativeElements() {
        RuntimeException exception = null;
        try {
            Assert.assertEquals(80, Calculator.add("10,20,50"));
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertNull(exception);
        assertThat("Вы ввели значения меньше нуля = [-30]", is(exception.getMessage()));
    }

    @Test
    public void whenInputNegativeNumbers() {
        assertThat(80, is(Calculator.add("10,20,50")));
    }

    @Test
    public void whenInputMoreArgumentsWithDoubleSlash() {
        assertThat(24, is(Calculator.add("//;\n 3;     6;15")));
    }

    @Test
    public void whenInputMoreArgumentsWithSpace() {
        assertThat(36, is(Calculator.add("13, 6, 7,          ,10")));
    }

    @Test
    public void whenInputMoreArgumentsWithSpaceAndNewLine() {
        assertThat(26, is(Calculator.add("3, \t,6, 7,     \n     ,10")));
    }

    @Test
    public void when2NumbersAreUsedThenNoExceptionIsThrown() {
        assertThat(3 + 6, is(Calculator.add("3,6")));
    }

    @Test
    public void whenInput3Numbers() {
        assertThat(16, is(Calculator.add("3,6,7")));

    }

    @Test
    public void whenInput5Numbers() {
        assertThat(40, is(Calculator.add("3,6,7,10,14")));
    }

    @Test
    public void whenInputNull() {
        assertThat(0, is(Calculator.add("")));
    }

    @Test(expected = RuntimeException.class)
    public void whenInputNumberAndSymbol() {
        Calculator.add("1,b");
    }
}