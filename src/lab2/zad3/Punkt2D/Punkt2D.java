package lab2.zad3.Punkt2D;

public class Punkt2D {
    protected double x;
    protected double y;

    public Punkt2D(double _x, double _y){
        this.x = _x;
        this.y = _y;
    }

    public double GetX(){
        return this.x;
    }
    public double GetY(){
        return this.y;
    }
    public void SetX(double _x){
        this.x = _x;
    }
    public void SetY(double _y){
        this.y = _y;
    }

    public double distance (Punkt2D other_point){
        return Math.sqrt(Math.pow(this.x-other_point.x,2)+Math.pow(this.y-other_point.y,2));
    }
}
