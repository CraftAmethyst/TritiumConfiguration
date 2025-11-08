package me.zcraft.tc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import me.zcraft.tc.platform.Services;

public class TritiumCommon {
    public static final String MOD_ID = "tritium_configuration";
    public static final String MOD_NAME = "Tritium Configuration";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        String version = Services.PLATFORM.getModVersion();
        String loader = Services.PLATFORM.getPlatformName();
        String env = Services.PLATFORM.getEnvironmentName();
        LOG.info("""
                Loaded!
                
                Tritium Config Library - Universal Configuration System
                Mod version: {} | Mod loader: {} | Environment: {}
                """, version, loader, env);
     }
 }