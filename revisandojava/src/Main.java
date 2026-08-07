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

        Personagem h4 = new SuperHeroi("vilardiner", Sexo.PREFIRO_NAO_DIZER, 1.90);
        ( (SuperHeroi) h4).setIdentidadeSecreta(true);
        ( (SuperHeroi) h4).setHabilidades(new ArrayList<>(List.of("Teletransporte", "Volta 10s", "Respirar no vácuo")));
        ( (SuperHeroi) h4).mostrar();

        System.out.println("\n-------Heroi--------\n\n");

        personagens.add(h1);
        personagens.add(h2);
        personagens.add(h3);
        personagens.add(h4);

        for (Personagem p : personagens) {
            System.out.println("\n\nEntão " + p.getNome() + " entra em cena\n");
            p.apresentar();
            p.agir();
        }

        ((SuperHeroi) h1).usarHabilidade("Grande bola de fogo");
        System.out.println("E o que você tem a dizer " + h1.getNome() + "?\n   -" + h1.toString());

        Personagem c1 = new Civil("Diogo Rodrigues", Sexo.HOMEM, 2.04);
        ( (Civil) c1).setProfissao("Arquiteto");

        Personagem c2 = new Civil("Victor Paulo", Sexo.HOMEM, 2.01);
        ( (Civil) c2).setProfissao("Marinheiro");

        Personagem c3 = new Civil("Daniel Burgues", Sexo.HOMEM, 1.96);
        ( (Civil) c3).setProfissao("Bombeiro");

        Personagem c4 = new Civil("Natanael Doris", Sexo.HOMEM, 1.73);
        ( (Civil) c4).setProfissao("Professor");
        System.out.println("\n-------Civil--------\n\n");

        personagens.add(c1);
        personagens.add(c2);
        personagens.add(c3);
        personagens.add(c4);

        for (Personagem c : personagens) {
            if (c instanceof Civil) {
                System.out.println("\n" + c.apresentar());
            }
        }
        // O vSuperHeroi f = SuperHeroi h;
        //        ilão consegue fazer isto. Por quê?



        ///////////////// BATALHA /////////////////

        Batalha batalhaFinal = new Batalha();

        batalhaFinal.adicionar(h1);
        batalhaFinal.adicionar(h2);
        batalhaFinal.adicionar(h3);
        batalhaFinal.adicionar(h4);
        batalhaFinal.adicionar(c1);
        batalhaFinal.adicionar(c2);
        batalhaFinal.adicionar(c3);
        System.out.println("\n");

        batalhaFinal.listarHerois();
        System.out.println("\n");

        batalhaFinal.maisAlto();
        System.out.println("\n");

        batalhaFinal.iniciar();
        System.out.println("\n");

        batalhaFinal.removerDerrotado("Mario Felgas");
        System.out.println("\n");

        batalhaFinal.listarHerois();
    }
}