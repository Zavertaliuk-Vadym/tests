/**
 * Created by employee on 11/3/16.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(add("//;n3;\n     6;15"));
    }

    public static int add(final String numbers) {
        String delimiter = "[, n]";
        String numbersWithoutDelimiter = numbers;
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
        }
        return add(numbersWithoutDelimiter, delimiter);
    }
    private static int add(String s,final String delimiter) {
        String[] numbersArray = s.split(delimiter);
        int count=0;
        if (numbersArray[0]==""){
            return 0;
        }
        for (String number : numbersArray) {
            if(!number.trim().isEmpty()) {
                count += Integer.parseInt(number.trim());
            }
        }
        return count;
    }
}
