package Fabric;

import Interfaces.iGameItem;
import Product.GinLamp;

public class GinLampGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GinLamp();
    }

}
