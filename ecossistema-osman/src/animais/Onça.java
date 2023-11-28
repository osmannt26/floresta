package animais;

public class Onça extends Mamiferos {
    public Onça(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println(nome + "  O maior predador está caçando sua presa pela floresta\n");
    }

    public void fazer_som(){
        System.out.println("A " + nome + " começou a rugir muito alto.\n");
    }
    
}
