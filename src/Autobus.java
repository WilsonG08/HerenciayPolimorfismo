public class Autobus extends Vehiculo{
    private int numPlazas;

    public Autobus(String marca, String modelo, double precioAlquiler, int numPlazas){
        super(marca,modelo,precioAlquiler);
        setPrecioAlquiler(numPlazas);
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public void imprimirtributos(){
        super.imprimirAtributo();
        System.out.println("\t"+"P¨lazas : "+numPlazas);
    }
}
