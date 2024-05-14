public class OrderPending implements State{

    private String name = "OrderPeding";
    private ShoppingOrder shoppingOrder;

    public OrderPending(ShoppingOrder shoppingOrder) {
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void aprovePaument() {
        this.shoppingOrder.setState(new OrderApproved(this.shoppingOrder));
    }

    @Override
    public void rejectPayment() {
        shoppingOrder.setState(new OrderRejected(this.shoppingOrder));
    }

    @Override
    public void waitPayment() {
        System.out.println("O pedido já está no estado de pegamento pendente");
    }

    @Override
    public void shipOrder() {
        System.out.println("Aguardando o pagamento...");
    }
}
