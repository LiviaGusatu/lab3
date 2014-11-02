package pk1;

/**
 * Created by Livia on 11/2/2014.
 * aceasta clasa este mostenita din clasa de baza
 */
public class motociclete extends autovehicule implements VitezaMaxima, TipCombustibil{

    //private

 public motociclete(String numar){
     super(numar);
 }

    @Override
    public int nr_pasageri() throws PasageriException{
        return this.nr_calatori;
    }

    @Override
    public void VMax() throws VMaxException {

    }

    @Override
    public void Combustibil() throws TypeCombustibilException {

    }

    @Override
    public void detalii() {
        super.detalii();
    }
}
