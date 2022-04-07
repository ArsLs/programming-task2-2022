import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFinder {
//    @Test
//    public void testNormalUsage() {
//
//        /*With Extension + recursive*/
//        String[] t1 = new FinderLauncher().parseAndLaunchForTest("-d src One.txt -r".split("\s+"));
//        String[] t2 = {"src\\test\\java\\Dir\\One.txt",
//                "src\\test\\java\\Dir\\Deeper\\One.txt",
//                "src\\test\\java\\Dir\\Deeper\\Deepest\\One.txt"};
//        assertEquals(t2.length, t1.length);
//        for (int i = 0; i < t1.length; i++) {
//            assertEquals(t1[i], t2[i]);
//        }
//
//        /*Without Extension + recursive*/
//        String[] t3 = new Finder("src", "One", true).initSearch();
//        String[] t4 = {"src\\test\\java\\Dir\\One.txt",
//                "src\\test\\java\\Dir\\Deeper\\One",
//                "src\\test\\java\\Dir\\Deeper\\One.txt",
//                "src\\test\\java\\Dir\\Deeper\\Deepest\\One.txt"};
//        assertEquals(t3.length, t4.length);
//        for (int i = 0; i < t3.length; i++) {
//            assertEquals(t3[i], t4[i]);
//        }
//
//        /*With Extension*/
//        String[] t5 = new Finder("src\\test\\java\\Dir", "Multiple.txt", false).initSearch();
//        String[] t6 = {"src\\test\\java\\Dir\\Multiple.txt"};
//        assertEquals(t5.length, t6.length);
//        for (int i = 0; i < t5.length; i++) {
//            assertEquals(t5[i], t6[i]);
//        }
//
//        /*Without Extension*/
//        String[] t7 = new Finder("src\\test\\java\\Dir", "Multiple", false).initSearch();
//        String[] t8 = {"src\\test\\java\\Dir\\Multiple",
//                "src\\test\\java\\Dir\\Multiple.txt",
//                "src\\test\\java\\Dir\\Multiple.zip"};
//        assertEquals(t7.length, t8.length);
//        for (int i = 0; i < t7.length; i++) {
//            assertEquals(t7[i], t8[i]);
//        }
//        /* Not absolute path*/
//        String[] t9 = new Finder("src", "One", true).initSearch();
//        String[] t10 = {"src\\test\\java\\Dir\\One.txt",
//                "src\\test\\java\\Dir\\Deeper\\One",
//                "src\\test\\java\\Dir\\Deeper\\One.txt",
//                "src\\test\\java\\Dir\\Deeper\\Deepest\\One.txt"};
//        assertEquals(t9.length, t10.length);
//        for (int i = 0; i < t10.length; i++) {
//            assertEquals(t9[i], t10[i]);
//        }
//        /*Path not given, consider user.dir as target dir*/
////        String[] t11 = new Finder("", "One", true).initSearch();
////        String[] t12 = {"\\build\\resources\\test\\Dir\\One.txt",
////                "src\\build\\resources\\test\\Dir\\Deeper\\One",
////                "src\\build\\resources\\test\\Dir\\Deeper\\One.txt",
////                "src\\build\\resources\\test\\Dir\\Deeper\\Deepest\\One.txt",
////                "src\\test\\resources\\Dir\\One.txt",
////                "src\\test\\resources\\Dir\\Deeper\\One",
////                "src\\test\\resources\\Dir\\Deeper\\One.txt",
////                "src\\test\\resources\\Dir\\Deeper\\Deepest\\One.txt"};
////        for (int i = 0; i < t12.length; i++) {
////            assertEquals(t11[i], t12[i]);
////        }
////        assertEquals(t11.length, t12.length);
//    }
//
//
//
//    @Test
//    public void testExceptions (){
//        /*Wrong dir name*/
//        IllegalArgumentException thrown = assertThrows(
//                IllegalArgumentException.class,
//                () -> new Finder("QWERTY", "1", false).initSearch(),
//                "Expected doThing() to throw, but it didn't"
//        );
//
//        assertTrue(thrown.getMessage().contains("No such directory or directory is empty."));
//    }

    @Test(expected = IllegalArgumentException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        new Finder("QWERTY", "1", false).initSearch();
    }
}
