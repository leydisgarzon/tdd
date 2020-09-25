package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String input){
        if (input.matches("[aeiou]*")) {
            return input.length();
        }
        return 0;
    }
}
