package gestores;

public class GestorPregunta {
    private static GestorPregunta gp;

    public static GestorPregunta getInstance(){
        if(gp==null) gp = new GestorPregunta();

        return gp;
    }
}
