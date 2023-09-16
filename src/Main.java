import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double VB = 5.95d, DVB = 7.95d, CB = 6.45d, CCB = 8.50d, CBB = 9.25d, DBB = 10.95d, HOB = 12.45d, sum = 0d;
        int choice, quantity;

        System.out.println("Welcome to Hamilton Hamburgers, have a look at our menu");
        System.out.println("1. Veggie Burger = $5.95");
        System.out.println("2. Deluxe Veggie Burger = $7.95");
        System.out.println("3. Chicken Burger = $6.45");
        System.out.println("4. Cheese Chicken Burger = $8.50");
        System.out.println("5. Cheese Bacon Burger = $9.25");
        System.out.println("6. Deluxe Bacon Burger = $10.95");
        System.out.println("7. Healthy Organic Burger = $12.45");
        System.out.println("8. Final Price");

        do {
            System.out.print("What would you like to order?(choose 1, 2, 3, 4, 5, 6, 7, (or 8 to Go to payments))");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("1. Veggie Burger Selected. Choose quantity = ");
                quantity = input.nextInt();
                System.out.println("Your total is " + (sum + (VB * quantity)));
                sum = sum + (VB * quantity);
            } else if (choice == 2) {
                System.out.println("2. Deluxe Veggie Burger Selected. Choose quantity = ");
                quantity = input.nextInt();
                System.out.println("Your total is " + (sum + (DVB * quantity)));
                sum = sum + (DVB * quantity);
            } else if (choice == 3) {
                System.out.println("3. Chicken Burger Selected. Choose quantity = ");
                quantity = input.nextInt();
                System.out.println("Your total is " + (sum + (CB * quantity)));
                sum = sum + (CB * quantity);
            } else if (choice == 4) {
                System.out.println("4. Cheese Chicken Burger Selected. Choose quantity = ");
                quantity = input.nextInt();
                System.out.println("Your total is " + (sum + (CCB * quantity)));
                sum = sum + (CCB * quantity);
            } else if (choice == 5) {
                System.out.println("5. Cheese Bacon Burger Selected. Choose quantity = ");
                quantity = input.nextInt();
                System.out.println("Your total is " + (sum + (CBB * quantity)));
                sum = sum + (CBB * quantity);
            } else if (choice == 6) {
                System.out.println("6. Deluxe Bacon Burger Selected. Choose quantity = ");
                quantity = input.nextInt();
                System.out.println("Your total is " + (sum + (DBB * quantity)));
                sum = sum + (DBB * quantity);
            } else if (choice == 7) {
                System.out.println("7. Healthy Organic Burger Selected. Choose quantity = ");
                quantity = input.nextInt();
                System.out.println("Your total is " + (sum + (HOB * quantity)));
                sum = sum + (HOB * quantity);
            } else if (choice == 8) {
                if (sum > 49 && sum < 100) {
                    sum = (sum * 1.13 * 0.95);
                    System.out.println("Tax + 5% Discount Applied. Your Total is " + sum);
                } else if (sum > 100) {
                    sum = (sum * 1.13 * 0.90);
                    System.out.println("Tax + 10% Discount Applied. Your Total is " + sum);
                } else if (sum < 50 && sum > 1) {
                    sum = (sum * 1.13);
                    System.out.println("Tax added. Your total is " + sum);
                } else if (sum == 0) {
                    System.out.println("Thank you. Please visit us again!");
                }
            } else if (choice > 8 || choice == 0) {
                System.out.println("Invalid Argument");
            }
        } while (choice != 8);

    }
}