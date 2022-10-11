package visitor;

import products.Item;


public class PriceCalculator extends ItemVisitor {
    private double total = 0;
    
    @Override
    public void visit(Item i) {
        total += i.getPrice();
    }

    public double getTotalPrice() {
        return total;
    }
}
