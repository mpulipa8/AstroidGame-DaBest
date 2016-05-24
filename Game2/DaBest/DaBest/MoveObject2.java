package DaBest;

import java.awt.*;

import java.applet.*;

import java.awt.event.*;

public class MoveObject2 extends Applet implements ActionListener

{

    Button upButton, downButton, leftButton, rightButton, resetButton;

    TextField notice;

    Panel panel1;


    int x = 165; // x coordinate of the ball

    int y = 140; // y coordinate of the ball


    public void init()

    {

        setBackground(Color.yellow);

        this.setLayout(null);  //set layout manager to null here

        upButton = new Button("Up"); // creates up button

        add(upButton);

        upButton.setBounds(0, 0, 150, 30); // specified the x, y and width and height of the button.

        downButton = new Button("Down");

        add(downButton);

        downButton.setBounds(0, 40, 50, 30);

        leftButton = new Button("Left");

        add(leftButton);

        leftButton.setBounds(0, 80, 50, 30);

        rightButton = new Button("Right");

        add(rightButton);

        rightButton.setBounds(0, 120, 50, 30);

        resetButton = new Button("Reset");

        add(resetButton);

        resetButton.setBounds(0, 160, 50, 30);

        notice = new TextField("",25);

        add(notice);

        notice.setBounds(60, 400, 200, 20);


        //adds an ActionListener to all of the buttons to be able to receive commands

        upButton.addActionListener(this);

        downButton.addActionListener(this);

        leftButton.addActionListener(this);

        rightButton.addActionListener(this);

        resetButton.addActionListener(this);

    }

    public void paint(Graphics g)

    {

        this.resize(650,450);

        g.setColor(Color.white);

        g.fillRect(60,40,480,350); //added 40 to x coordinates to leave space for buttons

        g.setColor(Color.orange);

        g.fillOval(x+40,y,150,150); //added 40 to starting x coordinate.


    }

    // receiver of the ActionListener method

    public void actionPerformed(ActionEvent e)

    {

        if(e.getSource() == upButton)

        {

            upButton.setBackground(Color.red);

            downButton.setBackground(Color.lightGray);

            leftButton.setBackground(Color.lightGray);

            rightButton.setBackground(Color.lightGray);

            resetButton.setBackground(Color.lightGray);

        }

        else if (e.getSource() == downButton)

        {

            downButton.setBackground(Color.red);

            upButton.setBackground(Color.lightGray);

            leftButton.setBackground(Color.lightGray);

            rightButton.setBackground(Color.lightGray);

            resetButton.setBackground(Color.lightGray);

        }

        else if (e.getSource() == leftButton)

        {


            leftButton.setBackground(Color.red);

            downButton.setBackground(Color.lightGray);

            upButton.setBackground(Color.lightGray);

            rightButton.setBackground(Color.lightGray);

            resetButton.setBackground(Color.lightGray);

        }

        else if (e.getSource() == rightButton)

        {


            rightButton.setBackground(Color.red);

            downButton.setBackground(Color.lightGray);

            leftButton.setBackground(Color.lightGray);

            upButton.setBackground(Color.lightGray);

            resetButton.setBackground(Color.lightGray);

        }

        else if (e.getSource() == resetButton)

        {


            resetButton.setBackground(Color.red);

            rightButton.setBackground(Color.lightGray);

            downButton.setBackground(Color.lightGray);

            leftButton.setBackground(Color.lightGray);

            upButton.setBackground(Color.lightGray);


        }

    }

}
