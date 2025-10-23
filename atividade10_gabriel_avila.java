package atividade10_gabriel_avila;

import java.sql.*;
import java.util.*;

public class Atividade10_gabriel_avila {

    public static class Aluno {
        private int id;
        private String nome;

        public Aluno() {}

        public Aluno(int id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        public int getId() { 
            return id; 
        }
        
        public void setId(int id) { 
            this.id = id; 
        } 

        public String getNome() { 
            return nome; 
        }
        
        public void setNome(String nome) {
            this.nome = nome; 
        }

        @Override
        public String toString() {
            return id + " - " + nome;
        }
    }

    public static class BancoDados {

        private Connection conectar() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/atividade10"; 
            String usuario = "root";
            String senha = "root";
            return DriverManager.getConnection(url, usuario, senha);
        }

        public void addAluno(Aluno aluno) {
            String sql = "INSERT INTO aluno (nome) VALUES (?)";
            try (Connection conn = conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, aluno.getNome());
                stmt.executeUpdate();
                System.out.println("Aluno cadastrado com sucesso!");

            } catch (SQLException e) {
                System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
            }
        }

        public List<Aluno> listarAlunos() {
            List<Aluno> alunos = new ArrayList<>();
            String sql = "SELECT id, nome FROM aluno";

            try (Connection conn = conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    alunos.add(new Aluno(rs.getInt("id"), rs.getString("nome")));
                }

            } catch (SQLException e) {
                System.out.println("Erro ao listar alunos: " + e.getMessage());
            }
            return alunos;
        }

        public void attAluno(Aluno aluno) {
            String sql = "UPDATE aluno SET nome = ? WHERE id = ?";
            try (Connection conn = conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, aluno.getNome());
                stmt.setInt(2, aluno.getId());
                int linhas = stmt.executeUpdate();

                if (linhas > 0)
                    System.out.println("Aluno atualizado com sucesso!");
                else
                    System.out.println("Nenhum aluno encontrado com esse ID.");

            } catch (SQLException e) {
                System.out.println("Erro ao atualizar aluno: " + e.getMessage());
            }
        }

        public void excluirAluno(int id) {
            String sql = "DELETE FROM aluno WHERE id = ?";
            try (Connection conn = conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, id);
                int linhas = stmt.executeUpdate();

                if (linhas > 0)
                    System.out.println("Aluno excluído com sucesso!");
                else
                    System.out.println("Nenhum aluno encontrado com esse ID.");

            } catch (SQLException e) {
                System.out.println("Erro ao excluir aluno: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BancoDados banco = new BancoDados();

        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Excluir aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do aluno: ");
                    String nome = in.nextLine();
                    banco.addAluno(new Aluno(0, nome));
                }
                case 2 -> {
                    List<Aluno> lista = banco.listarAlunos();
                    if (lista.isEmpty())
                        System.out.println("Nenhum aluno encontrado.");
                    else {
                        System.out.println("\n=== Lista de Alunos ===");
                        lista.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    System.out.print("ID do aluno: ");
                    int id = in.nextInt();
                    in.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = in.nextLine();
                    banco.attAluno(new Aluno(id, nome));
                }
                case 4 -> {
                    System.out.print("ID do aluno para excluir: ");
                    int id = in.nextInt();
                    banco.excluirAluno(id);
                }
                case 0 -> {
                    System.out.println("Encerrando o sistema...");
                    in.close();
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
