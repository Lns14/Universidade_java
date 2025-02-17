import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int codDisciplina;
    private String nomeDisciplina;
    private String siglaUnidade;
    private String nomeCurso;
    private List <Oferecimento> oferecimentosD;

    public Disciplina (int codDisciplina, String nomeDisciplina, String siglaUnidade, String nomeCurso){
        this.codDisciplina = codDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.siglaUnidade = siglaUnidade;
        this.nomeCurso = nomeCurso;
        this.oferecimentosD = new ArrayList<>();
    }

    public int getCodDisciplina(){
        return codDisciplina;
    }

    public String getNomeDisciplina(){
        return nomeDisciplina;
    }

    public String getSiglaUnidade(){
        return siglaUnidade;
    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public List<Oferecimento> getOferecimentosD(){
        return oferecimentosD;
    }

}