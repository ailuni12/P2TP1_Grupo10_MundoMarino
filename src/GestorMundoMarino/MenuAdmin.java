package GestorMundoMarino;

import GestorMundoMarino.MenuUsuario;

public class MenuAdmin implements MenuUsuario {
    private final InterfazUsuario iu;
    private final ManejadorBD bd;

    public MenuAdmin(InterfazUsuario iu, ManejadorBD bd) {
        this.iu = iu;
        this.bd = bd;
    }

    @Override
    public void mostrar() {
        iu.mostrarMensaje("\n--- MENÚ ADMIN ---");
        iu.mostrarMensaje("1. Ver reportes\n2. Gestionar usuarios\n3. Salir");

        String opcion = iu.solicitarEntrada("Elija una opción");

        switch (opcion) {
            case "1":
                iu.mostrarMensaje("Mostrando reportes...");
                break;
            case "2":
                iu.mostrarMensaje("Accediendo a gestión de usuarios...");
                break;
            case "3":
                iu.mostrarMensaje("Saliendo del sistema...");
                break;
            default:
                iu.mostrarMensaje("Opción no válida.");
        }
    }
}
