package com.example.testandroid3;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomMathTest {

    private CustomMath math;

    @Before
    public void setUp() {
        math = new CustomMath();
        System.out.println("Before");
    }

    @Test
    public void simpleAddCase() {
        assertEquals("6", math.add("4", "2"));
        assertEquals("6", math.sub("10", "4"));
        assertEquals("6", math.mult("3", "2"));
        assertEquals("6", math.div("12", "2"));
        System.out.println("simpleAddCase");
    }

    @Test
    public void emptyFieldCase() {
        assertEquals("0", math.add("", ""));
        assertEquals("0", math.sub("", ""));
        assertEquals("0", math.mult("", ""));
        assertEquals("0", math.div("", ""));
        System.out.println("emptyFieldCase");
    }

    @Test
    public void wordsFieldCase() {
        assertEquals("Нужно вводить тоьлко числа", math.add("a", "b"));
        assertEquals("Нужно вводить тоьлко числа", math.sub("a", "b"));
        assertEquals("Нужно вводить тоьлко числа", math.mult("a", "b"));
        assertEquals("Нужно вводить тоьлко числа", math.div("a", "b"));
        System.out.println("wordsFieldCase");
    }

    @Test
    public void spaceFieldCase() {
        assertEquals("10", math.add(" 5 ", " 5 "));
        assertEquals("0", math.sub(" 5 ", " 5 "));
        assertEquals("25", math.mult(" 5 ", " 5 "));
        assertEquals("1", math.div(" 5 ", " 5 "));
        System.out.println("spaceFieldCase");
    }

    @Test
    public void divideByZero() {
        assertEquals("Нельзя делить на ноль", math.div("3", "0"));
        System.out.println("divideByZero");
    }


    @Test
    public void simpleTwoWordsReverse() {
        assertEquals("World Hello", math.reverseString("Hello World"));
        System.out.println("simpleTwoWordsReverse");
    }

    @Test
    public void simpleThreeAndMoreWordsReverse() {
        assertEquals("Four Three Two One", math.reverseString("One Two Three Four"));
        System.out.println("simpleTwoWordsReverse");
    }

    @Test
    public void spaceWordsReverse() {
        assertEquals("Four Three Two One", math.reverseString("  One Two Three Four  "));
        System.out.println("spaceWordsReverse");
    }

    @After
    public void tearDown() {
        math = null;
        System.out.println("After");
    }

}
