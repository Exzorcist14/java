package ru.mirea.lab8.ex3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame
{
    private final BufferedImage[] Images;
    private int CurrentImage = 0;

    public Animation() throws IOException
    {
        Images = new BufferedImage[] {
                loadImage("C:\\Users\\vova_\\IdeaProjects\\labs\\src\\ru\\mirea\\lab8\\ex3\\1.jpg"),
                loadImage("C:\\Users\\vova_\\IdeaProjects\\labs\\src\\ru\\mirea\\lab8\\ex3\\2.jpg"),
                loadImage("C:\\Users\\vova_\\IdeaProjects\\labs\\src\\ru\\mirea\\lab8\\ex3\\3.jpg"),
                loadImage("C:\\Users\\vova_\\IdeaProjects\\labs\\src\\ru\\mirea\\lab8\\ex3\\4.jpg")
        };

        Timer timer = new Timer(1500, listener -> {
            repaint();
            CurrentImage++;
            if (CurrentImage >= Images.length) {
                CurrentImage = 0;
            }
        });
        timer.start();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    @Override
    public void paint(Graphics graph)
    {
        super.paint(graph);
        graph.drawImage(Images[CurrentImage], 0, 0, this);
    }

    private BufferedImage loadImage(String imagePath) throws IOException
    {
        return ImageIO.read(new File(imagePath));
    }
}
