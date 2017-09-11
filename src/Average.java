
/**
 * @author Tsegab Gebregziabher
 * Septmber 12,2017
 * tg29285@email.vccs.edu
 * Scanner Class with Delimiter
 */
import java.util.Scanner;
public class Average {
    public static void main (String[] args){
        Scanner keyboardNumber = new Scanner(System.in);
        System.out.println(" Enter ten numbers separeted by comma");
        keyboardNumber.useDelimiter(",");
        System.out.println(keyboardNumber.delimiter());

        int n1 = keyboardNumber.nextInt();
        int n2 = keyboardNumber.nextInt();
        int n3 = keyboardNumber.nextInt();
        int n4 = keyboardNumber.nextInt();
        int n5 = keyboardNumber.nextInt();
        int n6 = keyboardNumber.nextInt();
        int n7 = keyboardNumber.nextInt();
        int n8 = keyboardNumber.nextInt();
        int n9 = keyboardNumber.nextInt();
        int n10 = keyboardNumber.nextInt();
        int Sum= (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10); // this is how i add an input numbers from the keybord
        int average = Sum/10;
        System.out.println(" You enterd is " + n1 + "," + n2 + "," + n3 +  "," + n4 + "," + n5 + "," + n6 +"," + n7 + ","+ n8+ ","+ n9+ "," + n10);

        System.out.println("The average is " + average);
    }
}

