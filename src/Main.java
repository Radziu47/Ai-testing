import ControlPanel.Gui;
import ControlPanel.GuiController;

import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        GuiController newController = new GuiController();

        newController.CreateGui();

        newController.TextDefault("Hej");
    }
}