package wizardo.uwumod.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import wizardo.uwumod.uwuMod;

@Mod.EventBusSubscriber(modid = uwuMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(uwuMod.MOD_ID)
public class itemInit {
    public static final Item uwu_Chunk = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("uwu Chunk"));
    }
}
