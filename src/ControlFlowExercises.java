public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("ControlFlowExercises");

//Loop Basics
//
//While
//Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.

//    int i = 5;
//
//    while (i <= 15) {
//        System.out.println(i++);
//    }
//
//Refactor using a loop instead
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
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


//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

//      int i = 2;
//
//      do {
//        System.out.println("Number is squared " + Math.pow(i, 2));
//        System.out.println("Number squared " + i);
//        i = i * 2;
//    } while (i <= 1000000);
//
//    }}
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
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0)

                System.out.println("Multiples of 3 Fizz" + (i));

            if (i % 5 == 0)
                System.out.println("Multiples of 5 Buzz" + (i));

            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Multiples of 3 & 5 FizzBuzz" + (i));

    }}}



//  For the multiples of five print “Buzz”.
//  For numbers which are multiples of both three and five print “FizzBuzz”.










