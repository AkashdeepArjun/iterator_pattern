package home;

public class Movie {

    private String title;
    private int rating;
    private String description;

    private Genre movie_genre;

    public Movie(Genre genre,String title,String description,int rating){
        this.movie_genre=genre;
        this.title=title;
        this.description=description;
        this.rating=rating;
    }
    

    public String getTitle(){return this.title;}

    public int getRating(){return this.rating;}

    public String getDescription(){return this.description;}

    public Genre getGenre(){return this.movie_genre;}

    @Override
    public String toString() {
       
        return this.title;
    }
}
