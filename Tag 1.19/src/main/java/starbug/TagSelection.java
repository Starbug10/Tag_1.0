package starbug;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;


public class TagSelection implements Listener{

    @EventHandler
    public void PlayerDropItemEvent(PlayerDropItemEvent event) throws InterruptedException {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 1) {
            Bukkit.broadcastMessage(ChatColor.GOLD + "The person tagged is: " + (ChatColor.LIGHT_PURPLE + "Umfhero"));
            Bukkit.broadcastMessage(ChatColor.RED + "5");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "4");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "3");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "2");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "1");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "GO!");
        } else {
            Bukkit.broadcastMessage(ChatColor.GOLD + "The person tagged is: " + (ChatColor.BLUE + "starbug"));
            Bukkit.broadcastMessage(ChatColor.RED + "5");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "4");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "3");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "2");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "1");
            TimeUnit.SECONDS.sleep(1);
            Bukkit.broadcastMessage(ChatColor.RED + "GO!");
        }
    }}
