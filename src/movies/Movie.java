package movies;

public class Movie {
    private String name;
    private String category;
//need constructor below your class variables
//    rules of constructor need to be public, name of method needs to be same as class
//    ()put both parameters what you need which are strings(data type) and add name of class; parameter need name this.name = movieName

    public Movie(String movieName, String categoryType){
        this.name = movieName;
        this.category = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}




