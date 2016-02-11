package ui;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
    public MainFrame()
    {
        setTitle("MainFrame hibernate app");
        setBounds(200,200,500,500);
        add(new MainPanel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
