package app;

import java.util.*;

/**
 * Uma classe de autenticação simples que simula a interação com um banco de dados.
 */
public class LoginScreen {
    private Map<String, String> bancoDeUsuarios;
    // Banco de dados simulado que armazena pares de "username" e "password".

    /**
     * Construtor da classe Tela de Login. Inicializa um HashMap simulando o banco de dados e o preenche com dois registros.
     */
    public LoginScreen() {
        bancoDeUsuarios = new HashMap<>();
        bancoDeUsuarios.put("joao", "senha123");
        bancoDeUsuarios.put("alice", "senhasegura");
    }

    /**
     * Método que tenta realizar o login usando o "username" e "password" informados pelo usuário.
     * @param username o "username" (nome de usuário) informado pelo usuário que está tentando efetuar o login.
     * @param password a "password" (senha) informada pelo usuário que está tentando efetuar o login.
     * @return {@code true} se a autenticação for bem-sucedida, {@code false} se o login falhar.
     */
    public boolean realizarLogin(String username, String password) {
        if (bancoDeUsuarios.containsKey(username)) {
            String senhaArmazenada = bancoDeUsuarios.get(username);
            if (senhaArmazenada.equals(password)) {
                return true; // Login bem-sucedido
            }
        }
        return false; // Login falhou
    }

    /**
     * Adiciona um novo usuário ao "banco de dados". Este método é uma simplificação e não é recomendado para uso em projetos reais
     * devido à falta de medidas de segurança adequadas.
     * @param username o "username" (nome de usuário) do novo usuário.
     * @param password a "password" (senha) do novo usuário.
     */
    public void adicionarUsuario(String username, String password) {
        bancoDeUsuarios.put(username, password);
    }
}