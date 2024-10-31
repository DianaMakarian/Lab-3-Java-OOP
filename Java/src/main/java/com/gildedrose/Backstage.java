package com.gildedrose;

public class Backstage extends Item {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQualityByOne();
        sellIn = sellIn - 1;

        if (sellIn < 11) {
            increaseQualityByOne();
        }

        if (sellIn < 6) {
            increaseQualityByOne();
        }

        if (sellIn < 0) {
            super.quality = 0;
        }
    }
}
