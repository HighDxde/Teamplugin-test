package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permissible;

public class GmCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;


        if (args.length == 1) {

            if (args[0].equalsIgnoreCase("0")) {
                if (player.hasPermission("T.gm0")) {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage("§8[§eTeam§8] " + "§bDu bist nun im Survival-Modus");
                } else {
                    player.sendMessage(" ");
                }
            }


            if (args[0].equalsIgnoreCase("1")) {
                if (player.hasPermission("T.gm1")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage("§8[§eTeam§8] " + "§bDu bist nun im Kreativ-Modus");
                } else {
                    player.sendMessage(" ");
                }
            }

            if (args[0].equalsIgnoreCase("2")) {
                if (player.hasPermission("T.gm2")) {
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage("§8[§eTeam§8] " + "§bDu bist nun im Adventure-Modus");
                } else {
                    player.sendMessage(" ");
                }
            }

            if (args[0].equalsIgnoreCase("3")) {
                if (player.hasPermission("T.gm3")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage("§8[§eTeam§8] " + "§bDu bist nun im Spectator-Modus");
                } else {
                    player.sendMessage(" ");
                }
            }
        }
        if (args.length <1){
            sender.sendMessage("§cUsage: /gm <0/1/2/3> [Spieler]");
        }

        if(args.length == 2){
        if (player.hasPermission("T.gm0")) {
            if (args[0].equalsIgnoreCase("0")) {
                Player player1 = Bukkit.getPlayer(args[1]);
                    if (Bukkit.getOnlinePlayers().contains(player1) == false) {
                        player.sendMessage("§8[§eTeam§8] " + "§4Der Spieler wurde nicht gefunden!");
                        return true;
                    } else {
                        player1.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage("§8[§eTeam§8] " + "§bDu hast den Spieler§e§l " + player1.getName() + " §bin den Survival-Modus versetzt");
                        player1.sendMessage("§8[§eTeam§8] " + "§bDer Spieler§e§l " + player.getName() + " §bhat dich in den Survival-Modus versetzt" );
                    }
            }
        }
        else {
            player.sendMessage(" ");
        }


        if (player.hasPermission("T.gm1")) {
            if (args[0].equalsIgnoreCase("1")) {
                Player player1 = Bukkit.getPlayer(args[1]);
                    if (Bukkit.getOnlinePlayers().contains(player1) == false) {
                        player.sendMessage("§8[§eTeam§8] " + "§4Der Spieler wurde nicht gefunden!");
                        return true;
                    } else {
                        player1.setGameMode(GameMode.CREATIVE);
                        player.sendMessage("§8[§eTeam§8] " + "§bDu hast den Spieler§e§l " + player1.getName() + " §bin den Creative-Modus versetzt");
                        player1.sendMessage("§8[§eTeam§8] " + "§bDer Spieler§e§l " + player.getName() + " §bhat dich in den Creative-Modus versetzt" );
                    }
            }
        }
        else {
            player.sendMessage(" ");
        }

        if (player.hasPermission("T.gm2")) {
            if (args[0].equalsIgnoreCase("2")) {
                Player player1 = Bukkit.getPlayer(args[1]);
                    if (Bukkit.getOnlinePlayers().contains(player1) == false) {
                        player.sendMessage("§8[§eTeam§8] " + "§4Der Spieler wurde nicht gefunden!");
                        return true;
                    } else {
                        player1.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage("§8[§eTeam§8] " + "§bDu hast den Spieler§e§l " + player.getName() + " §bin den Adventure-Modus versetzt");
                        player1.sendMessage("§8[§eTeam§8] " + "§bDer Spieler§e§l " + player.getName() + " §bhat dich in den Adventure-Modus versetzt" );
                    }
            }
        }
        else {
            player.sendMessage(" ");
        }

        if (player.hasPermission("T.gm3")) {
            if (args[0].equalsIgnoreCase("3")) {
                Player player1 = Bukkit.getPlayer(args[1]);
                    if (Bukkit.getOnlinePlayers().contains(player1) == false) {
                        player.sendMessage("§8[§eTeam§8] " + "§4Der Spieler wurde nicht gefunden!");
                        return true;
                    } else {
                        player1.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage("§8[§eTeam§8] " + "§bDu hast den Spieler§e§l " + player1.getName() + " §bin den Spectator-Modus versetzt");
                        player1.sendMessage("§8[§eTeam§8] " + "§bDer Spieler§e§l " + player.getName() + " §bhat dich in den Spectator-Modus versetzt" );
                    }
            }
        }

        else {
            player.sendMessage(" ");
        }
        }
        if (args.length >2){
            sender.sendMessage("§cUsage: /gm <0/1/2/3> [Spieler]");
        }

        return false;
    }

}
