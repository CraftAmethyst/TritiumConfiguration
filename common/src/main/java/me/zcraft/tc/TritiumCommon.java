package me.zcraft.tc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TritiumCommon {
    public static final String MOD_ID = "tritium_configuration";
    public static final String MOD_NAME = "Tritium Configuration";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOG.info("""
                Tritium Config Loading...
                """ +
                "Tritium Config Library - Universal Configuration System"+
                " "+ MOD_NAME+" v"+TritiumCommon.class.getPackage().getImplementationVersion()+
                "                                         \n");
     }
 }