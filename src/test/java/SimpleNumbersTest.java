import org.junit.Assert;
import org.junit.Test;

public class SimpleNumbersTest {

    @Test
      public void test13(){
        Assert.assertEquals(true, SimpleNumbers.simpleNumber(13));
    }
    @Test
    public void test4(){
        Assert.assertEquals(false, SimpleNumbers.simpleNumber(4));
    }
    @Test
    public void test7(){
        Assert.assertEquals(true, SimpleNumbers.simpleNumber(7));
    }
    @Test
    public void test222(){
        Assert.assertEquals(false, SimpleNumbers.simpleNumber(222));
    }


}
