import javax.swing.*;

public class JavaSwing {
   public static void main(String[] args) {
    String title = "Swing";
    JFrame frame = new JFrame(title);
    frame.setSize(400,400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JFrame frame1 = new JFrame("Swing1");
    frame1.setSize(500,500);
    frame1.setVisible(true);
    
   }
}
