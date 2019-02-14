package UnitTestExample1.Test;
/**
 * Unit Test Example Java
 *
 * @author  Moustafa Farhat
 * @version 1.0
 * @since   2019-02-14
 */
import UnitTestExample1.FirstDayAtSchool;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrepareMyBagTest {

    FirstDayAtSchool school = new FirstDayAtSchool();

    String[] bag = { "Books", "Notebooks", "Pens" };

    @Test
    public void testPrepareMyBag() {

        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag, school.prepareMyBag());

    }

}