package DTO;

public class DoramaDTO {

    private int ID;
    private String plataforma;
    private String nome;
    private String genero;
    private String temp;
    private String eps;
    private String observacao;
    private UsuarioDTO usuario; 

    // GETTERS
    public int getID() {
        return ID;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getTemp() {
        return temp;
    }

    public String getEps() {
        return eps;
    }

    public String getObservacao() {
        return observacao;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    // SETTERS
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.ID;
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
        final DoramaDTO other = (DoramaDTO) obj;
        return this.ID == other.ID;
    }
}
