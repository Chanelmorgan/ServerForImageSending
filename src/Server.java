import javax.swing.*;
import java.awt.*;

public class Server {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Server");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabelText = new JLabel("Waiting for image from client...");

        jFrame.add(jLabelText, BorderLayout.SOUTH);

        jFrame.setVisible(true);


    }
}
