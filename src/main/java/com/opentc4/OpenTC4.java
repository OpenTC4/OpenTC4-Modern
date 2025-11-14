package com.opentc4;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OpenTC4.MODID)
public class OpenTC4 {
    public static final String MODID = "opentc4";
    public OpenTC4() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
