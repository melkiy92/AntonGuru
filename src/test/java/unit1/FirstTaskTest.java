package unit1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import unit1.FirstTask;

public class FirstTaskTest {
    @Test
    public void getMonthNameEnTest() {
        Assert.assertEquals("January", FirstTask.getMonthName(1, "en"));
        Assert.assertEquals("May", FirstTask.getMonthName(5, "en"));
        Assert.assertEquals("October", FirstTask.getMonthName(10, "en"));
    }

    @Test
    public void getMonthNameRuTest() {
        Assert.assertEquals("Январь", FirstTask.getMonthName(1, "ru"));
        Assert.assertEquals("Май", FirstTask.getMonthName(5, "ru"));
        Assert.assertEquals("Октябрь", FirstTask.getMonthName(10, "ru"));
    }

    @Test
    public void getMonthNameInvalidLanguageTest() {
        Assert.assertEquals("Unknown Language", FirstTask.getMonthName(1, "ru41"));
        Assert.assertEquals("Unknown Language", FirstTask.getMonthName(5, "ru5"));
        Assert.assertEquals("Unknown Language", FirstTask.getMonthName(10, ""));
    }

    @Test
    public void getMonthNameInvalidOrderTest() {
        Assert.assertEquals("Неизвестный месяц", FirstTask.getMonthName(112, "ru"));
        Assert.assertEquals("Неизвестный месяц", FirstTask.getMonthName(55, "ru"));
        Assert.assertEquals("Unknown Month", FirstTask.getMonthName(-10, "en"));
    }

    @Test
    public void getMonthNameInvalidLangAndOrderTest() {
        Assert.assertEquals("Unknown Language", FirstTask.getMonthName(-1, "asd"));
        Assert.assertEquals("Unknown Language", FirstTask.getMonthName(-5, "asd"));
        Assert.assertEquals("Unknown Language", FirstTask.getMonthName(-10, "asd"));
    }

    @Test
    public void binaryToDecimalIntegersTest() {
        Assert.assertEquals("1", FirstTask.binaryToDecimal("1"));
        Assert.assertEquals("2", FirstTask.binaryToDecimal("10"));
        Assert.assertEquals("6", FirstTask.binaryToDecimal("110"));
        Assert.assertEquals("7", FirstTask.binaryToDecimal("111"));
        Assert.assertEquals("5", FirstTask.binaryToDecimal("101"));
        Assert.assertEquals("3", FirstTask.binaryToDecimal("011"));
        Assert.assertEquals("1", FirstTask.binaryToDecimal("001"));
        Assert.assertEquals("4", FirstTask.binaryToDecimal("100"));
    }

    @Test
    @Ignore
    public void binaryToDecimalFractionsTest() {
        Assert.assertEquals("0.5", FirstTask.binaryToDecimal(".100"));
        Assert.assertEquals("0.5", FirstTask.binaryToDecimal(".10"));
        Assert.assertEquals("0.75", FirstTask.binaryToDecimal(".110"));
        Assert.assertEquals("0.875", FirstTask.binaryToDecimal(".111"));
        Assert.assertEquals("0.625", FirstTask.binaryToDecimal(".101"));
    }

    @Test
    @Ignore
    public void binaryToDecimalOverallTest() {
        Assert.assertEquals("1.5", FirstTask.binaryToDecimal("1.100"));
        Assert.assertEquals("2.5", FirstTask.binaryToDecimal("10.10"));
        Assert.assertEquals("5.75", FirstTask.binaryToDecimal("101.110"));
        Assert.assertEquals("7.875", FirstTask.binaryToDecimal("111.111"));
        Assert.assertEquals("8.625", FirstTask.binaryToDecimal("1000.101"));
    }

    @Test
    public void binaryToDecimalNotBinaryTest() {
        Assert.assertEquals("Not binary", FirstTask.binaryToDecimal("123"));
        Assert.assertEquals("Not binary", FirstTask.binaryToDecimal("24j"));
        Assert.assertEquals("Not binary", FirstTask.binaryToDecimal("1.00."));
        Assert.assertEquals("Not binary", FirstTask.binaryToDecimal(".11110."));
        Assert.assertEquals("Not binary", FirstTask.binaryToDecimal("100.00a"));
    }

    @Test
    @Ignore
    public void binaryToDecimalSpecialCasesTest() {
        Assert.assertEquals("4", FirstTask.binaryToDecimal("100."));
        Assert.assertEquals("4.0", FirstTask.binaryToDecimal("100.0"));
        Assert.assertEquals("4.0", FirstTask.binaryToDecimal("100.000000000000000000000"));
        Assert.assertEquals("0.375", FirstTask.binaryToDecimal("0.011"));
        Assert.assertEquals("0.125", FirstTask.binaryToDecimal("0.001"));
        Assert.assertEquals("0.125", FirstTask.binaryToDecimal("00000000000.00100000000"));
    }

    @Test
    public void decimalToBinaryTest() {
        Assert.assertEquals("10", FirstTask.decimalToBinary("2"));
        Assert.assertEquals("1", FirstTask.decimalToBinary("1"));
        Assert.assertEquals("11", FirstTask.decimalToBinary("3"));
        Assert.assertEquals("101", FirstTask.decimalToBinary("5"));
        Assert.assertEquals("111", FirstTask.decimalToBinary("7"));
        Assert.assertEquals("111", FirstTask.decimalToBinary("007"));
        Assert.assertEquals("111", FirstTask.decimalToBinary("00000000007"));
    }

    @Test
    public void sortArrayAscTest() {
        Assert.assertArrayEquals(new int[]{1, 2, 3}, FirstTask.sortArray(new int[]{3, 2, 1}, true));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, FirstTask.sortArray(new int[]{3, 1, 2}, true));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, FirstTask.sortArray(new int[]{2, 3, 1}, true));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, FirstTask.sortArray(new int[]{1, 3, 2}, true));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, FirstTask.sortArray(new int[]{1, 2, 3}, true));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, FirstTask.sortArray(new int[]{2, 1, 3}, true));


        Assert.assertArrayEquals(new int[]{1, 2, 3, 10, 12, 15}, FirstTask.sortArray(new int[]{2, 1, 3, 10, 15, 12}, true));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 10, 12, 15}, FirstTask.sortArray(new int[]{10, 15, 12, 2, 1, 3}, true));
        Assert.assertArrayEquals(new int[]{-15, 1, 2, 3, 10, 12}, FirstTask.sortArray(new int[]{10, -15, 12, 2, 1, 3}, true));
    }

    @Test
    public void sortArrayDescTest() {
        Assert.assertArrayEquals(new int[]{3, 2, 1}, FirstTask.sortArray(new int[]{3, 2, 1}, false));
        Assert.assertArrayEquals(new int[]{3, 2, 1}, FirstTask.sortArray(new int[]{3, 1, 2}, false));
        Assert.assertArrayEquals(new int[]{3, 2, 1}, FirstTask.sortArray(new int[]{2, 3, 1}, false));
        Assert.assertArrayEquals(new int[]{3, 2, 1}, FirstTask.sortArray(new int[]{1, 3, 2}, false));
        Assert.assertArrayEquals(new int[]{3, 2, 1}, FirstTask.sortArray(new int[]{1, 2, 3}, false));
        Assert.assertArrayEquals(new int[]{3, 2, 1}, FirstTask.sortArray(new int[]{2, 1, 3}, false));


        Assert.assertArrayEquals(new int[]{15, 12, 10, 3, 2, 1}, FirstTask.sortArray(new int[]{2, 1, 3, 10, 15, 12}, false));
        Assert.assertArrayEquals(new int[]{15, 12, 10, 3, 2, 1}, FirstTask.sortArray(new int[]{10, 15, 12, 2, 1, 3}, false));
        Assert.assertArrayEquals(new int[]{12, 10, 3, 2, 1, -15}, FirstTask.sortArray(new int[]{10, -15, 12, 2, 1, 3}, false));
    }
}
