class Loja extends Espaco {

    public Loja(String id, double area) {
        super(id, area);
    }

    @Override
    public double calcularAluguel() {
        System.out.printf("O valor do aluguel é: ");
        return 5000 + (super.getArea() * 10);
    }

    @Override
    public String getTipo() {
        return "Loja";
    }
}