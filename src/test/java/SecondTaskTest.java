import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SecondTaskTest {

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

}
