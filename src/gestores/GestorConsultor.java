package gestores;

public class GestorConsultor {
    private static GestorConsultor gc;

    public static GestorConsultor getInstance(){
        if(gc==null) gc = new GestorConsultor();

        return gc;
    }
}
