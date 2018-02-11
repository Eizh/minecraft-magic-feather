package be.ephys.magicfeather;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void init(FMLInitializationEvent e) {
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new ItemMagicFeather.ColorHandler(), ModItems.magicFeather);
    }
}
