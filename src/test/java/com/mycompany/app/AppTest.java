package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;



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
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }



	public void testFound() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().alex(array1, array2, 1, 4));
    }

    public void testMaxMinCheck() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().alex(array1, array2, 7, 15));
    }

    public void testEmptyArray() {
	  ArrayList<Integer> array1 = new ArrayList<>();
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3));
      assertFalse(new App().alex(array1, array2, 1, 4));
    }

    public void testNull() {
      ArrayList<Integer> array1=null;
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3));
      assertFalse(new App().alex(array1, array2, 1, 4));
    }
	public void testSize(){
	  ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(4,5,6,7));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3));
      assertFalse(new App().alex(array1, array2, 1, 4));
	}

}
