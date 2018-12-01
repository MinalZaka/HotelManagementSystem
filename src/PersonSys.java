import java.util.ArrayList;

/**
 *
 * @author Minal Zaka
 */
public class PersonSys {

    public static ArrayList<Person> people = new ArrayList<Person>();

    public static boolean addPerson(Person m) 
    {
        if(searchPerson(m.getId())!=null)
            return false;
        people.add(m);
        return true;
    }

    public static boolean removePerson(String id) 
    {
        Person p=searchPerson(id);
        if(p==null)
            return false;
        people.remove(p);
        return true;
    }

    public static Person searchPerson(String id) 
    {
        for (int i = 0; i < people.size(); i++) 
        {
            if (people.get(i).getId().equalsIgnoreCase(id)) 
            {
                return people.get(i);
            }
        }
        return null;
    }
    
    public static ArrayList<Person> getAllPeople()
    {
        return  people;
    }
    
    public static String displayPeople()
    {
        String output="";
        for(Person p: people)
        {
            output+=p.toString()+"\n";
        }
        return output;
    }
}
