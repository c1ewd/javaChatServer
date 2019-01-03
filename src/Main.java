import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Chat Server!");

        Server server = new Server();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                server.createGUI();
            }
        });
    }
}


class Server extends JFrame {

    static void createGUI() {
        JFrame frame = new JFrame("Java Chat Server");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem listenerItem = new JMenuItem("Listener");
        fileMenu.add(listenerItem);

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu aboutMenu = new JMenu("About");

        JMenuItem aboutItem = new JMenuItem("About");
        aboutMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(aboutMenu);

        frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(270, 225));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


}