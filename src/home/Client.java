package home;

public class Client {

    public static void main(String[] args){

        MovieCollection movies_db= populateMovies();
        MovieIterator movie_iterator=movies_db.iterator(Genre.ROMANCE);
        while(movie_iterator.hasNext()){
            MyUtils.log("ROMANTIC GENRE MOVIE", movie_iterator.next().toString());
        }


    }

    public static MovieCollection populateMovies(){
        MovieCollection movie_collection =new MovieCollectionImp();
        movie_collection.addMovie(new Movie(Genre.ACTION, "avengers", "marvel superhero movie", 5));
        movie_collection.addMovie(new Movie(Genre.HORROR, "alien 1979", "space scifi horro movie", 9));
        movie_collection.addMovie(new Movie(Genre.ROMANCE, "titanic", "romantic love story", 8));
        movie_collection.addMovie(new Movie(Genre.ROMANCE, "true love", "description", 9));
        return movie_collection;
    }
    
    
}
