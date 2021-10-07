package LSP;

public class Traingle {
    double a;
    double b;
    double c;

    public Traingle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Squere(){
        double p = ( a + b +c )/2;
        System.out.println(Math.sqrt(p) * (p-a) * (p-b) * (p-c));
    }
}
