import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    String reverse = "reverse";
    String result = "esrever";

    @Test
    public void testArray(){
        Assert.assertEquals(result, ReverseString.reverseWithArray(reverse));
    }
    @Test
    public void testStringBuilder(){
        Assert.assertEquals(result, ReverseString.reverseStringBuilder(reverse));
    }

    @Test
    public void testByStack(){
        Assert.assertEquals(result, ReverseString.reverseByStack(reverse));
    }

}
