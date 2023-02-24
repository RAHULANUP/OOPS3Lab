package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class light extends JFrame implements ActionListener{
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    int x=0,y=0,z=0;
    public light(){
        r1 = new JRadioButton(" RED ");
        r1.setBounds(50,370,100,50);
        r1.addActionListener(this);

        r2 = new JRadioButton(" YELLOW ");
        r2.setBounds(200,370,100,50);
        r2.addActionListener(this);

        r3 = new JRadioButton(" GREEN ");
        r3.setBounds(350,370,100,50);
        r3.addActionListener(this);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);



        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(r1);
        this.add(r2);
        this.add(r3);

    }
    public void paint(Graphics g){
        g.drawOval(200,100,50,50);
        g.drawOval(200,170,50,50);
        g.drawOval(200,240,50,50);
        if(x==1){
            g.setColor(Color.RED);
            g.fillOval(200,100,50,50);
            g.setColor(Color.BLACK);
            g.fillOval(200,170,50,50);
            g.setColor(Color.BLACK);
            g.fillOval(200,240,50,50);
            x=0;
        }
        if(y==1){
            g.setColor(Color.BLACK);
            g.fillOval(200,100,50,50);
            g.setColor(Color.YELLOW);
            g.fillOval(200,170,50,50);
            g.setColor(Color.BLACK);
            g.fillOval(200,240,50,50);
            y=0;
        }
        if(z==1){
            g.setColor(Color.BLACK);
            g.fillOval(200,100,50,50);
            g.setColor(Color.BLACK);
            g.fillOval(200,170,50,50);
            g.setColor(Color.GREEN);
            g.fillOval(200,240,50,50);
            z=0;
        }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==r1){
            x=1;
            repaint();
        }
        else if(ae.getSource()==r2){
            y=1;
            repaint();
        }
        else{
            z=1;
            repaint();
        }
    }
}
public class trafficlight {
    public static void main(String args[]){
        light l = new light();
    }
}