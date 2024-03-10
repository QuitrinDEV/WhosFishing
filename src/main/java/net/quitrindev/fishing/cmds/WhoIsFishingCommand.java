package net.quitrindev.fishing.cmds;

import net.quitrindev.fishing.Fishers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WhoIsFishingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        commandSender.spigot().sendMessage(Fishers.getFishersNames());
        return true;
    }
}
