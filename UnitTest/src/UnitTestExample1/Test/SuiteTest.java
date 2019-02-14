package UnitTestExample1.Test;
/**
 * Unit Test Example Java
 *
 * @author  Moustafa Farhat
 * @version 1.0
 * @since   2019-02-14
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ PrepareMyBagTest.class, AddPencilsTest.class })
public class SuiteTest {}