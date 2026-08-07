import java.util.List;

public class Batalha {
    private List<Personagem> participantes;
    public boolean eDuplicado(Personagem Participante){
        for (int i = 0; i < participantes.size(); i++) {
            for (int j = i + 1; j < participantes.size(); j++) {
                if (participantes.get(i) == participantes.get(j)) {
                    return true;
                }
            }

        }

        return false;
    }

    public void adicionar(Personagem participante) {
        if (participante != null && !eDuplicado(participante)) {
            participantes.add(participante);
        } else {
            System.out.println("Não deu para adicionar, participante nulo ou duplicado.");
        }
    }
    public void iniciar() {
        for (Personagem personagem : participantes) {
            personagem.agir();
        }
    }
    public Personagem maisAlto(){
        Personagem alto_atual = participantes.get(0);
        for (int i = 0;i<participantes.size();i++) {
           if (alto_atual.getAltura() < participantes.get(i+1).getAltura()){
               alto_atual = participantes.get(i+1);
           }
        }
        return alto_atual;
    }

    public boolean removerDerrotado(String nome){
        for (Personagem p: participantes){
            if (p.getNome() == nome){
                participantes.remove(p);
                return true;
            }
        }
        return false;
    }
}
