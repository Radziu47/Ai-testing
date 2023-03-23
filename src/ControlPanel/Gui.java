package ControlPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JPanel {
    private JButton sendTo;
    private JButton start;
    private JLabel sendText;
    private JLabel getText;
    private JLabel Sended;
    private JLabel Getted;
    private JToggleButton automate;

    public Gui() {
        //construct components
        sendTo = new JButton ("Wyslij Text");
        start = new JButton ("Start");
        sendText = new JLabel ();
        getText = new JLabel ();
        Sended = new JLabel ("Wyślesz:");
        Getted = new JLabel ("Pobrano:");
        automate = new JToggleButton ("Automat", false);

        //adjust size and set layout
        setPreferredSize (new Dimension (986, 589));
        setLayout (null);

        //add components
        add (sendTo);
        add (start);
        add (sendText);
        add (getText);
        add (Sended);
        add (Getted);
        add (automate);

        //set component bounds (only needed by Absolute Positioning)
        sendTo.setBounds (40, 150, 150, 50);
        start.setBounds (380, 480, 205, 85);
        sendText.setBounds (100, 100, 100, 25);
        getText.setBounds (100, 70, 100, 25);
        Sended.setBounds (40, 100, 100, 25);
        Getted.setBounds (40, 70, 100, 25);
        automate.setBounds (885, 560, 100, 25);

        sendTo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                GuiController.ToWebsite();
            }
        });
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                GuiController.ToWebsite();
            }
        });
        sendTo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                GuiController.ToWebsite();
            }
        });
    }

    public String getSendText() {
        return sendText.getText();
    }

    public void setSendText(String sendText) {
        this.sendText.setText(sendText);
    }

    public String getGetText() {
        return getText.getText();
    }

    public void setGetText(String getText) {
        this.getText.setText(getText);
    }
}