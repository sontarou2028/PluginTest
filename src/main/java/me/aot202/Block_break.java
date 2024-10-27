package me.aot202;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.awt.*;

public class Block_break implements Listener {
    @EventHandler
    public void breakable(BlockBreakEvent event){
        Player player = event.getPlayer();
        if(player.isSneaking()){
            player.sendMessage(ChatColor.RED + "you`re sneaking!");
        }
    }
}
