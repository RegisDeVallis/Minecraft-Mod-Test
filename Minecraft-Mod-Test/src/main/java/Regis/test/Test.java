/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regis.test;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Test.MODID, name=Test.MODNAME, version=Test.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class Test //Start the class Declaration
{
    //Set the ID of the mod (Should be lower case).
    public static final String MODID = "generic";
    //Set the "Name" of the mod.
    public static final String MODNAME = "Generic Mod";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    @Instance(value = Test.MODID) //Tell Forge what instance to use.
    public static Test instance;
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event)
    {

    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}