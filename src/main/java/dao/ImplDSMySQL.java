//http://linux-notes.org/ustanovka-mysql-na-debian-ubuntu-linux-mint/
package dao;

import model.Person;
import java.sql.Connection;

import java.util.ArrayList;

public class ImplDSMySQL implements InterfaceDS
{
    Connection connection;

    public void create(Person p) {

    }

    public ArrayList<Person> read() {
        return null;
    }

    public void update() {

    }

    public void delete() {

    }
}
