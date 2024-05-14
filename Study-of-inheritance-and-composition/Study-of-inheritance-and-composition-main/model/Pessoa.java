public class Pessoa {

    private String name;
    private Papel papel;

    public Pessoa(String name, Papel papel) {
        this.name = name;
        this.papel = papel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return "Pessoa " +
                "name='" + name + '\'' +
                ", papel=" + papel +
                '}';
    }
}