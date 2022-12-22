import java.awt.*;
public class Pattern {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(500,600);
        f.setLayout(new GridLayout(0,2));
        Panel P1 = new Panel();
        Panel P2 = new Panel();
 
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b10 = new Button("10");
        Button b11 = new Button("11");
        Button b12 = new Button("12");
        Button b13 = new Button("13");
        Button b14 = new Button("14");
        Button b15 = new Button("15");
        

        Panel x1 = new Panel();
        P1.setLayout(new GridLayout(2,0));
        x1.setLayout(new GridLayout(2,0));
        Panel x11 = new Panel();
        x11.setLayout(new GridLayout(1,0));
        x11.add(b1);
        Panel x12 = new Panel();
        x12.setLayout(new GridLayout(1,0));
        x12.add(b2);
        x1.add(x11);
        x1.add(x12);

        Panel x2 = new Panel();
        x2.setLayout(new GridLayout(0,2));
        Panel x13 = new Panel();

        x13.setLayout(new GridLayout(2,0));
       
        Panel x31 = new Panel();
        x31.setLayout(new GridLayout(1,0));
        x31.add(b6);
        Panel x32 = new Panel();
        x32.setLayout(new GridLayout(1,0));
        x32.add(b7);
        
        x13.add(x31);
        x13.add(x32);

        Panel x14 = new Panel();
        x14.setLayout(new GridLayout(3,0));
        
        
        Panel x41 = new Panel();
        x41.setLayout(new GridLayout(1,0));
        x41.add(b8);

        Panel x42 = new Panel();
        x42.setLayout(new GridLayout(1,0));
        x42.add(b9);

        Panel x43 = new Panel();
        x43.setLayout(new GridLayout(1,0));
        x43.add(b10);

        x14.add(x41);
        x14.add(x42);
        x14.add(x43);

        x2.add(x13);
        x2.add(x14);

        Panel x3 = new Panel();
        x3.setLayout(new GridLayout(0,3));
    
        Panel m = new Panel();
        m.setLayout(new GridLayout(0,1));
        m.add(b3);
        Panel n = new Panel();
        n.setLayout(new GridLayout(0,1));
        n.add(b4);
        Panel o = new Panel();
        o.setLayout(new GridLayout(0,1));
        o.add(b5);

        x3.add(m);
        x3.add(n);
        x3.add(o);
        

        Panel x4 = new Panel();
        x4.setBackground(Color.green);
        x4.setLayout(new GridLayout(2,0));
        Panel o1 = new Panel();
        o1.setLayout(new GridLayout(0,2));
        Panel o2 = new Panel();

        o2.setLayout(new GridLayout(0,3));

        Panel o3 = new Panel();
        o3.setLayout(new GridLayout(0,1));
        o3.add(b11);
        Panel o4 = new Panel();
        o4.setLayout(new GridLayout(0,1));
        o4.add(b12);
        
        o1.add(o3);
        o1.add(o4);

        Panel o5 = new Panel();
        o5.setLayout(new GridLayout(0,1));
        o5.add(b13);
        Panel o6 = new Panel();
        o6.setLayout(new GridLayout(0,1));
        o6.add(b14);
        Panel o7 = new Panel();
        o7.setLayout(new GridLayout(0,1));
        o7.add(b15);
        
        o2.add(o5);
        o2.add(o6);
        o2.add(o7);
        

        x4.add(o1);
        x4.add(o2);

        P2.setLayout(new GridLayout(2,0));
     
        P1.add(x1);
        P1.add(x2);
        P2.add(x3);
        P2.add(x4);
        f.add(P1);
        f.add(P2);
        
        f.setVisible(true);
        
    }
}
