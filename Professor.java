import java.util.List;
import java.util.ArrayList;

public class Professor extends Cadastro {
    private int DRT;
    private String emailDRT;
    private String unidadeAcademica;
    private List <Oferecimento> oferecimentosProfessor;

    public Professor(String nome, String nascimento, String endereco, String telefone, String genero, int DRT, String unidadeAcademica){
        super(nome, nascimento, endereco, telefone, genero);
        this.DRT = DRT;
        this.emailDRT = DRT + "@mackenzie.com.br";
        this.unidadeAcademica = unidadeAcademica;
        this.oferecimentosProfessor = new ArrayList<>();

    }

    public int getDRT() {
        return DRT;
    }

    public String getEmailDRT() {
        return emailDRT;
    }

    public String getUnidadeAcademica() {
        return unidadeAcademica;
    }

    public List<Oferecimento> getOferecimentosProfessor() {
        return oferecimentosProfessor;
    }


}