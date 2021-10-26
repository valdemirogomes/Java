
package util;

import javax.swing.JOptionPane;


public class MessagesView {

  
    public void MsgConfirmSolicitacao(){
      JOptionPane.showMessageDialog(null,"Pessoa cadastrada com sucesso");
}
    public void MsgRGConfirmCadastro(){
        JOptionPane.showMessageDialog(null,"RG Já cadastrado");
    }
    public void MsgCPFConfirmCadastro(){
        JOptionPane.showMessageDialog(null,"CPF Já cadastrado");
        
    }
    public void MsgPreenchaTodos(){
         JOptionPane.showMessageDialog(null,"Preencha todos os campos");
        
    }
    public void MsgPreenchaRGCompleto(){
    JOptionPane.showMessageDialog(null, "Preencha o RG Completamente");
}
    public void MsgBDDLeitura(){
        JOptionPane.showMessageDialog(null, "Não foi possivel abrir o arquivo para escrita");
    }
      
}

