public class OrderRejected implements State{

    private ShoppingOrder shoppingOrder;
    private String name = "Order Rejected";
    @Override
    public String getName() {
        return this.name;
    }

    public OrderRejected(ShoppingOrder shoppingOrder) {
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public void aprovePaument() {
        System.out.println("Não é possivel aprovar o pedido pois ele foi recusado");
    }

    @Override
    public void rejectPayment() {
        System.out.println("O pedido já esta recusado");
    }

    @Override
    public void waitPayment() {
        System.out.println("Não é possivel mover o pedido para pendente pois o foi recusado");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pagamento recusado, não posso enviar o pedido");
    }
}
