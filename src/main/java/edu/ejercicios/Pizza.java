package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;
    private static final String masa = "masa tradicional";
    private String[] ingredientes;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String nombre, double precio, String[] ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static String getMasa() {
        return masa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void agregarTopping(Topping topping) {
        toppings.add(topping);
        precio += topping.getPrecio();
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void preparar() {
        System.out.println("Preparando pizza " + this.nombre);
        System.out.println("Empezamos a amasar la : " + getMasa());
        System.out.println("Seleccionando ingredientes:");
        for (String ingrediente : this.ingredientes) {
            System.out.println("Agregando " + ingrediente);
        }
        System.out.println("Agregando toppings:");
        for (Topping topping : toppings) {
            System.out.println("Agregando " + topping.getNombre());
        }
        System.out.println("Horneando...");
    }

    public static class ContadorMetodo {
        public static void main(String[] args) {
            int segundos = 5;
            contadorSegundos(segundos);
        }

        public static void contadorSegundos(int segundos) {
            int contador = 0;
            while (contador < segundos) {
                System.out.println(contador + 1);
                contador++;

                try {
                    Thread.sleep(1000); // Esperar 1000 ms (1 segundo)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Pizza lista!");
        }
    }

    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }
}