import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralTest {
    //Test case 1: single letters
    @Test
    public void bug() {
        int result = new RomanNumeral().romanToInt("IT");
        Assertions.assertEquals(2, result);

    }
    @Test
    public void singleDigit(){
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I"));
        Assertions.assertEquals(5, new RomanNumeral().romanToInt("V"));
        Assertions.assertEquals(10, new RomanNumeral().romanToInt("X"));
        Assertions.assertEquals(50, new RomanNumeral().romanToInt("L"));
        Assertions.assertEquals(100, new RomanNumeral().romanToInt("C"));
        Assertions.assertEquals(500, new RomanNumeral().romanToInt("D"));
        Assertions.assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }
    @Test
    public void repetition(){
        Assertions.assertEquals(2,new RomanNumeral().romanToInt("II"));
        Assertions.assertEquals(20,new RomanNumeral().romanToInt("XX"));

    }
    @Test
    public void manyLettersInOrder(){
        Assertions.assertEquals(1000,new RomanNumeral().romanToInt("VI"));
        Assertions.assertEquals(1000,new RomanNumeral().romanToInt("XV"));

    }
}