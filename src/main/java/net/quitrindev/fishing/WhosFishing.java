package net.quitrindev.fishing;

import net.quitrindev.fishing.cmds.Launch;
import net.quitrindev.fishing.cmds.WhoIsFishingCommand;
import net.quitrindev.fishing.events.PlayerFishingListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class WhosFishing extends JavaPlugin {

    @Override
    public void onEnable() {
        new PlayerFishingListener(this);
        getCommand("fish").setExecutor(new WhoIsFishingCommand());
        getCommand("throw").setExecutor(new Launch());
    }
}
