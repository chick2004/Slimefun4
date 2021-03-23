package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.InvUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineHelper;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import me.mrCookieSlime.Slimefun.api.item_transport.RecipeSorter;

import org.apache.commons.lang.ArrayUtils;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public abstract class Melter extends AContainer {

	public Melter(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);
		
		new BlockMenuPreset(name, getInventoryTitle()) {
			
			@Override
			public void init() {
				constructMenu(this);
			}

			@Override
			public void newInstance(BlockMenu menu, Block b) {
			}

			@Override
			public boolean canOpen(Block b, Player p) {
				return p.hasPermission("slimefun.inventory.bypass") || CSCoreLib.getLib().getProtectionManager().canAccessChest(p.getUniqueId(), b, true);
			}
			
			@Override
			public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
				return new int[0];
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(BlockMenu menu, ItemTransportFlow flow, ItemStack item) {
				if (flow.equals(ItemTransportFlow.WITHDRAW)) return getOutputSlots();
				
				List<Integer> slots = new ArrayList<Integer>();
				
				for (int slot: getInputSlots()) {
					if (SlimefunManager.isItemSimiliar(menu.getItemInSlot(slot), item, true)) {
						slots.add(slot);
					}
				}
				
				if (slots.isEmpty()) {
					return getInputSlots();
				}
				else {
					Collections.sort(slots, new RecipeSorter(menu));
					return ArrayUtils.toPrimitive(slots.toArray(new Integer[slots.size()]));
				}
			}
		};
		
		this.registerDefaultRecipes(); 
	}
	
	@Override
	public void registerDefaultRecipes() {
		registerRecipe(5, new ItemStack[] {SlimefunItems.COPPER_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.COPPER_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.ALUMINUM_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.SILVER_INGOT, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.SILVER_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.LEAD_INGOT, new ItemStack(Material.BUCKET)} ,new ItemStack[] {SlimefunItems.LEAD_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.ZINC_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.ZINC_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.TIN_INGOT, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.TIN_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.MAGNESIUM_INGOT, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.MAGNESIUM_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.IRON_INGOT), new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.IRON_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_4K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_4K_LIQUID});
		
		registerRecipe(5, new ItemStack[] {SlimefunItems.COPPER_DUST, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.COPPER_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.ALUMINUM_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.SILVER_DUST, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.SILVER_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.LEAD_DUST, new ItemStack(Material.BUCKET)} ,new ItemStack[] {SlimefunItems.LEAD_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.ZINC_DUST, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.ZINC_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.TIN_DUST, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.TIN_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.MAGNESIUM_DUST, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.MAGNESIUM_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.IRON_DUST, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.IRON_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_DUST, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_4K_LIQUID});
		
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_6K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_6K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_8K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_8K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_10K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_10K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_12K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_12K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_14K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_14K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_16K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_16K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_18K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_18K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_20K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_20K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_22K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_22K_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.GOLD_24K, new ItemStack(Material.BUCKET)}, new ItemStack[] {SlimefunItems.GOLD_24K_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.COAL), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.CARBON_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.STEEL_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.STEEL_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.BRONZE_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.BRONZE_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.DURALUMIN_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.BILLON_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.BILLON_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.BRASS_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.BRASS_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.ALUMINUM_BRASS_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.ALUMINUM_BRASS_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.ALUMINUM_BRONZE_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.ALUMINUM_BRONZE_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.CORINTHIAN_BRONZE_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.CORINTHIAN_BRONZE_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.SOLDER_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.SOLDER_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.HARDENED_METAL_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.REINFORCED_ALLOY_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.NICKEL_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.NICKEL_LIQUID});
		registerRecipe(5, new ItemStack[] {SlimefunItems.COBALT_INGOT, new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.COBALT_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.DIAMOND), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.DIAMOND_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.DIAMOND_ORE), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.DIAMOND_ORE_LIQUID});		
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.EMERALD), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.EMERALD_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.EMERALD_ORE), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.EMERALD_ORE_LIQUID});		
		registerRecipe(5, new ItemStack[] {new CustomItem(Material.INK_SACK, 4, 1), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.LAPIS_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.LAPIS_ORE), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.LAPIS_ORE_LIQUID});		
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.REDSTONE), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.REDSTONE_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.REDSTONE_ORE), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.REDSTONE_ORE_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.IRON_ORE), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.IRON_ORE_LIQUID});
		registerRecipe(5, new ItemStack[] {new ItemStack(Material.GOLD_ORE), new ItemStack(Material.BUCKET)},new ItemStack[] {SlimefunItems.GOLD_ORE_LIQUID});
	}
	
	public String getInventoryTitle() {
		return "&cLò nóng chảy";
	}
	
	public ItemStack getProgressBar() {
		return new ItemStack(Material.FLINT_AND_STEEL);
	}
	
	public int[] getInputSlots() {
		return new int[] {19, 20};
	}
	
	public int[] getOutputSlots() {
		return new int[] {24, 25};
	}
	
	@Override
	public void register(boolean slimefun) {
		addItemHandler(new BlockTicker() {
			
			@Override
			public void tick(Block b, SlimefunItem sf, Config data) {
				Melter.this.tick(b);
			}

			@Override
			public void uniqueTick() {
			}

			@Override
			public boolean isSynchronized() {
				return false;
			}
		});

		super.register(slimefun);
	}
	
	@SuppressWarnings("deprecation")
	protected void tick(Block b) {
		if (isProcessing(b)) {
			int timeleft = progress.get(b);
			if (timeleft > 0) {
				ItemStack item = getProgressBar().clone();
		        item.setDurability(MachineHelper.getDurability(item, timeleft, processing.get(b).getTicks()));
				ItemMeta im = item.getItemMeta();
				im.setDisplayName(" ");
				List<String> lore = new ArrayList<String>();
				lore.add(MachineHelper.getProgress(timeleft, processing.get(b).getTicks()));
				lore.add("");
				lore.add(MachineHelper.getTimeLeft(timeleft / 2));
				im.setLore(lore);
				item.setItemMeta(im);
				
				BlockStorage.getInventory(b).replaceExistingItem(22, item);
				
				if (ChargableBlock.isChargable(b)) {
					if (ChargableBlock.getCharge(b) < getEnergyConsumption()) return;
					ChargableBlock.addCharge(b, -getEnergyConsumption());
					progress.put(b, timeleft - 1);
				}
				else progress.put(b, timeleft - 1);
			}
			else {
				BlockStorage.getInventory(b).replaceExistingItem(22, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte) 15), " "));
				pushItems(b, processing.get(b).getOutput());
				
				progress.remove(b);
				processing.remove(b);
			}
		}
		else {
			MachineRecipe r = null;
			Map<Integer, Integer> found = new HashMap<Integer, Integer>();
			outer:
			for (MachineRecipe recipe: recipes) {
				for (ItemStack input: recipe.getInput()) {
					slots:
					for (int slot: getInputSlots()) {
						if (SlimefunManager.isItemSimiliar(BlockStorage.getInventory(b).getItemInSlot(slot), input, true)) {
							found.put(slot, input.getAmount());
							break slots;
						}
					}
				}
				if (found.size() == recipe.getInput().length) {
					r = recipe;
					break outer;
				}
				else found.clear();
			}
			
			if (r != null) {
				if (!fits(b, r.getOutput())) return;
				for (Map.Entry<Integer, Integer> entry: found.entrySet()) {
					BlockStorage.getInventory(b).replaceExistingItem(entry.getKey(), InvUtils.decreaseItem(BlockStorage.getInventory(b).getItemInSlot(entry.getKey()), entry.getValue()));
				}
				processing.put(b, r);
				progress.put(b, r.getTicks());
			}
		}
	}
	
	@Override
	public String getMachineIdentifier() {
		return "MELTER";
	}

}
