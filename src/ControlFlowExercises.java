//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        System.out.println("ControlFlowExercises");

//Loop Basics
//
//While
//Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.

//    int i = 5;
//    while (i <= 15) {
//        System.out.print(i++);
//            System.out.print(" ");
//    }}}
//
//Refactor using a loop instead
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i);
//              System.out.print(" ");
//        }}}


////  Do While//
////Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line:
//
// int count = 0;
//
//        do {
//            System.out.println("Count is: " + count * 2);
//            System.out.println("Count is actually " + count);
//            count++;
//        } while (count <= 100);
//
//        }}
//Refactor using a loop instead
//        for (int count = 0; count <= 100; count++) {
//            System.out.println("count is: " + count * 2);
//            System.out.println("count is actually " + count);
//
//        }}}


//Alter your loop to count backwards by 5's from 100 to -10.

//        int bkwds = 100;
//
//        do {
//            System.out.println("Count down by fives " + bkwds);
//            bkwds = bkwds - 5;
//        } while (bkwds >= -10);
//
//    }}
//Refactor using a loop instead
//       for (int i = 100; i >= -10; i = i - 5) {
//           System.out.println(i);
//       }}}


//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
// 2
// 4
// 16
// 256
// 65536
//my soln:
//      int i = 2;
//
//      do {
//        System.out.println("Number is squared " + Math.pow(i, 2));
//        System.out.println("Number squared " + i);
//        i = i * 2;
//    } while (i <= 1000000);
//
//    }}

//Justin's soln:
//    long i = 2;
//
//      do {
//          System.out.println((i));
//          i = i * 2;
//          } while (i <= 65536);
//
//              }}


//Refactor using a loop instead
//      for (int i =2; i <= 1000000; i = i * 2) {
//          System.out.println(i);
//}}}

//Fizzbuzz
//
//One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//  Write a program that prints the numbers from 1 to 100.

//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }}

//  For multiples of three print “Fizz” instead of the number
//  For the multiples of five print “Buzz”.
//  For numbers which are multiples of both three and five print “FizzBuzz”.
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0)
//
//                System.out.println("Multiples of 3 Fizz" + (i));
//
//            if (i % 5 == 0)
//                System.out.println("Multiples of 5 Buzz" + (i));
//
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.println("Multiples of 3 & 5 FizzBuzz" + (i));
//
//    }}}

//Display a table of powers.
//
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125


//Justin's soln each pipe character is formating columns
//padding for each of the columns 7d, 8d, 9d d some sting val; the minus before the numbers justifies the nums in col
//get the math working us i, i * i, i * i * i;




//import java.util.Scanner;
//
//        public class ControlFlowExercises {
//            public static void main(String[] args) {
//                System.out.println("ControlFlowExercises");
//
//                Scanner scanner = new Scanner(System.in);
//                boolean userContinues = true;
//
//                do {
//                    System.out.println("What number would you like?");
//                    int userInt = sc.nextInt();
//                    System.out.println();
//
//                }
//
//
//            }
//            System.out.print("Would you like to enter another number (y/n)?");
//            String userResponse = sc.next();
//            if (!userResponse.equalIgnoreCase( anotherString: 'y')) {
//            }
//        } while (userContinues)




//import java.util.Scanner;
//
//        public class ControlFlowExercises {
//            public static void main(String[] args) {
//                System.out.println("ControlFlowExercises");
//
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter a number: ");
//                String userInput = scanner.next();
//
//                System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//        int number = 1;
//        int square;
//        int cube;
//        int squareNumber;
//        int cubeNumber;
//
//        System.out.println("\nNumber\tSquare\tCubes");
//
//        while (number <= 5) {
//
//            square = number * number;
//            cube = square * number;
//            System.out.printf(" %d\t \t%d\t \t%d\n", number, square, cube);
//            number++;
//        } //end Loop
//
//    }//end main
//
//}




//
//        int rows = 5;
//        int columns = 3;
//        for(int i=1;i<=rows;i++){
//
//
//
//            for(int j=1;j<=columns;j++)
//            {
//                System.out.printf("%5s", Math.pow(i,2));
//
//                System.out.printf("%5s", Math.pow(i,3));
//
//                System.out.println("Enter an integer");
//        System.out.println("Your integer is: " + .nextInt());
//        int numb = nextInt();
//        System.out.println("Your integer is " + numb);
//            }
//            System.out.print("\n");
//
//    }}}



//Convert given number grades into letter grades.
//
//Prompt the user for a numerical grade from 0 to 100.
//Display the corresponding letter grade.
//Prompt the user to continue.
//Assume that the user will enter valid integers for the grades.
//The application should only continue if the user agrees to.
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0
//justins soln had on if statement & 3 else if, i else; the last if under userResponse breaks out of loop
//if (!userResponse.equalsIgnoreCase( anotherString: "y")){
//    anotherGrade = false;
//        }
//        } while (anotherGrade);
//        }
//        }
//import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        System.out.println("ControlFlowExercises");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a numberical grade: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//
//   int A = 100 - 88
//   int B = 87 - 80
//   int C = 79 - 67
//   int D = 66 - 60
//   int F = 59 - 0
//
//   for(int A = 100 - 88)







