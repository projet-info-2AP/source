package application;
import metier.*;
import javax.swing.SwingUtilities;
import ihm.FenetrePrincipale;

public class Main
{
    public static void main(String[] args)
    {

        Point m = new Point(2, 2, "M");
        Particule a = new Particule(10, 10, 15, "A");
        Particule b = new Particule(15, 15, 17, "B");

        // test calcul distance
        double ma = m.distance(a);
        double mb = m.distance(b);
        System.out.println("Distances:\n - " + m.getName() + a.getName() + " = " + ma + "\n - " + m.getName() + b.getName() + " = " + mb);
        // end of test calcul distance



        // test potential calcul
        Potentiel p = new Potentiel(0, 0, "potentiel");
        System.out.println("Potentiel en " + m.getName() + ":\n - V(M) = " + p.calcV(a, b) + " C/m");
        // end of test potential calcul

        // test initChamp
        Champ champ = new Champ(a, b, 5, 5);
        champ.setH(3);
        champ.CalculChamp();
        double[][] tab_v = champ.getTab_V();
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.println(tab_v[i][j]);
            }
        }
        // fin test initChamp

        // test ihm 
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetrePrincipale fenetre = new FenetrePrincipale();
            }
        });
        // fin test ihm

    }
}