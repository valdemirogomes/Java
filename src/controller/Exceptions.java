package controller;

import exception.AtendenteException;
import exception.AtendenteVazioException;
import exception.CampoVazioException;
import exception.NaoEncontradoException;
import exception.RgVazioException;
import exception.SolicitacaoVazia;
import java.util.ArrayList;
import model.Pessoa;

public class Exceptions {

    public ArrayList<Pessoa> pegarPessoaPorNome(ArrayList<Pessoa> pessoas, String name) throws NaoEncontradoException {
        ArrayList<Pessoa> result = new ArrayList<Pessoa>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().toLowerCase().contains(name.toLowerCase())) {
                result.add(pessoa);
            }
        }

        if (result.size() == 0) {
            throw new NaoEncontradoException("Nada foi encontrado");
        }

        return result;
    }
    public ArrayList<Pessoa> BuscaRG(ArrayList<Pessoa> pessoas, String rg) throws NaoEncontradoException {
            ArrayList<Pessoa> result = new ArrayList<Pessoa>();
           for (Pessoa pessoa : pessoas) {
            if (pessoa.getRG().equals(rg)){
               result.add(pessoa);
                
            }

        }
           if(result.size() == 0){
               throw new NaoEncontradoException("RG não encontrado");
           }
        return result;
        
    
    }

    public ArrayList<Pessoa> BuscaAtendente(ArrayList<Pessoa> pessoas, String at) throws AtendenteException {
        ArrayList<Pessoa> resulta = new ArrayList<Pessoa>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAtendente().getNome().toLowerCase().contains(at.toLowerCase())) {
                resulta.add(pessoa);

            }

        }
        if (resulta.size() == 0) {
            throw new AtendenteException("Atendente não cadastrado");
        }

        return resulta;
    }

    public void CampoVazio(String name) throws CampoVazioException {
        if (name.isEmpty()) {

            throw new CampoVazioException("Campo nome vazio");
        }
    }

    public void Atendentevazio(String atendente) throws AtendenteVazioException {
        if (atendente.isEmpty()) {

            throw new AtendenteVazioException("Campo Nome Atendente Vazio");
        }
    }
        

    public void RgVazio(String rg) throws RgVazioException{
        if (rg.isEmpty()) {

           throw new RgVazioException("Campo RG vazio!");
        }
    }

    public void solicitacaoEmBranco(String name) throws SolicitacaoVazia {
        if (name.isEmpty()) {

            throw new SolicitacaoVazia("Preencha todos os campos! :)");
        }
    }

    public String pessoasToString(ArrayList<Pessoa> pessoas) {
        String ps = "";
        for (int i = 0; i < pessoas.size(); i++) {
            String get = pessoas.get(i).toString();
            ps += get + "\n";

        }
        return ps;

    }

    public String atendentesToString(ArrayList<Pessoa> pessoas) {
        String ps = "";
        for (int i = 0; i < pessoas.size(); i++) {
            String get = pessoas.get(i).getAtendente().getNome().toString();
            ps += get + "\n";

        }
        return ps;

    }
}
