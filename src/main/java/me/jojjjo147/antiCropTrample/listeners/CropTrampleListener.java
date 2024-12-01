package me.jojjjo147.antiCropTrample.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class CropTrampleListener implements Listener {

    @EventHandler
    public void onCropTrample(PlayerInteractEvent e) {
        if (e.getAction() == Action.PHYSICAL) {
            Block block = e.getClickedBlock();
            if (block != null && block.getType() == Material.FARMLAND) {
                e.setCancelled(true);
            }
        }
    }

}
