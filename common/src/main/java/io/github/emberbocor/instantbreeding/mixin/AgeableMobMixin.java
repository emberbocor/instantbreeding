package io.github.emberbocor.instantbreeding.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.animal.Animal;

@Mixin(AgeableMob.class)
public abstract class AgeableMobMixin {
    @ModifyArg(method = "ageUp(IZ)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/AgeableMob;setAge(I)V", ordinal = 1))
    private int instantbreeding$noForcedAgeCooldown(int age) {
        return (Object) this instanceof Animal ? 0 : age;
    }
}
