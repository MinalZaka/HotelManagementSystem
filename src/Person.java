/**
 *
 * @author Minal Zaka
 */
public class Person 
{

    protected String id;
    protected String fname;
    protected String lname;
    protected int age;
    protected String gender;
    protected String phoneNo;

    public Person(String id, String fname, String lname, int age, String gender, String phoneNo) 
    {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }
    

    public String getId() 
    {
        return id;
    }

    @Override
    public String toString() 
    {
        return "Person\n"
                + "Person Id: " + id
                + "\nFirst Name:" + fname
                + "\nLast Name: " + lname
                + "\nAge: " + age
                + "\nGender: " + gender
                + "\nPhone Number: " + phoneNo
                + "\n";
    }

}
