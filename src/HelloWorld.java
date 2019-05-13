public class HelloWorld {


    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.println("World!!!");

//        Create an int variable named myFavoriteNumber and assign your favorite number to it,
//        then print it out to the console.
        int myFavoriteNumber = 666;
        System.out.println(myFavoriteNumber);
        //Create a String variable named myString and assign a string value to it, then print
        // the variable out to the console.

        String myString = "This variable is a string. These words are it's value.";
        System.out.println(myString);

//        Change your code to assign a character value to myString. What do you notice?

//        myString = (char)'D'; I notice this can't be done.
//        Change your code to assign the value 3.14159 to myString. What happens?

        myString = "3.14159"; // I notice that it will only take it in the form of a string.

//      Declare an long variable named myNumber, but do not assign anything to it.  Next try to
//      print out myNumber to the console. What happens?
        long myNumber;
        // System.out.print(myNumber); will not print due to no variable assigned.
//        Change your code to assign the value 3.14 to myNumber. What do you notice?

        // myNumber = 3.14; // I can't assign it a float or a double.
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        // myNumber = 123L; // seems to work fine.
//        Change your code to assign the value 123 to myNumber.
        myNumber = 123; // works fine...
//      Change your code to declare myNumber as a float. Assign the value 3.14 to it. What
//      happens? What are two ways we could fix this?

        myNumber = (long) 3.14;

        System.out.println(myNumber);
//      Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);
//      Try to create a variable named class. What happens?
//        String class = "classic";

//         Object is the most generic type in Java. You can assign any value to a variable of
//         type Object. What do you think will happen when the following code is run?
//
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//Copy and paste the code above and then run it. Does the result match with your expectation?
//
//How is the above example different from this code block?
//
//
//        int three = (int) "three";
//What are the two different types of errors we are observing?
//        Rewrite the following expressions using the relevant shorthand assignment operators:


        x = 4;
        x += 5;

        x = 3;
        int y = 4;
        y *= x;
        System.out.println(x +" " + y);
        x = 10;
        y = 2;
        x /= y;
        y -= x;
        System.out.println(x +" " + y);

    }


}




