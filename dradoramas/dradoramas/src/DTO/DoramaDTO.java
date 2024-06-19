package DTO;

public class DoramaDTO {

    private int ID;
    private String Plataforma;
    private String Nome;
    private String Genero;
    private int Temp;
    private int Eps;
    private String Observacao;

    
    //GET
    public int getID() {
        return ID;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public String getNome() {
        return Nome;
    }

    public String getGenero() {
        return Genero;
    }

    public int getTemp() {
        return Temp;
    }

    public int getEps() {
        return Eps;
    }

    public String getObservacao() {
        return Observacao;
    }

    
    //SET
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setTemp(int Temp) {
        this.Temp = Temp;
    }

    public void setEps(int Eps) {
        this.Eps = Eps;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
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
