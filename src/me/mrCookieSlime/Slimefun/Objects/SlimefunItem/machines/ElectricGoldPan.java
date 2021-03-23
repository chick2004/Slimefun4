package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import java.util.ArrayList;
import java.util.List;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.InvUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.AdvancedMenuClickHandler;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineHelper;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public abstract class ElectricGoldPan extends AContainer {
	
	private static final int[] border = {3, 12, 30, 39};
	private static final int[] border_in = {0, 1, 2, 9, 11, 18, 20, 27, 29, 36 ,37, 38};
	private static final int[] border_out = {4, 5, 6, 7, 8, 13, 17,22, 26, 31, 35, 40, 41, 42, 43, 44};

	public ElectricGoldPan(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, name, recipeType, recipe);
	}

	@Override
	public String getInventoryTitle() {
		return "&6Máy sàng tự động";
	}

	@Override
	public ItemStack getProgressBar() {
		return new ItemStack(Material.DIAMOND_SPADE);
	}

	@Override
	public void registerDefaultRecipes() {}
	
	@SuppressWarnings("deprecation")
	protected void constructMenu(BlockMenuPreset preset) {
		for (int i: border) {
			preset.addItem(i, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte) 7), " "),
			new MenuClickHandler() {

				@Override
				public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction arg3) {
					return false;
				}
						
			});
		}
		for (int i: border_in) {
			preset.addItem(i, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte) 9), " "),
			new MenuClickHandler() {

				@Override
				public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction arg3) {
					return false;
				}
						
			});
		}
		for (int i: border_out) {
			preset.addItem(i, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte) 1), " "),
			new MenuClickHandler() {

				@Override
				public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction arg3) {
					return false;
				}
						
			});
		}
		
		preset.addItem(21, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte) 15), " "),
		new MenuClickHandler() {

			@Override
			public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction arg3) {
				return false;
			}
							
		});
		
		for (int i: getOutputSlots()) {
			preset.addMenuClickHandler(i, new AdvancedMenuClickHandler() {
				
				@Override
				public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
					return false;
				}

				@Override
				public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
					return cursor == null || cursor.getType() == null || cursor.getType() == Material.AIR;
				}
			});
		}
	}
	
	public abstract int getSpeed();
	
	@SuppressWarnings("deprecation")
	protected void tick(Block b) {
		if (isProcessing(b)) {
			int timeleft = progress.get(b);
			if (timeleft > 0 && getSpeed() < 10) {
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
				
				BlockStorage.getInventory(b).replaceExistingItem(221, item);
				
				if (ChargableBlock.isChargable(b)) {
					if (ChargableBlock.getCharge(b) < getEnergyConsumption()) return;
					ChargableBlock.addCharge(b, -getEnergyConsumption());
					progress.put(b, timeleft - 1);
				}
				else progress.put(b, timeleft - 1);
			}
			else if (ChargableBlock.isChargable(b)) {
				if (ChargableBlock.getCharge(b) < getEnergyConsumption()) return;
				ChargableBlock.addCharge(b, -getEnergyConsumption());

				BlockStorage.getInventory(b).replaceExistingItem(21, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte) 15), " "));
				pushItems(b, processing.get(b).getOutput());
				
				progress.remove(b);
				processing.remove(b);
			}
		}
		else {
			for (int slot: getInputSlots()) {
				if (SlimefunManager.isItemSimiliar(BlockStorage.getInventory(b).getItemInSlot(slot), new ItemStack(Material.GRAVEL), true)) {
					ItemStack output = SlimefunItems.SIFTED_ORE;
					if (CSCoreLib.randomizer().nextInt(100) < 16) output = new ItemStack(Material.FLINT);
					if (CSCoreLib.randomizer().nextInt(100) < 16) output = new ItemStack(Material.CLAY_BALL);
					
					MachineRecipe r = new MachineRecipe(3 / getSpeed(), new ItemStack[0], new ItemStack[] {output});
					if (!fits(b, r.getOutput())) return;
					BlockStorage.getInventory(b).replaceExistingItem(slot, InvUtils.decreaseItem(BlockStorage.getInventory(b).getItemInSlot(slot), 1));
					processing.put(b, r);
					progress.put(b, r.getTicks());
					break;
				}
				if (SlimefunManager.isItemSimiliar(BlockStorage.getInventory(b).getItemInSlot(slot), new ItemStack(Material.SOUL_SAND), true)) {
					ItemStack output = new ItemStack(Material.BLAZE_POWDER);
					if (CSCoreLib.randomizer().nextInt(100) < 16) output = new ItemStack(Material.GOLD_NUGGET);
					if (CSCoreLib.randomizer().nextInt(100) < 16) output = new ItemStack(Material.QUARTZ);
					if (CSCoreLib.randomizer().nextInt(100) < 16) output = new ItemStack(Material.NETHER_STALK);
					if (CSCoreLib.randomizer().nextInt(100) < 16) output = new ItemStack(Material.GHAST_TEAR);
					if (CSCoreLib.randomizer().nextInt(100) < 16) output = new ItemStack(Material.GLOWSTONE_DUST);
					
					MachineRecipe r = new MachineRecipe(3 / getSpeed(), new ItemStack[0], new ItemStack[] {output});
					if (!fits(b, r.getOutput())) return;
					BlockStorage.getInventory(b).replaceExistingItem(slot, InvUtils.decreaseItem(BlockStorage.getInventory(b).getItemInSlot(slot), 1));
					processing.put(b, r);
					progress.put(b, r.getTicks());
					break;
				}
			}
		}
	}
	@Override
	public int[] getInputSlots() {
		return new int[] {10, 19, 28};
	}

	@Override
	public int[] getOutputSlots() {
		return new int[] {14, 15, 16, 23, 24, 25, 32, 33, 34};
	}
	
	@Override
	public String getMachineIdentifier() {
		return "ELECTRIC_GOLD_PAN";
	}

}
