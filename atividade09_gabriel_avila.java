package atividade09_gabriel_avila;
import java.util.Scanner;
import java.util.ArrayList;

public class atividade09_gabriel_avila {
    /*1

    public static class Contato {
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

    
    public static void main(String[] args) {
        /*1
        Scanner entrada = new Scanner(System.in);
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
    }
    
}

