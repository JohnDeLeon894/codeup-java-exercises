import java.util.*;
import util.Input;
public class ArraysExercises {

    /*Array Basics

Create a class inside of src named ArraysExercises. Create a main method for this class to do your work

What happens when you run the following code? Why is Arrays.toString necessary?


int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers);
Create an array that holds 3 Person objects. Assign a new instance of the Person class to each
element. Iterate through the array and print out the name of each person in the array.

Create a static method named addPerson. It should accept an array of Person objects, as well as
a single person object to add to the passed array. It should return an array whose length is 1
greater than the passed array, with the passed person object at the end of the array.
*/
    public static void main(String[] args) {
        Input sc = new Input();
//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int n : numbers){
//            System.out.println(n);
//        }

        Person[] people;
        people = new Person[3];

        for (int i=0; i<3 ; i++) {
            String maName = "Person-" + i ;
            Person person = new Person(maName);
            people[i]=person;
        }
        for (Person p: people){
            String name = sc.getString();
            p.setName(name);
            p.sayHello();
        }
        printArray(people);
        people = addPerson(people, "Muhamet");
        printArray(people);
        people = addPerson(people, "Angelique");


    }
    private static Person[] addPerson(Person[] oldArray, String name){
        Person[] people;
        int newLength = oldArray.length+1;
        Person newPerson = new Person(name);
        people = Arrays.copyOf(oldArray, newLength);
        people[newLength-1] = newPerson;
        //printArray(people);
        return people;
    }

    private static void printArray(Person[] arr){
        for (Person p: arr){
            System.out.println("This array includes " + p.getName() + " :end:");
        }
    }

}
