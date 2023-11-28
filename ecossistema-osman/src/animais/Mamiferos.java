package animais;

public class Mamiferos {
    public String nome;
    public int idade;
    
    public Mamiferos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println("O " + nome + " Achou comida, está se alimentando.\n");
    }

    public void reproduzir() {
        System.out.println("O "+nome + " está procriando.\n");
    }

    public void movimentar() {
        System.out.println("O "+nome + " está andando na floresta. /n");
    }
    
}
