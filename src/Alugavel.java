import java.util.ArrayList;

public class Alugavel  {
    private int codigo;
    private String nome;
    private double precoDiario;
    private int anoFabricacao;
    private int numeroCavalos;
    private Aluguel aluguel;

    public Alugavel(int codigo, String nome, double precoDiario, int anoFabricacao, int numeroCavalos) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoDiario = precoDiario;
        this.anoFabricacao = anoFabricacao;
        this.numeroCavalos = numeroCavalos;
    }

    public Alugavel(int codigo, String nome, double precoDiario, int anoFabricacao, int numeroCavalos, Aluguel aluguel) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoDiario = precoDiario;
        this.anoFabricacao = anoFabricacao;
        this.numeroCavalos = numeroCavalos;
        this.aluguel = aluguel;
    }


    public boolean adicionaAluguel(Aluguel aluguel) { //REVISAR
        if (aluguel.getAlugavel().equals(false)) {
            return false;
        }
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(double precoDiario) {
        this.precoDiario = precoDiario;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getNumeroCavalos() {
        return numeroCavalos;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

}
