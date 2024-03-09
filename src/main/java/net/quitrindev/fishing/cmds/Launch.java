package net.quitrindev.fishing.cmds;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Launch implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            Location from = player.getLocation();
            Location to = new Location(player.getWorld(), player.getLocation().getX() + 4, player.getLocation().getY(), player.getLocation().getZ() + 4);

            player.setVelocity(new Vector(from.getX() - to.getX(), from.getY() - to.getY(), from.getZ() - to.getZ()));
        }
        return false;
    }
}
