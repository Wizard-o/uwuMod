package wizardo.uwumod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import wizardo.uwumod.init.itemInit;

@Mod("wizuwumod")

public class uwuMod {

    public static final String MOD_ID = "uwumod";

    public static uwuMod instance;

    public uwuMod() {
        instance = this;

        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        itemInit.ITEMS.register(modEventBus);
    }

}
