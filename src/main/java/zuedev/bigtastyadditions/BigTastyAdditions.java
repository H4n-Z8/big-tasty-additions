package zuedev.bigtastyadditions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigTastyAdditions implements ModInitializer {
    public static final String MOD_ID = "big-tasty-additions";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item PEELED_APPLE = registerItem(
            new Item(
                    new FabricItemSettings().food(
                            new FoodComponent.Builder()
                                    .hunger(FoodComponents.APPLE.getHunger())
                                    .build()
                    )
            ),
            "peeled_apple"
    );

    public static final Item APPLE_SLICES = registerItem(
            new Item(
                    new FabricItemSettings().food(
                            new FoodComponent.Builder()
                                    .hunger(FoodComponents.APPLE.getHunger())
                                    .build()
                    )
            ),
            "apple_slices"
    );

    public static Item registerItem(Item item, String id) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, id), item);
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}