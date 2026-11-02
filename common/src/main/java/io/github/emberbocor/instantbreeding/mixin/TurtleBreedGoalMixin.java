package io.github.emberbocor.instantbreeding.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(targets = "net.minecraft.world.entity.animal.turtle.Turtle$TurtleBreedGoal")
public abstract class TurtleBreedGoalMixin {
    @ModifyConstant(method = "breed", constant = @Constant(intValue = 6000))
    private int instantbreeding$noParentCooldown(int age) {
        return 0;
    }
}
