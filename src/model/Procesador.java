package model;

public class Procesador extends Componente{

    private int nucleos;
    private double frecuenciaBase;

    public Procesador(String marca, String modelo, double precio, int stock, int nucleos, double frecuenciaBase) {
        super(marca, modelo, precio, stock);
        this.nucleos = nucleos;
        this.frecuenciaBase = frecuenciaBase;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Procesador " + marca + " " + modelo + " de " + nucleos + " nucleos a "
                + frecuenciaBase + " GHZ " + " Precio $: " + precio + " con stock de: " + stock);
    }
}
