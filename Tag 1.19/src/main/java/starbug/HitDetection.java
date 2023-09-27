package starbug;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import java.time.LocalTime;

public class HitDetection implements Listener {
    int UmfheroHit = 0;
    int StarbugHit = 0;
    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player && event.getDamager() instanceof Player) {
            Player whoHit = (Player) event.getDamager();
            String First = whoHit.getName();
            if (First.equals("Starbug10")) {
                StarbugHit = (StarbugHit + 1);
                new starbug.Spawn();
                Bukkit.broadcastMessage(ChatColor.BLUE + "You have been hit by " + First + " " + StarbugHit + " times!");
                Bukkit.broadcastMessage(ChatColor.GOLD + "Time: " + (LocalTime.now()));
            }else if (First.equals("umfhero")) {
                UmfheroHit = (UmfheroHit + 1);
                new starbug.Spawn();
                Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "You have been hit by " + First + " " + UmfheroHit + " times!");
                Bukkit.broadcastMessage(ChatColor.GOLD + "Time: " + (LocalTime.now()));
            }
        }}}