package net.quitrindev.fishing;

import net.md_5.bungee.api.chat.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Fishers {

    public static List<Player> fishers = new ArrayList<>();
    public static List<String> fishers_name = new ArrayList<>();

    public static TextComponent getFishersNames() {
        TextComponent ret = new TextComponent(ChatColor.GREEN + "Players fishing now: " + ChatColor.RESET);
        int iteration = 1;
        if (fishers_name.isEmpty()) {
            ret = new TextComponent(ChatColor.GREEN + "There are no players fishing at the moment.");
        } else {
            for (String name : fishers_name) {
                iteration++;
                TextComponent name_display = new TextComponent(name + ", ");
                name_display.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/tp @s " + name));
                name_display.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to tp to " + name + ".").create()));
                if (fishers_name.size() != iteration) {
                    name_display = new TextComponent(name + ".");
                    name_display.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/tp @s " + name));
                    name_display.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to tp to " + name + ".").create()));
                }
                ret = new TextComponent(ret, name_display);
            }
        }

        return ret;
    }

}
