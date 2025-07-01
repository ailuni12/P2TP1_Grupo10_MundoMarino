package GestorMundoMarino;

import GestorMundoMarino.InterfazUsuario;
import java.util.Scanner;

public class InterfazConsola implements InterfazUsuario {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String solicitarEntrada(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }
}

