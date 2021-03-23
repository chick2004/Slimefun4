package me.mrCookieSlime.Slimefun.Lists;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.MenuItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.SeasonCategory;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Built-in categories.
 * 
 * @author TheBusyBiscuit
 * @since 4.0
 * @see Category
 */
public class Categories {
	
	public static Category WEAPONS = new Category(new MenuItem(Material.GOLD_SWORD, "&7Vũ khí", 0, "open"), 1);
	public static Category MELTER = new Category(new MenuItem(Material.FURNACE, "&7Luyện kim", 0, "open"), 6);
	public static Category MIXER = null;
	public static Category PORTABLE = null;
	public static Category FOOD = new Category(new MenuItem(Material.APPLE, "&7Thực phẩm", 0, "open"), 2);
	public static Category MACHINES_1 = null;
	public static LockedCategory ELECTRICITY = null;
	public static LockedCategory GPS = null;
	public static Category ARMOR = new Category(new MenuItem(Material.IRON_CHESTPLATE, "&7Giáp thường", 0, "open"), 2);
	public static Category ARMOR_II = new Category(new MenuItem(Material.DIAMOND_BOOTS, "&7Giáp thường - II", 0, "open"), 5);
	public static Category WEAPONS_II = new Category(new MenuItem(Material.DIAMOND_SWORD, "&7Vũ khí - II", 0, "open"), 5);
	public static Category LUMPS_AND_MAGIC = null;
	public static Category MAGIC = null;
	public static Category MISC = null;
	public static Category TECH = new Category(new CustomArmor(new MenuItem(Material.LEATHER_CHESTPLATE, "&7Thiết bị kĩ thuật", 0, "open"), Color.SILVER), 3);
	public static Category RESOURCES = null;
	public static Category CARGO = null;
	public static Category TECH_MISC = null;
	public static Category ANDROID = null;
	public static Category MAGIC_ARMOR = new Category(new MenuItem(Material.GOLD_CHESTPLATE, "&7Giáp ma thuật", 0, "open"), 2);
	public static Category TALISMANS_1 = new Category(new MenuItem(Material.EMERALD, "&7Ngọc hộ mệnh - &aCấp I", 0, "open"), 2);
	public static LockedCategory TALISMANS_2 = new LockedCategory(new MenuItem(Material.EMERALD, "&7Ngọc hộ mệnh - &aCấp II", 0, "open"), 3, TALISMANS_1);
	public static Category TOOLS = new Category(new MenuItem(Material.GOLD_PICKAXE, "&7Công cụ", 0, "open"), 1);
	public static SeasonCategory CHRISTMAS = new SeasonCategory(12, 1, new MenuItem(Material.NETHER_STAR, "&aGiáng &csinh", 0, ChatColor.translateAlternateColorCodes('&', "&chelp &aSanta")));
	public static SeasonCategory VALENTINES_DAY = new SeasonCategory(2, 2, new MenuItem(Material.RED_ROSE, "&dLễ tình nhân", 0, ChatColor.translateAlternateColorCodes('&', "&dcelebrate Love")));
	public static SeasonCategory EASTER = new SeasonCategory(4, 2, new MenuItem(Material.EGG, "&6Lễ phục sinh", 0, ChatColor.translateAlternateColorCodes('&', "&apaint some Eggs")));
	public static SeasonCategory BIRTHDAY = new SeasonCategory(10, 1, new MenuItem(Material.FIREWORK, "&aSinh nhật mrCookieSlime &7(26/10)", 0, ChatColor.translateAlternateColorCodes('&', "&acelebrate with me")));
	
	static {
		try {
			MAGIC = new Category(new CustomItem(new ItemStack(Material.ELYTRA), "&7Tiện ích ma thuật", new String[] { "", "&a> Click to open" }), 3);
			LUMPS_AND_MAGIC = new Category(new CustomItem(SlimefunItems.RUNE_ENDER, "&7Vật phẩm ma thuật", new String[] { "", "&a> Click to open" }), 2);
			TECH_MISC = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0="), "&7Linh kiện kĩ thuật", new String[] { "", "&a> Click to open" }), 2);
			MISC = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&7Linh tinh", "", "&a> Click to open"), 2);
			PORTABLE = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&7Vật phẩm thường", "", "&a> Click to open"), 1);
			MACHINES_1 = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&7Máy móc cơ bản", "", "&a> Click to open"), 1);
			ELECTRICITY = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTU4NDQzMmFmNmYzODIxNjcxMjAyNThkMWVlZThjODdjNmU3NWQ5ZTQ3OWU3YjBkNGM3YjZhZDQ4Y2ZlZWYifX19"), "&bĐiện và Năng lượng", "", "&a> Click to open"), 4, MACHINES_1);
			GPS = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bMáy móc GPS", "", "&a> Click to open"), 4, MACHINES_1);
			RESOURCES = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&7Tài nguyên", "", "&a> Click to open"), 1);
			CARGO = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&cCargo", "", "&a> Click to open"), 4, MACHINES_1);
			ANDROID = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&bAndroids", new String[] { "", "&a> Click to open" }), 5, new Category[] { MACHINES_1 });
			MIXER = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&7Hỗn hợp nóng chảy", "", "&a> Click to open"), 6);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
