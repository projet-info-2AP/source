package ihm;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Dimension;


import java.awt.Color;

public class PanneauEtat extends JPanel{
    private JLabel texteEtat;

    public PanneauEtat () {
        super ();
        
        texteEtat = new JLabel ("Panneau Etat");
        Border lineborder = BorderFactory.createLineBorder(Color.BLACK, 4);
        
        this.setBorder (lineborder);
        
        this.setPreferredSize(new Dimension(150, 30));
        
        this.add(texteEtat);
    }

    public void setTexte(String texte ) {
        texteEtat.setText(texte);
    }


    
}
