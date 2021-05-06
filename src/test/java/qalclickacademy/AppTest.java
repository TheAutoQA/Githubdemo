package qalclickacademy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("This is the added line1");
        System.out.println("This is the added line2");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	System.out.println("Step1 added to Testsuite method");
    	System.out.println("Step2 added to Testsuite method");
    	System.out.println("Step3 added to Testsuite method");
    	return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public static void demoA()
    {
    	System.out.println("Step added to DemoA method");
    }
}
