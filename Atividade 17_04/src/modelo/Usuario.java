package modelo;

public class Usuario {
    
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String sobrenome;
    private String idade;
    private String cep;
    private String corpreferida;
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
     public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
     public String getIdade() {
        return idade;
    }
    
    public void setIdade(String idade) {
        this.idade = idade;
    }

     public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

     public String getCorPreferida() {
        return corpreferida;
    }
    
    public void setCorPreferida(String corpreferida) {
        this.corpreferida = corpreferida;
    }

  
}
