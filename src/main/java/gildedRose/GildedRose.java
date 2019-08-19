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
            itemQualityDuel(items[i]);

            itemSellInDuel(items[i]);

            itemQualityDuelBySellIn(items[i]);
        }
    }

    public void itemQualityDuelBySellIn(Item item) {
        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality > 0) {
                        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                            item.quality--;
                        }
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                if (item.quality < 50) {
                    item.quality++;
                }
            }
        }
    }

    public void itemSellInDuel(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }
    }

    public void itemQualityDuel(Item item) {
        if (isEqualsSpecifiedName(item)) {
            if (item.quality > 0) {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality--;
                }
            }
        } else {
            if (item.quality < 50) {
                item.quality++;
                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.sellIn < 11) {
                        item.quality++;
                    }
                }
            }
        }
    }

    public boolean isEqualsSpecifiedName(Item item) {
        return !item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}