package vegetacao;

public class Arbustos extends Flores {
    public String nome;

    public Arbustos(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
    }

    @Override
    public void crescer() {
        System.out.println(nome + " estão crescendo por toda floresta, alguns bem volumosos.\n");
    }
}
