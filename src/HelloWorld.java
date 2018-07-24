public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!!!");


        int myFavoriteNumber = 7;

        System.out.println("My Favorite Number = "+ myFavoriteNumber);

        var myString = "105";

        System.out.println(myString);

        var myString2 = "Words";

        System.out.println(myString2);


        long myNumber;
        myNumber = 30000L;
        System.out.println(myNumber);


        //var myString3 = 3.14159;
//        System.out.println(myString3);

//        long myNumber = 123;
////        if you try to insert a decimal 3.14 it will not compile.
//        System.out.println(myNumber);
//
////we can use float this way as well:
//        float myNumber5 (float) = 3.14;
//        System.out.println(myNumber5);


        float myNumber2 = 3.14f;
//          if you just use 3.14 without "f" you will get an error;  Need
//        add 3.14f in order to process correctly.
        System.out.println(myNumber2);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        x++ returns the val of x & then increments ie 5 6

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        ++x increments the value of x & returns x ie 6 6

//        var class;  get an error message
//        String Class

//        int x = 4;
////        x = x + 5; short hand version below
//        x +=5;
//        System.out.println(++x);

//        int x = 3;
//        int y = 4;
//        y = y * x;  y *=x
//        System.out.println(x *= y);

//        int x = 10;
//        int y = 2;
//        x = x / y; x /=y;
//        y = y - x; y _=x;
//        System.out.println(x*=y);



        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;


    }
}

