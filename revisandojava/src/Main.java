import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personagem h = new SuperHeroi();
        h.setNome("Lisiane Reips");
        h.setSexo(Sexo.MULHER);
        h.setAltura(1.75);
        ( (SuperHeroi) h).setIdentidadeSecreta(true);
        ( (SuperHeroi) h).setHabilidades(new ArrayList<>(List.of("super força", "visão de raio-x", "voar", "super velocidade", "sopro congelante")));
        ( (SuperHeroi) h).mostrar();

        // O vSuperHeroi f = SuperHeroi h;
        //        ilão consegue fazer isto. Por quê?
    }
}