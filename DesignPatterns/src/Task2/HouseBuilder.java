package Task2;

public class HouseBuilder {
    private int etaje = 0;
    private int camere = 0;
    private String locatie;
    private boolean electrocasnice;
    private boolean piscina;
    private boolean panouriSolare;
    private boolean securitate;

    public HouseBuilder(String locatie, int etaje, int camere) {
        this.locatie = locatie;
        this.etaje = etaje;
        this.camere = camere;
    }
    public HouseBuilder electrocasnice(boolean electrocasnice) {
        this.electrocasnice = electrocasnice;
        return this;
    }
    public HouseBuilder piscina(boolean piscina) {
        this.piscina = piscina;
        return this;
    }
    public HouseBuilder panouriSolare(boolean panouriSolare) {
        this.panouriSolare = panouriSolare;
        return this;
    }
    public HouseBuilder securitate(boolean securitate) {
        this.securitate = securitate;
        return this;
    }
    public House build() {
        return new House(locatie,etaje,camere,electrocasnice,piscina,panouriSolare,securitate);
    }


}
