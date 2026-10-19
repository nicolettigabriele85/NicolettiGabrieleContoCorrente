/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nicolettigabrielecontocorrente;

/**
 *
 * @author nicoletti.gabriele
 */
public class ContoCorrente {

    private double capitaleIniziale, capitaleAttuale;

    /**
     *metodo costruttore parametrizzato che serve per creare un’istanza dell’oggetto “ContoCorrente”  con il valoro passatogli 
     * @param capitaleIniziale capitale iniale pasatogli 
     */
    public ContoCorrente(double capitaleIniziale) {
        this.capitaleIniziale = capitaleIniziale;
        this.capitaleAttuale = this.capitaleIniziale;
    }
    /**
     * controlla se è possibile eseguire il prelievo, se è possibile sottrae la somma da prelevare passatagli al “capitaleAttuale”
     * @param soldiPrelievo quantita da prelevare 
     * @return  returna se è possibile eseguire il prelievo
     */
    public boolean prelievo(double soldiPrelievo) {
        if(soldiPrelievo<this.capitaleAttuale)
        {
            this.capitaleAttuale -=  soldiPrelievo;
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
      
     * @return restituisce l’attributo capitaleIniziale

     */
    public double getCapitaleIniziale()
    {
        return this.capitaleIniziale;
    }
    /**
     * 
     * @return metodo che restituisce l’attributo capitaleAttuale

     */
    public double getCapitaleAttuale()
    {
        return this.capitaleAttuale;
    }
    /**
     * ggiunge al capitaleAttuale” la somma di denaro passatagli

     * @param soldiVersamento soldi da versare passategli 
     */
    public void versamento(double soldiVersamento) {
        this.capitaleAttuale +=soldiVersamento;
    }
    /**
     * 
     * @return returna una striga con tutte le informazioni delle istanza
     */
    public String toString() {
        return "Capitale iniziale: " + this.capitaleIniziale + "\nCapitale attuale: " + this.capitaleAttuale+"\n\n";
    }
   
}
