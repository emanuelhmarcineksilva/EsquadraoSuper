import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {
    public void getIdentidadeSecreta() {
        if (identidadeSecreta == true) {
            System.out.println("\"??? (identidade protegida)\"");
        } else {
            revelarIdentidade();
        }
    }

    public String revelarIdentidade(){
        return getNome();
    }
    public void setIdentidadeSecreta(boolean identidadeSecreta) {
        this.identidadeSecreta = identidadeSecreta;
    }

    public ArrayList<String> getHabilidades() {
        return new ArrayList<String>(this.habilidades);
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    private boolean identidadeSecreta;
    private ArrayList<String> habilidades;




    @Override
    public String apresentar() {
    return "prazer";
    }

    public void mostrar(){
        System.out.println(super.getNome() + " - " + super.getSexo().getDescricao() + " - " + super.getAltura());

//        for (int i = 0; i < getHabilidades().size(); i++) {
//            System.out.println(habilidades.get(i));
//        }
        for (String hab : habilidades) {
            System.out.println(hab);
        }
}
}