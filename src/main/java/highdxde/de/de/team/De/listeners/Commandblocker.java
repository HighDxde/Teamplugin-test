package highdxde.de.de.team.De.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Commandblocker implements Listener {

    @EventHandler
    public boolean onPlayerCommand(PlayerCommandPreprocessEvent e) {

        if (e.getPlayer().hasPermission("T.help")) {
            return true;
        } else {
            if (e.getMessage().startsWith("/help")) {
                e.setCancelled(true);
            }
        }

        if (e.getPlayer().hasPermission("T.plugins")){
            return true;
        }else {
            if (e.getMessage().startsWith("/plugins") || e.getMessage().startsWith("/pl")) {
                e.setCancelled(true);
            }
        }

        if (e.getPlayer().hasPermission("T.mee")){
            return true;
        }else {
            if (e.getMessage().startsWith("/mee")) {
                e.setCancelled(true);
            }
        }

        if (e.getPlayer().hasPermission("T.mee")){
            return true;
        }else {
            if (e.getMessage().startsWith("/mee")) {
                e.setCancelled(true);
            }
        }

        if (e.getPlayer().hasPermission("T.teamsystem")){
            return true;
        }else {
            if (e.getMessage().startsWith("/teamsystem") || e.getMessage().startsWith("/teamplugin")) {
                e.setCancelled(true);
            }
        }
        if (e.getPlayer().hasPermission("t.summoned")){
            return true;
        }else {
            if (e.getMessage().equals("Object successfully summoned")){
                e.setCancelled(true);
            }
        }

        if (e.getPlayer().hasPermission("T.fehler")){
            return true;
        }else {
            if (e.getMessage().equals("I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.")) {
                e.setCancelled(true);
            }
        }
        String message = "";
        if (message.contentEquals("Object successfully summoned")){
            e.setCancelled(true);
        }




        //pex group Manager user add HighDxde

        return false;
    }
}

