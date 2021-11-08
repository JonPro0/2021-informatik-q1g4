package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUI extends JFrame {
    private JPanel pMain;
    private JTextArea taAusgabe;
    private JButton bSortieren;
    private JPanel second;
    private JPanel first;

    public SortierGUI() {
        bSortieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ausgabe = SortierAusgabe.sortieren();
                taAusgabe.setText(ausgabe);
            }
        });



        add(pMain);
        setSize(800, 600);
        setTitle("Mein Fenster 11");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortierGUI();
    }
}
