package trabalho_pratico;

import java.util.Scanner;

public class Trabalho_pratico {

    public static class Veiculo {
        int codigo, tipo, horaEntrada, minutoEntrada, vaga;
        String placa, condutor, marca, modelo, cor;

        public Veiculo(int codigo, String placa, String condutor, String marca, String modelo, String cor,
                       int tipo, int horaEntrada, int minutoEntrada, int vaga) {
            this.codigo = codigo;
            this.placa = placa;
            this.condutor = condutor;
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.tipo = tipo;
            this.horaEntrada = horaEntrada;
            this.minutoEntrada = minutoEntrada;
            this.vaga = vaga;
        }
    }

    public static class Pagamento {
        int codigo, forma;
        double valor;

        public Pagamento(int codigo, double valor, int forma) {
            this.codigo = codigo;
            this.valor = valor;
            this.forma = forma;
        }

        public String getFormaTexto() {
            return switch (forma) {
                case 1 -> "Dinheiro";
                case 2 -> "PIX";
                case 3 -> "Cartão";
                default -> "Desconhecida";
            };
        }
    }

    static Scanner entrada = new Scanner(System.in);
    static Veiculo[] vagas = new Veiculo[10];
    static Pagamento[] historico = new Pagamento[100];
    static int proxCodigo = 1;
    static int qtdPagamentos = 0;

    public static void inicializarVagas() {
        for (int i = 0; i < vagas.length; i++) {
            vagas[i] = null;
        }
    }

    public static void registrarVeiculo() {
        System.out.println("\n=== Registrar Veículo ===");
        System.out.println("1 - Carro | 2 - Moto | 3 - Caminhão/Caminhonete");
        System.out.print("Digite o tipo do veículo: ");
        int tipo = lerInteiro();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo inválido!");
            return;
        }

        int vagaLivre = buscarVagaLivre(tipo);
        if (vagaLivre == -1) {
            System.out.println("Não há vagas disponíveis para este tipo.");
            return;
        }

        String placa = lerTextoObrigatorio("Placa: ");
        String condutor = lerTextoObrigatorio("Condutor: ");
        String marca = lerTextoObrigatorio("Marca: ");
        String modelo = lerTextoObrigatorio("Modelo: ");
        String cor = lerTextoObrigatorio("Cor: ");

        int hora = lerHora("Hora de entrada (0-23): ");
        int minuto = lerMinuto("Minuto de entrada (0-59): ");

        Veiculo v = new Veiculo(proxCodigo++, placa, condutor, marca, modelo, cor, tipo, hora, minuto, vagaLivre + 1);
        vagas[vagaLivre] = v;

        System.out.println("\nVeículo registrado com sucesso!");
        System.out.println("Vaga: " + (vagaLivre + 1));
        System.out.println("Código do veículo: " + v.codigo);
    }

    public static void finalizarUso() {
        System.out.println("\n=== Finalizar Uso ===");

        boolean temVeiculo = false;
        for (Veiculo v : vagas) {
            if (v != null) {
                temVeiculo = true;
                System.out.println("Código: " + v.codigo + " | Placa: " + v.placa + " | Vaga: " + v.vaga);
            }
        }

        if (!temVeiculo) {
            System.out.println("Nenhum veículo estacionado.");
            return;
        }

        System.out.print("Digite o código do veículo: ");
        int codigo = lerInteiro();

        Veiculo veiculo = null;
        int indice = -1;
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].codigo == codigo) {
                veiculo = vagas[i];
                indice = i;
                break;
            }
        }

        if (veiculo == null) {
            System.out.println("Código não encontrado.");
            return;
        }

        int horaSaida = lerHora("Hora de saída (0-23): ");
        int minutoSaida = lerMinuto("Minuto de saída (0-59): ");

        int minutosEntrada = veiculo.horaEntrada * 60 + veiculo.minutoEntrada;
        int minutosSaida = horaSaida * 60 + minutoSaida;

        if (minutosSaida < minutosEntrada) {
            minutosSaida += 24 * 60;
            System.out.println("(Saída no dia seguinte detectada)");
        }

        int tempoTotal = minutosSaida - minutosEntrada;
        double valor = calcularTarifa(veiculo.tipo, tempoTotal);

        System.out.printf("Tempo total: %d minutos\n", tempoTotal);
        System.out.printf("Valor a pagar: R$ %.2f\n", valor);

        int forma;
        do {
            System.out.println("1 - Dinheiro | 2 - PIX | 3 - Cartão");
            System.out.print("Forma de pagamento: ");
            forma = lerInteiro();
            if (forma < 1 || forma > 3) {
                System.out.println("Forma de pagamento inválida! Digite 1, 2 ou 3.");
            }
        } while (forma < 1 || forma > 3);

        historico[qtdPagamentos++] = new Pagamento(veiculo.codigo, valor, forma);
        vagas[indice] = null;

        System.out.println("Uso finalizado com sucesso!");
    }

    public static void consultarVagas() {
        System.out.println("\n=== Disponibilidade de Vagas ===");
        int livres = 0, ocupadas = 0;

        for (int i = 0; i < 10; i++) {
            String status;
            if (vagas[i] == null) {
                status = "LIVRE";
                livres++;
            } else {
                status = "OCUPADA (Placa: " + vagas[i].placa + ")";
                ocupadas++;
            }
            System.out.println("Vaga " + (i + 1) + ": " + status);
        }
        System.out.println("Total de vagas ocupadas: " + ocupadas);
        System.out.println("Total de vagas livres: " + livres);
    }

    public static void consultarHistorico() {
        System.out.println("\n=== HISTÓRICO DE PAGAMENTOS ===");
        double total = 0;

        for (int i = 0; i < qtdPagamentos; i++) {
            Pagamento p = historico[i];
            System.out.println("-------------------------------");
            System.out.println("Código: " + p.codigo);
            System.out.printf("Valor Pago: R$ %.2f\n", p.valor);
            System.out.println("Forma: " + p.getFormaTexto());
            total += p.valor;
        }

        System.out.println("-------------------------------");
        System.out.printf("SALDO TOTAL: R$ %.2f\n", total);
    }

    public static int buscarVagaLivre(int tipo) {
        for (int i = 0; i < 10; i++) {
            if (vagas[i] == null) {
                if ((i >= 0 && i <= 2 && tipo == 2) ||
                    (i >= 3 && i <= 4 && tipo == 3) ||
                    (i >= 5 && i <= 9 && tipo == 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static double calcularTarifa(int tipo, int minutos) {
        switch (tipo) {
            case 1:
                if (minutos <= 15) return 6.0;
                else if (minutos <= 30) return 17.0;
                else if (minutos <= 60) return 20.0;
                else return 20.0 + (minutos - 60) * 1.35;
            case 2:
                if (minutos <= 15) return 3.0;
                else if (minutos <= 30) return 7.0;
                else if (minutos <= 60) return 10.0;
                else return 10.0 + (minutos - 60) * 1.00;
            case 3:
                if (minutos <= 15) return 16.0;
                else if (minutos <= 30) return 27.0;
                else if (minutos <= 60) return 30.0;
                else return 30.0 + (minutos - 60) * 2.35;
            default:
                return 0.0;
        }
    }

    static int lerHora(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String valorDigitado = entrada.nextLine().trim();
            if (valorDigitado.matches("\\d{1,2}")) {
                int hora = Integer.parseInt(valorDigitado);
                if (hora >= 0 && hora <= 23) return hora;
            }
            System.out.println("Hora inválida! Digite um número entre 0 e 23 (máx. 2 dígitos).");
        }
    }

    static int lerMinuto(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String valorDigitado = entrada.nextLine().trim();
            if (valorDigitado.matches("\\d{1,2}")) {
                int minuto = Integer.parseInt(valorDigitado);
                if (minuto >= 0 && minuto <= 59) return minuto;
            }
            System.out.println("Minuto inválido! Digite um número entre 0 e 59 (máx. 2 dígitos).");
        }
    }

    static int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número: ");
            }
        }
    }

    static String lerTextoObrigatorio(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String valorDigitado = entrada.nextLine().trim();
            if (!valorDigitado.isEmpty()) {
                return valorDigitado;
            }
            System.out.println("Os campos precisam estar preenchidos!");
        }
    }

    public static void main(String[] args) {
        int opcao;
        inicializarVagas();

        do {
            System.out.println("\n===== MENU INICIAL DO ESTACIONAMENTO =====");
            System.out.println("1 - Registrar veículo");
            System.out.println("2 - Finalizar uso do veículo na vaga");
            System.out.println("3 - Consultar vagas");
            System.out.println("4 - Consultar saldo e histórico de pagamentos");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = lerInteiro();

            switch (opcao) {
                case 1 -> registrarVeiculo();
                case 2 -> finalizarUso();
                case 3 -> consultarVagas();
                case 4 -> consultarHistorico();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
}
