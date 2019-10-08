package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void newRectangle_instantiateCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(true, testRectangle instanceof  Rectangle);
    }

    @Test
    public void newRectangle_getsLength_2() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.getLength());
    }
    @Test
    public void newRectangle_getWidth_4() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }

    @Test
    public void isSquare_whenNotASquare_false() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(false, testRectangle.isSquare());
    }

}