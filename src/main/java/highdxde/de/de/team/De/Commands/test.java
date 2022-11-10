package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.performCommand("summon armor_stand ~ ~ ~ {Invisible:1b,NoBasePlate:1b,Small:1b,ArmorItems:[{id:\"iron_boots\",Count:1b},{id:\"iron_leggings\",Count:1b},{id:\"iron_chestplate\",Count:1b},{id:\"iron_helmet\",Count:1b}],HandItems:[{},{}],CustomName:\"§cghost\",CustomNameVisible:1b}");
                player.sendMessage("§8[§c§lServer§8] §7Oh shit a motherfucking §cghost§7!");
            }

            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("kill")) {
                    player.performCommand("minecraft:kill @e[type=armor_stand]");
                }
            }
        }else {
            sender.sendMessage("Error.not-a-player");
        }
        return false;
    }
}
