package movies;

public class Movie {
    private String name;
    private String category;

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




