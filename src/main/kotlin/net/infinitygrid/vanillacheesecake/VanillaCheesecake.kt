package net.infinitygrid.vanillacheesecake

import net.infinitygrid.mercury.MercuryPluginLoader

class VanillaCheesecake : MercuryPluginLoader() {

    companion object {
        lateinit var instance: VanillaCheesecake
    }

    override fun onPluginLoad() {
        instance = this
    }

    override fun onPluginEnable() {
        registerListener(EndPortalRestriction())
        InvisibleItemFrame()
    }

}
