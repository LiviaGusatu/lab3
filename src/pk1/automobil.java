package pk1;

import javafx.scene.paint.Color;

/**
 * Created by Livia on 11/2/2014.
 * aceasta clasa este derivata din clasa de baza
 * pe langa functiile mostenite are si o fc "nr_max" care verifica
 * daca sunt mai multi de 5 calatori in masina
 */
public class automobil extends autovehicule implements NrCalatori,TipCombustibil {


    public automobil(String numar){
        super(numar);
    }

    public automobil(String numar, Color culoare, String model) {
        super(numar, culoare, model);
    }

    @Override
    public void Combustibil() throws TypeCombustibilException {

    }

    public String model_auto(){
        return this.model;
    }

    @Override
    public void detalii() {
        super.detalii();
    }
   // @Override
    public void nr_max() {
        if(this.nr_calatori>5)
            this.nr_calatori=1;
    }
}
