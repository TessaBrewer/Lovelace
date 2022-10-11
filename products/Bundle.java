package products;
import java.lang.StringBuilder;


import visitor.ItemVisitor;

import java.util.*;

/**
 *  A bundle of items
 */

public class Bundle implements Item {
  
  public Bundle() {
    items = new ArrayList<Item>();
  }

  public void add(Item item) {
    items.add(item);
  }

  @Override
  public double getPrice() {
    double price = 0;
    for (Item item : items)
      price += item.getPrice();
    return price;
  }

  @Override
  public String toString() {
    StringBuilder description = new StringBuilder("Bundle: ");
    description.append(items.get(0).toString());
    for (int i = 1; i < items.size(); i++) {
      description.append(", ");
      description.append(items.get(i).toString());
    }
    return description.toString();
  }

  public void accept(ItemVisitor visitor) {
    for (Item item : items) {
      item.accept(visitor);
    }
  }

  private ArrayList<Item> items;
}