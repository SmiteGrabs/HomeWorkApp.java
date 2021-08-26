package ru.volokitin.l1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Lesson8Window extends JFrame
{
 Lesson8Window()
 {
     setLocation(250,250);
     setSize(500,500);
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


     JButton myFirstButton = new JButton("Выход");
     JButton mySecondButton = new JButton("Вторая кнопка");


     JPanel myPanel = new JPanel(new GridLayout(1,2));
     myPanel.add(myFirstButton);
     myPanel.add(mySecondButton);
     add(myPanel,BorderLayout.SOUTH);

     ActionListener myButtonListener = new CloseActionListener();
     myFirstButton.addActionListener(myButtonListener);

     setVisible(true);
 }
}
