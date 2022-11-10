package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpallCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Noch nicht fertig
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("T.tpall")) {
                if (args.length == 1) {
                    Player player1 = Bukkit.getPlayer(args[0]);
                    Location location = player.getLocation();
                } else {
                    sender.sendMessage("§4Usage: /Tpall <Spieler> ");
                }
            } else {
                sender.sendMessage(" ");
            }
        }else {
            sender.sendMessage("§cNur Spieler können den Befehl ausführen!");
        }
        return false;
    }
}
