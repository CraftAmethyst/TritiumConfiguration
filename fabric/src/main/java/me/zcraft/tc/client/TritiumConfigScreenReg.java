package me.zcraft.tc.client;

import me.zcraft.tc.TritiumCommon;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class TritiumConfigScreenReg implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        TritiumCommon.LOG.info("Tritium config screen system initialized for Fabric");
    }

    public static void registerConfigScreen(me.zcraft.tc.config.TritiumConfig config) {
        if (isModMenuAvailable()) {
            TritiumCommon.LOG.info("Mod Menu detected, config screen will be available for mod: {} (auto-detected)", config.getModId());
        } else {
            TritiumCommon.LOG.warn("Mod Menu not available, config screen disabled for mod: {}", config.getModId());
        }
    }

    private static boolean isModMenuAvailable() {
        return FabricLoader.getInstance().isModLoaded("modmenu");
    }
}