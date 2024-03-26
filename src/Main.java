import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1;
        int n2;
        int result;
        String symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Select one number: ");
        n1 = scanner.nextInt();
        System.out.println();
        System.out.print("Select another number: ");
        n2 = scanner.nextInt();
        System.out.println();

        System.out.print("What do you whant to do? : ");
        symbol = scanner.nextLine();

        if (symbol == "+"){
            result = n1 + n2;
            System.out.println(result);
        }else if (symbol == "-") {
            result = n1 - n2;
            System.out.println(result);
        }else if (symbol == "/") {
            result = n1 / n2;
            System.out.println(result);
            while (n1 == 0 || n2 ==0){
                System.out.println("You cant Divide a number with 0");
                symbol = scanner.nextLine();
                break;
            }
        }else if (symbol == "*") {
            result = n1 * n2;
            System.out.println(result);
        }else System.out.println("What do you whant me to do with that?");
    }
}