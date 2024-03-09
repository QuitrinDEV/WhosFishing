package net.quitrindev.fishing.cmds;

import net.quitrindev.fishing.Fishers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WhoIsFishingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        String fishers = "";
        int iter = 1;

        for (String fisher : Fishers.fishers_name) {
            iter++;
            if (!Fishers.fishers.isEmpty()) {
                fishers = fishers.concat(fisher).concat(",");
            } else {
                fishers = "No players fishin' now!";
            }
        }

        commandSender.sendMessage(fishers);

        return false;
    }
}
