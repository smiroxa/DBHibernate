package ui;

import dao.DataBase;
import model.Person;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
    DataBase dataBase = new DataBase();
    private Person person;

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        if (command.equals("create"))
        {
//            dataBase.create(person);
        }

        else if (command.equals("read"))
        {
            try
            {
                dataBase.read();
            } catch (Exception e1)
            {
                e1.printStackTrace();
            }
        }

        else if (command.equals("update"))
        {
//            dataBase.update();
        }
        else if (command.equals("delete"))
        {
//            dataBase.delete();
        }
    }
}
