import org.junit.Assert;
import org.junit.Test;

public class DashaMapThreeTests {

    @Test
    public void setTest() {
        //Given
        DashaMapThree dashaMapThree = new DashaMapThree();
        dashaMapThree.set("apple", "25");

        //When
        int expected = 1;
        int actual = dashaMapThree.singlyLinkedList[12].size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest() {
        //Given
        DashaMapThree dashaMapThree = new DashaMapThree();
        dashaMapThree.set("actor", "30");
        dashaMapThree.set("action", "12");
        int expected = 1;

        //When
        dashaMapThree.delete("actor");
        int actual = dashaMapThree.singlyLinkedList[24].size();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isEmptyTest() {
        //Given
        DashaMapThree dashaMapThree = new DashaMapThree();
        dashaMapThree.set("actor", "30");
        dashaMapThree.set("accolade", "12");

        //Then
        Assert.assertFalse(dashaMapThree.isEmpty(24));
    }

    @Test
    public void isEmptyTrueTest() {
        //Given
        DashaMapThree dashaMapThree = new DashaMapThree();

        //Then
        Assert.assertTrue(dashaMapThree.isEmpty(20));
    }

    @Test
    public void sizeTest() {
        //Given
        DashaMapThree dashaMapThree = new DashaMapThree();
        long expected = 0;

        //When
        long actual = dashaMapThree.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeWithTest() {
        //Given
        DashaMapThree dashaMapThree = new DashaMapThree();
        dashaMapThree.set("actor", "30");
        dashaMapThree.set("accolade", "12");
        dashaMapThree.set("action", "12");
        long expected = 3;

        //When
        long actual = dashaMapThree.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
