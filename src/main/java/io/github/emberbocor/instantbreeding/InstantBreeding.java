package io.github.emberbocor.instantbreeding;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(InstantBreeding.MODID)
public class InstantBreeding {
    public static final String MODID = "instantbreeding";
    public static final Logger LOGGER = LogUtils.getLogger();

    public InstantBreeding(IEventBus modEventBus, ModContainer modContainer) {
    }
}
