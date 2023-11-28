
import animais.*;
import vegetacao.*;
import clima_floresta.*;

public class ecossistema {
    public static void main(String[] args) {
        // Tipos de animais da floresta
        Onça onça = new Onça("Onça Pintada", 5);
        Capivara capivara = new Capivara("Capivara", 3);
        Gaviao gaviao = new Gaviao("Gavião", 4);
        Falcao falcao = new Falcao("Falcão", 2);
        Marmota marmota = new Marmota("Marmota", 1);
        Coelho coelho = new Coelho("Coelho", 2);

        // Vegetação/Plantas
        Arvores eucaliptos = new Arvores("Eucaliptos", 10);
        Cogumelos cogumelos = new Cogumelos("Cogumelos", 1);
        Arbustos amoras = new Arbustos("Arbustos", 1);

        // Criando fenômenos naturais
        Tempestade tempestade = new Tempestade("Tempestade de Inverno");

        // Interações entre animais/floresta
        System.out.println("\n\nE assim começa o dia na floresta:\n\n");
        System.out.println("Os anmimais acordaram! \n");
        onça.movimentar();
        onça.fazer_som();
        capivara.movimentar();
        gaviao.voar();
        falcao.voar();
        marmota.movimentar();
        coelho.movimentar();
        onça.comer();
        capivara.comer();
        marmota.comer();
        coelho.movimentar();
        eucaliptos.crescer();
        cogumelos.crescer();
        eucaliptos.balancar();
        amoras.crescer();
        tempestade.iniciarTempestade();
        System.out.println("Os animais procuraram os lugares mais seguros para abrigo na floresta, para se protegerem do frio que está por vir.\n");
        System.out.println("\n\n O inverno chegou e os animais se abrigaram, Fim da simulação.\n\n");
    }
}
