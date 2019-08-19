package gildedRose.entity;

import gildedRose.Item;
import gildedRose.item.ItemStrategyModel;

/**
 * Created by KingsWong on 2019/8/19.
 */
public class BackstagePasses implements ItemStrategyModel {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);

            if (item.getSellIn() < 11) {
                updateItemQualityWhenSmallerThanFifty(item);
            }

            if (item.getSellIn() < 6) {
                updateItemQualityWhenSmallerThanFifty(item);
            }
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }

    public void updateItemQualityWhenSmallerThanFifty(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
