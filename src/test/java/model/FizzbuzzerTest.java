package model;

import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzerTest {

    private Fizzbuzzer f = new Fizzbuzzer();

    //PRUEBAS UNITARIAS DEL MÉTODO FIZZ()
    @Test
    public void multipleOf3_shouldFizz() {
        //Arrange - We choose a multiple of 3 and create the line and the integer that represent it.
        String line = "99";
        int i = 99;
        //Action - We pass both the line and the integer to the fizz method.
        line = f.fizz(line, i);
        //Assert - We check if it fizzed
        Assert.assertEquals("99 xxFIZZxx", line);
    }

    @Test
    public void contains3_shouldFizz() {
        //Arrange - We choose a number containing 3 and create the line and the integer that represent it.
        String line = "13";
        int i = 13;
        //Action - We pass both the line and the integer to the fizz method.
        line = f.fizz(line, i);
        //Assert - We check if it fizzed
        Assert.assertEquals("13 xxFIZZxx", line);
    }

    @Test
    public void multipleOf3_contains3_shouldFizz() {
        //Arrange - We choose a multiple of 3 that also contains 3
        // and create the line and the integer that represent it.
        String line = "63";
        int i = 63;
        //Action - We pass both the line and the integer to the fizz method.
        line = f.fizz(line, i);
        //Assert - We check if it fizzed
        Assert.assertEquals("63 xxFIZZxx", line);
    }

    @Test
    public void neitherMultipleNorContains3_shouldntFizz() {
        //Arrange - We choose a non-multiple of 3 that doesn't contain 3
        // and create the line and the integer that represent it.
        String line = "40";
        int i = 40;
        //Action - We pass both the line and the integer to the fizz method.
        line = f.fizz(line, i);
        //Assert - We check if it didn't fizz
        Assert.assertEquals("40", line);
    }

    //PRUEBAS UNITARIAS DEL MÉTODO BUZZ()
    @Test
    public void multipleOf5_shouldBuzz() {
        //Arrange - We choose a multiple of 5 and create the line and the integer that represent it.
        String line = "10";
        int i = 10;
        //Action - We pass both the line and the integer to the buzz method.
        line = f.buzz(line, i);
        //Assert - We check if it buzzed
        Assert.assertEquals("10 xxBUZZxx", line);
    }

    @Test
    public void contains5_shouldBuzz() {
        //Arrange - We choose a number containing 5 and create the line and the integer that represent it.
        String line = "53";
        int i = 53;
        //Action - We pass both the line and the integer to the buzz method.
        line = f.buzz(line, i);
        //Assert - We check if it buzzed
        Assert.assertEquals("53 xxBUZZxx", line);
    }

    @Test
    public void multipleOf5_contains5_shouldBuzz() {
        //Arrange - We choose a multiple of 5 that also contains 5
        // and create the line and the integer that represent it.
        String line = "55";
        int i = 55;
        //Action - We pass both the line and the integer to the buzz method.
        line = f.buzz(line, i);
        //Assert - We check if it buzzed
        Assert.assertEquals("55 xxBUZZxx", line);
    }

    @Test
    public void neitherMultipleNorContains5_shouldntBuzz() {
        //Arrange - We choose a nonmultiple of 5 that doesn't contain 5
        // and create the line and the integer that represent it.
        String line = "77";
        int i = 77;
        //Action - We pass both the line and the integer to the buzz method.
        line = f.buzz(line, i);
        //Assert - We check if it didn't buzz
        Assert.assertEquals("77", line);
    }

    //PRUEBAS UNITARIAS DEL MÉTODO GETLINE()
    @Test
    public void getLine_multiple3_shouldFizz() {
        //Arrange - We choose a number that's a multiple of 3 and not of 5, and that contains
        //neither of the two.
        int i = 66;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it only fizzed.
        Assert.assertEquals("66 xxFIZZxx", line);
    }

    @Test
    public void getLine_contains3_shouldFizz() {
        //Arrange - We choose a number that contains 3 and not 5, and that is a multiple of
        //neither of the two.
        int i = 13;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it only fizzed.
        Assert.assertEquals("13 xxFIZZxx", line);
    }

    @Test
    public void getLine_multiple3contains3_shouldFizz() {
        //Arrange - We choose a number that's a multiple of 3 and also contains it,
        //but isn't a multiple of 5 nor contains it.
        int i = 33;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it only fizzed.
        Assert.assertEquals("33 xxFIZZxx", line);
    }

    @Test
    public void getLine_multiple5_shouldBuzz() {
        //Arrange - We choose a number that's a multiple of 5 and not of 3, and that contains
        //neither of the two.
        int i = 20;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it only buzzed.
        Assert.assertEquals("20 xxBUZZxx", line);
    }

    @Test
    public void getLine_contains5_shouldBuzz() {
        //Arrange - We choose a number that contains 5 and not 3, and isn't
        //a multiple of neither of the two.
        int i = 52;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it only buzzed.
        Assert.assertEquals("52 xxBUZZxx", line);
    }

    @Test
    public void getLine_multiple5contains5_shouldBuzz() {
        //Arrange - We choose a number that's a multiple of 5 and contains it,
        //but isn't a multiple of 3 nor contains it.
        int i = 55;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it only buzzed.
        Assert.assertEquals("55 xxBUZZxx", line);
    }

    @Test
    public void getLine_multiple3multiple5_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 3 and 5,
        //but contains neither of the two.
        int i = 60;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("60 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_multiple3contains5_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 3 but doesn't contain it,
        //and that isn't a multiple of 5 but does contain it.
        int i = 51;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("51 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_contains3contains5_shouldFizzBuzz() {
        //Arrange - We choose a number that contains both 3 and 5,
        //but is a multiple of neither.
        int i = 53;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("53 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_contains3multiple5_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 5 and not of 3,
        //and contains 3 but not 5.
        int i = 310;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("310 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_multipleBothContains3_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 3 and 5,
        //and contains 3 but not 5.
        int i = 30;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("30 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_multipleBothContains5_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 3 and 5,
        //and contains 5 but not 3.
        int i = 15;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("15 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_multiple3containsBoth_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 3 and not 5,
        //but contains both 3 and 5.
        int i = 153;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("153 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_multiple5containsBoth_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 5 and not 3,
        //and contains both 3 and 5.
        int i = 35;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("35 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_multipleBothContainsBoth_shouldFizzBuzz() {
        //Arrange - We choose a number that's a multiple of 3 and 5,
        //and contains both 3 and 5 as well.
        int i = 135;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it fizzed and buzzed.
        Assert.assertEquals("135 xxFIZZxx xxBUZZxx", line);
    }

    @Test
    public void getLine_multipleNeitherContainsNeither_shouldntFizzBuzz() {
        //Arrange - We choose a number that's not a multiple of 3 or 5,
        //and contains neither of the two.
        int i = 11;
        //Action - We pass the integer on to the getLine method.
        String line = f.getLine(i);
        //Assert - We check that it didn't fizz or buzz.
        Assert.assertEquals("11", line);
    }
}
