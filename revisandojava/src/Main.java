import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<Personagem>();
        ArrayList<String> habilidads = new ArrayList<>(List.of("super força", "visão de raio-x", "voar", "super velocidade", "sopro congelante"));
        Personagem h = new SuperHeroi("Lisiane Reips",Sexo.MULHER,1.75,true,habilidads);
        personagens.add(h);
        for(Personagem personagem:personagens){
            personagem.apresentar();
            personagem.agir();
        }

    }
}