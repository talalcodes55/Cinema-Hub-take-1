import java.io.Serializable;


public class Movie implements Serializable {
        
        private String title;       
        private String rating ;      
        private String genre;       
        private String thumbnail;

    public Movie(String title, String rating, String genre, String thumbnail) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
        
        
}
