package gildedRose.entity;

import gildedRose.Item;
import gildedRose.item.ItemStrategyModel;

/**
 * Created by KingsWong on 2019/8/19.
 */
public class AgedBrie implements ItemStrategyModel{

    @Override
    public void updateQuality(Item item) {
        updateItemQualityWhenSmallerThanFifty(item);

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            updateItemQualityWhenSmallerThanFifty(item);
        }
    }

    public void updateItemQualityWhenSmallerThanFifty(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
