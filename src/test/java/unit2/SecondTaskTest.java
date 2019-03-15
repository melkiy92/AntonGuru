package unit2;

import unit2.SecondTask;
import unit2.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SecondTaskTest {

    public List<Figure> createFigureList(double radiusCircle, double sideSquare, double sideHexagon) {
        List<Figure> list = new ArrayList<Figure>();
        Figure circle = new Circle(radiusCircle);
        Figure square = new Square(sideSquare);
        Figure hexagon = new Hexagon(sideHexagon);
        list.add(circle);
        list.add(square);
        list.add(hexagon);
        return list;
    }

    @Test
    public void getMowordAverageLengthTest() {
        Assert.assertEquals(3.333, SecondTask.wordAverageLength("Я хочу спать "), 0.001);
        Assert.assertEquals(2.8, SecondTask.wordAverageLength("I will not give up!"), 0.001);
        Assert.assertEquals(4.0, SecondTask.wordAverageLength("когда там уже весна?"), 0.001);
        Assert.assertEquals(4.0, SecondTask.wordAverageLength(" Мне скоро 27 "), 0.001);
        Assert.assertEquals(4.0, SecondTask.wordAverageLength("Я хожу на pole-dance, кроссфит, йогу"), 0.001);
        Assert.assertEquals(0.0, SecondTask.wordAverageLength(" "), 0.001);
        Assert.assertEquals(9.0, SecondTask.wordAverageLength("пропеллер"), 0.001);
    }

    @Test
    public void reverseWordsTest() {
        Assert.assertEquals("аннА тидох ан тифссорк", SecondTask.reverseWords("Анна ходит на кроссфит"));
        Assert.assertEquals(" отк тидох ан tiFssorC 3 азар в юледен, тот аннА ", SecondTask.reverseWords(" кто ходит на CrossFit 3 раза в неделю, тот Анна "));
        Assert.assertEquals("", SecondTask.reverseWords(""));
        Assert.assertEquals("62 + 001 = 621", SecondTask.reverseWords("26 + 100 = 126"));
    }

    @Test
    public void sortArrayTest() {
        Assert.assertArrayEquals(new String[]{"3", "5", "6", "7", "9"}, SecondTask.sortArray(new String[]{"6", "9", "3", "5", "7"}, true));
        Assert.assertArrayEquals(new String[]{"9", "7", "6", "5", "3"}, SecondTask.sortArray(new String[]{"6", "9", "3", "5", "7"}, false));
        Assert.assertArrayEquals(new String[]{"100", "27", "3", "36", "5", "93"}, SecondTask.sortArray(new String[]{"36", "100", "93", "5", "27", "3"}, true));
        Assert.assertArrayEquals(new String[]{"93", "5", "36", "3", "27", "100"}, SecondTask.sortArray(new String[]{"36", "100", "93", "5", "27", "3"}, false));
        Assert.assertArrayEquals(new String[]{" Anna", "Anna", "Anna T", "Anna-Maria", "AnnaT", "anna", "Анна-Мария"}, SecondTask.sortArray(new String[]{"anna", "Anna", "Anna-Maria", "Анна-Мария", "AnnaT", "Anna T", " Anna"}, true));
        Assert.assertArrayEquals(new String[]{"Анна-Мария", "anna", "AnnaT", "Anna-Maria", "Anna T", "Anna", " Anna"}, SecondTask.sortArray(new String[]{"anna", "Anna", "Anna-Maria", "Анна-Мария", "AnnaT", "Anna T", " Anna"}, false));
    }

    @Test
    public void getCharEntriesTest() {
        Assert.assertArrayEquals(new char[]{' ', 'i', 't', 'e', 'v', ',', 'm', 'o', 'I', 'k', 'l'}, SecondTask.getCharEntries("I like it, move it, move it"));
        Assert.assertArrayEquals(new char[]{'8', '7', '6', '5', '4', '3', '2', '1'}, SecondTask.getCharEntries("122333444455555666666777777788888888"));
        Assert.assertArrayEquals(new char[]{'a', 'n', 't'}, SecondTask.getCharEntries("annat"));
        Assert.assertArrayEquals(new char[]{'1', '2', '+', '='}, SecondTask.getCharEntries("1+11=12"));
        Assert.assertArrayEquals(new char[]{' '}, SecondTask.getCharEntries(" "));
        Assert.assertArrayEquals(new char[]{'a', 'b', 'c'}, SecondTask.getCharEntries("abc"));
        Assert.assertArrayEquals(new char[]{'A'}, SecondTask.getCharEntries("AAA"));
    }

    @Test
    public void calculateOverallAreaTest() {
        Assert.assertEquals(60.65, SecondTask.calculateOverallArea(createFigureList(3, 3, 3)), 0.01);
        Assert.assertEquals(6.74, SecondTask.calculateOverallArea(createFigureList(1, 1, 1)), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateOverallAreaExceptionTest() throws IllegalArgumentException {
        SecondTask.calculateOverallArea(createFigureList(0, -3, 3));
    }

}
