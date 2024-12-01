package me.jojjjo147.antiCropTrample;

import me.jojjjo147.antiCropTrample.listeners.CropTrampleListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCropTrample extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CropTrampleListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
