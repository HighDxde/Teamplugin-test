package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TphereCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("T.tph")) {
                if (args.length == 1) {
                    Player player1 = Bukkit.getPlayer(args[0]);
                    if (player1 == null) {
                        sender.sendMessage("§8[§eTeam§8] " + "§4Der Spieler wurde nicht gefunden!");
                        return true;
                    } else {
                        player1.teleport(player);
                        sender.sendMessage("§8[§eTeam§8]§b " + "Du hast den Spieler §e§l" + player1.getName() + " §bzu dir teleportiert");
                        player1.sendMessage("§8[§eTeam§8]§b " + "Der Spieler §e§l" + player.getName() + " §bhat dich zu ihm teleportiert");
                    }
                } else {
                    sender.sendMessage("§4Usage: /Tph <Spieler> ");
                    return true;
                }

            } else {
                sender.sendMessage(" ");
            }
        } else {
            sender.sendMessage("§cNur Spieler können den Befehl ausführen!");
        }
        return false;
    }
}
