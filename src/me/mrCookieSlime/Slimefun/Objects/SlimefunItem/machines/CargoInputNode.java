package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunBlockHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.UnregisterReason;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.CargoNet;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

public class CargoInputNode extends SlimefunItem {
	
	private static final int[] border = {0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 17, 18, 22, 23, 26, 27, 31, 32, 33, 34, 35, 36, 40, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53};

	public CargoInputNode(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack[] recipe, ItemStack recipeOutput) {
		super(category, item, name, recipeType, recipe, recipeOutput);
		
		new BlockMenuPreset(name, "&7Nút Cargo &c(Đầu vào)") {
			
			@Override
			public void init() {
				constructMenu(this);
			}

			@SuppressWarnings("deprecation")
			@Override
			public void newInstance(final BlockMenu menu, final Block b) {
				try {
					if (!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "filter-type") == null || BlockStorage.getBlockInfo(b, "filter-type").equals("whitelist")) {
						menu.replaceExistingItem(15, new CustomItem(new MaterialData(Material.WOOL), "&7Loại: &rWhitelist", "","&7Chỉ cho phép Item tương ứng đi qua", "&e> Ấn để chuyển sang Blacklist"));
						menu.addMenuClickHandler(15, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "filter-type", "blacklist");
								newInstance(menu, b);
								return false;
							}
						});
					}
					else {
						menu.replaceExistingItem(15, new CustomItem(new MaterialData(Material.WOOL, (byte) 15),  "&7Loại: &8Blacklist", "", "&7Chỉ chặn các Item tương ứng đi qua", "&e> Ấn để chuyển sang Whitelist"));
						menu.addMenuClickHandler(15, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "filter-type", "whitelist");
								newInstance(menu, b);
								return false;
							}
						});
					}
					
					if (!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "filter-durability") == null || BlockStorage.getBlockInfo(b, "filter-durability").equals("false")) {
						menu.replaceExistingItem(16, new CustomItem(new MaterialData(Material.STONE_SWORD, (byte) 20), "&7Bao gồm ID phụ/Độ bền: &4\u2718", "", "&e> Nhấp để chuyển đổi xem Độ bền có phù hợp hay không"));
						menu.addMenuClickHandler(16, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "filter-durability", "true");
								newInstance(menu, b);
								return false;
							}
						});
					}
					else {
						menu.replaceExistingItem(16, new CustomItem(new MaterialData(Material.GOLD_SWORD, (byte) 20), "&7Bao gồm ID phụ/Độ bền: &2\u2714", "", "&e> Nhấp để chuyển đổi xem Độ bền có phù hợp hay không"));
						menu.addMenuClickHandler(16, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "filter-durability", "false");
								newInstance(menu, b);
								return false;
							}
						});
					}
					
					if (!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "round-robin") == null || BlockStorage.getBlockInfo(b, "round-robin").equals("false")) {
						menu.replaceExistingItem(24, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&7Round-Robin Mode: &4\u2718", "", "&e> Ấn để bật Round Robin Mode", "&e(Các vật phẩm sẽ được phân bổ đều qua Kênh)"));
						menu.addMenuClickHandler(24, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "round-robin", "true");
								newInstance(menu, b);
								return false;
							}
						});
					}
					else {
						menu.replaceExistingItem(24, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&7Round-Robin Mode: &2\u2714", "", "&e> Ấn để tắt Round Robin Mode", "&e(Các vật phẩm sẽ được phân bổ đều qua Kênh)"));
						menu.addMenuClickHandler(24, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "round-robin", "false");
								newInstance(menu, b);
								return false;
							}
						});
					}
					
					if (!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "filter-lore") == null || BlockStorage.getBlockInfo(b, "filter-lore").equals("true")) {
						menu.replaceExistingItem(25, new CustomItem(new MaterialData(Material.EMPTY_MAP), "&7Bao gồm Lore: &2\u2714", "", "&e> Nhấp để chuyển đổi xem Lore có phù hợp hay không"));
						menu.addMenuClickHandler(25, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "filter-lore", "false");
								newInstance(menu, b);
								return false;
							}
						});
					}
					else {
						menu.replaceExistingItem(25, new CustomItem(new MaterialData(Material.EMPTY_MAP), "&7Bao gồm Lore: &4\u2718", "", "&e> Nhấp để chuyển đổi xem Lore có phù hợp hay không"));
						menu.addMenuClickHandler(25, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								BlockStorage.addBlockInfo(b, "filter-lore", "true");
								newInstance(menu, b);
								return false;
							}
						});
					}

					menu.replaceExistingItem(41, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI1OTliZDk4NjY1OWI4Y2UyYzQ5ODg1MjVjOTRlMTlkZGQzOWZhZDA4YTM4Mjg0YTE5N2YxYjcwNjc1YWNjIn19fQ=="), "&bKênh", "", "&e> Nhấp để giảm ID kênh đi 1"));
					menu.addMenuClickHandler(41, new MenuClickHandler() {

						@Override
						public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
							int channel = Integer.parseInt(BlockStorage.getBlockInfo(b, "frequency")) - 1;
							if (channel < 0) {
								if (CargoNet.EXTRA_CHANNELS) channel = 16;
								else channel = 15;
							}
							BlockStorage.addBlockInfo(b, "frequency", String.valueOf(channel));
							newInstance(menu, b);
							return false;
						}
					});
					
					int channel = ((!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "frequency") == null) ? 0: (Integer.parseInt(BlockStorage.getBlockInfo(b, "frequency"))));

					if (channel == 16) {
						menu.replaceExistingItem(42, new CustomItem(SlimefunItems.CHEST_TERMINAL, "&bChannel ID: &3" + (channel + 1)));
						menu.addMenuClickHandler(42, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								return false;
							}
						});
					}
					else {
						menu.replaceExistingItem(42, new CustomItem(new MaterialData(Material.WOOL, (byte) channel), "&bChannel ID: &3" + (channel + 1)));
						menu.addMenuClickHandler(42, new MenuClickHandler() {

							@Override
							public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
								return false;
							}
						});
					}

					menu.replaceExistingItem(43, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJmOTEwYzQ3ZGEwNDJlNGFhMjhhZjZjYzgxY2Y0OGFjNmNhZjM3ZGFiMzVmODhkYjk5M2FjY2I5ZGZlNTE2In19fQ=="), "&bKênh", "", "&e> Nhấp để tăng ID kênh lên 1"));
					menu.addMenuClickHandler(43, new MenuClickHandler() {

						@Override
						public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3) {
							int channel = Integer.parseInt(BlockStorage.getBlockInfo(b, "frequency")) + 1;

							if (CargoNet.EXTRA_CHANNELS) {
								if (channel > 16) channel = 0;
							}
							else {
								if (channel > 15) channel = 0;
							}
							
							BlockStorage.addBlockInfo(b, "frequency", String.valueOf(channel));
							newInstance(menu, b);
							return false;
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@Override
			public boolean canOpen(Block b, Player p) {
				boolean open = CSCoreLib.getLib().getProtectionManager().canAccessChest(p.getUniqueId(), b) || p.hasPermission("slimefun.cargo.bypass");
				if (!open) {
					Messages.local.sendTranslation(p, "inventory.no-access", true);
				}
				return open;
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
				return new int[0];
			}
		};
		
		registerBlockHandler(name, new SlimefunBlockHandler() {
			
			@Override
			public void onPlace(Player p, Block b, SlimefunItem item) {
				BlockStorage.addBlockInfo(b, "owner", p.getUniqueId().toString());
				BlockStorage.addBlockInfo(b, "index", "0");
				BlockStorage.addBlockInfo(b, "frequency", "0");
				BlockStorage.addBlockInfo(b, "filter-type", "whitelist");
				BlockStorage.addBlockInfo(b, "filter-lore", "true");
				BlockStorage.addBlockInfo(b, "filter-durability", "false");
				BlockStorage.addBlockInfo(b, "round-robin", "false");
			}
			
			@Override
			public boolean onBreak(Player p, Block b, SlimefunItem item, UnregisterReason reason) {
				BlockMenu inv = BlockStorage.getInventory(b);
				if (inv != null) {
					for (int slot: getInputSlots()) {
						if (inv.getItemInSlot(slot) != null) {
							b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
							inv.replaceExistingItem(slot, null);
						}
					}
				}
				return true;
			}
		});
	}
	
	@SuppressWarnings("deprecation")
	protected void constructMenu(BlockMenuPreset preset) {
		for (int i: border) {
			preset.addItem(i, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte) 9), " "),
			new MenuClickHandler() {

				@Override
				public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction arg3) {
					return false;
				}
				
			});
		}

		preset.addItem(2, new CustomItem(new MaterialData(Material.PAPER), "&3Vật phẩm", "", "&bĐặt tất cả vật phẩm bạn muốn đưa vào", "&bblacklist/whitelist"),
		new MenuClickHandler() {

			@Override
			public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction arg3) {
				return false;
			}
			
		});
	}
	
	public int[] getInputSlots() {
		return new int[] {19, 20, 21, 28, 29, 30, 37, 38, 39};
	}
}
