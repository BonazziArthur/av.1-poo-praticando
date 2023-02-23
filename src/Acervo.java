import java.util.ArrayList;

public class Acervo {
    private ArrayList<Alugavel> itensAlugaveis = new ArrayList<Alugavel>();

    public boolean adicionaAlugavel(Alugavel item) {
        for (Alugavel itemAlugado : itensAlugaveis) {
            if (item.getCodigo() == (itemAlugado.getCodigo())) {
                return false;
            }
        }
        itensAlugaveis.add(item);
        return true;
    }

    public Alugavel pesquisaAlugavelCodigo(int codigo) {
        for (Alugavel itemDesejado : itensAlugaveis) {
            if (itemDesejado.getCodigo() == codigo) {
                return itemDesejado;
            }
        }
        return null;
    }

    public ArrayList<Alugavel> pesquisaAlugavelNome(String nome) {
        ArrayList<Alugavel> listaDesejada = new ArrayList<>();
        for (Alugavel itemDesejado : itensAlugaveis) {
            if (itemDesejado.getNome().equals(nome)) {
                listaDesejada.add(itemDesejado);
                return listaDesejada;
            }
        }
        return null;
    }

    public ArrayList<Alugavel> getItensAlugaveis() {
        return itensAlugaveis;
    }
}
