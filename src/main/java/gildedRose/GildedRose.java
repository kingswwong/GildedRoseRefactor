package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }


    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].getItemStrategyModel().updateQuality(items[i]);

        }
    }

}