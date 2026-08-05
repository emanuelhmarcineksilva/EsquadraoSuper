public enum Sexo {
    MULHER("Gênero feminino"),HOMEM("Sexo Masculino"),OUTRO,PREFIRO_NAO_DIZER("Opção de não escolher");

    private String descricao;
    private Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
