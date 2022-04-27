package ihm;
import java.awt.BorderLayout;
import javax.swing.JPanel;


public class PanneauPrincipal extends JPanel {
    public PanneauPrincipal (){
        super ();
        this.setLayout(new BorderLayout());
        PanneauDessin panDessin = new PanneauDessin() ;
        PanneauEtat panEtat = new PanneauEtat();       
        

        this.add(panEtat, BorderLayout.SOUTH);
        this.add(panDessin, BorderLayout.CENTER);

    }

}
