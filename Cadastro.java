public class Cadastro {
  private String nome; 
  private String nascimento; 
  private String endereco;
  private String telefone;
  private String genero;

  public Cadastro (String nome, String nascimento, String endereco, String telefone, String genero){
    this.nome = nome;
    this.nascimento = nascimento;
    this.endereco = endereco;
    this.telefone = telefone;
    this.genero = genero;
  }

  public String getNome(){
    return nome;
  }

  public String getNascimento(){
    return nascimento;
  }

  public String getEndereço(){
    return endereco;
  }

  public String getTelefone(){
    return telefone;
  }

  public String getGenero(){
    return genero;
  }

}