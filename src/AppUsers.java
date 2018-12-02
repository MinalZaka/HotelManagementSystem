/**
 *
 * @author Resulkary Saparov
 */
public class AppUsers extends Staff
{
    private String username;
    private String password;
    private boolean admin;

    public AppUsers (String id, String fname, String lname, int age, 
            String gender, String phoneNo, double salary, String hireDate, String username, String password, boolean admin)
    {
        super(id, fname, lname, age, gender, phoneNo, salary, hireDate);
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    @Override
    public double calculateIncome()
    {
        double inc;
        
        String[] date = hireDate.split(".");
        int experience = Integer.parseInt(date[2]);
        
        inc = (salary * (1 + experience / 100)) * 1.1;
        
        if(admin)
            inc+=1500;
        
        return inc;
    }

    @Override
    public String toString()
    {
        return "AppUsers\n" + super.toString() + "\n";
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
