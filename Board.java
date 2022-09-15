import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;

import piece_collection.Square;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;



public class Board extends JFrame{


public static JFrame frame;
public static JPanel panel;
public static ImageIcon icon;
private List <Square> boxes;

public Board(){
    this.init();
    boxes = new ArrayList<Square>();
}



public void init() {
    icon=new ImageIcon("iconn.png");

    frame=new JFrame();
    frame.setBounds(30, 20, 800, 599);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Dice Chess");
    frame.setLocationRelativeTo(null);
    frame.setIconImage(icon.getImage());
    frame.setResizable(false);


    panel=new JPanel(){
    @Override
    public void paint(Graphics g) {

        boolean white=true;
        for (int i=0;i<8;i++){                  //8 pieces one white one black 
            for (int j=0;j<8;j++){
                boxes.add(new Square(i, j));
                
                if (white==true){
                    g.setColor(Color.PINK);
                }
                else{
                    g.setColor(Color.DARK_GRAY);
                }
                g.fillRect(i*70, j*70, 70, 70);
                if (white==true)
                white=false;
                else
                white=true;

                
                }
                if (white==true)
                white=false;
                else
                white=true;

            }

        }
    };

    
    Border border=BorderFactory.createLineBorder(Color.darkGray, 8, false);
    JPanel subpanel= new JPanel();
    


    panel.setBounds(30, 20, 130, 599);
    subpanel.setBackground(Color.lightGray);
    subpanel.setBounds(565,5,216,550);
    subpanel.setLayout(null);
    subpanel.setBorder(border);
  
    JButton button= new JButton("Roll dice");
    button.setBounds(65, 50, 100, 30);
    button.setFocusable(false);
    button.setBackground(Color.darkGray);
    button.setForeground(Color.pink);
    button.setBorder(BorderFactory.createEtchedBorder());
    button.setFocusPainted(true);
 

    
   
    subpanel.add(button);
    frame.add(subpanel);
    frame.add(panel);
    frame.setVisible(true);
}


    public void initPieces(){


}




}

