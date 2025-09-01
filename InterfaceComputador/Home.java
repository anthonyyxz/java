package InterfaceComputador;

public class Home implements Computador {
    private String marca;
    private int memoriaRam;

    public Home(String marca, int memoriaRam) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void ligar() {
        System.out.println("Computador Home está ligando...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Computador Home está reiniciando...");
    }

    @Override
    public void desligar() {
        System.out.println("Computador Home está desligando...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Computador Home está carregando sistema...");
    }
}
