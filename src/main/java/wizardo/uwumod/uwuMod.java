package wizardo.uwumod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("wiz_uwumod")
public class uwuMod {
    public static final String MOD_ID = "wiz_uwumod";
    public static uwuMod instance;

    public uwuMod() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {

    }
    private void doClientStuff(final FMLCommonSetupEvent event) {

    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
}