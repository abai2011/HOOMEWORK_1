import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // задание 1
        String myName;
        // задание 2
        final int NUM = 11;
        // задание 3
        String word = "abai";
        // задание 4
        myName = word + NUM;

        System.out.println(myName);
        // задание 5
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        // задание 6
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n" + fname + " " + lname);
    }


}





