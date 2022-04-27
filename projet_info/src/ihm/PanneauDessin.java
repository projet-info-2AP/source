package ihm;


import javax.swing.DefaultRowSorter;
import javax.swing.JPanel;
import metier.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;


public class PanneauDessin extends JPanel{
    private int pdWidth;   // Drawing panel width 
    private int pdHeight;  // Drawing panel height
    private int pdWidthC;  // Width center of the drawing panel
    private int pdHeightC;
    private Particule  A;
    private Particule B;
    private Font font = new Font ("Arial", Font.PLAIN, 17);
    private Graphics2D g2;
    
    //private Point M0 = new Point();
    public PanneauDessin () {
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent (Graphics g){
        
        g2 = (Graphics2D) g; 
        this.drawParticule(g, A, B);
        this.drawTitre();
    }
    public void drawParticule (Graphics g, Particule A, Particule B){

    }
    public void drawTitre (){
        g2.setFont(this.font);
        g2.setColor(Color.RED);
        g2.drawString("Tintintiiin", 50, 100);
    }
}
