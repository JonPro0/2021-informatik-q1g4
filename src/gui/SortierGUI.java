package gui;

import sortieren.BubbleSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUI extends JFrame {
    private JPanel pMain;
    private JTextArea taAusgabe;
    private JButton bSortieren;
    private JPanel pButtons;
    private JPanel pOutput;
    private JPanel POut;
    private ArrayPanel pArray;
    private SortierAusgabe ausgabe;
    private int[] array;

    public SortierGUI() {
        array = new int[]{3, 13, 2, 4, 8};
        ausgabe = new SortierAusgabe(taAusgabe);
        pArray = new ArrayPanel(array);
        bSortieren.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread() {
                    public void run() {
                        BubbleSort bsort = new BubbleSort(array, ausgabe);
                        bsort.sortieren(pArray, ausgabe);
                    }
                }.start();
            }
        });
        POut.add(pArray);


        add(pMain);
        setSize(800, 600);
        setTitle("Mein Fenster 11G4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortierGUI();
    }
}
