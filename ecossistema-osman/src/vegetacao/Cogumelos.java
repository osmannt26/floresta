package vegetacao;

public class Cogumelos extends Flores {
    public Cogumelos(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void crescer() {
        System.out.println(nome + " estão crescendo muito pela floresta, alías são ótimos alimentos para insetos. \n");
    }

}
