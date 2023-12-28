import java.io.*;
import java.util.ArrayList;

public class Ticketing {
    // display available seats for a movie:
    public static ArrayList<Integer> displayAvailableSeats(Movie movie, int showtime)
                throws IOException, FileNotFoundException {

            ArrayList<Integer> availableSeats = new ArrayList<>();
            FileReader fr = new FileReader(FileHandler.FILESDIR + movie.getTitle() + ".txt");
            BufferedReader br = new BufferedReader(fr);
        try {

            String line;
            while ((line = br.readLine()) != null) {
                String[] ID = line.split(",");
                String seat = ID[2];
                if (showtime == Integer.parseInt(seat) && !line.contains("#")) {
                    availableSeats.add(Integer.parseInt(seat));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            br.close();
        }
        return availableSeats;
    }

    // Book a ticket by a user:
    public static void book(User user, Movie movie, int month, int day, int showtime, int seatNumber)
            throws IOException, FileNotFoundException {
                
                FileWriter fw = new FileWriter(FileHandler.FILESDIR + movie.getTitle() + ".txt");
                FileReader fr = new FileReader(FileHandler.FILESDIR + movie.getTitle() + ".txt");
                BufferedWriter bw = new BufferedWriter(fw);
                BufferedReader br = new BufferedReader(fr);
        try {

            String ID = Integer.toString(month) + "," + Integer.toString(day) + "," + Integer.toString(showtime) + ","
                    + Integer.toString(seatNumber);
            String line;
             
            Ticket ticket = new Ticket(movie.getTitle(), ID, 100);
            user.addTickets(ticket);

            while ((line = br.readLine()) != null) {
                bw.write(line.replaceAll(ID, ID + "#"));
            }

            user.setBalance(user.getBalance() - 100);
            user.setTickets(user.getTickets());
   
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e){
            e.printStackTrace();
        }
        finally{
            bw.close();
            br.close();
        }
    }

    public static void unBook(User user, Movie movie, String ID)throws FileNotFoundException, IOException{

        FileWriter fw = new FileWriter(FileHandler.FILESDIR + movie.getTitle() + ".txt");
        FileReader fr = new FileReader(FileHandler.FILESDIR + movie.getTitle() + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);

        try {
            String line;
            String takenID = ID + "#";

            while ((line = br.readLine()) != null) {
                
                if (line.equals(takenID)) {
                    bw.write(line.replaceAll(line, ID));
                }
            }
            user.deleteTickets(ID);
            user.setTickets(user.getTickets());
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        finally{
            bw.close();
            br.close();
        }
    }

}
