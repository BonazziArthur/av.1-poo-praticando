import java.util.ArrayList;
import java.util.Scanner;

public class ACMERental {
    private Scanner in;
    private Acervo acervo;
    private Locacoes locacoes;

    public ACMERental() {
        in = new Scanner(System.in);
        acervo = new Acervo();
        locacoes = new Locacoes();
    }

    public void executa() {
        int escolha;
        do {
            menu();
            escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 1:
                    dadosCadastrados();
                    break;
                case 2:
                    pesquisarItemCodigo();
                    break;
                case 3:
                    pesquisarItemNome();
                    break;
                case 4:
                    pesquisarAlugueisCliente();
                    break;
                case 5:
                    System.out.println("Saindo da aplicação...");
                    break;
            }
        } while (escolha != 5);
    }


    private void menu() {
        System.out.println("=============================");
        System.out.println("Opcoes:");
        System.out.println("[1] Mostrar todos os dados cadastrados");
        System.out.println("[2] Pesquisar item alugavel pelo codigo");
        System.out.println("[3] Pesquisar itens alugaveis pelo nome");
        System.out.println("[4] Pesquisar alugueis de um cliente:");
        System.out.println("[5] Sair");
        System.out.println("=============================");
        System.out.println("Opcao desejada: ");
    }


    public void preCadastra() {
        Alugavel alugavel1, alugavel2, alugavel3;
        Aluguel aluguel1, aluguel2, aluguel3, aluguel4, aluguel5;

        alugavel1 = new Alugavel(1, "Ford KA", 100, 2019, 100);
        acervo.adicionaAlugavel(alugavel1);
        alugavel2 = new Alugavel(2, "Uno", 90, 2021, 80);
        acervo.adicionaAlugavel(alugavel2);
        alugavel3 = new Alugavel(3, "Mustang", 1000, 2022, 300);
        acervo.adicionaAlugavel(alugavel3);

        aluguel1 = new Aluguel("23/02/2023", 9, "xxx", "Joao", 900, alugavel1);
        locacoes.adicionaAluguel(aluguel1);
        aluguel2 = new Aluguel("22/02/2023", 7, "yyy", "Cleber", 700, alugavel1);
        locacoes.adicionaAluguel(aluguel2);
        aluguel3 = new Aluguel("22/02/2023", 7, "yyy", "Jorge", 700, alugavel1);
        locacoes.adicionaAluguel(aluguel3);
        aluguel4 = new Aluguel("22/02/2023", 7, "yyy", "Yama", 700, alugavel3);
        locacoes.adicionaAluguel(aluguel4);
        aluguel5 = new Aluguel("22/02/2023", 7, "yyy", "Yama", 700, alugavel2);
        locacoes.adicionaAluguel(aluguel5);

    }

    private void dadosCadastrados() {
        ArrayList<Alugavel> carrosCadastrados = acervo.getItensAlugaveis(); //IMPORTANTE
        ArrayList<Aluguel> alugueisCadastrados = locacoes.getListaDeCarros();

        if (carrosCadastrados.isEmpty()) {
            System.out.println("Nenhum item alugavel cadastrado no sistema!");
        } else {
            System.out.println("Itens Cadastrados até o momento presente e respectivos alugueis: ");
            for (Alugavel alugavel : carrosCadastrados) {
                System.out.println("Nome: " + alugavel.getNome());
                System.out.println("Codigo: " + alugavel.getCodigo());
                System.out.println("Preco Diario: " + alugavel.getPrecoDiario());
                System.out.println("Ano de Fabricacao: " + alugavel.getAnoFabricacao());
                System.out.println("Numero de Cavalos: " + alugavel.getNumeroCavalos());
            }
        }
    }

    private void pesquisarItemCodigo() {
        System.out.println("Insira o código de um item alugável: ");
        int codigo = in.nextInt();
        Alugavel carroCadastrado = acervo.pesquisaAlugavelCodigo(codigo);
        if (carroCadastrado.equals(codigo)) {
            System.out.println("Nome: " + carroCadastrado.getNome());
            System.out.println("Codigo: " + carroCadastrado.getCodigo());
            System.out.println("Ano Fabricacao: " + carroCadastrado.getAnoFabricacao());
        } else {
            System.out.println("Nenhum item alugavel encontrado com este codigo");
        }
    }

    public void pesquisarItemNome() {
        System.out.println("Insira o nome de um item alugavel: ");
        String item = in.nextLine();
        if (acervo.pesquisaAlugavelNome(item) == null) {
            System.out.println("Nenhum item alugavel encontrado" +
                    "com este nome.");
        } else {
            System.out.println("Itens alugaveis com o nome indicado " +
                    "e dados dos respectivos alugueis: ");
            System.out.println(acervo.getItensAlugaveis());
            System.out.println(locacoes.getListaDeCarros());
        }
    }


    private void pesquisarAlugueisCliente() {
        System.out.println("Insira o CPF do cliente para visualizar seus alugueis: ");
        String cpf = in.nextLine();
        if (locacoes.pesquisaAluguel(cpf) == null) {
            System.out.println("Nenhum aluguel encontrado com este CPF!");
        } else {
            System.out.println("Dados dos alugueis e respectivos itens alugados: ");
            System.out.println(locacoes.getListaDeCarros());
            System.out.println(acervo.getItensAlugaveis());
        }

    }
}
