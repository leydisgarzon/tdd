package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String input){
        String inputWithoutConsonants = input.toLowerCase().replaceAll("[^aeiou]","");
        return inputWithoutConsonants.length();
    }
}
