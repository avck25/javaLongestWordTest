import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by avck25 on 7/15/2018.
 */
public class EvaluateLongestWordTest {

    EvaluateLongestWord elw;

    @Before
    public void initailize() {
        elw = new EvaluateLongestWord();
    }

    @Test
    public void testFindLongestWord() {
        elw.findLongestWord("programming is the best");
        assertEquals("programming", elw.getLongestWord());
        assertNull(elw.getErrorMessage());
        assertEquals(11, elw.getLength());
        assertEquals(1, elw.getNumberOfWords());
    }

    @Test
    public void testFindLongestWordWithNull() {
        elw.findLongestWord(null);

        Assert.assertNotNull(elw.getErrorMessage());
        //testing that error message gets reset to null
        elw.findLongestWord("hello");
        Assert.assertNull(elw.getErrorMessage());
    }

    @Test
    public void testFindLongestWordWithOneWord() {
        elw.findLongestWord("yesterday");

        Assert.assertEquals(9, elw.getLength());

        assertEquals("yesterday", elw.getLongestWord());
        assertEquals(1, elw.getNumberOfWords());
    }

    @Test
    public void testFindMultipleLongestWords() {
        elw.findLongestWord("Hello there how are you");

        Assert.assertEquals(5, elw.getLength());

        assertEquals("Hello, there", elw.getLongestWord());
        assertEquals(2, elw.getNumberOfWords());

    }

    @Test
    public void testFindAlotOfMultipleLongestWord() {
        elw.findLongestWord("Delta compression using up to 8 threads. Compressing objects: 100% (14/14), done. Writing objects: 100% (16/16), 3.42 KiB | 0 bytes/s, done. " +
                "conjunctive Total 16 (delta 6), reused 0 (delta 0) remote: Resolving// deltas: 100% (6/6), completed with 6 local objects.");
        assertEquals("compression, Compressing, conjunctive, Resolving//", elw.getLongestWord());
        assertNull(elw.getErrorMessage());
        assertEquals(11, elw.getLength());
        assertEquals(4, elw.getNumberOfWords());
    }

    @Test
    public void testTrimWhitespaceToGiveError() {
        elw.findLongestWord("    ");
        Assert.assertNotNull(elw.getErrorMessage());

    }


}