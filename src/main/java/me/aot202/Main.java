package me.aot202;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Block_break(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
