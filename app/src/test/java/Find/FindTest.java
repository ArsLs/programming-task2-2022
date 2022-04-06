/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Find;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FindTest {
    @Test
    public void testNormalUsage() {
        String ud = System.getProperty("user.dir");
        String resourcesDir = ud + "\\src\\test\\resources";

        /*With Extension + recursive*/
        String[] t1 = new Finder(resourcesDir, "One.txt", true).initSearch();
        String[] t2 = {resourcesDir + "\\Dir\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\Deepest\\One.txt"};
        assertEquals(t1.length, t2.length);
        for (int i = 0; i < t1.length; i++) {
            assertEquals(t1[i], t2[i]);
        }

        /*Without Extension + recursive*/
        String[] t3 = new Finder(resourcesDir, "One", true).initSearch();
        String[] t4 = {resourcesDir + "\\Dir\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\One",
                resourcesDir + "\\Dir\\Deeper\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\Deepest\\One.txt"};
        assertEquals(t3.length, t4.length);
        for (int i = 0; i < t3.length; i++) {
            assertEquals(t3[i], t4[i]);
        }

        /*With Extension*/
        String[] t5 = new Finder(resourcesDir + "\\Dir", "Multiple.txt", false).initSearch();
        String[] t6 = {resourcesDir + "\\Dir\\Multiple.txt"};
        assertEquals(t5.length, t6.length);
        for (int i = 0; i < t5.length; i++) {
            assertEquals(t5[i], t6[i]);
        }

        /*Without Extension*/
        String[] t7 = new Finder(resourcesDir + "\\Dir", "Multiple", false).initSearch();
        String[] t8 = {resourcesDir + "\\Dir\\Multiple",
                resourcesDir + "\\Dir\\Multiple.txt",
                resourcesDir + "\\Dir\\Multiple.zip"};
        assertEquals(t7.length, t8.length);
        for (int i = 0; i < t7.length; i++) {
            assertEquals(t7[i], t8[i]);
        }
        /* Not absolute path*/
        String[] t9 = new Finder("\\src", "One", true).initSearch();
        String[] t10 = {resourcesDir + "\\Dir\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\One",
                resourcesDir + "\\Dir\\Deeper\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\Deepest\\One.txt"};
        assertEquals(t9.length, t10.length);
        for (int i = 0; i < t10.length; i++) {
            assertEquals(t9[i], t10[i]);
        }
        /*Path not given, consider user.dir as target dir*/
        String[] t11 = new Finder("", "One", true).initSearch();
        String[] t12 = {ud+"\\build\\resources\\test\\Dir\\One.txt",
                ud+"\\build\\resources\\test\\Dir\\Deeper\\One",
                ud+"\\build\\resources\\test\\Dir\\Deeper\\One.txt",
                ud+"\\build\\resources\\test\\Dir\\Deeper\\Deepest\\One.txt",
                resourcesDir + "\\Dir\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\One",
                resourcesDir + "\\Dir\\Deeper\\One.txt",
                resourcesDir + "\\Dir\\Deeper\\Deepest\\One.txt"};
        for (int i = 0; i < t12.length; i++) {
            assertEquals(t11[i], t12[i]);
        }
        assertEquals(t11.length, t12.length);
    }



    @Test
    public void testExceptions (){
        /*Wrong dir name*/
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> new Finder("QWERTY", "1", false).initSearch(),
                "Expected doThing() to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().contains("No such directory or directory is empty."));
    }
}
