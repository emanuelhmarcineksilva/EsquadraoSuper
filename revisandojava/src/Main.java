import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personagem h = new SuperHeroi("Lisiane Reips", Sexo.MULHER, 1.75);
        ( (SuperHeroi) h).setIdentidadeSecreta(true);
        ( (SuperHeroi) h).setHabilidades(new ArrayList<>(List.of("super força", "visão de raio-x", "voar", "super velocidade", "sopro congelante")));
        ( (SuperHeroi) h).mostrar();
        System.out.println("\n-------Heroi--------\n\n" + h.apresentar());


        Personagem c = new Civil("Diogo Rodrigues", Sexo.HOMEM, 2.04);
        ( (Civil) c).setProfissao("Arquiteto");
        System.out.println("\n-------Civil--------\n\n" + c.apresentar());


        // O vSuperHeroi f = SuperHeroi h;
        //        ilão consegue fazer isto. Por quê?
    }
}