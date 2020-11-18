package ovning;

 /*
        1. Skapa en klass Person som beskriver en person.
        Definiera följande egenskaper: namn, adress och personnummer.
        Skapa setters och getters.

        2. Skapa en subklass till Person som beskriver en anställd.
        Spara klassen som Employee.
        Subklassen ska ha nya egenskaper: befattning och lön
        Skapa metoder som sätter och hämtar de nya egenskaperna.
        Skapa en metod som höjer lönen för en anställd med 10%

        3. Skapa ett testprogram där du testar allt ovan.

  */

public class Person {

    // Instansvariabler
    private String namn;
    private String adress;
    private String personnummer;

    // Konstruktor
    public Person(String namn, String adress, String personnummer){
        this.namn = namn;
        this.adress = adress;
        this.personnummer = personnummer;
    }

    // Setters
    public void setNamn(String namn){
        if(namn == null)
            throw new NullPointerException();
        if(namn.isBlank())
            throw new IllegalArgumentException("namnet måste innehålla tecken");
        else
            this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if(adress == null)
            throw new NullPointerException();
        if(adress.isBlank())
            throw new IllegalArgumentException("adressen får inte vara tom");
        else
            this.adress = namn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        if(personnummer == null)
            throw new NullPointerException();
        if(personnummer.isBlank())
            throw new IllegalArgumentException("personnumret får inte vara tomt");
        else
            this.personnummer = namn;    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("namn='").append(namn).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", personnummer='").append(personnummer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
