package lab3.shape;

public class main {
    public static void main(String[] argv){
        kwadrat A = new kwadrat("a", 2);
        A.draw();
        kolo B = new kolo();
        B.draw();
        trojkat C = new trojkat("b", 10);
        C.draw();
        prostokat D = new prostokat("c", 2, 5);
        D.draw();
    }
}
