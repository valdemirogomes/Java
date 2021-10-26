/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atendente;
import model.Pessoa;

/**
 *
 * @author RA21700443
 */
public class PessoaController {
    
    public String pessoasToString(ArrayList<Pessoa> pessoas){
         String ps = "";
         for (int i = 0; i < pessoas.size(); i++) {
             String get = pessoas.get(i).toString();
             ps += get + "\n";
             
         }
         return ps;
         
     }
     
    public boolean validarRG(ArrayList<Pessoa> pessoas, String rg){
         for (int i = 0; i<pessoas.size(); i++) {
             if(pessoas.get(i).getRG().equals(rg)){
                 return false;
             }
         }
         return true;
         
    }
    public boolean validarCPF(ArrayList<Pessoa> pessoas, String cpf){
         for (int i = 0; i<pessoas.size(); i++) {
             if(pessoas.get(i).getCPF().equals(cpf)){
                 return false;
             }
         }
         return true;
            

        
    
}
    
}
     
