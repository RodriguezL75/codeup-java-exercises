package util;


import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);


//    constructor

    public String getString(String prompt) {
        prompt = (prompt.isEmpty()) ? "Type: " : prompt;
        System.out.println(prompt);
//        sc is a class variable below
        return this.sc.nextLine().trim();

    }

    public String getString() {
        return this.sc.next();

    }

//    use a blueprint analogy to create class

    public boolean yesNo() {
//        String result = this.getString("Type yes or no (y/n");
        String result = this.sc.next();
        return (result.equals("y") || result.equals("yes"));
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        int value = getInt();
        if (value < min || value > max) {
            System.out.printf("Enter a number between %d and %d%n", min, max);
            return getInt(min, max);
        }
        return value;
    }

    public int getInt() {
        String input = getString();

        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Must input an integer.");
            return getInt();
        }
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double value = getDouble();
        if (value < min || value > max) {
            System.out.printf("Enter a number between %f and %f%n", min, max);
            return getDouble(min, max);
        }
        return value;
    }

    public double getDouble() {
//        double number = scanner.nextDouble();
//        return number;
        String input = getString();
        try {
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Input must be a number.");
            return getDouble();
        }


    }
}
