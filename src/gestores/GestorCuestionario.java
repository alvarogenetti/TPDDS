package gestores;

public class GestorCuestionario {
    private static GestorCuestionario gc;

    public static GestorCuestionario getInstance(){
        if(gc==null) gc = new GestorCuestionario();

        return gc;
    }
}
