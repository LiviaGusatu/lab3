package pk1;

/**
 * Created by Livia on 11/2/2014.
 * interfata cu 2 fc
 * una care returneaza nr de pasageri
 * una care seteaza nr de pasageri la 1 daca se depaseste numarul maxim
 */
public interface NrCalatori {
    public int nr_pasageri() throws PasageriException;
    public void nr_max();
}
