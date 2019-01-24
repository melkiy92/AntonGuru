import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println(FirstTask.factorial(0)); //1
        System.out.println(FirstTask.factorial_recursion(-3)); //error
        System.out.println(FirstTask.factorial_recursion(5)); //125
        System.out.println(FirstTask.binaryToDecimal("1011011")); //91
        System.out.println(FirstTask.binaryToDecimal("11001")); //25
        System.out.println(FirstTask.binaryToDecimal("0111")); //7
        System.out.println(FirstTask.decimalToBinary("156")); // 10011100
        System.out.println(FirstTask.decimalToBinary("57")); // 111001
        System.out.println(FirstTask.decimalToBinary("567")); // 1000110111
        System.out.println(FirstTask.decimalToBinary("75")); // 1001011
        int[] arr = {-3,7,-1,2,0,-4};
        System.out.println(Arrays.toString(FirstTask.sortArray(arr, true)));
        System.out.println(Arrays.toString(FirstTask.sortArray(arr, false)));
        FirstTask.getMonthName(1, "en");
        FirstTask.getMonthName(10, "ru");
        FirstTask.getMonthName(31, "en");
        FirstTask.getMonthName(3, "usd");
    }

}
