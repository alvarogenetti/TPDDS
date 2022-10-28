package gestores;

public class GestorBloque {
    private static GestorBloque gb;

    public static GestorBloque getInstance(){
        if(gb==null) gb= new GestorBloque();

        return gb;
    }
}
