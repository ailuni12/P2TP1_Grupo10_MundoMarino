package gestormundomarino.ui;

import gestormundomarino.entradasalida.EntradaSalida;
import gestormundomarino.manejadorbd.ManejadorBD;

public class MenuGuia implements MenuUsuario {
    private final EntradaSalida iu;
    private final ManejadorBD bd;

    public MenuGuia(EntradaSalida iu, ManejadorBD bd) {
        this.iu = iu;
        this.bd = bd;
    }

    @Override
    public void mostrar() {
        iu.mostrarMensaje("\n--- MENÚ GUÍA ---");
        iu.mostrarMensaje("1. Ver recorridos asignados\n2. Registrar actividad\n3. Salir");

        String opcion = iu.solicitarEntrada("Elija una opción");

        switch (opcion) {
            case "1":
                iu.mostrarMensaje("Mostrando recorridos asignados...");
                break;
            case "2":
                iu.mostrarMensaje("Registrando actividad...");
                break;
            case "3":
                iu.mostrarMensaje("Saliendo del sistema...");
                break;
            default:
                iu.mostrarMensaje("Opción no válida.");
        }
    }
}