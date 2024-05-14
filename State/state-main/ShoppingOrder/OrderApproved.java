public class OrderApproved implements State{

    private String name = "Order Approved";
    private ShoppingOrder shoppingOrder;

    public OrderApproved(ShoppingOrder shoppingOrder){
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void aprovePaument() {
        System.out.println("Este pedido já esta aprovado");
    }

    @Override
    public void rejectPayment() {
        shoppingOrder.setState(new OrderRejected(this.shoppingOrder));
    }

    @Override
    public void waitPayment() {
        shoppingOrder.setState(new OrderApproved(this.shoppingOrder));
    }

    @Override
    public void shipOrder() {
        System.out.println("Enviando o Pedido");
    }
}
