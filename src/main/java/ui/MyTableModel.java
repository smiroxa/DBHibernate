package ui;

import model.Person;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class MyTableModel extends AbstractTableModel
{
    ArrayList<Person> persons = null;

    public MyTableModel()
    {
        persons = init();
    }

    private ArrayList<Person> init()
    {
        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add( new Person(34,"Gala","Groove",23) );
        persons.add( new Person(37,"Hula","Godunov",26) );
        persons.add( new Person(23,"Paula","Groom's",29) );
        persons.add( new Person(11,"Fla","Protozoa",19) );
        persons.add( new Person(19,"Kala","Who've",41) );

        return persons;
    }

    public int getRowCount()
    {
        return persons.size();
    }

    public int getColumnCount()
    {
        return 4;
    }

    public Object getValueAt(int row, int col)
    {
        Object  data = null;
        Person person = persons.get(row);
        switch (col)
        {
            case 0:
                data = person.getId();
                break;
            case 1:
                data = person.getFname();
                break;
            case 2:
                data = person.getLname();
                break;
            case 3:
                data = person.getAge();
                break;
        }
        return data;
    }
}
