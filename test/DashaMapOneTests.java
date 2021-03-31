import org.junit.Assert;
import org.junit.Test;

public class DashaMapOneTests {

    @Test
    public void setTest() {
        //Given
        DashaMapOne dMapOne = new DashaMapOne();
        dMapOne.set("apple", "25");

        //When
        int expected = 1;
        int actual = dMapOne.singlyLinkedList[0].size();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
