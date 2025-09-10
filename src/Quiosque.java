class Quiosque extends Espaco {
    public Quiosque(String id, double area) {
        super(id, area);
    }

    @Override
    public double calcularAluguel() {
        return 1500;
    }

    @Override
    public String getTipo() {
        return "Quiosque";
    }
}