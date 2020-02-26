package domein;

import theorie.H10RodeDraadDeel1Start.src.domein.Rekening;

public class ZichtRekening extends Rekening
{

    private double maxKredietOnderNul;

    public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul)
    {
        super(rekeningNr, houder);
        setMaxKredietOnderNul(maxKredietOnderNul);
    }

    public double getMaxKredietOnderNul()
    {
        return maxKredietOnderNul;
    }

    public final void setMaxKredietOnderNul(double maxKredietOnderNul)
    {
        if (maxKredietOnderNul > 0)
        {
            throw new IllegalArgumentException("Maximaal krediet moet <= 0.0 zijn");
        }

        if (maxKredietOnderNul > getSaldo())
        {
            throw new IllegalArgumentException("Maximaal krediet moet <= saldo");
        }
        this.maxKredietOnderNul = maxKredietOnderNul;
    }

    @Override
    public boolean haalAf(double bedrag)
    {
        if (getSaldo() - bedrag >= maxKredietOnderNul)
        
            return super.haalAf(bedrag);
        else  
            return false;
    }

    @Override
    public String toString()
    {
        return String.format("%s. %s %.2f euro.",
                super.toString(),
                "Max krediet onder nul=", maxKredietOnderNul);
    }
}
