package yamon.Lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PaintingAtWindow extends JFrame {

    private PaintingAtWindow(String path) {
        setLayout(null);
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert myPicture != null;
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JPanel panel = new JPanel();
        panel.add(picLabel);
        panel.setSize(1000, 1000);
        add(panel);
        setVisible(true);
        setSize(1000, 1000);
    }

    public static void main(String[] args) {
        for (String argument: args){
            new PaintingAtWindow(argument);
        }
    }
}
