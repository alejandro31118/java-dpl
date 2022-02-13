package vehiculosmain;

public class Guaguas extends Vehiculos {
    private int numPlazas;
    private String tipoServicio; //Publico, Escolar o Discrecional

    public Guaguas() {
    }

    public Guaguas(String matricula, String marca, String DNIPropietario, int numPlazas, String tipoServicio) {
        super(matricula, marca, DNIPropietario);
        this.numPlazas = numPlazas;
        this.tipoServicio = tipoServicio;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
