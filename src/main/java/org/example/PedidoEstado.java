package org.example;

public interface PedidoEstado {
    String getEstado();
    String aberto(Pedido pedido);
    String pronto(Pedido pedido);
    String aceito(Pedido pedido);
    String caminho(Pedido pedido);
    String entregue(Pedido pedido);
    String cancelado(Pedido pedido);
}
