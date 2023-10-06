package Fabric;

import Interfaces.iGameItem;
import Product.DragonEgg;

public class DragonEggGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new DragonEgg();
    }
}
