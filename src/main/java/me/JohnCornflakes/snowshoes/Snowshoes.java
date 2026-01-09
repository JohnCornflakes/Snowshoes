package me.JohnCornflakes.snowshoes;

import net.fabricmc.api.ModInitializer;

public class Snowshoes implements ModInitializer {
    public static String MOD_ID = "snowshoes";

    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}
