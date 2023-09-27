package starbug;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tag extends JavaPlugin implements Listener {
    HitDetection myEvents = new HitDetection();

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(myEvents, this);
        this.getServer().getPluginManager().registerEvents(new Tag(), this);
        this.getServer().getPluginManager().registerEvents(new Spawn(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            new Spawn();
        }else {
            Bukkit.broadcastMessage("Not a player"); return false;
        }
        return false;
    }}