package gestores;

public class GestorCompetencia {
    private static GestorCompetencia gc;

    public static GestorCompetencia getInstance(){
        if(gc==null) gc = new GestorCompetencia();

        return gc;
    }
}
