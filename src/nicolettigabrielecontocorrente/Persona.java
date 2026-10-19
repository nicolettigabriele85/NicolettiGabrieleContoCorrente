/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nicolettigabrielecontocorrente;

/**
 *
 * @author nicoletti.gabriele
 */
public class Persona {

    private String nome, cognome;
    private ContoCorrente contoCorrente;

    /**
     *
     * @param nome nome 
     * @param cognome cognome
     * @param c1 conto corrente
     */
    public Persona(String nome, String cognome, ContoCorrente c1) {
        this.nome = nome;
        this.cognome = cognome;
        this.contoCorrente = c1;
    }
    /**
     * 
     * @param soldiPrelievo soldi che deve prelevare
     */
    public void preleva(double soldiPrelievo) {
        this.contoCorrente.prelievo(soldiPrelievo);
    /**
     * @param soldiVersamento soldi da versare
     */
    }
    public void versa(double soldiVersamento) {
        this.contoCorrente.versamento(soldiVersamento);

    }
    /**
     * 
     * @return estituisce l’attributo nome

     */
    public String getNome()
    {
        return this.nome;
    }
    /**
     * 
     * @return metodo che restituisce l’attributo conome

     */
    public String getCognome() {
        return this.cognome;
    }
    /**
     * 
     * @return metodo che restituisce l’attributo contoCorrente

     */
     public ContoCorrente getContoCorrente() {
        return this.contoCorrente;
    }
    /**
     * 
     * @return metodo che stampa a schermo una stringa con tutte le informazioni dell’istanza

     */

    public String toString() {
        return "Nome: " + this.nome + "\nCognome: " + this.cognome + "\n" + this.contoCorrente.toString();
    }
}
