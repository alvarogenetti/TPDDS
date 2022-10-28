package gestores;

public class GestorFactor {
    private static GestorFactor gf;

    public static GestorFactor getInstance(){
        if(gf==null) gf = new GestorFactor();

        return gf;
    }
}
