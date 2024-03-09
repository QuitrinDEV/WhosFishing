package net.quitrindev.fishing.events;

import net.quitrindev.fishing.WhosFishing;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class PlayerFishingListener implements Listener {

    public PlayerFishingListener(WhosFishing plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerFishing(PlayerFishEvent event) {
        if (event.getState() == PlayerFishEvent.State.FISHING) {
            Player fisher = event.getPlayer();

        }
    }

}
