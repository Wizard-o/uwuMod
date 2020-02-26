package wizardo.uwumod.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wizardo.uwumod.uwuMod;

public final class itemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, uwuMod.MOD_ID);

    public static final RegistryObject<Item> UWU_CHUNK = ITEMS.register("uwu Chunk", () -> new Item
            (new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> UWU_MIX = ITEMS.register("uwu Mix", () -> new Item
            (new Item.Properties().group(ItemGroup.MISC)));
}