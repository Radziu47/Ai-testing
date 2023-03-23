package ControlPanel;

import SeleniumController.SelenumWebsiteController;

import javax.swing.*;

public class GuiController {
    private static Gui newGui = new Gui();
    private static SelenumWebsiteController seleniumInterface = new SelenumWebsiteController();
    public void CreateGui(){
        JFrame frame = new JFrame("Control Panel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(newGui);
        frame.pack();
        frame.setVisible(true);
    }

    public void TextDefault(String TEXT){
        newGui.setGetText(TEXT);
        newGui.setSendText(TEXT);
    }

    public static void ToWebsite(){
        SelenumWebsiteController.SendTextToWebsite(newGui.getSendText());
    }
    public static void StartWebsite(){
        SelenumWebsiteController.OpenBrowser();
    }
    public static void Automat(){
        System.out.println("Automat");
    }
}
