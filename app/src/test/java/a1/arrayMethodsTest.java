package a1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class arrayMethodsTest {
    @Test public void testWholeSum(){
        arrayMethods classUnderTest = new arrayMethods();
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(10.0f, classUnderTest.wholeSum(arr1), 0.00001);
    }

    @Test public void testSum(){
        arrayMethods classUnderTest = new arrayMethods();
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(5.0f, classUnderTest.sum(arr1, 1, 3), 0.00001);
    }

    @Test public void testMean(){
        arrayMethods classUnderTest = new arrayMethods();
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(3.5f, classUnderTest.mean(arr1), 0.00001);
    }

    @Test public void testMin(){
        arrayMethods classUnderTest = new arrayMethods();
        float[] arr1 = {1.0f, 3.0f, 2.0f, 4.0f};
        assertEquals(2.0f, classUnderTest.min(arr1, 1, 4), 0.00001);
    }

    @Test public void testMax(){
        arrayMethods classUnderTest = new arrayMethods();
        float[] arr1 = {1.0f, 3.0f, 2.0f, 4.0f};
        assertEquals(4.0f, classUnderTest.max(arr1, 1, 4), 0.00001);
    }

    @Test public void testIsEqualTo(){
        arrayMethods classUnderTest = new arrayMethods();
        float[] arr1 = {1.0f, 2.0f, 3.0f, 2.0f};
        boolean[] expected = {false, true, false, true};
        assertArrayEquals(expected, classUnderTest.isEqualTo(arr1, 2.0f));
    }

    @Test public void testLogicalNot(){
        arrayMethods classUnderTest = new arrayMethods();
        boolean[] arr1 = {false, true, false, false};
        boolean[] expected = {true, false, true, true};
        assertArrayEquals(expected, classUnderTest.logicalNot(arr1));
    }


    @Test public void testIsGreaterThan(){
        arrayMethods classUnderTest = new arrayMethods();
        float[] arr1 = {1.0f, 2.0f, 3.0f, 2.5f};
        boolean[] expected = {false, false, true, false};
        assertArrayEquals(expected, classUnderTest.isGreaterThan(arr1, 2.5f));
    }

    @Test public void testDatesBetween(){
        arrayMethods classUnderTest = new arrayMethods();
        int[] arr1 = {20230101,20230214,20230704};
        boolean[] expected = {false, true, false};
        assertArrayEquals(expected, classUnderTest.datesBetween(arr1, 20230201, 20230601));
    }

    @Test public void testLogicalAnd(){
        arrayMethods classUnderTest = new arrayMethods();
        boolean[] arr = {false, true, true, false};
        boolean[] arr2 = {false, true, false, true};
        boolean[] expected = {false, true, false, false};
        assertArrayEquals(expected, classUnderTest.logicalAnd(arr, arr2));
    }

    @Test public void testCount(){
        arrayMethods classUnderTest = new arrayMethods();
        boolean[] arr1 = {false, true, true, false, true};
        int expected = 3;
        assertEquals(expected, classUnderTest.count(arr1));
    }

    @Test public void testFindFirst(){
        arrayMethods classUnderTest = new arrayMethods();
        boolean[] arr1 = {false, false, true, false, true};
        assertEquals(2, classUnderTest.findFirst(arr1));
    }

    @Test public void testFind() {
        arrayMethods classUnderTest = new arrayMethods();
        boolean[] arr1 = {false, true, true, false, true};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, classUnderTest.find(arr1));
    }

}
