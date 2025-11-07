package me.zcraft.tc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TritiumCommon {
    public static final String MOD_ID = "tritium_configuration";
    public static final String MOD_NAME = "Tritium Configuration";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOG.info("""
                Loading...
                
                """ +
                "  ______       _  __   _                 \n" +
                " /_  __/_____ (_)/ /_ (_)__  __ ____ ___ \n" +
                "  / /  / ___// // __// // / / // __ `__ \\\n" +
                " / /  / /   / // /_ / // /_/ // / / / / /\n" +
                "/_/  /_/   /_/ \\__//_/ \\__,_//_/ /_/ /_/ \n" +
                "                                         \n" +
                "Tritium Config Library - Universal Configuration System");
    }
}