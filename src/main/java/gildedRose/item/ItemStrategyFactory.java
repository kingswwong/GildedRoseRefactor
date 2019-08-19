package gildedRose.item;

import gildedRose.entity.AgedBrie;
import gildedRose.entity.BackstagePasses;
import gildedRose.entity.Sulfuras;

/**
 * Created by KingsWong on 2019/8/19.
 */
public class ItemStrategyFactory {

    public static ItemStrategyModel createItem(String name){
        switch (name){
            case "Aged Brie":
                return new AgedBrie();
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePasses();
        }
        return null;
    }
}
