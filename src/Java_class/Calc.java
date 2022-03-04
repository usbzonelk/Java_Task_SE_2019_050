import java.util.*;

class Calc {

    static double add(double num1, double num2) {
        return num1 + num2;
    }

    static double sub(double num1, double num2) {
        return num1 - num2;
    }

    static double mult(double num1, double num2) {
        return num1 * num2;
    }

    static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String args[]) {

        Scanner usr_in = new Scanner(System.in);

        System.out.print(
                "Hello!\nWhat do you wanna do?\n\nPress num 1 for sum\nPress num 2 for diff\nPress num 3 for multiplication\nPress num 4 for division.\n\nPress your option: ");
        String usr_inp_s = usr_in.nextLine();
        int usr_inp = Integer.parseInt(usr_inp_s);
        while (usr_inp != 1 && usr_inp != 2 && usr_inp != 3 && usr_inp != 4) {
            System.out.print("Please enter a valid input! : ");
            usr_inp = Integer.parseInt(usr_in.nextLine());
        }
        System.out.print("Enter number 1: ");

        double num_1 = Double.parseDouble(usr_in.nextLine());

        System.out.print("Enter number 2: ");
        double num_2 = Double.parseDouble(usr_in.nextLine());

        usr_in.close();
        if (usr_inp == 1) {
            System.out.println("Answer is: " + (add(num_1, num_2)));
        } else if (usr_inp == 2) {
            System.out.println("Answer is: " + (sub(num_1, num_2)));
        } else if (usr_inp == 3) {
            System.out.println("Answer is: " + (mult(num_1, num_2)));
        } else if (usr_inp == 4) {
            System.out.println("Answer is: " + (div(num_1, num_2)));
        }
    }

}
