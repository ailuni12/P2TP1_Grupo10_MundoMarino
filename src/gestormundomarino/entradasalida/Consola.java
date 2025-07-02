package gestormundomarino.entradasalida;

import java.util.Scanner;

public class Consola implements EntradaSalida {
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