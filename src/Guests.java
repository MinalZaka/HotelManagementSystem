/**
 *
 * @author Minal Zaka
 */
public class Guests extends Person
{
    private final Room roomSelected;
    private final int daysStayed;

    public Guests(Room roomSelected, int daysStayed, String id, String fname, String lname, int age, String gender, String phoneNo) 
    {
        super(id, fname, lname, age, gender, phoneNo);
        this.roomSelected = roomSelected;
        this.daysStayed = daysStayed;
    }
       
    @Override
    public String toString()
    {
        return "Guest Information:\n" + super.toString()
                + "Room: " + roomSelected.toString()
                + "Days Stayed: " + daysStayed
                + "\n";
    }   
}
