package me.zcraft.tc;

import me.zcraft.tc.client.TritiumConfigScreenReg;
import me.zcraft.tc.config.TritiumConfig;
import net.fabricmc.api.ModInitializer;
public class TC implements ModInitializer {

    @Override
    public void onInitialize() {
        TritiumCommon.init();
        TritiumConfig.register(TritiumCommon.MOD_ID, ExampleConfigClass.class);
        // TritiumConfig.register(TritiumCommon.MOD_ID, ExampleConfigClass.class).filename("tc")
        TritiumConfigScreenReg.registerConfigScreen();
    }
}