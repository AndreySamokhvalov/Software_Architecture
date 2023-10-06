package Fabric;

import Interfaces.iGameItem;
import Product.ManaPotion;

public class ManaPotionGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new ManaPotion();
    }

}
