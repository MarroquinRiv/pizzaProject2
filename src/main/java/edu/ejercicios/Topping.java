package edu.ejercicios;

public class Topping {
    private String nombre;
    private double precio;

    public Topping(String nombre) {
        this.nombre = nombre;
        switch (nombre) {
            case "cebolla":
                this.precio = 2.0;
                break;
            case "champinones":
                this.precio = 3.0;
                break;
            case "extra queso":
                this.precio = 12;
                break;
            case "pepperoni":
                this.precio = 5;
                break;
                case "jamon":
                this.precio = 3;
                break;
                case "salchicha":
                this.precio = 3;
                break;
                case "aceitunas":
                this.precio = 2.5;
                break;
                case "lomito":
                this.precio = 8;
                break;
            default:
                this.precio = 0.0;
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}