public abstract class Personagem {
    private String nome;
    private Sexo sexo;
    private double altura;


    public abstract String apresentar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.equals("")) {
            throw new IllegalArgumentException("Nome não pode estar vaziu");
        }else {
            this.nome = nome;
        }
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.5 && altura < 3.00) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("Altura invalida");
        }

    }
}
