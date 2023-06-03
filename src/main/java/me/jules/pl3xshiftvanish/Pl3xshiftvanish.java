package me.jules.pl3xshiftvanish;

import me.jules.pl3xshiftvanish.Events.PlayerSneakEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Pl3xshiftvanish extends JavaPlugin {

    Plugin pl = Pl3xshiftvanish.this;
    @Override
    public void onEnable() {
        registerEvents();
        pl.getLogger().info("Loading plugin...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        pl.getLogger().info("Shutting down plugin...");
    }

    public void registerEvents(){
        pl.getServer().getPluginManager().registerEvents(new PlayerSneakEvent(), pl);
    }

}
