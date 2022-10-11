package visitor;

import products.materials.ItemDecorator;

public class NumberOfUnitsOfSteelCalculator extends ItemVisitor {

    @Override
    public void visit(ItemDecorator id) {
        number++;
    }

    public long getNumber() {
        return number;
    }

    private long number = 0;
}
