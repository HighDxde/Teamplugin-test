package highdxde.de.de.team.De.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TeamCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(" ");
        sender.sendMessage("§8———————[§eTeam§8]———————");
        sender.sendMessage(" ");
        sender.sendMessage("§aDas Team-Plugin wurde von §e§lHighDxde§a entwickelt");
        sender.sendMessage(" ");
        sender.sendMessage("§8———————[§eTeam§8]———————");
        sender.sendMessage(" ");
        return false;
    }
}

