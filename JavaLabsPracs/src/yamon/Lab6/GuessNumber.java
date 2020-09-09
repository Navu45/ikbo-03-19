package yamon.Lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GuessNumber extends JFrame {
    private JTextField textField;
    private int guessNumber;
    private int numOfTry;

    public GuessNumber() {
        setLayout(new GridLayout(2,1));
        setSize(300,  300);
        guessNumber = randomNumber();
        numOfTry = 0;

        textField = new JTextField("Попробуйте угадать число!");
        add(textField);

        JButton button = new JButton("ОК");
        ButtonListener buttonListener = new ButtonListener();
        button.addMouseListener(buttonListener);
        add(button);
        setVisible(true);
    }

    private void close(){
        this.dispose();
    }

    class ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            numOfTry++;
            if (numOfTry > 3) {
                JOptionPane.showMessageDialog(null,
                        "Количество попыток кончилось!\nПравильное число - " + guessNumber,
                        "Проигрыш(",JOptionPane.INFORMATION_MESSAGE);
                close();
            }
            else {
                int enteredNum = Integer.parseInt(textField.getText().trim());
                if (enteredNum == guessNumber)
                {
                    JOptionPane.showMessageDialog(null,
                            "Вы угадали!", "Победа)",JOptionPane.INFORMATION_MESSAGE);
                    close();

                }
                else {
                    JOptionPane.showMessageDialog(null,
                            "Вы не угадали!..", "Попробуйте еще.",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private int randomNumber(){
        return (int)(Math.random() * 20);
    }

    public static void main(String[] args){
        GuessNumber game = new GuessNumber();
    }
}
