package net.quitrindev.fishing;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class WhosFishing extends JavaPlugin {
    public List<Player> fishers = new ArrayList<>();

    public List<Player> getFishers() {
        return fishers;
    }

    public void addFisher(Player fisher) {
        fishers.add(fisher);
    }

    @Override
    public void onEnable() {

    }
}
