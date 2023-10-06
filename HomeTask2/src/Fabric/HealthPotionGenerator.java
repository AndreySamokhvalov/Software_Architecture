package Fabric;

import Interfaces.iGameItem;
import Product.HealthPotion;

public class HealthPotionGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new HealthPotion();
    }

}
