package UnitTestExample1.Test;
/**
 * Unit Test Example Java
 *
 * @author  Moustafa Farhat
 * @version 1.0
 * @since   2019-02-14
 */
import static org.junit.Assert.*;

import UnitTestExample1.FirstDayAtSchool;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class FirstDayAtSchoolTest {

    FirstDayAtSchool school = new FirstDayAtSchool();
    String[] bag1 = { "Books", "Notebooks", "Pens" };
    String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };

    @Test
    public void testPrepareMyBag() {
        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag1, school.prepareMyBag());

    }

    @Ignore
    @Test
    public void testAddPencils() {
        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag2, school.addPencils());
    }

}