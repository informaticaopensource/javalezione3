import java.util.Scanner;
import java.util.InputMismatchException;

public class Vettore
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private int dimensione;
    private int array[];

    
    public Vettore(int d)
    {
        this.dimensione=d;
        array=new int[dimensione];
    }
    void carica()
    {
        int k;
        
        Scanner tastiera = new Scanner(System.in);
        for (k=0;k<dimensione;k++)
        {
          
            try
            {
                System.out.println("Inserisci elemento");
                array[k]=tastiera.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("\n Errore nell'inserimento");
             } 
    }
}
    void stampa_array()
    {
        int k;
        System.out.println("Stampa elementi dell'array");
        for (k=0;k<dimensione;k++)
        {
            System.out.print("\t"+array[k]);
        }
        System.out.println("----");
    }
}
