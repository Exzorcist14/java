package ru.mirea.lab8.ex1;

import javax.swing.*;
import java.awt.*;

public class RandomShapes extends JFrame
{
    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[20];
        for (int i = 0; i < 20; i++)
        {
            shapes[i] = new Circle();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
    }

    @Override
    public void paint(Graphics graph)
    {
        super.paint(graph);
        for (Shape shape : shapes)
        {
            shape.Draw(graph);
        }
    }
}
