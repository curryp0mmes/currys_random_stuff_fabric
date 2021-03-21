package com.curryp0mmes.random.stuff.fabric;

import net.fabricmc.api.DedicatedServerModInitializer;

import static com.curryp0mmes.random.stuff.fabric.RandomStuffMod.MOD_ID;

public class RandomStuffServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        System.out.println("["+ MOD_ID + "] is in Server mode");
    }
}
