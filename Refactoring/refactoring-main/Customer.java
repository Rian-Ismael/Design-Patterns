import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer (String name){
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName (){
        return _name;
    }

//    private double amountFor(Rental aRental) {
//        double thisAmount = 0;
//
//        //determine amounts for each line
//        switch (aRental.getMovie().getPriceCode()) {
//            case Movie.REGULAR:
//                thisAmount += 2;
//                if (aRental.getDaysRented() > 2)
//                    thisAmount += (aRental.getDaysRented() - 2) * 1.5;
//                break;
//            case Movie.NEW_RELEASE:
//                thisAmount += aRental.getDaysRented() * 3;
//                break;
//            case Movie.CHILDRENS:
//                thisAmount += 1.5;
//                if (aRental.getDaysRented() > 3)
//                    thisAmount += (aRental.getDaysRented() - 3) * 1.5;
//                break;
//        }
//        return thisAmount;
//    }

    public String statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    public Enumeration getRentals() {
        return _rentals.elements();
    }

    public int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    public double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }



}