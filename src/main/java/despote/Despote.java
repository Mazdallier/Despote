/*******************************************************************************
 * Copyright (c) 2011-2014 Mazdallier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 ******************************************************************************/

import despote.lib.RefStrings

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)

public class Despote {
  
  @EventHandler
  public static void PreLoad(FMLPreInitializationEvent PreEvent){
    
  }
  
  @EventHandler
  public static void load(FMLInitializationEvent event){
    
  }
  
  @EventHandler
  public static void PostLoad(FMLPostInitializationEvent PostEvent){
    
  }
  
}
