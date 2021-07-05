import org.junit.*;

public class MainClassTest {

    /*@BeforeClass
    public void beforeClassMethod() {

    }

    @Before
    public void setUp() {

    }*/


    @Test
    public void test2() {
        Assert.assertTrue("Value are not equals!", 1+1==2);
        Assert.assertFalse("Value are equals!",1+1==2);
    }

    @Test
    public void test3() {
        Assert.assertEquals(10, 5+5);
        Assert.assertNotEquals(10, 2+2);
    }


    /*@After
    public void tearDown() {

    }

    @AfterClass
    public void afterClassMethod() {

    }*/
}
