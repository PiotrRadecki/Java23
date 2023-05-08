// Definicja klasy abstrakcyjnej Zwierze
abstract class Zwierze {
    // Pole 'imie' jest dostępne dla wszystkich klas dziedziczących po Zwierze
    String imie;

    // Konstruktor zdefiniowany w klasie abstrakcyjnej
    public Zwierze(String imie) {
        this.imie = imie;
    }

    // Metoda abstrakcyjna, która będzie musiała być zaimplementowana przez klasy dziedziczące
    public abstract void dajGlos();
}

// Definicja interfejsu Ssak
interface Ssak {
    void karm();
}

// Definicja interfejsu Wodny
interface Wodny {
    void plywaj();
}

// Klasa Pies dziedzicząca po klasie abstrakcyjnej Zwierze i implementująca interfejs Ssak
class Pies extends Zwierze implements Ssak {
    // Konstruktor zdefiniowany w klasie Pies
    public Pies(String imie) {
        // Wywołanie konstruktora z klasy nadrzędnej
        super(imie);
    }

    // Implementacja metody abstrakcyjnej z klasy Zwierze
    public void dajGlos() {
        System.out.println("Hau, hau!");
    }

    // Implementacja metody z interfejsu Ssak
    public void karm() {
        System.out.println("Karmię szczeniaka.");
    }

    // Nadpisanie metody toString z klasy Object
    @Override
    public String toString() {
        return "Pies " + imie;
    }
}

// Klasa Delfin dziedzicząca po klasie abstrakcyjnej Zwierze i implementująca interfejs Wodny
class Delfin extends Zwierze implements Wodny {
    // Konstruktor zdefiniowany w klasie Delfin
    public Delfin(String imie) {
        // Wywołanie konstruktora z klasy nadrzędnej
        super(imie);
    }

    // Implementacja metody abstrakcyjnej z klasy Zwierze
    public void dajGlos() {
        System.out.println("Iks, iks!");
    }

    // Implementacja metody z interfejsu Wodny
    public void plywaj() {
        System.out.println("Pływam w delfinarium.");
    }

    // Nadpisanie metody toString z klasy Object
    @Override
    public String toString() {
        return "Delfin " + imie;
    }
}

// Klasa Husky dziedzicząca po klasie Pies
class Husky extends Pies {
    // Konstruktor zdefiniowany w klasie Husky
    public Husky(String imie) {
        // Wywołanie konstruktora z klasy nadrzędnej
        super(imie);
    }
}

// Klasa Chihuahua dziedzicząca po klasie Pies
class Chihuahua extends Pies {
    // Konstruktor zdefiniowany
// w klasie Chihuahua
    public Chihuahua(String imie) {
// Wywołanie konstruktora z klasy nadrzędnej
        super(imie);
    }
}

// Przykład użycia klas i interfejsów
public class Main {
    public static void main(String[] args) {
// Tworzenie obiektów klas Pies i Delfin
        Pies pies = new Husky("Burek");
        Delfin delfin = new Delfin("Flipper");
        // Wywołanie metody dajGlos na obiektach klas Pies i Delfin
        pies.dajGlos();
        delfin.dajGlos();

        // Wywołanie metody karm tylko na obiekcie klasy Pies
        ((Ssak) pies).karm();

        // Wywołanie metody plywaj tylko na obiekcie klasy Delfin
        ((Wodny) delfin).plywaj();

        // Wywołanie nadpisanej metody toString na obiektach klas Pies i Delfin
        System.out.println(pies);
        System.out.println(delfin);
    }
}