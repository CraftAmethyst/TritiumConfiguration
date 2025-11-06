package me.zcraft.tc;

import net.fabricmc.api.ModInitializer;

public class TC implements ModInitializer {

    @Override
    public void onInitialize() {
        TritiumCommon.init();
    }
}