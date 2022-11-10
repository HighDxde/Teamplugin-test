package highdxde.de.de.team.De.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class FlyspeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

            if (player.hasPermission("T.fsp")) {
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("1")) {
                        player.setFlySpeed(0.1f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l1");
                    }
                    if (args[0].equalsIgnoreCase("2")){
                     player.setFlySpeed(0.2f);
                     player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l2");
                    }
                    if (args[0].equalsIgnoreCase("3")){
                        player.setFlySpeed(0.3f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l3");
                    }
                    if (args[0].equalsIgnoreCase("4")){
                        player.setFlySpeed(0.4f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l4");
                    }
                    if (args[0].equalsIgnoreCase("5")){
                        player.setFlySpeed(0.5f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l5");
                    }
                    if (args[0].equalsIgnoreCase("6")){
                        player.setFlySpeed(0.6f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l6");
                    }
                    if (args[0].equalsIgnoreCase("7")){
                        player.setFlySpeed(0.7f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l7");
                    }
                    if (args[0].equalsIgnoreCase("8")){
                        player.setFlySpeed(0.8f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l8");
                    }
                    if (args[0].equalsIgnoreCase("9")){
                        player.setFlySpeed(0.9f);
                        player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l9");
                    }
                    if (args[0].equalsIgnoreCase("10")) {
                        player.setFlySpeed(1f);
                            player.sendMessage("§8[§eTeam§8] " + "§bDein Flyspeed ist nun auf §e§l10");
                    }
                } else {
                    sender.sendMessage("§cUsage: /fsp <1-10>");
                }
            } else {
                sender.sendMessage(" ");
                return true;
            }
        return false;
    }
}
