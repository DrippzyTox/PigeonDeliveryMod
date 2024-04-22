package com.piginmail.entity.custom;

import com.piginmail.entity.ModEntities;
import com.piginmail.item.PDItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class PigeonEntity extends AnimalEntity implements GeoEntity {
    public PigeonEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    protected static final RawAnimation IDLE = RawAnimation.begin().thenLoop("idle_animation");
    protected static final RawAnimation WALK = RawAnimation.begin().thenLoop("walk_animation");

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new AnimalMateGoal(this, 1.100));
        this.goalSelector.add(2, new TemptGoal(this,1.20D, Ingredient.ofItems(PDItems.BREAD_CRUMBS),false ));

        this.goalSelector.add(3, new WanderAroundFarGoal(this, 1.2D));
        this.goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(0, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createPigeonAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.05f)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.3f);
}

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(PDItems.BREAD_CRUMBS);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.PIGEON.create(world);
    }

    // current implemented animations
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "Idle", 5, this::idleAnimController));
        controllers.add(new AnimationController<>(this, "Walk", 10, this::walkAnimController));
    }

    protected <E extends PigeonEntity> PlayState idleAnimController(final AnimationState<E> state) {
        if (!state.isMoving()) {
            return state.setAndContinue(IDLE);
        }
        return PlayState.STOP;
    }

    protected <E extends PigeonEntity> PlayState walkAnimController(final AnimationState<E> state) {
        if (state.isMoving()) {
            return state.setAndContinue(WALK);
        }
        return PlayState.STOP;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return geoCache;
    }
}
