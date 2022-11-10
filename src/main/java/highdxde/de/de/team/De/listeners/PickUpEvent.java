package highdxde.de.de.team.De.listeners;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import java.util.ArrayList;

public class PickUpEvent implements Listener {

    @EventHandler
    public void drop(PlayerDropItemEvent e){
    }

    @EventHandler
    public void pickup(PlayerPickupItemEvent e) {
        if (e.getPlayer().hasPermission("T.Aufheben")) {

        }else {
            e.setCancelled(true);
        }
    }
}
