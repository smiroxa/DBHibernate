package ui;

import dao.ImplDSMySQL;
import dao.InterfaceDS;
import model.Person;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel
{
    public MainPanel()
    {
        createButtons();
        MyTableModel myTableModel = new MyTableModel();
        JTable jTable = new JTable(myTableModel);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        add(jScrollPane);
    }

    private void createButtons()
    {
        String[] arrButtons = new String[]{"create", "read", "update", "delete"};
        EventHandler eventHandler = new EventHandler();
        for (String current : arrButtons)
        {
            JButton jButton = new JButton(current);
            jButton.setActionCommand(current);
            jButton.addActionListener(eventHandler);
            add(jButton);
        }
    }
}
