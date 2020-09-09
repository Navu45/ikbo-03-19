package yamon.Prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISport extends JFrame {
    private JButton realMadridButton = new JButton("Real Madrid");
    private JButton acMilan = new JButton("AC Milan");
    private int realMadridScore = 0;
    private int acMilanScore = 0;
    private JPanel[] panels = new JPanel[9];
    private JLabel scoreLabel = new JLabel("Result: 0 X 0");
    private JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    private Label winnerLabel = new Label("Winner: DRAW");

    GUISport() {

        super("Real Madrid vs AC Milan");
        setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9; i++)
        {
            panels[i] = new JPanel();
            add(panels[i]);
        }

        panels[1].setLayout(new BorderLayout());
        panels[1].add(lastScorerLabel, BorderLayout.CENTER);

        panels[3].setLayout(new BorderLayout());
        panels[3].add(acMilan, BorderLayout.CENTER);
        acMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreLabel.setText("Result: " + ++acMilanScore + " X " + realMadridScore);
                lastScorerLabel.setText("Last Scorer: AC Milan");
            }
        });

        panels[4].setLayout(new BorderLayout());
        panels[4].add(scoreLabel, BorderLayout.CENTER);

        panels[5].setLayout(new BorderLayout());
        panels[5].add(realMadridButton, BorderLayout.CENTER);
        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreLabel.setText("Result: " + acMilanScore + " X " + ++realMadridScore);
                lastScorerLabel.setText("Last Scorer: Real Madrid");
            }
        });

        panels[7].setLayout(new BorderLayout());
        panels[7].add(winnerLabel, BorderLayout.CENTER);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] main) {
        new GUISport();
    }

}
