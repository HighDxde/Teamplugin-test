package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BcCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("T.Bc")){
            if (args.length >= 1){
                String msg = "";
                for (int i = 0; i< args.length;i++){
                    msg = msg + args[i] + " ";
                }
                Bukkit.broadcastMessage(" ");
                Bukkit.broadcastMessage("§8[§cSystem§8]§c§l " + msg.replaceAll("&", "§"));
                Bukkit.broadcastMessage(" ");

            }else {
                sender.sendMessage("§cUsage: /bc <Nachricht>");
            }
        }else {
            sender.sendMessage(" ");
            return true;
        }


        return false;
    }
}
