public class Contact {
    // TODO vegyél fel egy név és egy telefonszám fieldet, írj konstruktort és gettereket!

    private final String name;

    private final String mobil;

    public Contact(String name, String mobil){
        this.name = name;
        this.mobil = mobil;
    }

    public String getName() {
        return name;
    }

    public String getMobil() {
        return mobil;
    }

    @Override
    public String toString() {
        return name + " ; " + mobil;
    }
}
