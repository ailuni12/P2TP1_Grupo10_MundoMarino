package gestormundomarino.ui;

import gestormundomarino.entradasalida.EntradaSalida;
import gestormundomarino.manejadorbd.ManejadorBD;

public class MenuCuidador implements MenuUsuario {
    private final EntradaSalida iu;
    private final ManejadorBD bd;

    public MenuCuidador(EntradaSalida iu, ManejadorBD bd) {
        this.iu = iu;
        this.bd = bd;
    }

    @Override
    public void mostrar() {
        iu.mostrarMensaje("\n--- MENÚ CUIDADOR ---");
        iu.mostrarMensaje("1. Ver animales a cargo\n2. Registrar alimentación\n3. Salir");

        String opcion = iu.solicitarEntrada("Elija una opción");

        switch (opcion) {
            case "1":
                iu.mostrarMensaje("Mostrando animales a cargo...");
                break;
            case "2":
                iu.mostrarMensaje("Registrando alimentación...");
                break;
            case "3":
                iu.mostrarMensaje("Saliendo del sistema...");
                break;
            default:
                iu.mostrarMensaje("Opción no válida.");
        }
    }
}