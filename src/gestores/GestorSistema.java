package gestores;

public class GestorSistema {
    private static GestorSistema gs;

    public static GestorSistema getInstance(){
        if(gs==null) gs = new GestorSistema();

        return gs;
    }
}
