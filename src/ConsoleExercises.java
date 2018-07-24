import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        System.out.println("Console Exercises!!!");

        Scanner sc = new Scanner(System.in);
//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer? error msg

//        System.out.println("Enter an integer"); print question in console sting
//        System.out.println("Your integer is: " +sc..nextInt());
//        int numb = sc.nextInt();
//        System.out.println("Your integer is " + numb);





//        2. Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("What your age is: " + age);

        System.out.println("Give the first word");
        String word1 = sc.nextLine();
        System.out.println("Give the second word");
        String word2 = sc.nextLine();
        System.out.println("Give the third word");
        String word3 = sc.nextLine();
        System.out.println("What three colors do you like?");
//        String answer = sc.nextLine(); prints words in one line
//        System.out.println("The three words are " + answer); ie
//        The three words are red, blue, yellow

        System.out.printf("Your words: %s %s %s", word1, word2, word3);


/////////////////////////////////////////
    import java.util.Scanner;

        public class ConsoleExercises {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("What's your age?");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Your age is: " + age);

                System.out.println("Give me the first word");
                String word1 = sc.nextLine();
                System.out.println("Give me the second word");
                String word2 = sc.nextLine();
                System.out.println("Give me the third word");
                String word3 = sc.nextLine();

                System.out.printf("Your words: %s %s %s", word1, word2, word3);

                System.out.println("Give me a sentence");
                String sentence = sc.nextLine();

                System.out.println(sentence);

                System.out.println("Give me the length");
                String length = sc.nextLine();
                System.out.println("Give me the width");
                String width = sc.nextLine();

                double area = Double.parseDouble(length)  * Double.parseDouble(width);
                System.out.println(area + " = "+length+" x "+width);

                double perimeter = (2 * Double.parseDouble(length)) + ( 2 * Double.parseDouble(width));

                System.out.println(perimeter + " = 2x"+length+" + 2x"+width);


            }
        }














//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?


//                Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.

        System.out.println("Give me a sentence");
        String sentence = sc.nextLine();

        System.out.println(sentence);


//        do you capture all of the words?
//        Rewrite the above example using the .nextLine method.


//
//        Calculate the perimeter and area of Codeup's classrooms
//
//        Prompt the user to enter values of length and width of the classroom.


        System.out.println("Give me the length");
        String length = sc.nextLine();
        System.out.println("Give me the width");
        String width = sc.nextLine();

        double area = Double.parseDouble(length) * Double.parseDouble(width);
        System.out.println(area + " = "+length+" x "+ width);

        double perimeter = (2 * Double.parseDouble(length)) + (2 * Double.parseDouble(width));

        System.out.println(perimeter + " = 2x"+length+" + 2x" +width);





//
//                Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//
//                Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
//
//                area = length x width
//        perimter = 2 x length + 2 x width






    }
}