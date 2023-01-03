public class Vehiculo {
    private String marca, modelo;
    private double precioAlquiler;

    public Vehiculo(String marca, String modelo, double precioAlquiler){
        this.marca=marca;
        this.modelo=modelo;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void imprimirAtributo(){
        System.out.println("Modelo : "+marca + " "+
                modelo + "\t" + "Precio : " + precioAlquiler);
    }
}
