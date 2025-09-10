public class Main {
    public static void main(String[] args) {
        GerenciadorShopping gerenciador = new GerenciadorShopping();

        gerenciador.adicionarEspaco(new Loja("L01", 120));
        gerenciador.adicionarEspaco(new Quiosque("Q01", 8));
        gerenciador.adicionarEspaco(new Loja("L02", 200));

        gerenciador.listarEspacos();

        Locatario locatorio01 = new Locatario("Pedro Pascal", "73625413813");

        Espaco lojaParaAlugar = gerenciador.buscarEspaco("L01");

        if (lojaParaAlugar != null) {
            try {
                lojaParaAlugar.alugar(locatorio01);
            } catch (EspacoNaoDisponivelException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("------- Verificando espaço -------");
        System.out.println(lojaParaAlugar);

        try {
            lojaParaAlugar.alugar(new Locatario("João", "98309548456"));
        } catch (EspacoNaoDisponivelException e) {
            System.out.println("\n" + e.getMessage());
        }

        lojaParaAlugar.desocupar();
        System.out.println("------- Verificando espaço -------");
        System.out.println(lojaParaAlugar);

    }
}