package animais;

public class Falcao extends Aves {
    public String nome;

    public Falcao(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
    }

    public void voar() {
        System.out.println(nome + " está voando pela floresta\n");
    }

}
