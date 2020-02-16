package H9_overerving.Veelhoeken.domein;

public class Rechthoek extends Veelhoek{

    private int lengte;
    private int breedte;

    public Rechthoek(int x, int y){
        super(4);
        checkArgs(x);
        checkArgs(y);
        this.breedte = x;
        this.lengte = y;
    }

    public int getBreedte() {
        return breedte;
    }

    public int getLengte() {
        return lengte;
    }

    public void setBreedte(int breedte) {
        checkArgs(breedte);
        this.breedte = breedte;
    }

    public void setLengte(int lengte){
        checkArgs(lengte);
        this.lengte = lengte;
    }

    public int berekenOmtrek(){
        return 2 * this.breedte + 2 * this.lengte;
    }

    public int berekenOppervlakte(){
        return this.lengte * this.breedte;
    }

    public String toString(){
        String lengteString = "Lengte = " + this.lengte;
        String breedteString = "Breedte = " + this.breedte;
        String oppervlakteString = "Oppervlakte = " + berekenOppervlakte();
        String omtrekString = "Omtrek = " + berekenOmtrek();
        return super.toString() + "";
    }

    public void checkArgs(int x){
        if (x <= 0 || x >= 20 ){
            throw new IllegalArgumentException("argument moet tussen 0 en 20 zijn");
        }
    }
}
