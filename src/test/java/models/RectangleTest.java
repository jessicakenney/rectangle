package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class RectangleTest {
    @Test
    public void newRectangle_instantiatesCorrectly() throws Exception {
        Rectangle testRectangle = new Rectangle (2, 4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangle_getHeight_2(){
        Rectangle testRectangle = new Rectangle (2,4);
        assertEquals(2, testRectangle.getHeight());
    }
    @Test
    public void newRectangle_getWidth_4(){
        Rectangle testRectangle = new Rectangle (2,4);
        assertEquals(4, testRectangle.getWidth());
    }
    @Test
    public void isSquare_whenNotASquare_false(){
        Rectangle testRectangle = new Rectangle (2,4);
        assertEquals(false, testRectangle.isSquare());
    }
    @Test
    public void isSquare_whenASquare_true(){
        Rectangle testRectangle = new Rectangle (4,4);
        assertEquals(true, testRectangle.isSquare());
    }
}