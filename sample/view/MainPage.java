package sample.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
public class MainPage extends JFrame {
    private JPanel panel;
    private JLabel introText;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    MainPage frame=new MainPage();
                    frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public MainPage(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        panel=new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(panel);
        setTitle("TSBN .inc");
        introText=new JLabel("Hello");

    }
}
