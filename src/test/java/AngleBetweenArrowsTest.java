import org.junit.Assert;
import org.junit.Test;

public class AngleBetweenArrowsTest {

    @Test
    public void degreeTest(){
        Assert.assertEquals(60, AngleBetweenArrows.angle(3,25));
    }
}
