package gestormundomarino;

import java.util.ArrayList;
//backup branch test

public class Main {

    public static void main(String[] args) {
        System.out.println("Programacion 2 - TP1 // 2025 // Comision 2-603.");
        System.out.println("GRUPO 10. Tema: Mundo Marino.");
        System.out.println("Alumnos: Matias Hayashi, Ailin Nicliz, Daiana Veliz.");
        
        ArrayList<Dato> parquemundomarino = new ArrayList<>();

        // zonas
        parquemundomarino.add(new Zona(1, "Zona Azul", 12.5));
        parquemundomarino.add(new Zona(2, "Zona Morada", 8.3));

        // habitats
        parquemundomarino.add(new Habitat(3, "Oceano Abierto", "Templado", "Algas marinas", "Antartida"));
        parquemundomarino.add(new Habitat(4, "Costas Rocosas", "Frío", "Kelp", "Sudamerica"));
        parquemundomarino.add(new Habitat(5, "Aguas Profundas", "Frio", "Plancton", "Global"));

        // especies
        parquemundomarino.add(new Especie(6, "Delfin", "Delphinus delphis", 
            "Mamifero marino inteligente y jugueton", 1));
        parquemundomarino.add(new Especie(7, "Orca", "Orcinus orca", 
            "El mayor miembro de la familia de los delfines", 3));
        parquemundomarino.add(new Especie(8, "Pinguino Sudamericano", "Spheniscus magellanicus", 
            "Ave marina no voladora de plumaje blanco y negro", 2));

        // animales, 2 de cada especie
        parquemundomarino.add(new Animal(9, 6, 3, "Flipper"));
        parquemundomarino.add(new Animal(10, 6, 3, "Marina"));
        parquemundomarino.add(new Animal(11, 7, 5, "Orki"));
        parquemundomarino.add(new Animal(12, 7, 5, "Blanca"));
        parquemundomarino.add(new Animal(13, 8, 4, "Pingu"));
        parquemundomarino.add(new Animal(14, 8, 4, "Lola"));

        // empleados
        parquemundomarino.add(new Guia(15, "Jose Martinez", "Calle del Mar 123", 555100200));
        parquemundomarino.add(new Guia(16, "Rocio Sanchez", "Avenida Oceánica 45", 555300400));
        parquemundomarino.add(new Cuidador(17, "Gaston Lopez", "Playa Principal 78", 555500600));
        parquemundomarino.add(new Cuidador(18, "Mariana Diaz", "Bahia Escondida 22", 555700800));
        parquemundomarino.add(new Administrador(19, "Pedro Gonzalez", "Puerto Principal 10", 555900100));

        // mostrar elementos
        for (Dato elemento : parquemundomarino) {
            elemento.mostrar();
            System.out.println("");
        }
    }
    
}
