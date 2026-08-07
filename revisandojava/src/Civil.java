public class Civil extends Personagem{
    private String profissao;

    public Civil(String nome, Sexo sexo, double altura) {
        super(nome, sexo, altura);
    };

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String apresentar() {
        return "Sou civil meu nome é: " + getNome() + " tenho " + getAltura() + " de altura e trabalho como " + getProfissao();
    }

    @Override
    public void agir() {

    }
}
