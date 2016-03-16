import org.junit.Assert;
import org.junit.Test;

public class PrimitiveTypeTest {

    @Test
    public void byteTest() {
        Assert.assertEquals(127, PrimitiveType.byteValue());
    }

    @Test
    public void shortTest() {
        Assert.assertEquals(32767, PrimitiveType.shortValue());
    }

    @Test
    public void intTest() {
        Assert.assertEquals(2147483646, PrimitiveType.intValue());
    }

}
