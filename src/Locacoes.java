import java.util.ArrayList;

public class Locacoes {
    private ArrayList<Aluguel> listaDeCarros = new ArrayList<>();

    public void adicionaAluguel(Aluguel aluguel) {
        listaDeCarros.add(aluguel);
    }

    public ArrayList<Aluguel> pesquisaAluguel(String cpf) {
        ArrayList<Aluguel> listaDesejadaAluguel = new ArrayList<>();
        for (Aluguel aluguelDesejado : listaDeCarros) {
            if (aluguelDesejado.getCpf().equals(cpf)) {
                listaDesejadaAluguel.add(aluguelDesejado);
                return listaDesejadaAluguel;
            }
        }
        return null;
    }

    public ArrayList<Aluguel> getListaDeCarros() {
        return listaDeCarros;
    }
}
