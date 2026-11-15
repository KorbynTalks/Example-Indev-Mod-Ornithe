package me.myname.examplemod.mixin;

import me.myname.examplemod.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

@Mixin(Minecraft.class)
public abstract class ExampleModMixin {
    @Inject(method = "<init>", at = @At(value = "HEAD"))
    private static void hello(Canvas applet, MinecraftApplet width, int height, int fullscreen, boolean par5, CallbackInfo ci) {
        ExampleMod.LOGGER.info("Hello Mixins!");
    }
}
