package movies;
import util.Input;
import movies.MoviesArray;

import java.util.Arrays;
/*
* /*
* Movie List

We are going to build an application that keeps track of movies and displays them by category.

*Inside of src, create a directory named movies. Create all of the classes described below in
*this directory.
*Create a class named Movie. It should have private fields for name and category, and a
*constructor that sets both of these. Create methods to access these properties and change them
* (getters and setters).
*Download the MoviesArray file and save it as MoviesArray.java inside of movies. This class has a
*static method named findAll that will return an array of Movie objects.
*Create a class named MoviesApplication that has a main method.
Give the user a list of options for viewing all the movies or viewing movies by category.
Use your Input class to get input from the user, and display information based on their choice.
(Remember to import your Input class)
If a category is selected, only movies from that category should be displayed.
Your application should continue to run until the user chooses to exit.
Sample Output


What would you like to do?

0 - exit
1 - view all movies
2 - view movies in the animated category
3 - view movies in the drama category
4 - view movies in the horror category
5 - view movies in the scifi category

Enter your choice: 1

Frankenstein -- horror
Goodfellas -- drama
Pulp Fiction -- drama
...
Bonus

Add functionality to allow a user to add a new movie to the list.
*/

public class MoviesApplication {

    static Movie[] allMovies = MoviesArray.findAll();
    static Movie[] animMovies;
    static Movie[] dramaMovies;
    static Movie[] horrorMovies;
    static Movie[] scifiMovies;
    static Movie[] genMovieList;

    public static void main(String[] args) {

        /*0 - exit
        1 - view all movies
        2 - view movies in the animated category
        3 - view movies in the drama category
        4 - view movies in the horror category
        5 - view movies in the scifi category
        */
        // testing methods
        System.out.println(getAllMovies());
       // getAnimMovies();
       // getDramaMovies();
       // getHorrorMovies();
       // getScifiMovies();
       // gelMovies("horror");
    }


    public static Movie[] getAnimMovies (){
      return gelMovies("animated");

    }
    public static Movie[] getDramaMovies(){
       return gelMovies("drama");
    }

    public static Movie[] getHorrorMovies(){
        return gelMovies("horror");
    }

    public  static Movie[] getScifiMovies(){
        return gelMovies("scifi");
    }

    public static Movie[] getAllMovies() {
        return allMovies;
    }

    public static Movie[] gelMovies(String cat) {
        int movCount = 0;
        for(Movie mov: allMovies){
            String movCat = mov.getMovCat();
            if(movCat.equals(cat)) {
                genMovieList = Arrays.copyOf(genMovieList, movCount + 1);
                genMovieList[movCount] = mov;
                movCount++;
            }

        }
        System.out.printf("The movies in the catagory of %s are : %n",cat );
        for (Movie mov : genMovieList) {
            System.out.println(mov);

        }


        return genMovieList;
    }
}
