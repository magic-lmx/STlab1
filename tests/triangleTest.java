import com.sun.javadoc.ThrowsTag;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by magic on 16/3/18.
 */
public class triangleTest {

    private triangle triangle1;
    @Before
    public void setUp() throws Exception {
        triangle1 = new triangle();
    }

    @Test
    public void testtriangle() throws Exception {
        assertEquals("equilateral",triangle1.judge(6,6,6));
        assertEquals("isosceles",triangle1.judge(6,6,5));
        assertEquals("right angle",triangle1.judge(3,4,5));
        assertEquals("scalene",triangle1.judge(6,4,5));
    }
    @After
    public void tearDown() throws Exception {

    }
}