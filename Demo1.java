import java.awt.*;
import java.awt.event.*;
class Demo1 implements AdjustmentListener{
    Frame f;
    TextField T1,T2,T3;
    Scrollbar sb1 , sb2 , sb3;
    public Demo1() {
         f = new Frame();
        f.setSize(500,600);
        f.setLayout(new BorderLayout());
         sb1 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
         sb1.addAdjustmentListener(this);
         sb2 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
         sb2.addAdjustmentListener(this);
         sb3 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
         sb3.addAdjustmentListener(this);
        
        Panel P1 = new Panel();
        P1.setLayout(new GridLayout(0,3));

        Panel x = new Panel();
        x.setLayout(new GridLayout(0,1));
        x.add(sb1);

        Panel y = new Panel();
        y.setLayout(new GridLayout(0,1));
        y.add(sb2);

        Panel z = new Panel();
        z.setLayout(new GridLayout(0,1));
        z.add(sb3);
        
        P1.add(x);
        P1.add(y);
        P1.add(z);
        
        Panel P2= new Panel();
        Label L1 = new Label("Red");
         T1 = new TextField();
        Label L2 = new Label("Green");
         T2 = new TextField();
        Label L3 = new Label("Blue");
         T3 = new TextField();
        P2.add(L1);
        P2.add(T1);
        P2.add(L2);
        P2.add(T2);
        P2.add(L3);
        P2.add(T3);
        f.add(P2,"South");
        f.add(P1,"East");
        f.setVisible(true);
        
    }
    public void adjustmentValueChanged(AdjustmentEvent e){
        int value =sb1.getValue();
        T1.setText(value+"");

        int value1 =sb2.getValue();
        T2.setText(value1+"");

        int value2 =sb3.getValue();
        T3.setText(value2+"");
        int x =sb1.getValue();
        int y=sb2.getValue();
        int z = sb3.getValue();
        Color mycolor = new Color(x,y,z);
        f.setBackground(mycolor);

    }
    public static void main(String[] args) {
        Demo1 d = new Demo1();
    }
}
