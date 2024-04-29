import javax.swing.*;
import java.awt.*;

public class LandingPage {
    public LandingPage() {
        JFrame LandingPage = new JFrame();
        LandingPage.setTitle("Landing Page");
        LandingPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LandingPage.setExtendedState(JFrame.MAXIMIZED_BOTH);
        LandingPage.setVisible(true);
    }

    public static void main(String[] args) {
        new LandingPage();
    }
}