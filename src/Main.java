import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List listaVehiculos = new ArrayList();

        listaVehiculos.add(new Vehiculo("Mercedes","E",55));
        listaVehiculos.add(new Autobus("Mercedes","M20",100,200));
        listaVehiculos.add(new Turismo("BMW","252",50,4));
        listaVehiculos.add(new Turismo("Audi","A4",55,4));
        listaVehiculos.add(new Autobus("Mercedes","M10",120,30));
        listaVehiculos.add(new Turismo("VM","Passast",35,4));
        listaVehiculos.add((new Turismo("Audi","A3",30,5)));
        listaVehiculos.add((new Vehiculo("Auidi","A3",30)));
        imprimirListas((ArrayList)listaVehiculos);
    }

    private static void imprimirListas(ArrayList lista){
        for (int i = 0; i < lista.size();i++){
            Vehiculo v= (Vehiculo)lista.get(i);

            v.imprimirAtributo();
            System.out.println("  ");
        }

    }
}