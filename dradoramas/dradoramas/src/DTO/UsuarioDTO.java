
package DTO;


public class UsuarioDTO {
    private int ID;
    private String Nome;
    private int Idade;
    private String Genero;
    private String Email;
    private String Senha;

    
    
    
    
    public int getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String getGenero() {
        return Genero;
    }

    public String getEmail() {
        return Email;
    }

    public String getSenha() {
        return Senha;
    }

    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        return this.ID == other.ID;
    }
}
