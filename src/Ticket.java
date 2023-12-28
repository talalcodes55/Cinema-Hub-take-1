
public class Ticket {
    String forWichMovie;
    String ID;
    int price;


    public Ticket(String forWhichMovie, String ID, int price) {
        this.forWichMovie = forWhichMovie;
        this.ID = ID;
        this.price = price;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getForWhichMovie() {
        return this.forWichMovie;
    }
    
    public void setForWhichMovie(String forWichMovie) {
        this.forWichMovie = forWichMovie;
    }


    public String getForWichMovie() {
        return this.forWichMovie;
    }

    public void setForWichMovie(String forWichMovie) {
        this.forWichMovie = forWichMovie;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "{" +
            " forWichMovie='" + getForWhichMovie() + "'" +
            ", ID='" + getID() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
    
}
