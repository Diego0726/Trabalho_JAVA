package DTO;

public class DoramaDTO {

    private int ID;
    private String plataforma;
    private String nome;
    private String genero;
    private float temp;
    private float eps;
    private String observacao;
    public String get;

    
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

    public float gettemp() {
        return temp;
    }

    public float geteps() {
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

    public void settemp(int temp) {
        this.temp = temp;
    }

    public void seteps(int eps) {
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

    public String setplataforma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String settnome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String setgenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String settemp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String seteps() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

    
    
    
}
