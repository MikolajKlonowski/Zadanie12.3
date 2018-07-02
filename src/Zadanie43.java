import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;


public class Zadanie43 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> tablicaLiczb = new ArrayList<> ( );
        File file = new File ("Liczby.txt");
        Scanner sc = new Scanner (file);
        while (sc.hasNextInt ( )) {
            tablicaLiczb.add (sc.nextInt ( ));
        }

        Collections.sort (tablicaLiczb);
        System.out.println (tablicaLiczb.toString ( ));
//tablicaLiczb.get (tablicaLiczb.size ()
        int a = tablicaLiczb.get (tablicaLiczb.size ()-1);
        for (int i = 0; i < a; i++) {
            if (tablicaLiczb.contains (i)) {
                int suma = 0;
                for (int j = 0; j < tablicaLiczb.size (); j++) {
                    if (tablicaLiczb.get (j) == i) {
                        suma += 1;

                    }

                }
                System.out.println (i + "Liczba wystąpień" + suma);
            }
        }


    }
}
