public interface State {

    public String getName();
    public void aprovePaument();
    public void rejectPayment();
    public void waitPayment();
    public void shipOrder();
}
