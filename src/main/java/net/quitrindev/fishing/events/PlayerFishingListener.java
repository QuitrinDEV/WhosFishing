package net.quitrindev.fishing.events;

import net.quitrindev.fishing.WhosFishing;
import net.quitrindev.fishing.Fishers;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.util.Vector;

public class PlayerFishingListener implements Listener {

    public PlayerFishingListener(WhosFishing plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    boolean is_fishing = false;
    boolean trigger = true;

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerFishing(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Player fisher = event.getPlayer();
            if (event.getMaterial() == Material.FISHING_ROD) {
                if (trigger) {
                    if (is_fishing) {
                        Fishers.fishers_name.remove(event.getPlayer().getDisplayName());
                        Fishers.fishers.remove(event.getPlayer());
                        is_fishing = false;

                    } else {
                        Fishers.fishers_name.add(event.getPlayer().getDisplayName());
                        Fishers.fishers.add(event.getPlayer());
                        is_fishing = true;
                    }
                    //String ans = is_fishing ? ChatColor.GREEN + "true" : ChatColor.RED + "false";
                    //fisher.sendMessage("Fishing state: " + ans);
                }
                trigger = !trigger;
            }
        }
    }

}
