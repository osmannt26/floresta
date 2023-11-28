package animais;

public class Marmota extends Mamiferos {
    public Marmota(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println(nome + " está se movimentando lentamente pela floresta\n");
    }
    
}
