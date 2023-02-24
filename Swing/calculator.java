package Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class calc extends JFrame implements ActionListener{
    JTextField txt;
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton e;
    JButton a;
    JButton s;
    JButton m;
    JButton d;
    JButton clear;
    calc(){
        txt= new JTextField();
        txt.setBounds(50,40,500,100);
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        e=new JButton("=");
        a=new JButton("+");
        s=new JButton("-");
        m=new JButton("x");
        d=new JButton("/");
        clear=new JButton("CLEAR");
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        e.addActionListener(this);
        clear.addActionListener(this);
        a.addActionListener(this);
        s.addActionListener(this);
        m.addActionListener(this);
        d.addActionListener(this);


        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,5));
        this.setSize(500,500);
        this.add(txt);
        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(e);
        this.add(a);
        this.add(s);
        this.add(m);
        this.add(d);
        this.add(clear);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b0){
            txt.setText(txt.getText()+"0");
        }
        if(ae.getSource()==b1){
            txt.setText(txt.getText()+"1");
        }
        if(ae.getSource()==b2){
            txt.setText(txt.getText()+"2");
        }
        if(ae.getSource()==b3){
            txt.setText(txt.getText()+"3");
        }
        if(ae.getSource()==b4){
            txt.setText(txt.getText()+"4");
        }
        if(ae.getSource()==b5){
            txt.setText(txt.getText()+"5");
        }
        if(ae.getSource()==b6){
            txt.setText(txt.getText()+"6");
        }
        if(ae.getSource()==b7){
            txt.setText(txt.getText()+"7");
        }
        if(ae.getSource()==b8){
            txt.setText(txt.getText()+"8");
        }
        if(ae.getSource()==b9){
            txt.setText(txt.getText()+"9");
        }
        if(ae.getSource()==a){
            txt.setText(txt.getText()+"+");
        }
        if(ae.getSource()==s){
            txt.setText(txt.getText()+"-");
        }
        if(ae.getSource()==m){
            txt.setText(txt.getText()+"x");
        }
        if(ae.getSource()==d){
            txt.setText(txt.getText()+"/");
        }
        if(ae.getSource()==clear){
            txt.setText("");
        }
        if(ae.getSource()==e){
            String s=txt.getText();
            int i=0;
            char b=s.charAt(i);
            while( b != '+' && b != '-' && b != 'x' && b !='/'){
                i++;
                b=s.charAt(i);
            }
            int num1,num2;
            int result=0;
            num1=Integer.parseInt(s.substring(0,i));
            num2=Integer.parseInt(s.substring(i+1,s.length()));
            if(b =='+'){
                result=num1+num2;
            }
            else if(b =='-'){
                result=num1-num2;
            }
            else if(b =='x'){
                result=num1*num2;
            }
            else if(b =='/'){
                result=num1/num2;
            }

            txt.setText(result+" ");
        }

    }
}
public class calculator {
    public static void main(String args[]){
        calc c= new calc();
    }
}
