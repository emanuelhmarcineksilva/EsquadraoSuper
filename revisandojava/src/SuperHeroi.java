public class SuperHeroi extends Personagem {
    public boolean identidadeSecreta;
    public String[] habilidades;

    public void mostrar() {
        System.out.println(nome + " - " + sexo + " - " + altura);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(habilidades[i]);
        }
    }














}