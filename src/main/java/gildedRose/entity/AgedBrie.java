package gildedRose.entity;

import gildedRose.Item;
import gildedRose.item.ItemStrategyModel;

/**
 * Created by KingsWong on 2019/8/19.
 */
public class AgedBrie implements ItemStrategyModel{

    @Override
    public void updateQuality(Item item) {
        UpdateItemQualityWhenSmallerThanFifty(item);

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            UpdateItemQualityWhenSmallerThanFifty(item);
        }
    }

    public void UpdateItemQualityWhenSmallerThanFifty(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
