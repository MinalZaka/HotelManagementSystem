/**
 *
 * @author Resulkary Saparov
 */
public class OtherStaff extends Staff
{
    private final String jobName;
    private final boolean partTime;

    public OtherStaff(String id, String fname, String lname, int age, 
            String gender, String phoneNo, double salary, String hireDate, String jobName, boolean partTime)
    {
        super(id, fname, lname, age, gender, phoneNo, salary, hireDate);
        this.jobName = jobName;
        this.partTime = partTime;
    }

    @Override
    public double calculateIncome()
    {
        String[] date = hireDate.split(".");
        int experience = Integer.parseInt(date[2]);
        double income = salary;
        
        if (partTime)
            income *= .9; 
        
        return income * (1 + experience / 100);
    }

    @Override
    public String toString()
    {
        return "OtherStaff\n"
                + super.toString()
                + "\nJob Name: " + jobName
                + "\nPart Time: " + partTime
                + "\n";
    }
}
