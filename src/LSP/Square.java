package LSP;

public class Square extends Traingle{
    double d;
    public Square(double a, double b, double c) {
        super(a, b, c);
    }

    public Square(double a, double b, double c, double d) {
        super(a, b, c);
        this.d = d;
    }
}
