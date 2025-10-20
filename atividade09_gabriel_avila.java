package atividade09_gabriel_avila;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Atividade09_gabriel_avila {
    //1

    /*public static class Contato {
        private String nome;
        private String telefone;
        private String email;

        public Contato(String nome, String telefone, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
        }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getTelefone() { return telefone; }
        public void setTelefone(String telefone) { this.telefone = telefone; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String toString() {
            return "Nome: " + nome + ", Telefone: " + telefone + ", E-mail: " + email;
        }
    }

    public static class AgendaEletronica {
        private ArrayList<Contato> contatos;

        public AgendaEletronica() {
            contatos = new ArrayList<>();
        }

        public void cadastrarContato(Scanner entrada) {
            System.out.println("== CADASTRAR CONTATO ==");
            
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Telefone: ");
            String telefone = entrada.nextLine();
            System.out.print("E-mail: ");
            String email = entrada.nextLine();
            
            for (Contato c : contatos) {
                if (c.getTelefone().equals(telefone)) {
                    System.out.println("Erro: já existe um contato com esse telefone!");
                    return;
                }
            }

            contatos.add(new Contato(nome, telefone, email));
            System.out.println("Contato cadastrado com sucesso!");
        }

        public void consultarAgenda(Scanner entrada) {
            System.out.println("== CONSULTAR AGENDA ==");
            System.out.println("1 - Listar ");
            System.out.println("2 - Buscar por nome");
            System.out.print("Escolha: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                if (contatos.isEmpty()) {
                    System.out.println("Agenda vazia!");
                } else {
                    contatos.sort((a, b) -> a.getNome().compareToIgnoreCase(b.getNome()));
                    for (Contato c : contatos) {
                        System.out.println(c);
                    }
                }
            } else if (opcao == 2) {
                System.out.print("Digite o nome para buscar: ");
                String busca = entrada.nextLine();
                boolean encontrado = false;
                for (Contato c : contatos) {
                    if (c.getNome().equalsIgnoreCase(busca)) {
                        System.out.println(c);
                        encontrado = true;
                    }
                }
                if (!encontrado) System.out.println("Nenhum contato encontrado!");
            }
        }

        public void editarContato(Scanner entrada) {
            System.out.print("Digite o telefone do contato para editar: ");
            String tel = entrada.nextLine();
            for (Contato c : contatos) {
                if (c.getTelefone().equals(tel)) {
                    System.out.print("Novo nome: ");
                    c.setNome(entrada.nextLine());
                    System.out.print("Novo telefone: ");
                    c.setTelefone(entrada.nextLine());
                    System.out.print("Novo e-mail: ");
                    c.setEmail(entrada.nextLine());
                    System.out.println("Contato atualizado!");
                    return;
                }
            }
            System.out.println("Contato não encontrado!");
        }

        public void excluirContato(Scanner entrada) {
            System.out.print("Digite o telefone do contato para excluir: ");
            String tel = entrada.nextLine();
            for (int i = 0; i < contatos.size(); i++) {
                if (contatos.get(i).getTelefone().equals(tel)) {
                    System.out.print("Confirma a exclusão? (S/N): ");
                    String resp = entrada.nextLine();
                    if (resp.equalsIgnoreCase("S")) {
                        contatos.remove(i);
                        System.out.println("Contato excluído!");
                    } else {
                        System.out.println("Exclusão cancelada!");
                    }
                    return;
                }
            }
            System.out.println("Contato não encontrado!");
        }
    }*/
    
    //2
    /*public static class Livro {
        private String titulo;
        private String autor;
        private int ano;
        private int codigo;
        private boolean emprestado;
        private String emprestadoPor;
        private LocalDate dataEmprestimo;

        public Livro(String titulo, String autor, int ano, int codigo, boolean emprestado) {
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
            this.codigo = codigo;
            this.emprestado = emprestado;
            this.emprestadoPor = null;
            this.dataEmprestimo = null;
        }

        public String getTitulo() { 
            return titulo; 
        }
        
        public String getAutor() { 
            return autor; 
        }
        
        public int getAno() { 
            return ano; 
        }
        
        public int getCodigo() { 
            return codigo; 
        }
        
        public boolean isEmprestado() { 
            return emprestado; 
        }
        
        public String getEmprestadoPor() { 
            return emprestadoPor; 
        }
        
        public LocalDate getDataEmprestimo() { 
            return dataEmprestimo; 
        }

        public void emprestar(String leitor, LocalDate data) {
            this.emprestado = true;
            this.emprestadoPor = leitor;
            this.dataEmprestimo = data;
        }

        public String toString() {
            String status = emprestado ? "Emprestado a: " + emprestadoPor : "Disponível";
            return String.format("Código: %d | Título: %s | Autor: %s | Ano: %d | Status: %s",
                    codigo, titulo, autor, ano, status);
        }
    }

    public static class Acervo {
        private Livro[] livros;

        public Acervo() {
            livros = new Livro[5];
            livros[0] = new Livro("POO EM JAVA", "Silva, A.", 1605, 101, false);
            livros[1] = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 102, false);
            livros[2] = new Livro("O Menino Maluquinho", "Ziraldo", 1980, 103, false);
            livros[3] = new Livro("A Metamorfose", "Franz Kafka", 1915, 1004, false);
            livros[4] = new Livro("Dom Casmurro", "Machado de Assis", 1899, 1005, false);

        }

        public void exibirAcervo() {
            System.out.println("\n=== ACERVO DISPONÍVEL ===");
            for (Livro l : livros) {
                System.out.println(l);
            }
        }

        public Livro procurarCodigo(int codigo) {
            for (Livro l : livros) {
                if (l.getCodigo() == codigo) return l;
            }
            return null;
        }

        public Livro procurarTitulo(String termo) {
            String busca = termo.trim().toLowerCase();
            for (Livro l : livros) {
                if (l.getTitulo().toLowerCase().contains(busca)) return l;
            }
            return null;
        }

        private LocalDate calcularDevolucao(LocalDate dataInicial, int diasUteis) {
            LocalDate data = dataInicial;
            int count = 0;
            while (count < diasUteis) {
                data = data.plusDays(1);
                DayOfWeek dia = data.getDayOfWeek();
                if (dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY) {
                    count++;
                }
            }
            return data;
        }

        public boolean realizarEmprestimo(Livro livro, String leitor) {
            if (livro == null) {
                System.out.println("Livro inexistente.");
                return false;
            }

            if (livro.isEmprestado()) {
                System.out.println("O livro '" + livro.getTitulo() + "' já está emprestado.");
                return false;
            }

            LocalDate hoje = LocalDate.now();
            livro.emprestar(leitor, hoje);
            LocalDate devolucao = calcularDevolucao(hoje, 7);

            System.out.println("\n=== RECIBO ===");
            System.out.println("Leitor: " + leitor);
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Código: " + livro.getCodigo());
            System.out.println("Data de empréstimo: " + hoje);
            System.out.println("Devolução prevista: " + devolucao);

            return true;
        }
    }*/

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*1
        AgendaEletronica a = new AgendaEletronica();
        
        int opcao = 0;
        String nome, telefone, email;
        
        do {
            System.out.println("\n===== AGENDA ELETRONICA =====\n");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Consultar Agenda");
            System.out.println("3 - Editar Contato");
            System.out.println("4 - Excluir Contato");
            System.out.println("5 - Sair");

            System.out.print("\nDigite uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> a.cadastrarContato(entrada);
                case 2 -> a.consultarAgenda(entrada);
                case 3 -> a.editarContato(entrada);
                case 4 -> a.excluirContato(entrada);
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 5);*/
        
        //2
        /*Acervo acervo = new Acervo();
        int escolha;
        
        do {
            System.out.println("\n=== SISTEMA DA BIBLIOTECA ===");
            System.out.println("1 - Visualizar acervo");
            System.out.println("2 - Realizar empréstimo");
            System.out.println("3 - Encerrar");
            System.out.print("Opção: ");

            while (!entrada.hasNextInt()) {
                System.out.println("Digite um número válido (1 a 3).");
                entrada.nextLine();
            }

            escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1 -> acervo.exibirAcervo();

                case 2 -> {
                    System.out.println("Deseja buscar por (1) Código ou (2) Parte do Título?");
                    String criterioBusca = entrada.nextLine().trim();
                    Livro livroSelecionado = null;

                    if (criterioBusca.equals("1")) {
                        System.out.print("Digite o código do livro: ");
                        if (entrada.hasNextInt()) {
                            int cod = entrada.nextInt();
                            entrada.nextLine();
                            livroSelecionado = acervo.procurarCodigo(cod);
                        } else {
                            System.out.println("Código inválido.");
                            entrada.nextLine();
                            break;
                        }
                    } else {
                        System.out.print("Informe parte do título: ");
                        String titulo = entrada.nextLine();
                        livroSelecionado = acervo.procurarTitulo(titulo);
                    }

                    if (livroSelecionado == null) {
                        System.out.println("Livro não localizado.");
                        break;
                    }

                    System.out.print("Nome ou matrícula do leitor: ");
                    String leitor = entrada.nextLine();
                    if (leitor.isEmpty()) {
                        System.out.println("Leitor inválido.");
                        break;
                    }

                    acervo.realizarEmprestimo(livroSelecionado, leitor);
                }

                case 3 -> System.out.println("Programa finalizado.");

                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (escolha != 3);*/
    }
    
}


