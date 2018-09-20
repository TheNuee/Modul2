package TugasPraktikum2;

public class Bola {

    private double r, D, LP, V;

    public double getR() {
        r = 40;
        return r;
    }

    public double getD() {
        D = r + r;
        return D;
    }

    public double getLP() {
        LP = 4 * 3.14 * r * r;
        return LP;
    }

    public double getV() {
        V = (4 * 3.14 * r * r) / 3;
        return V;
    }

    public void setR(double R) {
        this.r = r;
    }
}
