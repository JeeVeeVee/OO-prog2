package oefeningen.H10_polymorfisme.Veelhoeken.domein;

public class Driehoek extends Veelhoek {

    private int a;
    private int b;
    private int c;

    public Driehoek(int a, int b, int c){
        super(3);
        controleerZijde(a);
        controleerZijde(b);
        controleerZijde(c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    private void controleerZijde(int x) {
        if(x <= 0){
            System.out.println("we do dis");
            throw new IllegalArgumentException("argument moet strikt positief zijn");
        }
    }

    public boolean isRechthoekigeDriehoek(){
        return a * a + b * b == c *c || a * a == b * b + c *c || a * a + c * c == b *b;
    }

    public String geefGriekseBenaming(){
        return "trigoon";
    }
}
