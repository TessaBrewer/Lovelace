package visitor;

import products.Item;

public class CountingCalculator extends ItemVisitor {

    @Override
    public void visit(Item i) {
        number++;
    }

    public long getNumber() {
        return number;
    }

    private long number = 0;
}
