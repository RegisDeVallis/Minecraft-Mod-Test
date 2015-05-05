/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regis.test;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 *
 * @author Dalen
 */
public class redstonePlate extends Block {
    
    public redstonePlate (Material material) {
    
    super(material);
    setHarvestLevel("pickaxe", 1);
    setHardness(0.5F);
    setStepSound(Block.soundTypeStone);
    setBlockName("Redstone Plate");
    setCreativeTab(CreativeTabs.tabRedstone);
    
   
    
    
    }
    
   
    
}
