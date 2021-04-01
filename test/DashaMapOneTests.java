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

    @Test
    public void deleteTest() {
        //Given
        DashaMapOne dMapOne = new DashaMapOne();
        dMapOne.set("actor", "30");
        dMapOne.set("aunt", "12");
        int expected = 1;

        //When
        dMapOne.delete("aunt");
        int actual = dMapOne.singlyLinkedList[0].size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        //Given
        DashaMapOne dMapOne = new DashaMapOne();
        dMapOne.set("actor", "30");
        dMapOne.set("aunt", "12");

        //Then
        Assert.assertFalse(dMapOne.isEmpty(0));
    }

    @Test
    public void isEmptyTrueTest() {
        //Given
        DashaMapOne dMapOne = new DashaMapOne();

        //Then
        Assert.assertTrue(dMapOne.isEmpty(12));
    }

    @Test
    public void sizeTest() {
        //Given
        DashaMapOne dashaMapOne = new DashaMapOne();
        long expected = 0;

        //When
        long actual = dashaMapOne.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeWithTest() {
        //Given
        DashaMapOne dashaMapOne = new DashaMapOne();
        dashaMapOne.set("ball", "12");
        dashaMapOne.set("queen", "21");
        dashaMapOne.set("tan", "1");
        dashaMapOne.set("fact", "5");
        long expected = 4;

        //When
        long actual = dashaMapOne.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        //Given
        DashaMapOne dashaMapOne = new DashaMapOne();
        dashaMapOne.set("ball", "12");
        dashaMapOne.set("queen", "21");
        dashaMapOne.set("tan", "1");
        dashaMapOne.set("fact", "5");
        String expected = "5";

        //When
        String actual = dashaMapOne.get("fact");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getToughTest() {
        //Given
        DashaMapOne dashaMapOne = new DashaMapOne();
        dashaMapOne.set("ball", "12");
        dashaMapOne.set("queen", "21");
        dashaMapOne.set("tan", "1");
        dashaMapOne.set("front", "5");
        dashaMapOne.set("fact", "15");
        String expected = "15";

        //When
        String actual = dashaMapOne.get("fact");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findInTest() {
        //Given
        DashaMapOne dMapOne = new DashaMapOne();
        dMapOne.set("actor", "30");
        dMapOne.set("aunt", "12");
        String expected = "12";

        //When
        String actual = dMapOne.findIn(0, "aunt").getValue();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
