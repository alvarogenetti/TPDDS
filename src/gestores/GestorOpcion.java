package gestores;

public class GestorOpcion {
    private static GestorOpcion go;

    public static GestorOpcion getInstance(){
        if(go==null) go = new GestorOpcion();

        return go;
    }
}
