package me.zcraft.tc;

import me.zcraft.tc.annotation.ClientOnly;
import me.zcraft.tc.annotation.ConfigVersion;
import me.zcraft.tc.annotation.Range;
import me.zcraft.tc.annotation.SubCategory;

import java.util.Arrays;
import java.util.List;
//Example Config Class
@ConfigVersion(1)
public class ExampleConfigClass {
    @SubCategory("ExampleCommon")
    public static Example example = new Example();

    @ClientOnly
    @SubCategory("ExampleClient")
    public static ExampleClient exampleClient = new ExampleClient();

    public static class Example {
        public static boolean expl = true;
    }

    public enum Exampleenum {
        SIMPLE, VANILLA
    }

    @ClientOnly
    public static class ExampleClient {
        @SubCategory("ExampleClientTHI")
        public static Examplet examplebt = new Examplet();

        public static class Examplet {
            @Range(min = 1, max = 256)
            public int exampleint = 64;
            public List<String> examplelist = Arrays.asList("minecraft:player", "minecraft:villager");
        }
    }
}