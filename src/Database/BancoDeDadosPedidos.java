package Database;

import java.util.ArrayList;
import model.Atendente;
import model.Internacao;
import model.Pedido;
import model.Pessoa;
import util.FileManager;

public class BancoDeDadosPedidos {

    private ArrayList<Pedido> pedidos;
    private ArrayList<Internacao> internacoes;
    public ArrayList<Pessoa> pessoas;
    public ArrayList<Atendente> atendentes;
    private FileManager fm;

    public BancoDeDadosPedidos() {
        pedidos = new ArrayList<Pedido>();
        pessoas = new ArrayList<Pessoa>();
        internacoes = new ArrayList<Internacao>();
        atendentes = new ArrayList<Atendente>();
        fm = new FileManager();
              populatePessoa();

    }

    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        fm.write("pessoa.txt", pessoa.ParaArquivo());

    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

   

    private void populatePessoa(){
        ArrayList<String> pessoa;
        pessoa = fm.readAll("pessoa.txt");

        for (String p : pessoa) {
            if (p.length() >0) {

                String[] parameters = p.split("#");

                Internacao internacao = new Internacao(parameters[4], Integer.parseInt(parameters[5]));
                Pedido pedido = new Pedido(parameters[6], parameters[7]);
                Atendente atendente = new Atendente(parameters[8]);

                Pessoa pe = new Pessoa(parameters[0],
                        parameters[1],
                        parameters[3],
                        parameters[2],
                        pedido,
                        internacao,
                        atendente);

                this.pessoas.add(pe);
            }

        }
    }
}
    
     
            
          
       


         
     

     
