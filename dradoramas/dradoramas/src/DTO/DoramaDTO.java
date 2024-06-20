package DTO;

public class DoramaDTO {

    private int ID;
    private String plataforma;
    private String nome;
    private String genero;
    private String temp;
    private String eps;
    private String observacao;

    
    //GET
    public int getID() {
        return ID;
    }

    public String getplataforma() {
        return plataforma;
    }

    public String getnome() {
        return nome;
    }

    public String getgenero() {
        return genero;
    }

    public String gettemp() {
        return temp;
    }

    public String geteps() {
        return eps;
    }

    public String getobservacao() {
        return observacao;
    }

    
    //SET
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setplataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public void settemp(String temp) {
        this.temp = temp;
    }

    public void seteps(String eps) {
        this.eps = eps;
    }

    public void setobservacao(String observacao) {
        this.observacao = observacao;
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
