package gildedRose.item;

import gildedRose.entity.AgedBrie;

/**
 * Created by KingsWong on 2019/8/19.
 */
public class ItemStrategyFactory {

    public static ItemStrategyModel createItem(String name){
        switch (name){
            case "Aged Brie":
                return new AgedBrie();
        }
        return null;
    }
}
