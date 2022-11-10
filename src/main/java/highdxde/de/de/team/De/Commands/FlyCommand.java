package highdxde.de.de.team.De.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;




public class FlyCommand implements CommandExecutor {
    boolean flymode = false;


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
                if (player.hasPermission("T.fly")) {
                    if (args.length == 0) {
                        if (flymode == false) {
                            player.setAllowFlight(true);
                            flymode = true;
                            player.sendMessage("§8[§eTeam§8] " + "§bDer Fly-Modus ist nun aktiviert!");
                        } else {
                            player.setAllowFlight(false);
                            flymode = false;
                            player.sendMessage("§8[§eTeam§8] " + "§bDer Fly-Modus ist nun deaktiviert");
                        }
                }



            if (args.length == 1) {
                Player player1 = Bukkit.getPlayer(args[0]);
                    if (player.isOnline()) {
                        if (player1 == null) {
                            sender.sendMessage("§8[§eTeam§8] " + "§4Der Spieler wurde nicht gefunden!");
                            return true;
                        } else {
                            if (flymode == false) {
                                player1.setAllowFlight(true);
                                flymode = true;
                                player.sendMessage("§8[§eTeam§8] " + "§bDu hast den Fly-Modus für§e§l " + player1.getName() + " §baktiviert");
                                player1.sendMessage("§8[§eTeam§8] " + "§bDer Spieler§e§l " + player.getName() + "§b hat deinen Fly-Modus aktiviert");
                            } else {
                                player1.setAllowFlight(false);
                                flymode = false;
                                player.sendMessage("§8[§eTeam§8] " + "§bDu hast den Fly-Modus für§e§l " + player1.getName() + " §bdeaktiviert");
                                player1.sendMessage("§8[§eTeam§8] " + "§bDer Spieler§e§l " + player.getName() + "§b hat deinen Fly-Modus deaktiviert");
                            }
                        }
                    }
                }


        } else {
                    player.sendMessage(" ");
                    }
                } else {
                    sender.sendMessage("§8[§eTeam§8] " + "§4Nur ein Spieler kann den Befehl benutzen!");
                }
                return false;
            }
        }
