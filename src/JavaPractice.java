////================================= METHOD BONUSES
////
////        ------ 1 ------
////        Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
////
////        EXAMPLE...
////
////        INPUT: countVowels("cat")
////
////        OUTPUT:
////        |======== VOWEL COUNT ========|
////        | A's | E's | I's | O's | U's |
////        | 1   | 0   | 0   | 0   | 0   |
////        |=============================|
////
////        countVowels() will use...
////        countAs(),
////        countEs(),
////        countIs(),
////        countOs(),
////        and countUs()
//
//import java.util.Scanner;
//
//
//
//public class JavaPractice {
////        public static void main(String[] args) {
////
////        Scanner input = new Scanner(System.in);
////        System.out.println("Give me a word");
////        String word = input.nextLine();
////
////
////
////        public static int countVowels(String word)
////        for (int i = 0; i < word.length(); i++) {
////            if (word.charAt(i) == ('a') || word.charAt(i) == ('i') || word.charAt(i) == ('o') || word.charAt(i) == ('u') || word.charAt(i) == ('e')) {
////                return word + " contains a vowel";
////            }
////        }
////        return word + " does not contain a vowel";
////
////
////    }
////
////}
//
// public static String hasVowel(String input) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a string to check if it has any vowels");
//        input = scan.nextLine();
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == ('a') || input.charAt(i) == ('e') || input.charAt(i) == ('i') ||
//                    input.charAt(i) == ('o') || input.charAt(i) == ('u')) {
//                return input + " contains a vowel";
//            }
//        }
//        return input + " does not contain a vowel";
//    }
//     public static void main(String[] input) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter something:");
//         input = scan.nextLine();


//
//     }}