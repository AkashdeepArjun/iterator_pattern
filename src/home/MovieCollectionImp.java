package home;

import java.util.*;
public class MovieCollectionImp implements MovieCollection{
    private List<Movie> movies;

    public MovieCollectionImp(){movies=new ArrayList<Movie>();}


    @Override
    public void addMovie(Movie movie) {
      
        this.movies.add(movie);
        
    }
    @Override
    public MovieIterator iterator(Genre genre) {
       
        return new MovieIteratorImp(genre, this.movies);
    }

    @Override
    public void removeMovie(Movie movie) {
    
        this.movies.remove(movie);
    }

    private class MovieIteratorImp implements MovieIterator{

        private Genre movie_genre;
        private int position=0;
    
        public MovieIteratorImp(Genre movie_genre,List<Movie> movies_list){
            this.movie_genre=movie_genre;
            movies=movies_list;
        }
    
        @Override
        public boolean hasNext() {
            while(position < movies.size()){
                Movie movie=movies.get(position);
                if(movie.getGenre().equals(this.movie_genre) || this.movie_genre.equals(Genre.ALL)){
                    return true;
                }else{
                    position++;
                }
            }
            return false;
        }
    
        @Override
        public Movie next() {
            Movie movie=movies.get(position);
            position++;
            return movie;
        }






}}
