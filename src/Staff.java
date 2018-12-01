/**
 *
 * @author Resulkary Saparov
 */
public abstract class Staff extends Person 
{
    protected final double salary;
    protected final String hireDate;

    public Staff(String id, String fname, String lname, int age, String gender, String phoneNo, double salary, String hireDate)
    {
        super(id, fname, lname, age, gender, phoneNo);
        this.salary = salary;
        this.hireDate = hireDate;
    }
    
    public abstract double calculateIncome();

    @Override
    public String toString()
    {
        return "Staff"
                + super.toString()
                + "\nSalary:" + salary 
                + "\nHire Date: " + hireDate;
    }
}
