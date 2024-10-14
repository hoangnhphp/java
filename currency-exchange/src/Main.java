import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate = 23000;
        double money;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        money = input.nextDouble();
        System.out.println("The amount of money is: " + (money * rate));
    }
}
