/**
 * Created by employee on 11/3/16.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(add("3, 6, 7,   \t     ,10"));
    }

    static int add(String s) {
        String[] numbersArray = s.split("[, nt]");
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
