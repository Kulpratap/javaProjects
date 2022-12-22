import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing2 implements MouseMotionListener {
    
    public void mouseDragged(MouseEvent e) {
        int x, y;
        x = e.getX();
        y = e.getY();
        Graphics g = f.getGraphics();
        g.setColor(Color.black);
         g.fillOval(x,y,5,5);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    class WindowCloser extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            Window w = e.getWindow();
            w.setVisible(false);
            w.dispose();
            System.exit(1);
        }
    }
    Frame f;
    public Drawing2()
    {
        WindowCloser wc = new WindowCloser();
        f = new Frame();
        f.addWindowListener(wc);
        f.setVisible(true);
        f.setSize(400, 400);
        f.addMouseMotionListener(this);
    }

    public static void main(String[] args) {
     Drawing2 d = new Drawing2();
    }
}
