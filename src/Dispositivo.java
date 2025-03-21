public abstract class Dispositivo {
    private final String modelo;
    private final String fabricante;

    public Dispositivo(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }
}
