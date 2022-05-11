import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyControls extends Frame{
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    KeyControls()
    {
        super();
        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP") , "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN") , "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT") , "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT") , "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        getWindow().add(label);
    }

    public class UpAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY() - 10);
        }
    }

    public class DownAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY() + 10);
        }
    }

    public class LeftAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10,label.getY());
        }
    }

    public class RightAction extends AbstractAction
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10,label.getY());
        }
    }
}
