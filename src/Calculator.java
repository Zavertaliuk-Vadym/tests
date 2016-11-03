/**
 * Created by employee on 11/3/16.
 */
public class Calculator {
    public static void main(String[] args) {
        add("");
    }

    static void add(String s) {
        String[] numbersArray = s.split(",");
        int count=0;
        if (numbersArray[0]==""){
            System.out.println("\"\"");
            return;
        }
        if (numbersArray.length==0){
            System.out.println(count);
            return;
        }
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                count+=Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
        }
        System.out.println(count);

    }
}
