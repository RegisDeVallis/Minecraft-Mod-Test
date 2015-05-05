//main file
package Regis.test;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
   


@Mod(modid=Test.MODID, name=Test.MODNAME, version=Test.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class Test //Start the class Declaration
{
    //Set the ID of the mod (Should be lower case).
    public static final String MODID = "test";
    //Set the "Name" of the mod.
    public static final String MODNAME = "Test Mod";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    @Instance(value = Test.MODID) //Tell Forge what instance to use.
    public static Test instance;
    
    
        //public static CommonProxy proxy;
    
    //my stuff
    public static Block redstonePlate;
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Block redstonePlate = new redstonePlate(Material.rock);
            
        GameRegistry.registerBlock(redstonePlate, "redstonePlate");
        
        
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        
        ItemStack redstonePlateStack = new ItemStack(redstonePlate);
        ItemStack redstoneStack = new ItemStack(Blocks.redstone_wire);
        ItemStack ironIngotStack = new ItemStack(Items.iron_ingot);
        ItemStack stoneSlabStack = new ItemStack(Blocks.stone_slab);
        GameRegistry.addRecipe(new ItemStack(redstonePlate),
        "xyx",
        "yzy",
        "xyx",
        'x', ironIngotStack, 'y', redstoneStack, 'z', stoneSlabStack);
        
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}