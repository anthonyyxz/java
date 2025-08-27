import java.util.Date;

public class Consulta {
    private Date data;
    private String nomePcnte;
    private String nomeDents;

    // Construtor corrigido: faltou abrir e fechar as chaves {}
    public Consulta(Date data, String nomePcnte, String nomeDents) {
        this.data = data;
        this.nomePcnte = nomePcnte;
        this.nomeDents = nomeDents;
    }

    // Getter para data - deve retornar Date, não String
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomePcnte() {
        return nomePcnte;
    }

    public void setNomePcnte(String nomePcnte) {
        this.nomePcnte = nomePcnte;
    }

    public String getNomeDents() {
        return nomeDents;
    }

    public void setNomeDents(String nomeDents) {
        this.nomeDents = nomeDents;
    }
}


