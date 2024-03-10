package net.quitrindev.fishing;

import net.quitrindev.fishing.cmds.WhoIsFishingCommand;
import net.quitrindev.fishing.events.PlayerFishingListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class WhosFishing extends JavaPlugin {

    @Override
    public void onEnable() {
        new PlayerFishingListener(this);
        getCommand("fish").setExecutor(new WhoIsFishingCommand());
    }
}
