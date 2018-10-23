package lab2.zad3.Punkt3D;

import lab2.zad3.Punkt2D.Punkt2D;

public class Punkt3D extends Punkt2D {
    protected double z;
    public Punkt3D(double _x, double _y, double _z){
        super(_x, _y);
        this.z=_z;
    }

    public double GetZ(){
        return this.z;
    }
    public void SetZ(double _z){
        this.z = _z;
    }

    public double distance (Punkt3D other_point){
        return Math.sqrt(Math.pow(this.x-other_point.x,2)+Math.pow(this.y-other_point.y,2)+Math.pow(this.z-other_point.z,2));
    }
    public void print(){
        System.out.print("("+(this.x)+", "+this.y+", "+this.z+")");
    }
}
