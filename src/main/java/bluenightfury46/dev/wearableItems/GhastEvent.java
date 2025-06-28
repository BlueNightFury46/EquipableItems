package bluenightfury46.dev.wearableItems;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class GhastEvent implements Listener {

    @EventHandler
    public void event(PlayerInteractEvent ev){


        if(ev.getAction().isRightClick()) {

            if (ev.getPlayer().isSneaking() && ev.getPlayer().getInventory().getHelmet().isEmpty()) {

                ItemStack stack = new ItemStack(ev.getItem().getType(), 1);

                ev.getItem().setAmount((ev.getItem().getAmount()-1));
                ev.getPlayer().getInventory().setHelmet(stack);

                Location loc = ev.getPlayer().getLocation();
                ev.getPlayer().getWorld().playSound(loc, Sound.ENTITY_HAPPY_GHAST_EQUIP, 0.5f, 1);
                loc.add(0.5, 2, -0.5);
                ev.getPlayer().getWorld().spawnParticle(Particle.HAPPY_VILLAGER, loc, 1);
                loc.add(-0.5, 0, 0.5);
                ev.getPlayer().getWorld().spawnParticle(Particle.HAPPY_VILLAGER, loc, 1);
                loc.add(-0.25, 0, 0);
                ev.getPlayer().getWorld().spawnParticle(Particle.SCRAPE, loc, 3);
                loc.add(-0.25, 0, 0);
                ev.getPlayer().getWorld().spawnParticle(Particle.HAPPY_VILLAGER, loc, 1);


            }

        }

    }
}
