package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ChatClear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        for (Player all : Bukkit.getOnlinePlayers()) {
            if (!all.hasPermission("T.clearchat")) {
                for (int i = 0; i <= 120; i++) {
                    all.sendMessage(" ");
                }
            }
        }
        return false;
    }
}
