import org.junit.Assert;
import org.junit.Test;

public class MinMaxValueTest {

    @Test
    public void maxTest() {
        Assert.assertEquals(9, MinMaxValue.maxValue());
    }

    @Test
    public void minTest() {
        Assert.assertEquals(1, MinMaxValue.minValue());
    }
}
