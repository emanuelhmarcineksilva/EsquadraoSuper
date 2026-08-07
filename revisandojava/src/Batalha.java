import java.util.ArrayList;
import java.util.List;

public class Batalha {
    private List<Personagem> participantes = new ArrayList<>();

    public void adicionar(Personagem p) {
        if (p == null) {return;}

        for (Personagem hero : participantes) {
            if (hero.equals(p)) {
                System.out.println("Este participante ja esta no ringue!");
                return;
            }
        }

        participantes.add(p);

    }

    public void iniciar() {
        for (Personagem p : participantes) {
            p.agir();
        }
    }
    public void listarHerois() {
        for (Personagem p : participantes) {
            System.out.println("--- Inscritos ---\n ");
            if (p instanceof SuperHeroi) {
                System.out.println(p.getNome() + "\n");
            }
        }
    }
    public void maisAlto() {
        if (participantes.isEmpty()) {
            System.out.println("Não há participantes");
            return;
        }
        Personagem maisAlto = participantes.getFirst();
        for (Personagem p : participantes) {
            maisAlto = p;
            if (p.getAltura() > maisAlto.getAltura()) {
                maisAlto = p;
            }
        }
        System.out.println("O mais alto é " + maisAlto.getNome());
    }

    public void removerDerrotado(String nomeDeGuerra) {
        for (Personagem p : participantes) {
            if (nomeDeGuerra.equals(p.getNome())) {
                participantes.remove(p);
            } else {
                System.out.println("Não existe esse participante!");
            }
        }
    }
}
