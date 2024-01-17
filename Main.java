public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder("Mario", "Sturniolo");
        builder.setEta(55);
        builder.setIndirizzo("Via Roma 50");

        //Persona creata tramite Builder.
        Person persona1 = builder.build();
        System.out.println("Persona1: " + persona1);

        System.out.println("------------------------------------------------------------------------------------");

        //Persona creata tramite istanza di Persona.
        Person persona2 = new Person("Giuseppe", "Rossi",34,"Via Luce 23");
        System.out.println("Persona2: " + persona2);
    }
}
