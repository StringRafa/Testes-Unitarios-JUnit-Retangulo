import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import services.RetanguloTest;
import services.RetanguloTest2;

@RunWith(Suite.class)
@SuiteClasses({RetanguloTestJUnit.class, RetanguloTest.class, RetanguloTest2.class})
public class RetanguloSuiteTest {

}
