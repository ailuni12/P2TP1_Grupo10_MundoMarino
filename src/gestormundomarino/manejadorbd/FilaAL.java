package gestormundomarino.manejadorbd;

import java.util.ArrayList;
import java.util.Arrays;

class FilaAL {
    private ArrayList<String> filaAL;

    public FilaAL(String... campos) {
        filaAL.addAll(Arrays.asList(campos));
    }

    public String get(int indice) {
        return filaAL.get(indice);
    }

    public void add(String... campos) {
        filaAL.addAll(Arrays.asList(campos));
    }

    public ArrayList<String> getFilaAL() {
        return filaAL;
    }

    public void modificar(int id, String valor) {
        filaAL.set(id, valor);
    }
}
