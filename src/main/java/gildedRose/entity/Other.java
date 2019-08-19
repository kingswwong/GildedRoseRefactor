package gildedRose.entity;

import gildedRose.Item;
import gildedRose.item.ItemStrategyModel;

/**
 * Created by KingsWong on 2019/8/19.
 */
public class Other implements ItemStrategyModel {
    @Override
    public void updateQuality(Item item) {
        updateQualityWhenSmallerThanZero(item);

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            updateQualityWhenSmallerThanZero(item);
        }
    }

    public void updateQualityWhenSmallerThanZero(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
