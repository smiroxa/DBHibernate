package dao;

import model.Person;

import java.util.ArrayList;

public interface InterfaceDS
{
    void create(Person p);
    ArrayList<Person> read();
    void update();
    void delete();
}
