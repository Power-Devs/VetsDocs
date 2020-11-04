public class Clinica_vet extends Endereçocadastro {
	
	   private int cnpj;
	   private String nome;
	   private int telefone;
	   private String email;
	   private String senha;
	   
	   public void setcpf(int cnpj) {this.cnpj = cnpj;}
	   public void setnome(String nome) {this.nome = nome;}
	   public void settelefone(int telefone) {this.telefone = telefone;}
	   public void setemail(String email) {this.email = email;}
	   public void setsenha(String senha) {this.senha = senha;}  
	   
	   public int getcpf(){return cnpj;}
	   public String getnome(){return nome;}
	   public int gettelefone(){return telefone;}
	   public String email(){return email;}
	   public String senha(){return senha;}
		
	   public Clinica_vet() {}  

}


public class Usuario extends Endereçocadastro {

   private int cpf;
   private String nome;
   private String email;
   private String senha;
	
   public void setcpf(int cpf) {this.cpf = cpf;}
   public void setnome(String nome) {this.nome = nome;}
   public void setemail(String email) {this.email = email;}
   public void setsenha(String senha) {this.senha = senha;}  
   
   public int getcpf(){return cpf;}
   public String getnome(){return nome;}
   public String email(){return email;}
   public String senha(){return senha;}
	
   public Usuario() {}  
}


public class Endereçocadastro {
	
	   public String Rua;
	   public int numero;
	   public String bairro;
	   public int cep;
	   public String municipio;
	   public String estado;

}


public class Avaliacao {
	
	private String Avaliacaotexto;
	private int nota;
	private int data;
	private int hora;
	private String tipo;
	
	   public void setAvaliacao(String Avaliacaotexto) {this.Avaliacaotexto = Avaliacaotexto;}
	   public void setnota(int nota) {this.nota = nota;}
	   public void setdata(int data) {this.data = data;}
	   public void sethora(int hora) {this.hora = hora;}
	   public void settipo(String tipo) {this.tipo = tipo;}

	   public String getAvaliacaotexto(){return Avaliacaotexto;}
	   public int getnota(){return nota;}
	   public int getdata(){return data;}
	   public int gethora(){return hora;}
	   public String gettipo(){return tipo;}
	   
	   
	   public Avaliacao() {}  
}
