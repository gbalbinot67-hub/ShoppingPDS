class Locatario {
    private String nome;
    private String documento;

    public Locatario(String nome, String documento){
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome(){
        return nome;
    }
}