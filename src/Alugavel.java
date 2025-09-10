interface Alugavel {
    void alugar(Locatario locatario) throws EspacoNaoDisponivelException;
    void desocupar();
    boolean estaAlugado();
}