package model;

public class TarjetaVideo extends Componente{

    private int vramGB;

    public TarjetaVideo(String marca, String modelo, double precio, int stock, int vramGB){
        super(marca, modelo, precio, stock);
        this.vramGB = vramGB;

    }

   @Override
    public void mostrarDetalles(){
       System.out.println("Tarjeta de video " + marca + " " + modelo +  " Precio $: " + precio + " con stock de: " + stock);
   }

}
