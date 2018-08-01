package movies;


import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
//        data type input & input name
//        another option is to use Input.getInt(0,5) as a switch statement
// switch(input.getInt(0, 5){
//        case 0:
//          System.exit(0); used to exit program
//          break;
//        case 1:
//        for(Movie movie: movies){
//          System.out.println("Title ;
        Input input = new Input();
//        can use Movie[] movies = Movies.Array.findAll();
        String userChoice;

        System.out.println("Welcome to the Movie List");
        System.out.println("Please select from the following options...");

        do {
            showMenu();
            System.out.println("Enter your choice: ");
            userChoice = input.getString();

            if (userChoice.equals("1")) {
                showAll();
            } else if (userChoice.equals("2")) {
                showMoviesByCategory("animated");
            } else if (userChoice.equals("3")) {
                showMoviesByCategory("drama");
            } else if (userChoice.equals("4")) {
                showMoviesByCategory("horror");
            } else if (userChoice.equals("5")) {
                showMoviesByCategory("scifi");
            }
            System.out.println();

        } while (!userChoice.equals("0"));

        System.out.println("Thanks for using Movie List!");

    }

    public static void showMenu() {
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
    }

    public static void showMoviesByCategory(String category) {
        Movie[] allMovies = MoviesArray.findAll();

        for(Movie movie : allMovies){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void showAll() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }
}







