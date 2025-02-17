import java.util.ArrayList;
import java.util.List;

public class Estudante extends Cadastro {
    private int RA;
    private String emailRA;
    private String curso;
    private int semestre;
    private int anoCurso;
    private List <Oferecimento> oferecimentosAluno;

    public Estudante(String nome, String nascimento, String endereco, String telefone, String genero, int RA, String curso, int semestre, int anoCurso) {
        super(nome, nascimento, endereco, telefone, genero);
        this.RA = RA;
        this.emailRA = RA + "@mackenzista.com.br";
        this.curso = curso;
        this.semestre = semestre;
        this.anoCurso = anoCurso;
        this.oferecimentosAluno = new ArrayList<>();
    }


    public int getRa() {
        return RA;
    }

    public String getCurso() {
        return curso;
    }

    public String getEmailRa(){
        return emailRA;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getAnoCurso() {
        return anoCurso;
    }

    public List<Oferecimento> getOferecimentosAluno(){
        return oferecimentosAluno;
    }

}