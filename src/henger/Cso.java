package henger;
public class Cso extends TomorHenger{
    private double falvastagsag;
    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        this(sugar, magassag, 1);
    }

    public Cso(double falvastagsag, double sugar, double magassag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        return Math.PI*sugar*sugar*magassag; 
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
    
}
