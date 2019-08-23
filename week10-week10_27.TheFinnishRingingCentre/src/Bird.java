
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Bird compared = (Bird) object;

        if (!this.latinName.equals(compared.latinName) || this.ringingYear != compared.ringingYear) {
            return false;
        }

        if (this.latinName.equals(compared.latinName) && this.ringingYear == compared.ringingYear) {
            return true;
        }
        return true;

    }

    @Override
    public int hashCode() {
        return this.latinName.hashCode();
    }
}
