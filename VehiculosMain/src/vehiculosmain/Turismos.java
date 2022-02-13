package vehiculosmain;

public class Turismos extends Vehiculos {
    private int numPuertas;
    private int numPlazas;

    public Turismos() {
    }

    public Turismos(String matricula, String marca, String DNIPropietario, int yearMatriculacion, int numPuertas) {
        super(matricula, marca, DNIPropietario);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
}