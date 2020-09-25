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

    @Test
    public void counterForStringOfMultipleVowelsAndNoConsonant(){
        Assert.assertEquals(3, new VowelCounter().count("ieu"));
    }

    @Test
    public void counterZeroForOneLetterAConsonant(){
        Assert.assertEquals(0, new VowelCounter().count("n"));
    }

    @Test
    public void counterZeroForMultipleConsonantsNoVowel(){
        Assert.assertEquals(0, new VowelCounter().count("nsdfgffrt"));
    }

    @Test
    public void counterForMultipleConsonantsAndVowels(){
        Assert.assertEquals(5, new VowelCounter().count("iodfuie"));
    }

}