package lab3.shape;

public class kwadrat extends shape{

    public int a;
    public kwadrat(String _name, int _a) {
        name = _name;
        a = _a;
    }

    public void draw(){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

}