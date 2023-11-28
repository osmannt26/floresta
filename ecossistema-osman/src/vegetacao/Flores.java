package vegetacao;

public class Flores {
    public String nome;
    public int idade;

    public Flores(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void crescer() {
        System.out.println(nome + " está crescendo como uma nova flor.\n");
    }

    public void reproduzir() {
        System.out.println(nome + " está se reproduzindo como uma flor.\n");
    }

}
