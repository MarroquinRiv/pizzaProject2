package edu.ejercicios;

class PizzaItaliana extends Pizza {
    private static final String salsa = "salsa de tomate italiana";

    public PizzaItaliana(String nombre, double precio, String[] ingredientes) {
        super(nombre, precio, ingredientes);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza italiana " + getNombre());
        System.out.println("Empezando a amasar la masa: " + getMasa());
        System.out.println("Agregando la salsa: " + salsa);
        System.out.println("Seleccionando ingredientes:");
        for (String ingrediente : getIngredientes()) {
            System.out.println("Agregando " + ingrediente);
        }
        System.out.println("Agregando toppings:");
        for (Topping topping : getToppings()) {
            System.out.println("Agregando " + topping.getNombre());
        }
        System.out.println("Horneando...");
    }
}