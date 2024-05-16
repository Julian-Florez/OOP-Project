package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class MyWindow extends JFrame{
    public MyWindow(){
        super("First app");
        Image back = Toolkit.getDefaultToolkit().getImage("Example1\\src\\view\\back.jpg");
        this.setContentPane(new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(back, (this.getWidth()/2-back.getWidth(rootPane)/2), (this.getHeight()/2-back.getHeight(rootPane)/2), rootPane);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setPreferredSize(new Dimension(400,300));
        getContentPane().setBackground(Color.BLUE);
        setIconImage(new ImageIcon("Example1\\src\\view\\descarga.jpg").getImage());
        pack();
        setLocationRelativeTo(null);
    }
}
