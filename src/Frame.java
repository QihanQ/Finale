import javax.swing.*;

public class Frame
{
    private JFrame window;

    public Frame()
    {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(420,420);
        window.setTitle("Defeat Covid!");
        window.setLayout(null);
        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }
}