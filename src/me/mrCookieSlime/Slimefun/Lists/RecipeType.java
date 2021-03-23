package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.List;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunGadget;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunMachine;
import me.mrCookieSlime.Slimefun.api.SlimefunRecipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RecipeType {
	
	public static final RecipeType MULTIBLOCK = new RecipeType(new CustomItem(Material.BRICK, "&bĐa khối", 0, new String[] {"", "&aBạn phải xây dựng chúng"}));
	public static final RecipeType ARMOR_FORGE = new RecipeType(new CustomItem(Material.ANVIL, "&aÁp dụng công thức này cho", 0, new String[] {"&6Máy làm giáp"}), "ARMOR_FORGE");
	public static final RecipeType GRIND_STONE = new RecipeType(new CustomItem(Material.DISPENSER, "&aÁp dụng công thức này cho", 0, new String[] {"&6Máy mài"}), "GRIND_STONE");
	public static final RecipeType MOB_DROP = new RecipeType(new CustomItem(Material.MONSTER_EGG, "&bGiết mob", 0, new String[] {"&aGiết mob được chỉ định để nhận được vật phẩm này"}));
	public static final RecipeType SMELTERY = new RecipeType(new CustomItem(Material.FURNACE, "&aÁp dụng công thức này cho", 0, new String[] {"&6Lò rèn"}), "SMELTERY");
	public static final RecipeType ORE_CRUSHER = new RecipeType(new CustomItem(Material.DISPENSER, "&aÁp dụng công thức này cho", 0, new String[] {"&6Máy nghiền"}), "ORE_CRUSHER");
	public static final RecipeType GOLD_PAN = new RecipeType(new CustomItem(Material.BOWL, "&bBát sàng sỏi", 0, new String[] {"&aSàng sỏi để nhận được vật phẩm này"}));
	public static final RecipeType COMPRESSOR = new RecipeType(new CustomItem(Material.PISTON_BASE, "&aÁp dụng công thức này cho", 0, new String[] {"&6Máy nén"}), "COMPRESSOR");
	public static final RecipeType PRESSURE_CHAMBER = new RecipeType(new CustomItem(Material.GLASS, "&aÁp dụng công thức này cho", 0, new String[] {"&6Máy nén áp suất"}), "PRESSURE_CHAMBER");
	public static final RecipeType OVEN = new RecipeType(new CustomItem(Material.FURNACE, "&&aÁp dụng công thức này cho", 0, new String[] {"&aLò nung bình thường"}), "OVEN");
	public static final RecipeType MAGIC_WORKBENCH = new RecipeType(new CustomItem(Material.BOOKSHELF, "&aÁp dụng công thức này cho", 0, new String[] {"&6Bàn pháp sư"}), "MAGIC_WORKBENCH");
	public static final RecipeType ORE_WASHER = new RecipeType(new CustomItem(Material.CAULDRON_ITEM, "&aÁp dụng công thức này cho", 0, new String[] {"&6Máy rửa quặng"}), "ORE_WASHER");
	public static final RecipeType ENHANCED_CRAFTING_TABLE = new RecipeType(new CustomItem(Material.WORKBENCH, "&aÁp dụng công thức này cho", 0, new String[] {"&6Bàn chế tạo cao cấp"}), "ENHANCED_CRAFTING_TABLE");
	public static final RecipeType JUICER = new RecipeType(new CustomItem(Material.GLASS_BOTTLE, "&aÁp dụng công thức này cho&eJuicer", 0, new String[] {"&6Máy ép trái cây"}), "JUICER");
	public static final RecipeType ANCIENT_ALTAR = new RecipeType(new CustomItem(Material.ENCHANTMENT_TABLE, "&aÁp dụng công thức này cho", 0, new String[] {"&5Bệ cổ ma thuật"}));
	public static final RecipeType HEATED_PRESSURE_CHAMBER = new RecipeType(new CustomItem(Material.STAINED_GLASS, "&aÁp dụng công thức này cho", 8, new String[] {"&cLò áp suất"}), "HEATED_PRESSURE_CHAMBER");
	public static final RecipeType SOLIDIFIER = new RecipeType(new CustomItem(Material.STAINED_GLASS, "&aÁp dụng công thức này cho", 11, new String[] {"&cMáy làm nguội"}), "SOLIDIFIER");
	public static final RecipeType MELTER = new RecipeType(new CustomItem(Material.FURNACE, "&aÁp dụng công thức này cho", 14, new String[] {"&cLò nóng chảy"}), "MELTER");
	public static final RecipeType MIXER = new RecipeType(new CustomItem(Material.FURNACE, "&aÁp dụng công thức này cho", 0, new String[] {"&cMáy trộn"}), "MIXER");
	public static final RecipeType CENTRIFUGE = new RecipeType(new CustomItem(Material.STAINED_GLASS, "&aÁp dụng công thức này cho", 11, new String[] {"&cMáy li tâm"}), "CENTRIFUGE");

	
	public static final RecipeType SHAPED_RECIPE = new RecipeType(new CustomItem(Material.WORKBENCH, "&aÁp dụng công thức này cho", 0, new String[] {"&aBàn chế tạo bình thường"}));
	public static final RecipeType SHAPELESS_RECIPE = new RecipeType(new CustomItem(Material.WORKBENCH, "&aÁp dụng công thức này cho", 0, new String[] {"&aBàn chế tạo bình thường"}));
	public static final RecipeType FURNACE = new RecipeType(new CustomItem(Material.FURNACE, "&aÁp dụng công thức này cho", 0, new String[] {"&aLò nung bình thường"}));
	public static final RecipeType NULL = new RecipeType(null);
	
	ItemStack item;
	String machine;
	
	public RecipeType(ItemStack item) {
		this.item = item;
		this.machine = "";
	}
	
	public RecipeType(ItemStack item, String machine) {
		this.item = item;
		this.machine = machine;
	}
	
	public RecipeType(String machine, int seconds, ItemStack[] input, ItemStack[] output) {
		this.machine = machine;
		SlimefunItem item = getMachine();
		this.item = item.getItem();
		
		SlimefunRecipes.registerMachineRecipe(machine, seconds, input, output);
	}
	
	public ItemStack toItem() {
		return this.item;
	}
	
	public SlimefunItem getMachine() {
		return SlimefunItem.getByID(machine);
	}
	
	public static List<ItemStack> getRecipeInputs(SlimefunItem machine) {
		if (machine == null) return new ArrayList<ItemStack>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack> convertable = new ArrayList<ItemStack>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertable.add(recipes.get(i)[0]);
		}
		return convertable;
	}
	
	public static List<ItemStack[]> getRecipeInputList(SlimefunItem machine) {
		if (machine == null) return new ArrayList<ItemStack[]>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack[]> convertable = new ArrayList<ItemStack[]>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertable.add(recipes.get(i));
		}
		return convertable;
	}
	
	public static ItemStack getRecipeOutput(SlimefunItem machine, ItemStack input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputs(machine).indexOf(input) * 2) + 1))[0];
	}
	
	public static ItemStack getRecipeOutputList(SlimefunItem machine, ItemStack[] input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputList(machine).indexOf(input) * 2) + 1))[0];
	}
}
