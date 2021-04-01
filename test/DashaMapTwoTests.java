import org.junit.Assert;
import org.junit.Test;

public class DashaMapTwoTests {
    @Test
    public void setTest() {
        //Given
        DashaMapTwo dMapTwo = new DashaMapTwo();
        dMapTwo.set("apple", "25");
        dMapTwo.set("ipsum", "21");

        //When
        int expected = 2;
        int actual = dMapTwo.singlyLinkedList[15].size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest() {
        //Given
        DashaMapTwo dMapTwo = new DashaMapTwo();
        dMapTwo.set("push", "30");
        dMapTwo.set("aunt", "12");
        int expected = 1;

        //When
        dMapTwo.delete("aunt");
        int actual = dMapTwo.singlyLinkedList[20].size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        //Given
        DashaMapTwo dMapTwo = new DashaMapTwo();
        dMapTwo.set("push", "30");
        dMapTwo.set("aunt", "12");

        //Then
        Assert.assertFalse(dMapTwo.singlyLinkedList[20].isEmpty());
    }

    @Test
    public void isEmptyTrueTest() {
        //Given
        DashaMapTwo dMapTwo = new DashaMapTwo();
        dMapTwo.set("push", "30");
        dMapTwo.set("aunt", "12");

        //Then
        Assert.assertFalse(dMapTwo.singlyLinkedList[20].isEmpty());
    }

    @Test
    public void sizeEmptyTest() {
        //Given
        DashaMapTwo dashaMapTwo = new DashaMapTwo();
        long expected = 0;

        //When
        long actual = dashaMapTwo.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeWithTest() {
        //Given
        DashaMapTwo dashaMapTwo = new DashaMapTwo();
        dashaMapTwo.set("push", "30");
        dashaMapTwo.set("aunt", "12");
        dashaMapTwo.set("wonky", "82");
        dashaMapTwo.set("pill", "9");
        long expected = 4;

        //When
        long actual = dashaMapTwo.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
