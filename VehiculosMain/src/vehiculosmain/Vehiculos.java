package vehiculosmain;

public abstract class Vehiculos {
    private String matricula;
    private String marca;
    private String DNIPropietario;
    
    public Vehiculos() {
    }

    public Vehiculos(String matricula, String marca, String DNIPropietario) {
        this.matricula = matricula;
        this.marca = marca;
        this.DNIPropietario = DNIPropietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDNIPropietario() {
        return DNIPropietario;
    }

    public void setDNIPropietario(String DNIPropietario) {
        this.DNIPropietario = DNIPropietario;
    }
}
