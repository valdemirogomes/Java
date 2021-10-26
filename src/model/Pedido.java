
package model;


public class Pedido {
   private String descPedido;
    private String setor;
    private boolean atendido;

    public Pedido() {
    }
    

    public Pedido(String descPedido, String setor) {
        this.descPedido = descPedido;
        this.setor = setor;
        this.atendido = false;
        
    }

    public String getDescPedido() {
        return descPedido;
    }

    public void setDescPedido(String descPedido) {
        this.descPedido = descPedido;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

   
   
}
