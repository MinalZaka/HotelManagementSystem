/**
 *
 * @author Minal Zaka
 */
public class Guests extends Person
{
    private Room roomSelected;
    private int daysStayed;

    public Guests(String id, String fname, String lname, int age, String gender, 
            String phoneNo, Room roomSelected, int daysStayed) 
    {
        super(id, fname, lname, age, gender, phoneNo);
        this.roomSelected = roomSelected;
        this.daysStayed = daysStayed;
    }

    public int getDaysStayed()
    {
        return daysStayed;
    }
    
    public String getRoom()
    {
        return roomSelected;
    }
       
    @Override
    public String toString()
    {
        return "Guest Information:\n" 
                + super.toString()
                + "\nRoom: " + roomSelected
                + "\nDays Stayed: " + daysStayed
                + "\n";
    }
}
