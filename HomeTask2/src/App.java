import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.BookGenerator;
import Fabric.GinLampGenerator;
import Fabric.HealthPotionGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.ManaPotionGenerator;
import Fabric.DragonEggGenerator;
import Fabric.SilverGenerator;


public class App {

    public static void main(String[] args) throws Exception {

        List<ItemGenerator> listGenerator = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listGenerator.add(new GoldGenerator());
        }

        for (int i = 0; i < 60; i++) {
            listGenerator.add(new SilverGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new GemGenerator());
        }

        for (int i = 0; i < 3; i++) {
            listGenerator.add(new BookGenerator());
        }

        for (int i = 0; i < 7; i++) {
            listGenerator.add(new ManaPotionGenerator());
        }

        for (int i = 0; i < 1; i++) {
            listGenerator.add(new GinLampGenerator());
        }

        for (int i = 0; i < 4; i++) {
            listGenerator.add(new DragonEggGenerator());
        }

        for (int i = 0; i < 2; i++) {
            listGenerator.add(new HealthPotionGenerator());
        }

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int index = rand.nextInt(100);
            listGenerator.get(index).openReward();

        }
    }
}
