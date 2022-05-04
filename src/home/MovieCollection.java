package home;

public interface MovieCollection {
    public void addMovie(Movie movie);
    public void removeMovie(Movie movie);
    public MovieIterator iterator(Genre genre);
    
}
