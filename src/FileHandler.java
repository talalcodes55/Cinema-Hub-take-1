import java.io.*;
import java.util.HashMap;
public class FileHandler {
    public static final String USERS_FILE = "Files\\users.txt";
    public static final String MOVIES_FILE = "Files\\movies.txt";
    public static final String FILESDIR = "Files\\";
    
    HashMap <String , Movie> movies = new HashMap<>();
    HashMap <String , User> users = new HashMap<>();
    
    public void readAllMovies() throws IOException, ClassNotFoundException{
    
        FileInputStream fis = new FileInputStream(MOVIES_FILE);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Movie movie;
        while (( movie = (Movie)ois.readObject()) != null) {
           movies.put(movie.getTitle(), movie);
        }
            ois.close();
    }   

    public void readAllUsers() throws IOException, ClassNotFoundException, FileNotFoundException{

        FileInputStream fis = new FileInputStream(USERS_FILE);
        ObjectInputStream ois = new ObjectInputStream(fis);
        User user;

        while ((user = (User)ois.readObject()) != null){
            users.put(user.getUsername(), user);
        }
        ois.close();
    }
}
