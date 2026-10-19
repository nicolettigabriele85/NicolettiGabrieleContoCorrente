/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nicolettigabrielecontocorrente;

/**
 *
 * @author nicoletti.gabriele
 */
public class NicolettiGabrieleContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoCorrente c1=new ContoCorrente(10000);
        Persona p1=new Persona("Francesco","Beacci",c1);
        
        System.out.println(p1.toString());
        p1.preleva(2000);
        p1.versa(800);
        System.out.println(p1.getContoCorrente());
        p1.versa(200);
        p1.preleva(1000);
        System.out.println(p1.getContoCorrente());
        p1.preleva(11000);
        System.out.println(p1.getContoCorrente());
        
    }
    
}
