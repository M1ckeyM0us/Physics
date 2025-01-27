import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //creating instance of JFrame
        JFrame f = new JFrame();
        f.setSize(400, 400);

        Arena myPanel = new Arena();
        //myPanel.setBackground(Color.BLUE);

        f.add(myPanel);

        f.setVisible(true);
    }
}