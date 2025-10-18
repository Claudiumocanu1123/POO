package Task2;

public class House {
    public String locatie;
    public int etaje;
    public int camere;
    private boolean electrocasnice;
    private boolean piscina;
    private boolean panouriSolare;
    private boolean securitate;

    public House(String locatie, int etaje, int camere, boolean electrocasnice, boolean piscina, boolean panouriSolare, boolean securitate) {

        this.locatie = locatie;
        this.etaje = etaje;
        this.camere = camere;
        this.electrocasnice = electrocasnice;
        this.piscina = piscina;
        this.panouriSolare = panouriSolare;
        this.securitate = securitate;
    }
    public String toString() {
        return locatie + " " + etaje + " " + camere + " " + electrocasnice + " " + piscina + " " + panouriSolare + " " + securitate;
    }
}
