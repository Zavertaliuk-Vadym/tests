import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/3/16.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(add("10,20,100,50"));
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
        List exception = new ArrayList();
        int sum=0;
        String[] numbersArray = s.split(delimiter);
        int count;
        if (numbersArray[0]==""){
            return 0;
        }
        for (String number : numbersArray) {
            if(!number.trim().isEmpty()) {
                count = Integer.parseInt(number.trim());
                if (count==100){
                    count=0;
                }
                if(count<0){
                    exception.add(count);
                }
                sum+=count;
            }
        }
        if (exception.size()>0){
            throw new RuntimeException("Вы ввели значения меньше нуля = "+exception.toString());
        }
        return sum;
    }
}
