package ru.mirea.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");

    Label result = new Label("Result: 0 X 0");
    Label lastScorer = new Label("N/A");
    Label winner = new Label("Winner: DRAW");

    int milanScore;
    int madridScore;

    public GUI() {
        super("Футбольный матч");
        setLayout(new BorderLayout());

        add(milan, BorderLayout.NORTH);
        add(madrid, BorderLayout.SOUTH);

        add(result, BorderLayout.CENTER);
        result.setAlignment(Label.CENTER);

        add(lastScorer, BorderLayout.WEST);
        add(winner, BorderLayout.EAST);

        milan.addMouseListener(new addScoreToMilan());
        madrid.addMouseListener(new addScoreToMadrid());

        setSize(854,480);
    }

    public class addScoreToMilan implements MouseListener {
        public void mouseClicked(MouseEvent a) {
            milanScore++;

            updateData("AC Milan");
        }

        public void mouseExited(MouseEvent a) {}
        public void mouseEntered(MouseEvent a) {}
        public void mouseReleased(MouseEvent a) {}
        public void mousePressed(MouseEvent a) {}
    }

    public class addScoreToMadrid implements MouseListener {
        public void mouseClicked(MouseEvent a) {
            madridScore++;

            updateData("Real Madrid");
        }

        public void mouseExited(MouseEvent a) {}
        public void mouseEntered(MouseEvent a) {}
        public void mouseReleased(MouseEvent a) {}
        public void mousePressed(MouseEvent a) {}
    }

    public void updateData(String scorer) {
        result.setText("Result: " + milanScore + " X " + madridScore);
        lastScorer.setText(scorer);

        if (milanScore > madridScore) {
            winner.setText("Winner: AC Milan");
        }

        else if (madridScore > milanScore) {
            winner.setText("Winner: Real Madrid");
        }

        else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}

















/*
    setLayout(new FlowLayout());
    add(milan);
    add(madrid);
    add(result);
    add(lastScorer);
    add(winner);
*/



