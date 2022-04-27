package metier;

/*
* @autor Arthur Carton de Wiart, Marie Pierron, Jérémy Alhon
*/

public class Particule extends Point
{

    // class variables
    public double valeurCharge;
    //  end of class variables


    // constructors
    public Particule(double x, double y, double valeurCharge, String name)
    {
        super(x, y, name);
        this.valeurCharge = valeurCharge;
    }
    // end of constructors



    // getters and setters
    public double getValeurCharge()
    {
        return(this.valeurCharge);
    }
    
    public void setValeurCharge(double valeurCharge)
    {
        this.valeurCharge = valeurCharge;
    }

    public String getName()
    {
        return(this.name);
    }
    
    public void setName(String name){
        this.name = name;
    }


    public double getX()
    {
        return(this.x);
    }

    public double getY()
    {
        return(this.y);
    }
    // end of getters and setters

}