package dao;

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String sobrenome;
    String cep;
    String idade;
    String corpreferida;
    
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario(nome,sobrenome,idade,cpf,cep,email,telefone,corpreferida)VALUES(?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getSobrenome());
                stmt.setString(3, usuario.getIdade());
                stmt.setString(4, usuario.getCpf());
                stmt.setString(5, usuario.getCep());
                stmt.setString(6, usuario.getEmail());
                stmt.setString(7, usuario.getTelefone());
                stmt.setString(8, usuario.getCorPreferida());
                stmt.execute();
                stmt.close();
            } 
            catch (SQLException u) {
                throw new RuntimeException(u);
            }
    }
  
}
