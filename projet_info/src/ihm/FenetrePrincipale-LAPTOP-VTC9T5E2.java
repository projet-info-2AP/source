package ihm;
import javax.swing.JFrame;

import java.awt.Dimension;
import javax.swing.JFrame;

public class FenetrePrincipale extends JFrame {
    public FenetrePrincipale(){
        super() ;
        this.setTitle("Champ magnétique créée par des particules");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 100);
        
        this.setMinimumSize(new Dimension(800,400));

        this.add(new PanneauPrincipal());
        
        this.pack();
        this.setVisible(true);
    }
}