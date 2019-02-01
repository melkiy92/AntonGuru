import java.util.ArrayList;
import java.util.List;

public class SecondTask {

    public static double wordAverageLength(String str) {
        double averageLength = 0;
        int countLetters = 0;
        List<Integer> countLettersArray = new ArrayList<Integer>();
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int ascii = (int) character;
            if( ascii > 64 ) {
                countLetters++;
                if( i == str.length() - 1) {
                    countLettersArray.add(countLetters);
                }
            } else {
                if(countLetters > 0) {
                    countLettersArray.add(countLetters);
                    countLetters = 0;
                }
            }
        }
        if( countLettersArray.size() == 0 ) {
            System.out.println("There are no words in sentence");
            return 0;
        }
        int sum = 0;
        for (int item : countLettersArray) {
            sum += item;
        }
        averageLength = (double) sum / countLettersArray.size();
        return averageLength;
    }


    public static String reverseWords(String str) {
        StringBuilder strBuilderInitial = new StringBuilder(str);
        StringBuilder strBuilderWord = new StringBuilder();
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < strBuilderInitial.length(); i++) {
            char character = strBuilderInitial.charAt(i);
            int ascii = (int) character;
            if (ascii > 64 || (ascii > 47 && ascii < 66 )) {
                strBuilderWord.append(character);
                if (i == strBuilderInitial.length() - 1) {
                    strBuilderWord.reverse();
                    reversedString.append(strBuilderWord);
                }
            } else {
                strBuilderWord.reverse();
                reversedString.append(strBuilderWord).append(character);
                strBuilderWord.delete(0, i);
            }
        }
        return reversedString.toString();
    }
}
