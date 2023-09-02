package edu.ejercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.ejercicios.PizzaItaliana;
import edu.ejercicios.Topping;
import edu.ejercicios.Pizza;
public class Main {
    public static void main(String[] args) {
        String[] ingredientesPizzaItaliana = {"queso", "tomate", "oregano"};
        PizzaItaliana miPizzaItaliana = new PizzaItaliana("Clasica", 35.50, ingredientesPizzaItaliana);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la pizzeria de Java!");
        System.out.println("El dia de hoy tenemos una pizza italiana, cuyo costo base es de Q" + miPizzaItaliana.getPrecio());
        System.out.println("Los ingredientes que incluye en la masa son: " + miPizzaItaliana.getIngredientes());
        System.out.println("¿Desea agregar toppings? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("s")) {

            List<Topping> toppingsDisponibles = new ArrayList<>();
            toppingsDisponibles.add(new Topping("cebolla"));
            toppingsDisponibles.add(new Topping("champiñones"));
            toppingsDisponibles.add(new Topping("extra queso"));
            toppingsDisponibles.add(new Topping("pepperoni"));
            toppingsDisponibles.add(new Topping("jamon"));
            toppingsDisponibles.add(new Topping("salchicha"));
            toppingsDisponibles.add(new Topping("aceitunas"));
            toppingsDisponibles.add(new Topping("lomito"));

            List<Topping> toppingsElegidos = new ArrayList<>();

            while (true) {
                System.out.println("¿Qué topping desea agregar? (0 para terminar)");
                System.out.println("1. Cebolla, Q2.00");
                System.out.println("2. Champiñones, Q3.00");
                System.out.println("3. Extra queso, Q12.00");
                System.out.println("4. Pepperoni, Q5.00");
                System.out.println("5. Jamon, Q3.00");
                System.out.println("6. Salchicha, Q3.00");
                System.out.println("7. Aceitunas, Q2.50");
                System.out.print("8. Lomito, Q8.00");
                String toppingNombre = scanner.nextLine();

                int opcion = scanner.nextInt();
                if (opcion == 0) {
                    break;
                }

                //Limpiar pantalla
                //System.out.print("\033[H\033[2J");
                //System.out.flush();

                if (opcion > 0 && opcion <= toppingsDisponibles.size()) {
                    Topping toppingElegido = toppingsDisponibles.get(opcion - 1);
                    toppingsElegidos.add(toppingElegido);
                    miPizzaItaliana.agregarTopping(toppingElegido);
                } else {
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                }
            }

        }

        //Limpiar pantalla
        //System.out.print("\033[H\033[2J");
        //System.out.flush();

        System.out.println(miPizzaItaliana.toString());
        miPizzaItaliana.preparar();
        Pizza.ContadorMetodo.contadorSegundos(5);

        System.out.println("Gracias por su compra!");
        System.out.println("Resumen de su compra:");
        System.out.println(miPizzaItaliana.toString());
        if (respuesta.equals("s")){
            System.out.println("Toppings usados:");
            for (Topping topping : miPizzaItaliana.getToppings()) {
                System.out.println(topping.getNombre());
            }
            System.out.println("Precio de cada topping utilizado:");
            for (Topping topping : miPizzaItaliana.getToppings()) {
                System.out.println(topping.getPrecio());
            }
        }

        System.out.println("Total: Q" + miPizzaItaliana.getPrecio());
        System.out.println("¡Vuelva pronto!");

        scanner.close();
        }
    }
