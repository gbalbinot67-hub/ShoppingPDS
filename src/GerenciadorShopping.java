import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class GerenciadorShopping {
    private List<Espaco> espacos = new ArrayList<>();

    public void adicionarEspaco(Espaco espaco) {
        espacos.add(espaco);
    }

    public Espaco buscarEspaco(String id) {
        for (Espaco espaco : espacos) {
            if (Objects.equals(espaco.getId(), id)) {
                return espaco;
            }
        }
        return null;
    }

    public void listarEspacos() {
        System.out.println("\n------- Lista de Espaços -------");
        espacos.forEach(System.out::println);
    }
}