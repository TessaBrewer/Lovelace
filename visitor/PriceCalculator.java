package visitor;

import products.impl.Hammer;
import products.impl.Nails;
import products.impl.Saw;
import products.materials.ItemDecorator;


public class PriceCalculator extends ItemVisitor {

    @Override
    public void visit(Hammer hammer) {
        total += hammer.getPrice();
    }

    @Override
    public void visit(Nails nails) {
        total += nails.getPrice();
    }

    @Override
    public void visit(Saw saw) {
        total += saw.getPrice();
    }

    @Override
    public void visit(ItemDecorator id) {
        total += id.premiumPrice();
    }


    public double getTotalPrice() {
        return total;
    }

    private double total = 0;
}
