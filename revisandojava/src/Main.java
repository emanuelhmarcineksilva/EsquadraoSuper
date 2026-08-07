import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();

        Personagem h1 = new SuperHeroi("Lisiane Reis", Sexo.MULHER, 1.75);
        ( (SuperHeroi) h1).setIdentidadeSecreta(true);
        ( (SuperHeroi) h1).setHabilidades(new ArrayList<>(List.of("super força", "visão de raio-x", "voar", "super velocidade", "sopro congelante")));
        ( (SuperHeroi) h1).mostrar();

        Personagem h2 = new SuperHeroi("Mario Felgas", Sexo.HOMEM, 1.85);
        ( (SuperHeroi) h2).setIdentidadeSecreta(true);
        ( (SuperHeroi) h2).setHabilidades(new ArrayList<>(List.of("Corpo de aço", "Mutação molecular", "mergulhar no concreto")));
        ( (SuperHeroi) h2).mostrar();

        Personagem h3 = new SuperHeroi("MAX", Sexo.PREFIRO_NAO_DIZER, 1.50);
        ( (SuperHeroi) h3).setIdentidadeSecreta(true);
        ( (SuperHeroi) h3).setHabilidades(new ArrayList<>(List.of("Misturar com a sombra", "Andar pelas nuvens", "mergulahr no vento", "Mãos de choque")));
        ( (SuperHeroi) h3).mostrar();

        System.out.println("\n-------Heroi--------\n\n");

        personagens.add(h1);
        personagens.add(h2);
        personagens.add(h3);

        for (Personagem p : personagens) {
            System.out.println("\n\nEntão " + p.getNome() + " entra em cena\n");
            p.apresentar();
            p.agir();
        }

        ((SuperHeroi) h1).usarHabilidade("Grande bola de fogo");
        System.out.println("E o que você tem a dizer " + h1.getNome() + "?\n   -" + h1.toString());

        Personagem c = new Civil("Diogo Rodrigues", Sexo.HOMEM, 2.04);
        ( (Civil) c).setProfissao("Arquiteto");
        System.out.println("\n-------Civil--------\n\n" + c.apresentar());


        // O vSuperHeroi f = SuperHeroi h;
        //        ilão consegue fazer isto. Por quê?
    }
}