
public class ShoppingOrder {

    private State state;

    public ShoppingOrder(){
        this.state = new OrderPending(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getStateName(){
        return this.state.getName();
    }

    public void appovePayment(){
        this.state.aprovePaument();
    }

    public void rejectPayment(){
        this.state.rejectPayment();
    }

    public void waitPayment(){
        this.state.waitPayment();
    }

    public void shipOrder(){
        this.state.shipOrder();
    }
}
