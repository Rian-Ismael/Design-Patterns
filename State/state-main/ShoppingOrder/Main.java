public class Main {

    public static void main(String[] args) {

        ShoppingOrder shoppingOrder = new ShoppingOrder();
        System.out.println( shoppingOrder.getStateName());

        shoppingOrder.appovePayment();
        System.out.println( shoppingOrder.getStateName());
        shoppingOrder.shipOrder();
        shoppingOrder.rejectPayment();
        System.out.println( shoppingOrder.getStateName());
        shoppingOrder.shipOrder();



    }
}
