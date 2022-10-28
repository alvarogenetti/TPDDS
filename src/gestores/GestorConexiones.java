package gestores;

public class GestorConexiones {
    private static GestorConexiones gc;

    public static GestorConexiones getInstance(){
        if(gc==null) gc = new GestorConexiones();

        return gc;
    }
}
