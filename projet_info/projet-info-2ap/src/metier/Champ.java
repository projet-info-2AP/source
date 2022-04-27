package metier;

/*
* @autor Arthur Carton de Wiart, Marie Pierron, Jérémy Alhon
*/

public class Champ
{
    // class variables
    double h; // échelle métrique : 1 pixel vaut "h" unitées métriques FAIRE UN CURSEUR C.F EX10 
    Particule a;
    Particule b;
    Point m;
    double[][] tab_v; // tableau de données des valeurs du potentiel élétrostratique en chaque point de la fenetre
    int nbLig;
    int nbCol;
    // end of class variables



    // contructors
    public Champ(Particule a, Particule b, int nbLig, int nbCol)
    {
        this.a = a;
        this.b = b;
        this.nbLig = nbLig;
        this.nbCol = nbCol;
        this.tab_v = new double [nbLig][nbCol];
    }
    // end of constructors
    


    // field initialisation

    public void CalculChamp()
    {
        for (int i = 0 ; i < this.nbLig ;i++)
        {
            for(int j = 0 ; j < this.nbCol ; j++)
            {
                Potentiel p = new Potentiel(i*h, j*h, "potentiel");
                // p.setPosition(i * h, j * h);
                System.out.println(p.calcV(a, b));
                this.tab_v[i][j] = p.calcV(a, b);
            }
        }
    }
    // end of field initialisation



    // getters and setters
    public double getH()
    {
        return h;
    }

    public void setH(double h)
    {
        this.h = h;
    }

    public double[][] getTab_V()
    {
        return tab_v;
    }
    // end of getters and setter
}