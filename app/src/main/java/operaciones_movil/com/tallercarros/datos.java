package operaciones_movil.com.tallercarros;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by android on 07/10/2017.
 */

public class datos {

    private static ArrayList<Carro> carros = new ArrayList();

    public static void guardarCarros(Carro p){
        carros.add(p);
    }

    public static ArrayList<Carro> obtenerCarros(){
        return carros;
    }

    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSel;
        Random r = new Random();
        fotoSel = r.nextInt(fotos.size());
        return fotos.get(fotoSel);
    }
}
