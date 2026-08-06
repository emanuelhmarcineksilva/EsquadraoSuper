public class Civil extends Personagem {
    public Civil(String nome, Sexo sexo, double altura){
        super(nome,sexo,altura);

    }

    @Override
    public String apresentar() {
        return "prazer, sou apenas um civil normal";
    }
    @Override
    public void agir(){
        System.out.println("Sou apenas um civil, SOCORRO!!");
    }
}
