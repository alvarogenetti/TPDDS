package gestores;

public class GestorCandidatos {
    private static GestorCandidatos gc;

    public static GestorCandidatos getInstance(){
        if(gc==null) gc= new GestorCandidatos();

        return gc;
    }
}
