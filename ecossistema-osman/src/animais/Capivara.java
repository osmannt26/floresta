package animais;

public class Capivara extends Mamiferos {
    public Capivara(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println("A " + nome + " está caminhando pela floresta procurando por tipos de capim e vegetações aquáticas próximos a rios\n");
    }
    
}
