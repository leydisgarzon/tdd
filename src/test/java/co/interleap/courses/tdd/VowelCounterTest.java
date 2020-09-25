package co.interleap.courses.tdd;

import org.junit.Assert;
import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void counterZeroForEmptyString(){
        VowelCounter vowelCounter = new VowelCounter();
        int count = vowelCounter.count("");
        Assert.assertEquals(0, count);
    }

    @Test
    public void counterOneForStringOfOneLetterAVowel(){
        Assert.assertEquals(1, new VowelCounter().count("e"));
    }

}