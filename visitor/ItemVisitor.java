package visitor;

import products.impl.Hammer;
import products.impl.Nails;
import products.impl.Saw;
import products.materials.ItemDecorator;

public abstract class ItemVisitor {
    public void visit(Hammer hammer) {
    }
    
    public void visit(Nails nails) {
    }
    
    public void visit(Saw saw) {
    }
    
    public void visit(ItemDecorator id) {
    }

}
