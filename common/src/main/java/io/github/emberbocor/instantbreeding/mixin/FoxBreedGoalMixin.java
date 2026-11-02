package io.github.emberbocor.instantbreeding.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(targets = "net.minecraft.world.entity.animal.fox.Fox$FoxBreedGoal")
public abstract class FoxBreedGoalMixin {
    @ModifyConstant(
            method = "breed",
            constant = @Constant(intValue = 6000),
            slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/Animal;getLoveCause()Lnet/minecraft/server/level/ServerPlayer;"))
    )
    private int instantbreeding$noParentCooldown(int age) {
        return 0;
    }
}
