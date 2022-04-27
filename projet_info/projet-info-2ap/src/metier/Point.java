package metier;

/*
 * @autor Arthur Carton de Wiart, Marie Pierron, Jérémy Alhon
 */

public class Point
{
    // class variables
    double x;
    double y;
    String name;
    double distance;
    // end of class variables
    
    
    
    // constructor
    public Point(double x, double y, String name)
    {
        this.x = x;
        this.y = y;
        this.name = name;
    }
    // end of constructors



    // distance calcul
    public double distance(Point p)
    {
        distance = Math.sqrt((this.x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
        return distance;
        
    }
    // end of distance calcul



    // getters and setters
    public void setPosition(double x, double y)
    {

        this.x = x;
        this.y = y;

    }

    public String getName()
    {
        return this.name;
    }
    // end of getters and setters
}