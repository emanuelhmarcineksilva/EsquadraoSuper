import java.util.ArrayList;

public class Vilao extends Personagem {
    private int nivelDeAmeaca;
    public Vilao(String nome, Sexo sexo, double altura, int nivelDeAmeaca){
        super(nome,sexo,altura);
        if (nivelDeAmeaca <= 10 && nivelDeAmeaca >= 0) {
            this.nivelDeAmeaca = nivelDeAmeaca;
        }
        else {
            System.out.println("Nível de ameaça inválido!!");
        }

    }

    @Override
    public String apresentar() {
        return "prazer, vilao";
    }

    @Override
    public void agir() {

    }
}
