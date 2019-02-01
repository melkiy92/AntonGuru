import java.util.ArrayList;
import java.util.List;

public class FirstTask {

    private FirstTask(){};

    static int factorial(int n) {
        if( n < 0 ) {
            throw new IllegalArgumentException("The argument must be positive.");
        }
        int factorial = 1;
        for( int i = 1; i <= n; i++ ) {
            factorial *= i;
        }
        return factorial;
    }


    static int factorialRecursion (int n) throws IllegalArgumentException {
        int factorial = 1;
        if (n == 1 || n == 0) {
            return factorial;
        }
        if (n < 0) {
            throw new IllegalArgumentException("The argument must be positive.");
        }
        factorial = n * factorialRecursion(n-1);
        return factorial;
    }

    static String binaryToDecimal(String binaryNumber) {
        int iDecimal = 0;
        for(int i = 0; i < binaryNumber.length(); i++) {
            if(binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                return "Not binary";
            }
            iDecimal = iDecimal * 2 + Character.digit(binaryNumber.charAt(i), 10);
        }
        String sDecimal = Integer.toString(iDecimal);
        return sDecimal;
    }

    static String decimalToBinary(String decimalNumber) {
        int iDecimal = Integer.parseInt(decimalNumber);
        List<Integer> arrBinary = new ArrayList();
        do {
            int mod = iDecimal % 2;
            arrBinary.add(mod);
            iDecimal /= 2;
        } while( iDecimal > 0);
        int iLastBinaryElem = arrBinary.size() - 1;
        StringBuilder sbBinaryResult = new StringBuilder();
        for(int i = 0; i <= iLastBinaryElem; i++ ) {
            sbBinaryResult.append(arrBinary.get(iLastBinaryElem - i));
        }
        return sbBinaryResult.toString();
    }



    //It was implemented using the method "bubble sort"
    static int[] sortArray(int[] array, boolean asc) {
            int iLastElem = array.length - 1;
            while (iLastElem > 0) {
                for (int i = 0; i < iLastElem; i++) {
                    int pos1 = i;
                    int pos2 = i + 1;
                    if (((array[pos1] > array[pos2]) && asc) || ((array[pos1] < array[pos2]) && !asc)) {
                        int temp = array[pos1];
                        array[pos1] = array[pos2];
                        array[pos2] = temp;
                    }
                    if (pos2 == iLastElem) {
                        iLastElem -= 1;
                    }
                }
            }
        return array;
    }

    static String getMonthName(int monthOrder, String language) {
        if (!language.equals("en") && !language.equals("ru") ) {
            return "Unknown Language";
        }
        String month = "";
        switch(monthOrder) {
            case 1: month = (language == "en" ? "January" : "Январь"); break;
            case 2: month = (language == "en" ? "February" : "Февраль"); break;
            case 3: month = (language == "en" ? "March" : "Март"); break;
            case 4: month = (language == "en" ? "April" : "Апрель"); break;
            case 5: month = (language == "en" ? "May" : "Май"); break;
            case 6: month = (language == "en" ? "June" : "Июнь"); break;
            case 7: month = (language == "en" ? "July" : "Июль"); break;
            case 8: month = (language == "en" ? "August" : "Август"); break;
            case 9: month = (language == "en" ? "September" : "Сентябрь"); break;
            case 10: month = (language == "en" ? "October" : "Октябрь"); break;
            case 11: month = (language == "en" ? "November" : "Ноябрь"); break;
            case 12: month = (language == "en" ? "December" : "Декабрь"); break;
            default: month = (language == "en" ? "Unknown Month" : "Неизвестный месяц");
        }
    return month;
    }
}

