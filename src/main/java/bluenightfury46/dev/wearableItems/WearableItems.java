package bluenightfury46.dev.wearableItems;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WearableItems extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new GhastEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
