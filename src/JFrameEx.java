import javax.swing.JFrame;

public class JFrameEx {
    public  void setFrame(String title, int height, int width, boolean isVisible, int closeOperation ) {
        
        JFrame frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setVisible(isVisible);
        frame.setDefaultCloseOperation(closeOperation);
        
    }
}
