public class PersonBuilder {
    private String nome;
    private String cognome;
    private int eta;
    private String indirizzo;

    public PersonBuilder(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public PersonBuilder setEta(int eta) {
        this.eta = eta;
        return this;
    }

    public PersonBuilder setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
        return this;
    }

    public Person build() {
        return new Person(nome, cognome, eta, indirizzo);
    }
}
