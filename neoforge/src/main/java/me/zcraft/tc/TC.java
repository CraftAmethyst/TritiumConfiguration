package me.zcraft.tc;

import me.zcraft.tc.client.TritiumConfigScreenReg;
import me.zcraft.tc.config.TritiumConfig;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(TritiumCommon.MOD_ID)
public class TC {

    public TC(IEventBus eventBus) {
        TritiumCommon.init();
        TritiumConfig.register(TritiumCommon.MOD_ID,ExampleConfigClass.class);
        TritiumConfigScreenReg.registerConfigScreen();
        if(ExampleConfigClass.Example.expl){
            TritiumCommon.LOG.info("ExampleConfigEB!");
        }
    }
}