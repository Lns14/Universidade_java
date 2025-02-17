import java.util.ArrayList;
import java.util.List;

public class Oferecimento {
    private int codOfer;
    private int ano;
    private int semestre;
    private int DRT;
    private int codDisciplina;
    private List <Integer> matriculados;

    public Oferecimento (int codOfer, int ano, int semestre, int DRT, int codDisciplina){
        this.codOfer = codOfer;
        this.ano = ano;
        this.semestre = semestre;
        this.DRT = DRT;
        this.codDisciplina = codDisciplina;
        this.matriculados = new ArrayList<>();
    }

    public int getCodOfer(){
        return codOfer;
    }

    public int getAno(){
        return ano;
    }

    public int getSemestre(){
        return semestre;
    }

    public int getDrt(){
        return DRT;
    }

    public int getCodigoDisciplina(){
        return codDisciplina;
    }

    public List<Integer> getMatriculados(){
        return matriculados;
    }    

    @Override
        public String toString() {
            return "" + this.codOfer;
        }

}