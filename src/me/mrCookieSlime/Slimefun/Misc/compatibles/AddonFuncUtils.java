package me.mrCookieSlime.Slimefun.Misc.compatibles;

import com.bekvon.bukkit.residence.Residence;
import com.bekvon.bukkit.residence.protection.ClaimedResidence;
import com.intellectualcrafters.plot.object.Location;
import com.intellectualcrafters.plot.object.Plot;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;


public class AddonFuncUtils {
    public static boolean canAccessItem(Player p, Block b){
        if (p.isOp()){
            p.sendMessage("§8[§e远古工艺§8] §c越权打开了他人的机器");
            return true;
        }

        if (SlimefunStartup.instance.isPlotSquaredInstalled()){
            Location plotLoc = new Location(b.getLocation().getWorld().getName(), b.getLocation().getBlockX(), b.getLocation().getBlockY(), b.getLocation().getBlockZ());
            Plot plot = Plot.getPlot(plotLoc);
            if (plot != null) {
                if (!plot.isAdded(p.getUniqueId())){
                    p.sendMessage("§8[§e远古工艺§8] §c抱歉，你不可以在无权使用的地皮上使用机器. 请联系地皮主人给你权限吧！");
                    return false;
                }
            }
        }
        if (SlimefunStartup.instance.isResidenceInstalled()) {
            ClaimedResidence res = Residence.getInstance().getResidenceManager().getByLoc(b.getLocation());
            if (res != null) {
                if (!p.hasPermission("residence.bypass.use")) {
                    if ((!res.getPermissions().playerHas(p.getName(), p.getWorld().getName(), "sf-machines", true) && !res.getPermissions().has("sf-machines", true))) {
                        p.sendMessage("§8[§b远古工艺§8] §c你需要这个领地的§esf-machines§c标识§8(flag)§c才能这么做");
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
