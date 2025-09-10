abstract class Espaco implements Alugavel {
    private String id;
    private double area;
    boolean alugado;
    private Locatario locatario;

    public Espaco(String id, double area) {
        this.id = id;
        this.area = area;
        this.alugado = false;
    }

    public abstract double calcularAluguel();

    public abstract String getTipo();

    @Override
    public void alugar(Locatario locatario) throws EspacoNaoDisponivelException {
        if (this.alugado) {
            throw new EspacoNaoDisponivelException("O espaço " + this.id + " já está alugado");
        }
        this.alugado = true;
        this.locatario = locatario;
        System.out.println("O espaço " + this.id + " foi alugado para " + locatario.getNome() + ".");
    }

    @Override
    public void desocupar() {
        this.alugado = false;
        this.locatario = null;
        System.out.println("O espaço " + this.id + " foi desocupado");
    }

    @Override
    public boolean estaAlugado() {
        return alugado;
    }

    public String getId() {
        return id;
    }
    public double getArea() {
        return area;
    }
    public Locatario getLocatario(){
        return locatario;
    }

    @Override
    public String toString() {
        return String.format("Espaço ID: %s, Área: %.2f m², Tipo: %s, Status: %s",
                id, area, getTipo(), alugado ? "Alugado" : "Disponível");
    }
}