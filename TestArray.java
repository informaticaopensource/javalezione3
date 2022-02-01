
/**
 * Aggiungi qui una descrizione della classe TestArray
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class TestArray
{
    public static void main(String args[])
    {
        int d=0;
        boolean errore=false;
        Scanner tastiera=new Scanner(System.in);
      
            try{
                 System.out.println("Digita dimensione array");
                 d=tastiera.nextInt();
                 
            } 
            catch (InputMismatchException e)
        {
                System.out.println("Errore nell'inserimento dimensione");
                 
            }
        Vettore v = new Vettore(d);
        v.carica();
        v.stampa_array();
    }
}
 
