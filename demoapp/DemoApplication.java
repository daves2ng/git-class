import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DemoApplication {

    public static void main(String[] args) {
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Print Message");
        button.addActionListener(new ActionListener() {

            private final Random random = new Random();
            private final String[] messages = new String[]{"Hello World", "Bonjour le monde", "Hallo Welt", "Hola Mundo"};

            @Override
            public void actionPerformed(ActionEvent e) {
                String message = messages[random.nextInt(messages.length)];
                textField.setText(message);
            }
        });

        JPanel contentPanel = new JPanel(new FlowLayout());
        contentPanel.add(textField);
        contentPanel.add(button);

        JFrame frame = new JFrame("Demo Application");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(contentPanel);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
