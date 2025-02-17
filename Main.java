/*
Adrielle Moreira - RA: 10425304
Livia Novais - RA: 10428550
Stephanie Soares - RA: 10428278
*/

import java.util.List;
import java.util.ArrayList;

public class Main {
    private List <Disciplina> listaDisciplina;
    private List <Professor> listaProfessores;
    private List <Estudante> listaEstudantes;
    private List <Oferecimento> listaOferecimentos;

    public Main() {
        this.listaDisciplina = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
        this.listaEstudantes = new ArrayList<>();
        this.listaOferecimentos = new ArrayList<>();
    }

    
    public void adicionaEstudante(Estudante estudante) {
        for (int i = 0; i < listaEstudantes.size(); i++) {
            if (estudante.getRa() == listaEstudantes.get(i).getRa()) {
                System.out.println("Já existe um estudante com esse RA.");
                return;
            }
        }
        listaEstudantes.add(estudante);
        System.out.println("Estudante " + estudante.getRa() + " cadastrado com sucesso.");
    }

    
    public void imprimeEstudantes() {
        if (listaEstudantes.size() == 0) {
            System.out.println("Não há estudantes cadastrados.");
        }
        System.out.println("\nLista de estudantes cadastrados:");
        for (int i = 0; i < listaEstudantes.size(); i++) {
            Estudante estudante = listaEstudantes.get(i);
            System.out.println("\nRA: " + estudante.getRa() + "\nNome: " + estudante.getNome() + "\nCurso: " + estudante.getCurso());
        }
    }

    
    public void buscaEstudante(int ra) {
        for (int i = 0; i < listaEstudantes.size(); i++) {
            Estudante estudante = listaEstudantes.get(i);
            if (ra == estudante.getRa()) {
                System.out.println("\n*Busca de estudante*" + "\nNome: " + estudante.getNome() + "\nData de nascimento: " + estudante.getNascimento() + "\nCEP do endereço: " + estudante.getEndereço() + "\nTelefone: " + estudante.getTelefone() + "\nGênero: " + estudante.getGenero() + "\nRA: " + estudante.getRa() + "\nCurso: " + estudante.getCurso() + "\nEmail: " + estudante.getEmailRa() + "\nSemestre de início do curso: " + estudante.getSemestre() + "\nAno de início do curso: " + estudante.getAnoCurso() + "\nOferecimentos cadastrados: " + estudante.getOferecimentosAluno());
                return;
            }
        }
        System.out.println("Não há estudantes com esse RA.");
    }

    
    public void adicionaProfessor(Professor professor) {
        for (int i = 0; i < listaProfessores.size(); i++) {
            if (professor.getDRT() == listaProfessores.get(i).getDRT()) {
                System.out.println("Já existe um professor com esse DRT.");
                return;
            }
        }
        listaProfessores.add(professor);
        System.out.println("Professor " + professor.getDRT() + " cadastrado com sucesso.");
    }

    public void imprimeProfessores() {
        if (listaProfessores.isEmpty()) {
            System.out.println("Não há professores cadastrados.");
        }
        System.out.println("\nLista de professores cadastrados:");
        for (Professor professor : listaProfessores) {
            System.out.println("\nDRT: " + professor.getDRT() + "\nNome: " + professor.getNome());
        }
    }

    public void buscaProfessor(int drt){
        for (int i = 0; i < listaProfessores.size(); i++){
            Professor professor = listaProfessores.get(i);
            if (drt == professor.getDRT()){
                System.out.println("\n*Busca de professor*" + "\nNome: " + professor.getNome() + "\nData de nascimento: " + professor.getNascimento() + "\nCEP do endereço: " + professor.getEndereço() + "\nTelefone: " + professor.getTelefone() + "\nGênero: " + professor.getGenero() + "\nDRT: " + professor.getDRT() + "\nEmail: " + professor.getEmailDRT() + "\nUnidade Acadêmica: " + professor.getUnidadeAcademica() + "\nOferecimentos cadastrados: " + professor.getOferecimentosProfessor());
                return;
            }
        }
        System.out.println("Não há professores com esse DRT.");
    }

    public void adicionaDisciplina(Disciplina disciplina1) {
        for (int i = 0; i < listaDisciplina.size(); i++) {
            if (disciplina1.getCodDisciplina() == listaDisciplina.get(i).getCodDisciplina()) {
                System.out.println("Já existe uma disciplina com este código.");
                return;
            }
        }
        listaDisciplina.add(disciplina1);
        System.out.println("Disciplina " + disciplina1.getNomeDisciplina() + " cadastrada com sucesso.");
    }

    public void imprimeDisciplina() {
        if (listaDisciplina.size() == 0) {
            System.out.println("Não há disciplinas cadastradas.");
        }
        System.out.println("\nLista de disciplinas cadastradas:");
        for (int i = 0; i < listaDisciplina.size(); i++) {
            Disciplina disciplina = listaDisciplina.get(i);
            System.out.println("\nCódigo da disciplina: " + disciplina.getCodDisciplina() + "\nNome da disciplina: " + disciplina.getNomeDisciplina() + "\nSigla da unidade: " + disciplina.getSiglaUnidade());
        }
    }

    public void buscaDisciplina(int codigo) {
        for (int i = 0; i < listaDisciplina.size(); i++) {
            Disciplina disciplina = listaDisciplina.get(i);
            if (codigo == disciplina.getCodDisciplina()) {
                System.out.println("\n*Busca de disciplina*" + "\nCódigo da disciplina: " + disciplina.getCodDisciplina() + "\nNome da disciplina: " + disciplina.getNomeDisciplina() + "\nUnidade acadêmica: " + disciplina.getSiglaUnidade() + "\nNome do Curso: " + disciplina.getNomeCurso() + "\nOferecimentos cadastrados: " + disciplina.getOferecimentosD());
                return;
            }
        }
        System.out.println("Não há disciplinas com esse código.");
    }

    public void adicionaNovoOferecimento(Oferecimento oferecimentoA) {
        //conferindo se o código do oferecimento é único
        for (int k = 0; k < listaOferecimentos.size(); k++){
            if(oferecimentoA.getCodOfer() == listaOferecimentos.get(k).getCodOfer()){
                System.out.println("Já existe um oferecimento com esse código.");
                return;
            }
        }
        //conferindo se o DRT do prof responsável existe
        for (int i = 0; i < listaProfessores.size(); i++){
            if (oferecimentoA.getDrt() == listaProfessores.get(i).getDRT()){
                //conferindo se a disciplina existe
                for (int j = 0; j < listaDisciplina.size(); j++){
                    if (oferecimentoA.getCodigoDisciplina() == listaDisciplina.get(i).getCodDisciplina()){
                        //adicionando o oferecimento na lista de oferecimentos
                        listaOferecimentos.add(oferecimentoA);
                        //adicionando o oferecimento na lista de oferecimentos do prof responsável
                            listaProfessores.get(i).getOferecimentosProfessor().add(oferecimentoA);
                        System.out.println("Oferecimento " + oferecimentoA.getCodOfer() + " cadastrado com sucesso.");
                        return;
                    }
                }
            }
        }
        System.out.println("Professor ou disciplina não existe.");
    }

    public void imprimeOferecimento(Disciplina disciplinaA){
        if (disciplinaA.getOferecimentosD().size() == 0){
            System.out.println("Não há oferecimentos cadastrados nessa disciplina.");
        }
        System.out.println("\nLista de oferecimentos cadastrados na disciplina " + disciplinaA.getNomeDisciplina() + ":");
        for (int i = 0; i < disciplinaA.getOferecimentosD().size(); i++){
            Oferecimento oferecimento = disciplinaA.getOferecimentosD().get(i);
            System.out.println("\nCódigo do oferecimento: " + oferecimento.getCodOfer() + "\nAno oferecido: " + oferecimento.getAno() + "\nSemestre oferecido: " + oferecimento.getSemestre() + "\nNome da disciplina: " + disciplinaA.getNomeDisciplina() + "\nDRT do professor responsável: " + oferecimento.getDrt());
        }
    }
    

    public void buscaOferecimento(int codOferec, int codDisc){
        for (int i = 0; i < listaDisciplina.size(); i++){
            if (codDisc == listaDisciplina.get(i).getCodDisciplina()){
                for (int j = 0; j < listaDisciplina.get(i).getOferecimentosD().size(); j++){
                    if (codOferec == listaDisciplina.get(i).getOferecimentosD().get(j).getCodOfer()){
                        Oferecimento oferecimento = listaDisciplina.get(i).getOferecimentosD().get(j);
                        System.out.println("\nOferecimento da disciplina " + listaDisciplina.get(i).getNomeDisciplina() + ":" + "\nAno oferecido: " + listaDisciplina.get(i).getOferecimentosD().get(j).getAno() + "\nSemestre oferecido: " + listaDisciplina.get(i).getOferecimentosD().get(j).getSemestre() + "\nDRT do professor responsável: " + listaDisciplina.get(i).getOferecimentosD().get(j).getDrt());
                        for (int k = 0; k < oferecimento.getMatriculados().size(); k++){
                            for (int l = 0; l < listaEstudantes.size(); l++){
                                if (oferecimento.getMatriculados().get(k) == listaEstudantes.get(l).getRa()){
                                    System.out.println("Nome do estudante: " + listaEstudantes.get(l).getNome() + "\nRA: " + listaEstudantes.get(l).getRa());
                                    
                                }
                            }
                            
                        
                    }
                }
            }
            }
    }
    }

    public void adicionaOfernoAluno(int codOferec, int raAluno){
        for (int i = 0; i < listaEstudantes.size(); i++){
            if (raAluno == listaEstudantes.get(i).getRa()){
                for (int j = 0; j < listaOferecimentos.size(); j++){
                    if (codOferec == listaOferecimentos.get(j).getCodOfer()){
                        listaEstudantes.get(i).getOferecimentosAluno().add(listaOferecimentos.get(j));
                        listaOferecimentos.get(j).getMatriculados().add(raAluno);
                        System.out.println("Oferecimento " + codOferec + " adicionado ao estudante " + raAluno + ".");
                        return;
                    }
                }
            }
        }
        System.out.println("Aluno ou oferecimento não existe.");
    }

    public void adicionaOfernaDisciplina(Oferecimento codOferec, int codDisc){
        for (int i = 0; i < listaDisciplina.size(); i++){
            if (codDisc == listaDisciplina.get(i).getCodDisciplina()){
                listaDisciplina.get(i).getOferecimentosD().add(codOferec);
                System.out.println("Oferecimento " + codOferec + " adicionado à disciplina " + codDisc + ".");
                return;
            }
        }
        System.out.println("Disciplina não existe.");
    }

    //opção extra
    public void email(int ra){
        for (int i = 0; i < listaEstudantes.size(); i++){
            if (ra == listaEstudantes.get(i).getRa()){
                System.out.println("\nEmail do estudante " + listaEstudantes.get(i).getNome() + ": " + listaEstudantes.get(i).getEmailRa());
                return;
            }
        }
        System.out.println("Estudante não existe.");
    }
    
    public static void main(String[] args) {

        Main sistema = new Main();

        Estudante estudante1 = new Estudante("João Vitor", "10/08/2003", "06523010", "11985647532", "Masculino", 10465684, "Sistemas de Informação", 2, 2022);
        Estudante estudante2 = new Estudante("Cecília Almeida", "28/03/2004", "05245360", "11978265364", 
"Feminino", 10467678, "Sistemas de Informação", 1, 2023);
        Estudante estudante3 = new Estudante("Maria Pires", "20/12/2003", "06443210", "11983621982", "Feminino", 10420360, "Sistemas de Informação", 2, 2023);
        Professor professor1 = new Professor("Marcos Silva", "17/09/1988", "06558626", "11985142389", "Masculino", 2105567, "FCI");
        Professor professor2 = new Professor("Daniel Oliveira", "05/12/1986", "06455781", "11912536415", "Masculino", 2102547, "FCI");
        
        Disciplina disciplina1 = new Disciplina(1, "Programação de Sistemas", "FCI", "Sistemas de Informação");
        Disciplina disciplina2 = new Disciplina(2, "Banco de Dados" , "FCI", "Ciência da Computação");

        Oferecimento oferecimento1 = new Oferecimento(99, 2024, 1, 2105567, 1);
        Oferecimento oferecimento2 = new Oferecimento(98, 2024, 1, 2102547, 2);

        sistema.adicionaEstudante(estudante1);
        sistema.adicionaEstudante(estudante2);
        sistema.adicionaEstudante(estudante3);
        sistema.adicionaProfessor(professor1);
        sistema.adicionaProfessor(professor2);
        
        sistema.adicionaDisciplina(disciplina1);
        sistema.adicionaDisciplina(disciplina2);
        sistema.adicionaNovoOferecimento(oferecimento1);
        sistema.adicionaNovoOferecimento(oferecimento2);

        sistema.adicionaOfernoAluno(99, 10467678);
        sistema.adicionaOfernoAluno(98, 10465684);
        sistema.adicionaOfernoAluno(98, 10467678);
        sistema.adicionaOfernoAluno(98, 10465904);

        sistema.adicionaOfernaDisciplina(oferecimento1, 1);
        sistema.adicionaOfernaDisciplina(oferecimento2, 1);
        sistema.adicionaOfernaDisciplina(oferecimento2, 2);
        
        sistema.imprimeEstudantes();
        sistema.imprimeProfessores();
        sistema.imprimeDisciplina();
        sistema.imprimeOferecimento(disciplina1);
        sistema.imprimeOferecimento(disciplina2);
        
        sistema.buscaEstudante(10467678);
        sistema.buscaProfessor(2102547);
        sistema.buscaDisciplina(1);
        sistema.buscaOferecimento(1, 99);

        sistema.email(10467678);
        sistema.email(10465684);
        sistema.email(10420360);
    }
}