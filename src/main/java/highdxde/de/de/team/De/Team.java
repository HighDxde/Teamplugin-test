package highdxde.de.de.team.De;

import highdxde.de.de.team.De.Commands.*;
import highdxde.de.de.team.De.listeners.Commandblocker;
import highdxde.de.de.team.De.listeners.PickUpEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;

public final class Team extends JavaPlugin {

    public static ArrayList<Item> dropitemlist = new ArrayList<>();

    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new GmCommand());
        getCommand("ghost").setExecutor(new test());
        getCommand("Tp").setExecutor(new TpCommand());
        getCommand("Fly").setExecutor(new FlyCommand());
        getCommand("Broadcast").setExecutor(new BcCommand());
        getCommand("Tphere").setExecutor(new TphereCommand());
        getCommand("Teamsystem").setExecutor(new TeamCommand());
        getCommand("Flyspeed").setExecutor(new FlyspeedCommand());
        getCommand("clearchat").setExecutor(new ChatClear());
        Bukkit.getPluginManager().registerEvents(new Commandblocker(), this);
        Bukkit.getPluginManager().registerEvents(new PickUpEvent(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {

        // Plugin shutdown logic
    }
}
