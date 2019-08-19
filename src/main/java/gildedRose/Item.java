package gildedRose;

import gildedRose.item.ItemStrategyFactory;
import gildedRose.item.ItemStrategyModel;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemStrategyModel itemStrategyModel;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.itemStrategyModel = ItemStrategyFactory.createItem(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public ItemStrategyModel getItemStrategyModel() {
        return itemStrategyModel;
    }

    public void setItemStrategyModel(ItemStrategyModel itemStrategyModel) {
        this.itemStrategyModel = itemStrategyModel;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
