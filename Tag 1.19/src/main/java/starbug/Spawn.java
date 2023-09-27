package starbug;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Spawn implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e){
        if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
            Player p = ((Player) e.getDamager()).getPlayer();
        }
    }
}

