package metier;

public class Potentiel extends Point
{


    // constructors
    public Potentiel(double x, double y, String name)
    {

        super(x, y, name);
        this.x = x;
        this.y = y;
        this.name = name;

    }
    // end of constructors



    // potential calcul
    public double calcV(Particule a, Particule b)
    {
        double v = a.getValeurCharge()/this.distance(a) + b.getValeurCharge()/this.distance(b);
        return v;
    }
    // end of potential calcul



    // getters and setters

    // end of getters and setters

}
