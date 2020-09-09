package yamon.Lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame implements ActionListener{

    private Animator gifPanel;
    Timer timer;

    @Override
    public void actionPerformed(ActionEvent e) {
        gifPanel.repaint();
        timer.restart();
    }

    private Animation(){
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        timer = new Timer(433, this);
        gifPanel = new Animator();
        add(gifPanel);
        timer.start();
    }

    static class Animator extends JPanel {
        int currentFrame = 1;
        Animator() {

            setSize(1000,1000);
            setLayout(new BorderLayout());
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File("C:\\Users\\Алексей\\IdeaProjects\\project1_java\\src\\yamon\\Lab5\\photos\\frame-" + currentFrame + ".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert img != null;
            g.clearRect(0,0,img.getWidth(),img.getHeight());
            g.drawImage(img,0,0, null);
            if (currentFrame > 0 && currentFrame < 6)
            {
                currentFrame++;
            }
            else{
                currentFrame = 1;
            }
        }

    }

    public static void main(String[] args)
    {
        new Animation();
    }


}



