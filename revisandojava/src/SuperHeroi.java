import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SuperHeroi extends Personagem {
    Random random = new Random();
    public SuperHeroi(String nome, Sexo sexo, double altura, boolean identidadeSecreta, ArrayList<String> habilidades){
        super(nome,sexo,altura);
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = habilidades;
    }

    @Override
    public void agir(){
        int randomIndex = random.nextInt(habilidades.size());
        String randomString = habilidades.get(randomIndex);
        System.out.println(randomString);
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
        System.out.println("Prazer, Super HEROI!!");
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


    public void usarHabilidade(){
        int randomIndex = random.nextInt(habilidades.size());
        String randomString = habilidades.get(randomIndex);
        System.out.println(randomString);
    }

    public void usarHabilidade(int indice){
        try {
            String habilidadeDeUso = habilidades.get(indice);
            System.out.println(habilidadeDeUso);
        }
        catch (IndexOutOfBoundsException ier){
            System.out.println("index out of bounds!!");
        }
    }

    public void usarHabilidade(String nome){
        for (String habilidade : habilidades){
        if (habilidade == "nome"){
            System.out.println(habilidade);
            break;
        }
    }
    }
}