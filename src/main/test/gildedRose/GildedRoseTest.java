package gildedRose;

import static org.junit.Assert.*;

/**
 * Created by KingsWong on 2019/8/19.
 */
import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by KingsWong on 2019/8/19.
 */
public class GildedRoseTest {

    @Test
    public void should_item_quality_be_1_when_given_item_name_Sulfuras_Hand_of_Ragnaros_and_quality_1_and_sellIn_1() throws Exception {
        Item items[] = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);

        assertEquals(1,gildedRose.getItems()[0].quality);

    }
}