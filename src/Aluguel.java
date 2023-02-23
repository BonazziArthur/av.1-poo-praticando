import java.util.ArrayList;

public class Aluguel {

    private String data;
    private int periodo;
    private String cpf;
    private String nome;
    private double valorFinal;
    private Alugavel alugavel;

    public Aluguel(String data, int periodo, String cpf, String nome, double valorFinal, Alugavel alugavel) {
        this.data = data;
        this.periodo = periodo;
        this.cpf = cpf;
        this.nome = nome;
        this.valorFinal = valorFinal;
        this.alugavel = alugavel;
    }

    public double calculaValorTotal() { //!
        double total = periodo * alugavel.getPrecoDiario();
        if (periodo > 7) {
            double desconto = total - total * 0.1;
            valorFinal = desconto;
        }
        return valorFinal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Alugavel getAlugavel() {
        return alugavel;
    }
}
