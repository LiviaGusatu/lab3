package pk1;

import javafx.scene.paint.Color;

/**
 * Created by Livia on 11/1/2014.
 * Autovehicule este clasa de baza
 * aici sunt constructori, fc de set, get, o fc abstracta
 * si o fc "detalii" care returneaza detaliile despre autovehicule
 */
public abstract class autovehicule {
    private String NrInmatriculare;
    private Color culoare;
    public String model;
    public int nr_calatori;

    public autovehicule(String numar){
        this.NrInmatriculare=numar;
    }

    public autovehicule(String numar, Color culoare, String model){
        this.NrInmatriculare=numar;
        this.culoare=culoare;
        this.model=model;
    }

    public void setNumar(String nr){
        this.NrInmatriculare=nr;
    }

    public void setModel(String m){
        this.model=m;
    }

    public String getNumar(){
        return this.NrInmatriculare;
    }

    public int nr_pasageri() throws PasageriException{
        return this.nr_calatori;
    }

    public abstract void  Combustibil() throws TypeCombustibilException ;
    public void detalii(){
        System.out.println(this.NrInmatriculare + this.model + this.nr_calatori + this.culoare);
    }
}
