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
        gildedRose.updateQuality();
        assertEquals(1,gildedRose.getItems()[0].quality);

    }

    @Test
    public void should_item_quality_be_0_when_given_item_name_Other_and_quality_1_and_sellIn_1() throws Exception {
        Item items[] = new Item[]{new Item("Other", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,gildedRose.getItems()[0].quality);

    }

    @Test
    public void should_item_quality_be_2_when_given_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_quality_1_and_sellIn_1() throws Exception {
        Item items[] = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(3,gildedRose.getItems()[0].quality);

    }

    @Test
    public void should_item_sellIn_be_1_when_given_item_name_Sulfuras_Hand_of_Ragnaros_and_quality_1_and_sellIn_1() throws Exception {
        Item items[] = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(1,gildedRose.getItems()[0].sellIn);

    }

    @Test
    public void should_item_quality_be_0_when_given_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_quality_1_and_sellIn_1() throws Exception {
        Item items[] = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,gildedRose.getItems()[0].sellIn);

    }

    @Test
    public void should_item_quality_be_1_when_given_item_name_Sulfuras_Hand_of_Ragnaros_and_quality_1_and_sellIn_minux_1() throws Exception {
        Item items[] = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(1,gildedRose.getItems()[0].quality);

    }

    @Test
    public void should_item_quality_be_0_when_given_item_name_Other_and_quality_1_and_and_sellIn_minux_1() throws Exception {
        Item items[] = new Item[]{new Item("Other", -1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,gildedRose.getItems()[0].quality);

    }

    @Test
    public void should_item_quality_be_2_when_given_item_name_Aged_Brie_and_quality_1_and_and_sellIn_minux_1() throws Exception {
        Item items[] = new Item[]{new Item("Aged Brie", -1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(3,gildedRose.getItems()[0].quality);

    }
}