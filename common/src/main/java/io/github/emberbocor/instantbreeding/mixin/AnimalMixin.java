package io.github.emberbocor.instantbreeding.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.world.entity.animal.Animal;

@Mixin(Animal.class)
public abstract class AnimalMixin {
    @ModifyConstant(method = "finalizeSpawnChildFromBreeding", constant = @Constant(intValue = 6000))
    private int instantbreeding$noParentCooldown(int age) {
        return 0;
    }
}
