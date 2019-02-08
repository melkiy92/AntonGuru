import java.util.*;

import static java.util.Arrays.*;

public class SecondTask {

    public static double wordAverageLength(String str) {
        double averageLength = 0;
        int countLetters = 0;
        List<Integer> countLettersArray = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int ascii = (int) character;
            if (ascii > 64) {
                countLetters++;
                if (i == str.length() - 1) {
                    countLettersArray.add(countLetters);
                }
            } else {
                if (countLetters > 0) {
                    countLettersArray.add(countLetters);
                    countLetters = 0;
                }
            }
        }
        if (countLettersArray.size() == 0) {
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
            if (ascii > 64 || (ascii > 47 && ascii < 66)) {
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


    public static String[] sortArray(String[] array, boolean asc) {

        int mid = array.length / 2;

        String[] left = new String[mid];
        String[] right = new String[array.length - mid];
        String[] result = new String[array.length];

        if (array.length <= 1) {
            return array;
        } else {
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }

            left = sortArray(left, asc);
            right = sortArray(right, asc);

            //merge sorted arrays
            int i = 0, j = 0, r = 0;
            while (i < left.length && j < right.length) {
                if ((left[i].compareTo(right[j]) < 0 && asc) || (left[i].compareTo(right[j]) > 0 && !asc)) {
                    result[r++] = left[i++];
                } else {
                    result[r++] = right[j++];
                }
            }
            while (i < left.length) {
                result[r++] = left[i++];
            }
            while (j < right.length) {
                result[r++] = right[j++];
            }
            return result;
        }
    }


    public static char[] getCharEntries(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = str.toCharArray();

        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > sortedList =
                new ArrayList<Map.Entry<Character, Integer> >(map.entrySet());

        // Sort the list in descending order
        Collections.sort(sortedList, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to array of char
        char[] charArray = new char[sortedList.size()];
        int i =0;
        for (Map.Entry<Character, Integer> aa : sortedList) {
            charArray[i++] = aa.getKey();
        }

        return charArray;
    }

    public static double calculateOverallArea(List<Figure> figures) {
        double sum = 0;
        for (Figure f : figures) {
            sum += f.calculateArea();
        }
        return sum;
    }

};

