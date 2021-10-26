package model;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String CPF;
    private String RG;
    private Pedido pedido;
    private Internacao internacao;
    private Atendente atendente;
    

    public Pessoa() {
    }
    public Pessoa(String nome, String sobrenome, String CPF, String RG, Pedido pedido, Internacao internacao, Atendente atendente){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.RG = RG;
        this.pedido = pedido;
        this.internacao = internacao;
        this.atendente = atendente;
        
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    

    public String toString(){
        return "Nome :"+this.nome+"\n"+
               "Sobrenome :"+this.sobrenome+"\n"+
               "CPF :"+this.CPF+"\n"+
               "RG :"+this.RG+"\n"+
               "Internação :"+ this.internacao.getLocalInternação()+" "+"Número :"+ this.internacao.getNumero()+"\n"+
               "Pedido :"+ this.pedido.getDescPedido()+" "+"Setor :"+ this.pedido.getSetor()+"\n"+
               "Atendente :"+ this.atendente.getNome()+"\n\n";
        
        
        
    }
    

    public String ParaArquivo() {
        return    this.nome + "#"
                + this.sobrenome + "#"
                + this.RG + "#"
                + this.CPF + "#" 
                + this.internacao.getLocalInternação()+"#"
                + this.internacao.getNumero()+"#"
                + this.pedido.getDescPedido() + "#"
                + this.pedido.getSetor() + "#"
                + this.atendente.getNome();
      
}
   public String ToString(ArrayList<Pessoa> pessoas) {
         ArrayList<Pessoa> resultado = new ArrayList<Pessoa>();
       
       Pessoa p = new Pessoa();
         for (int i = 0; i<pessoas.size(); i++) {
              for (Pessoa pessoa : pessoas) {
            
                resultado.add(pessoa);
        }

        }
         
         return null;
   }
   
}   
    
     
