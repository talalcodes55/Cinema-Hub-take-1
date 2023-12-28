import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    
        private String username;
        private String password;
        private String bankAccId;
        private int balance;
        private ArrayList<Ticket> tickets;
        
        public User(String username, String password,String bankAccId,int balance) {
            this.username = username;
            this.password = password;
            this.bankAccId = bankAccId;
            this.balance = balance;
            this.tickets = new ArrayList<>();
        }
        

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankAccId() {
        return this.bankAccId;
    }

    public void setBankAccId(String bankAccId) {
        this.bankAccId = bankAccId;
    }
    
    public void setTickets(ArrayList<Ticket> tickets){
        this.tickets = tickets;
    }

    public void addTickets(Ticket ticket){
        tickets.add(ticket);
    }

    public void deleteTickets(String ID){
        Ticket ticketToRemove = null;
        for (Ticket ticket : tickets) {
            if (ticket.getID() == ID) {
                ticketToRemove = ticket;
                break;
            }
        }
        if (ticketToRemove != null) {
            tickets.remove(ticketToRemove);
        }
    }

    public ArrayList<Ticket> getTickets(){
        return this.tickets;
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", tickets='" + getTickets() + "'" +
            "}";
    }

    
}
