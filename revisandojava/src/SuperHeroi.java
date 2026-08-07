import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {

    public SuperHeroi(String nome, Sexo sexo, double altura){
        super(nome,sexo,altura);
    }



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
        System.out.println("Sou Heroi meu nome é: " + getNome() + " tenho " + getAltura() + " e minha abilidade principal é " + getHabilidades().getFirst());
        return "Foi apresentado";
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

    @Override
    public void agir() {
        System.out.println("Estão o Super Heroi " + getNome() + " Usuou seu poder de " + getHabilidades().getLast() + " e atacou o inimigo!");
    }


    public void usarHabilidade() {
        System.out.println("Então o heroi " + getNome() + " usa " + getHabilidades().get(2));
    }

    public void usarHabilidade(int indice) {
        if (indice < getHabilidades().size()) {
            System.out.println("Então o heroi " + getNome() + " usa " + getHabilidades().get(indice));
        } else {
            System.out.println("Habilidade não funcionou");
        }
    }

    public void usarHabilidade(String nome) {
        System.out.println("Então o heroi " + getNome() + " usa " + nome);
    }
}