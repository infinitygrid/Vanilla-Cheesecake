package net.infinitygrid.vanillacheesecake

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level

class VanillaCheesecake : JavaPlugin() {

    companion object {
        lateinit var instance: VanillaCheesecake
    }

    private val pluginManager = Bukkit.getPluginManager()

    override fun onLoad() {
        instance = this
    }

    override fun onEnable() {
        pluginManager.registerEvents(InvisibleItemFrame.InvisibleItemFramePlacementListener(), this)
        logger.log(Level.INFO, "Plugin has been enabled!")
    }

    override fun onDisable() {
        logger.log(Level.INFO, "Plugin has been disabled.")
    }

}
