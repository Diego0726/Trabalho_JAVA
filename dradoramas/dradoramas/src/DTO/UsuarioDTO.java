
package DTO;


public class UsuarioDTO {
    private int ID;
    private String nome;
    private int idade;
    private String genero;
    private String email;
    private String senha;

    public int getID() {
        return ID;
    }

    public String getnome() {
        return nome;
    }

    public int getidade() {
        return idade;
    }

    public String getgenero() {
        return genero;
    }

    public String getemail() {
        return email;
    }

    public String getsenha() {
        return senha;
    }

    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.getID();
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
        return this.getID() == other.getID();
    }

    public String getplataforma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String gettemp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String geteps() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getobservacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
