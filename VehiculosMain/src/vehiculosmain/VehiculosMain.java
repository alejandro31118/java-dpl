package vehiculosmain;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiculosMain {
    static ArrayList<Vehiculos> myVehicles = new ArrayList<>();
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        addVehicles();
        printTurismos();
        printMotos();
        printGuaguas();
    }

    private static void addVehicles() {
        int select = 0;
        do {
            System.out.print("Seleccione un vehiculo:\n"
                            + "Turismo [1]\n"
                            + "Moto [2]\n"
                            + "Guagua [3]\n"
                            + "Salir [0]\n"
                            + "Introduce la opcion: ");
            select = kb.nextInt();
            
            if (select == 1) {
                addTurismo();
            } else if (select == 2) {
                addMoto();
            } else if (select == 3){
                addGuagua();
            }
        }while (select != 0);
    }

    private static void introdVehicleData(Vehiculos vehiculo, String vehicleType) {
        kb.nextLine();
        System.out.print("Introduce la matricula: ");
        vehicleType = kb.nextLine();
        vehiculo.setMatricula(vehicleType);
        System.out.print("Introduce la marca del vehiculo: ");
        vehicleType = kb.nextLine();
        vehiculo.setMarca(vehicleType);
        System.out.print("Introduce el DNI del propietario: ");
        vehicleType = kb.nextLine();
        vehiculo.setDNIPropietario(vehicleType);
    }

    private static void addTurismo() {
        myVehicles.add(new Turismos());
        introdVehicleData(myVehicles.get(myVehicles.size()-1), "l Turismo");
        System.out.print("Introduzca el numero de puertas del turismo (minimo 1 y maximo 5): ");
        ((Turismos)myVehicles.get(myVehicles.size()-1)).setNumPuertas(kb.nextInt());
        System.out.print("Introduzca el numero de plazas del Turismo: ");
        ((Turismos)myVehicles.get(myVehicles.size()-1)).setNumPlazas(kb.nextInt());
    }

    private static void addMoto() {
        myVehicles.add(new Motos());
        introdVehicleData(myVehicles.get(myVehicles.size()-1), " la Moto");
    }

    private static void addGuagua() {
        myVehicles.add(new Guaguas());
        introdVehicleData(myVehicles.get(myVehicles.size()-1), " la Guagua");
        System.out.print("Introduzca el numero de plazas de la Guagua: ");
        ((Guaguas)myVehicles.get(myVehicles.size()-1)).setNumPlazas(kb.nextInt());
        kb.nextLine();
        System.out.print("Introduzca el tipo de Servicio de esta Guagua ('Publico', 'Escolar' o 'Discrecional'): ");
        ((Guaguas)myVehicles.get(myVehicles.size()-1)).setTipoServicio(kb.nextLine());
    }

    private static String printGeneralData(Vehiculos vehicle) {
        return " con Matricula: " + vehicle.getMatricula() + "\nMarca: "+ vehicle.getMarca() + "\nDNI del Pripietario: " + vehicle.getDNIPropietario();
    }

    private static void printTurismos() {
        String res = "";
        System.out.println("\n--------------------\nTurismos Registrados:");
        for (Vehiculos vehicle: myVehicles) {
            if (vehicle instanceof Turismos) {
                res = "--> Turismo" + printGeneralData(vehicle) + "\n" + ((Turismos)vehicle).getNumPuertas() + " puertas \n" + ((Turismos)vehicle).getNumPlazas() + " plazas  ";
                System.out.println(res);
                res = "";
            }
        }
    }

    private static void printMotos() {
        System.out.println("\n--------------------\nMotos Registradas:");
        for (Vehiculos vehicle: myVehicles) {
            if (vehicle instanceof Motos) {
                System.out.println("--> Moto" + printGeneralData(vehicle));
            }
        }
    }

    private static void printGuaguas() {
        System.out.println("\n--------------------\nGuaguas Registradas:");
        for (Vehiculos vehicle: myVehicles) {
            if (vehicle instanceof Guaguas) {
                System.out.println("--> Guagua" + printGeneralData(vehicle) + "\n" + ((Guaguas)vehicle).getNumPlazas() + " plazas y es para Transporte " + ((Guaguas)vehicle).getTipoServicio());
            }
        }
    }
}