public class Main {
    //Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
    //Il costruttore accetterà un Builder in input
    //Creare una classe Builder che attraverso il costruttore e dei metodi specifici
    //(tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
    //Creare due oggetti Person e stamparli a video
    public static void main(String[] args) {

        PersonBuilder person = new PersonBuilder("Mario", "Rossi");
        person.setAge(21);
        Person person1 = person.info();

        Person personFull = new Person("Marco", "Bianchi", 17, "Rome");

        System.out.println("Name & Surname mandatory fields: " + person1);
        System.out.println("All mandatory fields" + personFull);
    }
}