public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder("Mario", "Sturniolo");
        builder.setEta(55);
        builder.setIndirizzo("Via Roma 50");

        Person persona1 = builder.build();
        System.out.println("Persona1: " + persona1);

        System.out.println("------------------------------------------------------------------------------------");

        PersonBuilder builder2 = new PersonBuilder("Pino", "Stinnicchio");
        builder2.setEta(44);
        builder2.setIndirizzo("Via Disgrazia 50");

        Person persona2 = builder2.build();
        System.out.println("Persona2: " + persona2);

    }
}
