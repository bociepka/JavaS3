package lab3.shape;

public class prostokat extends shape {
    public int a;
    public int b;
    public prostokat(String _name, int _a, int _b) {
        name = _name;
        a = _a;
        b = _b;
    }
    public void draw(){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}