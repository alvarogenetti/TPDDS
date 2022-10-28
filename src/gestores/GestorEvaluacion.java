package gestores;

public class GestorEvaluacion {
    private static GestorEvaluacion ge;

    public static GestorEvaluacion getInstance(){
        if(ge==null) ge = new GestorEvaluacion();

        return ge;
    }
}
