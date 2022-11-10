package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.graalvm.compiler.lir.Variable;
import org.graalvm.compiler.word.Word;

public class TpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        if (!(sender instanceof Player)) {
            System.out.println("Error.notAPlayer");
            return true;
        }

                if (player.hasPermission("T.tp")) {
                    if (args.length == 1) {
                        Player player1 = Bukkit.getPlayer(args[0]);
                        if (player1 == null) {
                            sender.sendMessage("§8[§eTeam§8] " + "§4Der Spieler wurde nicht gefunden!");
                            return true;
                        } else {
                            player.teleport(player1);
                            player.sendMessage("§8[§eTeam§8] " + "§bDu hast dich zum Spieler§e§l " + player1.getName() + " §bTeleportiert!");
                        }
                    }
                }else {
                    player.sendMessage(" ");
                }



        return false;
    }
}

