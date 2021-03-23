package me.mrCookieSlime.Slimefun.Lists;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomPotion;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.Christmas;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

@SuppressWarnings("deprecation")
public class SlimefunItems {  
	      
	/*		 Items 		*/

  	public static ItemStack HELICOPER_HAT = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&eMũ trực thăng", 0, new String[] { "", "&7*phạch phạch pạch :)", "", "&7⇨&eShift&7 để sử dụng", "", "&7[Giáp ma thuật]" }), Color.PURPLE);
	public static ItemStack OUTPUT_CHEST = new CustomItem(Material.CHEST, "&cRương sản phẩm", 0, new String[] { "","&7Đặt trước Dispenser của máy hoặc trước máy","&7Sản phẩm của máy sẽ tự thêm vào đây", "", "&7[Máy móc cơ bản]" });

	public static ItemStack MELTER = new CustomItem(Material.FURNACE, "&cLò nóng chảy", 0, new String[] { "","&7Nóng chảy kim loại thành chất lỏng", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &764 J Buffer", "&8⇨ &e⚡ &732 J/s", "", "&7[Điện và năng lượng]" });

	public static ItemStack MIXER = new CustomItem(Material.FURNACE, "&cMáy trộn", 0, new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &7128 J Buffer", "&8⇨ &e⚡ &764 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack SOLIDIFIER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)11), "&bMáy làm nguội", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &716 J Buffer", "&8⇨ &e⚡ &78 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack CRYSTALLIZER = new CustomItem(Material.DIAMOND_BLOCK, "&bMáy làm nguội tinh thể", 0, new String[] { "", "&7(Lapis, kim cương và lục bảo)","", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &7128 J Buffer", "&8⇨ &e⚡ &7128 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack SLAG2 = new CustomItem(new MaterialData(Material.COAL, (byte)1), "&7Xỉ", new String[] {"","&7Có thể sử dụng trên &6Máy xay đá", ""});
	public static ItemStack SLAG = null;
	public static ItemStack CENTRIFUGE = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)11), "&bMáy ly tâm", new String[] {"","&7Phân tách quặng nóng chảy", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &764 J Buffer", "&8⇨ &e⚡ &732 J/s", "", "&7[Điện và năng lượng]" });

	public static ItemStack SPRAY_SOLIDIFIER = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)11), "&bMáy phun đông lạnh", new String[] {"","&7Làm nguội chất lỏng thành bột","", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &7128 J Buffer", "&8⇨ &e⚡ &764 J/s", "", "&7[Điện và năng lượng]" });

	public static ItemStack PORTABLE_CRAFTER = null;
	public static ItemStack PORTABLE_DUSTBIN = null;
	public static ItemStack ENDER_BACKPACK = null;

	public static ItemStack MAGIC_EYE_OF_ENDER = new CustomItem(Material.EYE_OF_ENDER, "&6Ngọc dịch chuyển", 0, new String[] { "", "&4Yêu cầu:&f trang bị đủ bộ&5 Giáp Ender", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Tiện ích ma thuật]" });
	public static ItemStack BROKEN_SPAWNER = new CustomItem(new MaterialData(Material.MOB_SPAWNER), "&cLồng Spawner bị nứt", new String[] { "&7Loại: &b<Type>", "", "&cCần được sửa chữa bằng&d Bệ cổ ma thuật", "", "&7[Vật phẩm ma thuật]" });
	public static ItemStack REPAIRED_SPAWNER = new CustomItem(Material.MOB_SPAWNER, "&bLồng Spawner được gia cố", 0, new String[] { "&7Loại: &b<Type>", "", "&7[Tiện ích ma thuật]" });
	public static ItemStack INFERNAL_BONEMEAL = new CustomItem(new MaterialData(Material.INK_SACK, (byte)15), "&4Bột xương Nether", new String[] { "", "&7Thúc đẩy sự phát triển", "&7của &cBướu Nether", "", "&7[Tiện ích ma thuật]" });
	
	/*		 Gadgets 		*/
	public static ItemStack GOLD_PAN = new CustomItem(Material.BOWL, "&6Bát sàng", 0, new String[] { "", "&fGiúp bạn có nhiều vật phẩm khác hơn", "", "&7⇨&eChuột phải&7 vào sỏi để sàng", "", "&7[Công cụ]" });
	public static ItemStack NETHER_GOLD_PAN = new CustomItem(Material.BOWL, "&cBát sàng Nether", 0, new String[] { "", "&fGiúp bạn có nhiều vật phẩm khác hơn", "", "&7⇨&eChuột phải&7 vào đất linh hồn để sàng", "", "&7[Công cụ]" });
	public static ItemStack PARACHUTE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&rDù bay", 0, new String[] { "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.WHITE);
	public static ItemStack GRAPPLING_HOOK = new CustomItem(Material.LEASH, "&6Móc kéo", 0, new String[] { "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Công cụ]" });
	public static ItemStack SOLAR_HELMET = new CustomItem(Material.IRON_HELMET, "&bMũ năng lượng Mặt trời", 0, new String[] { "", "&fSạc năng lượng cho vật phẩm", "&fhoặc giáp trên tay", "", "&7[Thiết bị kĩ thuật]" });
	public static ItemStack CLOTH = new CustomItem(Material.PAPER, "&bVải", 0, new String[] { "", "&7[Linh tinh]" });
	public static ItemStack CAN = null;
	public static ItemStack NIGHT_VISION_GOGGLES = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&aKính nhìn đêm", 0, new String[] { "", "&fGiúp nhìn rõ trong đêm tối", "", "&7[Thiết bị kĩ thuật]" }), Color.BLACK);
	public static ItemStack FARMER_SHOES = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&eỦng nông dân", 0, new String[] { "", "&6Bảo vệ ruộng khi nhảy lên chúng", "", "&7[Giáp ma thuật]" }), Color.YELLOW);
	public static ItemStack INFUSED_MAGNET = null;
	public static ItemStack FLASK_OF_KNOWLEDGE = new CustomItem(Material.GLASS_BOTTLE, "&cChai kinh nghiệm", 0, new String[] { "", "&rCho phép dự trữ exp lên chai", "&7Giá: &a1 Level", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Tiện ích ma thuật]" });
	public static ItemStack FILLED_FLASK_OF_KNOWLEDGE = new CustomItem(Material.EXP_BOTTLE, "&aChai kinh nghiệm", 0, new String[] { "", "&rCó thể sử dụng", "", "&7[Tiện ích ma thuật]" });
	public static ItemStack RAG = new CustomItem(Material.PAPER, "&cMảnh vải", 0, new String[] { "", "&rHồi 2 &c❤", "&rLoại bỏ hiệu ứng cháy", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	public static ItemStack BANDAGE = new CustomItem(Material.PAPER, "&cBăng gạc", 0, new String[] { "", "&rHồi 4 &c❤", "&rLoại bỏ hiệu ứng cháy", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	public static ItemStack SPLINT = new CustomItem(Material.STICK, "&cThanh nẹp", 0, new String[] { "", "&rHồi 2 &c❤", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	public static ItemStack VITAMINS = new CustomItem(Material.NETHER_STALK, "&cVitamin", 0, new String[] { "", "&rHồi 2 &c❤", "&rLoại bỏ hiệu ứng cháy", "&rLoại bỏ hiệu ứng &6Độc&7, &8Khô héo&7, &2Phóng xạ", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	public static ItemStack MEDICINE = new CustomItem(Material.POTION, "&cThuốc", 8229, new String[] { "", "&rHồi 2 &c❤", "&rLoại bỏ hiệu ứng cháy", "&rLoại bỏ hiệu ứng &6Độc&7, &8Khô héo&7, &2Phóng xạ", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	
	/*		Backpacks		*/
	public static ItemStack BACKPACK_SMALL = null;
	public static ItemStack BACKPACK_MEDIUM = null;
	public static ItemStack BACKPACK_LARGE = null;
	public static ItemStack WOVEN_BACKPACK = null;
	public static ItemStack GILDED_BACKPACK = null;
	public static ItemStack DOUBLE_BACKPACK = null;
	public static ItemStack BOUND_BACKPACK = null;
	public static ItemStack COOLER = null;
	
	public static ItemStack VOIDBAG_SMALL = null;
	public static ItemStack VOIDBAG_MEDIUM = null;
	public static ItemStack VOIDBAG_BIG = null;
	public static ItemStack VOIDBAG_LARGE = null;
	public static ItemStack BOUND_VOIDBAG = null;

	/*		 Jetpacks		*/
	public static ItemStack DURALUMIN_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9Giáp phản lực &7- &eI", new String[] { "", "&8⇨ &7Nguyên liệu: &bDuralumin", "&8⇨ &e⚡ &70 / 20 J", "&8⇨ &7Sức đẩy: &c0.35", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack SOLDER_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9Giáp phản lực &7- &eII", new String[] { "", "&8⇨ &7Nguyên liệu: &bSolder", "&8⇨ &e⚡ &70 / 30 J", "&8⇨ &7Sức đẩy: &c0.4", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack BILLON_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9Giáp phản lực &7- &eIII", new String[] { "", "&8⇨ &7Nguyên liệu: &bBillon", "&8⇨ &e⚡ &70 / 45 J", "&8⇨ &7Sức đẩy: &c0.45", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9Giáp phản lực &7- &eIV", new String[] { "", "&8⇨ &7Nguyên liệu: &bSteel", "&8⇨ &e⚡ &70 / 60 J", "&8⇨ &7Sức đẩy: &c0.5", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9Giáp phản lực &7- &eV", new String[] { "", "&8⇨ &7Nguyên liệu: &bDamascus Steel", "&8⇨ &e⚡ &70 / 75 J", "&8⇨ &7Sức đẩy: &c0.55", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9Giáp phản lực &7- &eVI", new String[] { "", "&8⇨ &7Nguyên liệu: &bReinforced Alloy", "&8⇨ &e⚡ &70 / 100 J", "&8⇨ &7Sức đẩy: &c0.6", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack CARBONADO_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9Giáp phản lực &7- &eVII", new String[] { "", "&8⇨ &7Nguyên liệu: &bCarbonado", "&8⇨ &e⚡ &70 / 150 J", "&8⇨ &7Sức đẩy: &c0.7", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.BLACK);
	public static ItemStack ARMORED_JETPACK = new CustomItem(new MaterialData(Material.IRON_CHESTPLATE), "&9Giáp phản lực &7- &eVIII", new String[] { "&8⇨ &7Nguyên liệu: &bSteel", "", "&8⇨ &e⚡ &70 / 50 J", "&8⇨ &7Sức đẩy: &c0.45", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" });
	
	/*		 Jetboots		*/
	public static ItemStack DURALUMIN_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9Giày phản lực &7- &eI", new String[] { "", "&8⇨ &7Nguyên liệu: &bDuralumin", "&c&o&8⇨ &e⚡ &70 / 20 J", "&8⇨ &7Speed: &a0.35", "&8⇨ &7Độ chính xác: &c50%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack SOLDER_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9Giày phản lực &7- &eII", new String[] { "", "&8⇨ &7Nguyên liệu: &bSolder", "&c&o&8⇨ &e⚡ &70 / 30 J", "&8⇨ &7Speed: &a0.4", "&8⇨ &7Độ chính xác: &660%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack BILLON_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9Giày phản lực &7- &eIII", new String[] { "", "&8⇨ &7Nguyên liệu: &bBillon", "&c&o&8⇨ &e⚡ &70 / 40 J", "&8⇨ &7Speed: &a0.45", "&8⇨ &7Độ chính xác: &665%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9Giày phản lực &7- &eIV", new String[] { "", "&8⇨ &7Nguyên liệu: &bSteel", "&c&o&8⇨ &e⚡ &70 / 50 J", "&8⇨ &7Speed: &a0.5", "&8⇨ &7Độ chính xác: &e70%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9Giày phản lực &7- &eV", new String[] { "", "&8⇨ &7Nguyên liệu: &bDamascus Steel", "&c&o&8⇨ &e⚡ &70 / 75 J", "&8⇨ &7Speed: &a0.55", "&8⇨ &7Độ chính xác: &a75%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9Giày phản lực &7- &eVI", new String[] { "", "&8⇨ &7Nguyên liệu: &bReinforced Alloy", "&c&o&8⇨ &e⚡ &70 / 100 J", "&8⇨ &7Speed: &a0.6", "&8⇨ &7Độ chính xác: &c80%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.SILVER);
	public static ItemStack CARBONADO_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9Giày phản lực &7- &eVII", new String[] { "", "&8⇨ &7Nguyên liệu: &bCarbonado", "&c&o&8⇨ &e⚡ &70 / 125 J", "&8⇨ &7Speed: &a0.7", "&8⇨ &7Độ chính xác: &c99.9%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" }), Color.BLACK);
	public static ItemStack ARMORED_JETBOOTS = new CustomItem(new MaterialData(Material.IRON_BOOTS), "&9Giày giáp phản lực", new String[] { "", "&8⇨ &7Nguyên liệu: &bSteel", "&8⇨ &e⚡ &70 / 50 J", "&8⇨ &7Speed: &a0.45", "&8⇨ &7Độ chính xác: &e70%", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Thiết bị kĩ thuật]" });	
	/*		 Multi Tools		*/
	public static ItemStack DURALUMIN_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9Đa công cụ &7- &eI", new String[] { "", "&8⇨ &7Nguyên liệu: &bDuralumin", "&8⇨ &e⚡ &70 / 20 J", "", "&7⇨&eChuột phải&7 để sử dụng", "&7⇨ &eShift + Chuột phải&7 để đổi chế độ", "", "&7[Thiết bị kĩ thuật]" });
	public static ItemStack SOLDER_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9Đa công cụ &7- &eII", new String[] { "", "&8⇨ &7Nguyên liệu: &bSolder", "&8⇨ &e⚡ &70 / 30 J", "", "&7⇨&eChuột phải&7 để sử dụng", "&7⇨ &eShift + Chuột phải&7 để đổi chế độ", "", "&7[Thiết bị kĩ thuật]" });
	public static ItemStack BILLON_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9Đa công cụ &7- &eIII", new String[] { "", "&8⇨ &7Nguyên liệu: &bBillon", "&8⇨ &e⚡ &70 / 40 J", "", "&7⇨&eChuột phải&7 để sử dụng", "&7⇨ &eShift + Chuột phải&7 để đổi chế độ", "", "&7[Thiết bị kĩ thuật]" });
	public static ItemStack STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9Đa công cụ &7- &eIV", new String[] { "", "&8⇨ &7Nguyên liệu: &bSteel", "&8⇨ &e⚡ &70 / 50 J", "", "&7⇨&eChuột phải&7 để sử dụng", "&7⇨ &eShift + Chuột phải&7 để đổi chế độ", "", "&7[Thiết bị kĩ thuật]" });
	public static ItemStack DAMASCUS_STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9Đa công cụ &7- &eV", new String[] { "", "&8⇨ &7Nguyên liệu: &bDamascus Steel", "&8⇨ &e⚡ &70 / 60 J", "", "&7⇨&eChuột phải&7 để sử dụng", "&7⇨ &eShift + Chuột phải&7 để đổi chế độ", "", "&7[Thiết bị kĩ thuật]" });
	public static ItemStack REINFORCED_ALLOY_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9Đa công cụ &7- &eVI", new String[] { "", "&8⇨ &7Nguyên liệu: &bReinforced Alloy", "&8⇨ &e⚡ &70 / 75 J", "", "&7⇨&eChuột phải&7 để sử dụng", "&7⇨ &eShift + Chuột phải&7 để đổi chế độ", "", "&7[Thiết bị kĩ thuật]" });
	public static ItemStack CARBONADO_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9Đa công cụ &7- &eVII", new String[] { "", "&8⇨ &7Nguyên liệu: &bCarbonado", "&8⇨ &e⚡ &70 / 100 J", "", "&7⇨&eChuột phải&7 để sử dụng", "&7⇨ &eShift + Chuột phải&7 để đổi chế độ", "", "&7[Thiết bị kĩ thuật]" });
	
	/*		 Food 		*/
	public static ItemStack FORTUNE_COOKIE = new CustomItem(Material.COOKIE, "&6Bánh quy may mắn", 0, new String[] { "", "&fThì thầm những lời kì lạ", "", "&7[Thực phẩm]" });
	public static ItemStack BEEF_JERKY = new CustomItem(Material.COOKED_BEEF, "&6Thịt bò khô", 0, new String[] { "", "&9Bão hòa", "", "&7[Thực phẩm]" });
	public static ItemStack MAGIC_SUGAR = new CustomItem(Material.SUGAR, "&6Bột thần kì", 0, new String[] { "", "&fTăng tốc cực đại", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Thực phẩm]" });
	public static ItemStack MONSTER_JERKY = new CustomItem(Material.ROTTEN_FLESH, "&6Thịt Zombie khô", 0, new String[] { "", "&fKhông bị đói khi ăn", "", "&7[Thực phẩm]" });
	public static ItemStack APPLE_JUICE = new CustomPotion("&cNước ép Táo", 8197, new String[] { "", "&7[Thực phẩm]" }, new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack MELON_JUICE = new CustomPotion("&cNước ép Dưa", 8197, new String[] { "", "&7[Thực phẩm]" }, new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack CARROT_JUICE = new CustomPotion("&6Nước ép Cà rốt", 8195, new String[] { "", "&7[Thực phẩm]" }, new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack PUMPKIN_JUICE = new CustomPotion("&6Nước ép Bí ngô", 8195, new String[] { "", "&7[Thực phẩm]" }, new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack GOLDEN_APPLE_JUICE = new CustomPotion("&bNước ép Táo vàng", 8195, new String[] { "", "&7[Thực phẩm]" }, new PotionEffect(PotionEffectType.ABSORPTION, 400, 0));
	
	/*		Christmas		*/
	public static ItemStack CHRISTMAS_MILK = new CustomPotion("&6Ly sữa", 8194, new String[] { "", "&7[Giáng sinh]" }, new PotionEffect(PotionEffectType.SATURATION, 5, 0));
	public static ItemStack CHRISTMAS_CHOCOLATE_MILK = new CustomPotion("&6Chocolate Sữa", 8201, new String[] { "", "&7[Giáng sinh]" }, new PotionEffect(PotionEffectType.SATURATION, 12, 0));
	public static ItemStack CHRISTMAS_EGG_NOG = new CustomPotion("&aCocktail trứng sữa", 8194, new String[] { "", "&7[Giáng sinh]" }, new PotionEffect(PotionEffectType.SATURATION, 7, 0));
	public static ItemStack CHRISTMAS_APPLE_CIDER = new CustomPotion("&cRượu táo", 8197, new String[] { "", "&7[Giáng sinh]" }, new PotionEffect(PotionEffectType.SATURATION, 14, 0));
	public static ItemStack CHRISTMAS_COOKIE = new CustomItem(Material.COOKIE, "&aBánh quy giáng sinh", 0, new String[] { "", "&7[Giáng sinh]" });
	public static ItemStack CHRISTMAS_FRUIT_CAKE = new CustomItem(Material.PUMPKIN_PIE, "&fBánh trái cây", 0, new String[] { "", "&7[Giáng sinh]" });
  	public static ItemStack CHRISTMAS_APPLE_PIE = new CustomItem(Material.PUMPKIN_PIE, "&rBánh táo", 0, new String[] { "", "&7[Giáng sinh]" });
  	public static ItemStack CHRISTMAS_HOT_CHOCOLATE = new CustomPotion("&6Chocolate Nóng", 8201, new String[] { "", "&7[Giáng sinh]" }, new PotionEffect(PotionEffectType.SATURATION, 14, 0));
  	public static ItemStack CHRISTMAS_CAKE = new CustomItem(Material.PUMPKIN_PIE, "&6Bánh giáng sinh", 0, new String[] { "", "&7[Giáng sinh]" });
  	public static ItemStack CHRISTMAS_CARAMEL = new CustomItem(Material.CLAY_BRICK, "&6Caramel", 0, new String[] { "", "&7[Giáng sinh]" });
  	public static ItemStack CHRISTMAS_CARAMEL_APPLE = new CustomItem(Material.APPLE, "&6Caramel Táo", 0, new String[] { "", "&7[Giáng sinh]" });
  	public static ItemStack CHRISTMAS_CHOCOLATE_APPLE = new CustomItem(Material.APPLE, "&6Táo Chocolate", 0, new String[] { "", "&7[Giáng sinh]" });
  	public static ItemStack CHRISTMAS_PRESENT = new CustomItem(Material.CHEST, "&6Quà giáng sinh", 0, new String[] { "", "&7Từ: &emrCookieSlime", "&7Đến: &eBạn", "", "&7⇨&eChuột phải&7 để mở" });
	/*     */ 
	/*		Easter			*/
  	public static ItemStack EASTER_EGG = new CustomItem(Material.EGG, "&rTrứng phục sinh", 0, new String[] { "", "&7[Lễ phục sinh]" });
  	public static ItemStack EASTER_CARROT_PIE = new CustomItem(Material.PUMPKIN_PIE, "&6Bánh bí", 0, new String[] { "", "&7[Lễ phục sinh]" });
 
	/*		 Weapons 		*/
  	public static ItemStack GRANDMAS_WALKING_STICK = new CustomItem(Material.STICK, "&eGậy bật lùi &7-&f I", 0, new String[] { "", "&7[Vũ khí]" }, new String[] { "KNOCKBACK-2" });
    public static ItemStack GRANDPAS_WALKING_STICK = new CustomItem(Material.STICK, "&eGậy bật lùi &7-&f II", 0, new String[] { "", "&7[Vũ khí]" }, new String[] { "KNOCKBACK-5" });
  	public static ItemStack SWORD_OF_BEHEADING = new CustomItem(Material.IRON_SWORD, "&6Sát kiếm", 0, new String[] { "&7Beheading II", "", "&fTăng tỉ lệ drop đầu mob", "", "&7[Vũ khí]" });
  	public static ItemStack BLADE_OF_VAMPIRES = new CustomItem(Material.GOLD_SWORD, "&cQuỷ kiếm", 0, new String[] { "&7Life Steal I", "", "&f45% khả năng hồi 2 &c❤", "&fmỗi khi tấn công kẻ địch", "", "&7[Vũ khí]" }, new String[] { "FIRE_ASPECT-2", "DURABILITY-4", "DAMAGE_ALL-2" });
  	public static ItemStack SEISMIC_AXE = new CustomItem(Material.IRON_AXE, "&aRìu chấn động", 0, new String[] { "", "&fTriệu hồi động đất", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vũ khí]" });
	
	/*		Bows		*/
  	public static ItemStack EXPLOSIVE_BOW = new CustomItem(Material.BOW, "&cCung nổ", 0, new String[] { "", "&fTạo vụ nổ khi mũi tên đâm trúng kẻ thù", "", "&7[Vũ khí]" });
	public static ItemStack ICY_BOW = new CustomItem(Material.BOW, "&bCung băng", 0, new String[] { "", "&fLàm chậm &e2 giây&f đối với kẻ trúng tên", "", "&7[Vũ khí]" });
	
	/*		 Tools		*/
	public static ItemStack MULTI_TOOL = new CustomItem(Material.DIAMOND_PICKAXE, "&bĐa công cụ", 0, new String[] { "", "&bCúp - Rìu - Xẻng","&7Ấn vào block để đổi", "", "&7[Công cụ]" });
	public static ItemStack AUTO_SMELT_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&6Cúp dung nham", 0, new String[] { "", "&cNung mọi quặng đào được", "", "&7[Công cụ]" });
	public static ItemStack LUMBER_AXE = new CustomItem(Material.DIAMOND_AXE, "&6Rìu tiều phu", 0, new String[] { "", "&bMột chặt bay cây =))", "", "&7[Công cụ]" });
	public static ItemStack PICKAXE_OF_CONTAINMENT = new CustomItem(Material.IRON_PICKAXE, "&cCúp nhẹ nhàng", 0, new String[] { "", "&bCó thể phá lồng Spawner thường", "", "&7[Công cụ]" });
	public static ItemStack HERCULES_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9Cúp Hercules", 0, new String[] { "", "&fNghiền mọi quặng đào được thành bột", "", "&7[Công cụ]" }, new String[] { "DURABILITY-2", "DIG_SPEED-4" });
	public static ItemStack HAMMER = new CustomItem(Material.IRON_PICKAXE, "&9Búa sắt", 0, new String[] {"", "&7[Công cụ]" });
	public static ItemStack EXPLOSIVE_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&eCúp nổ", 0, new String[] { "", "&bTạo một vụ nổ mỗi khi phá 1 block", "", "&7[Công cụ]" });
  	public static ItemStack PICKAXE_OF_THE_SEEKER = new CustomItem(Material.DIAMOND_PICKAXE, "&aCúp tìm kiếm", 0, new String[] { "", "&bXác định quặng gần bạn nhất", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Công cụ]" });
  	public static ItemStack COBALT_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9Cúp Cobalt", 0, new String[] { "", "&7[Công cụ]" }, new String[] { "DURABILITY-4", "DIG_SPEED-6" });
  	public static ItemStack PICKAXE_OF_VEIN_MINING = new CustomItem(Material.DIAMOND_PICKAXE, "&eCúp khai phá", 0, new String[] { "", "&bTự phá các quặng cùng loại ở gần", "&bmỗi khi bạn đào một quặng nào đó", "", "&7[Công cụ]" });
	/*     */
	/*		 Armor 		*/
  	public static ItemStack GLOWSTONE_HELMET = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&eMũ phát sáng", 0, new String[] { "", "&f[&7+&9Night Vision&f]", "", "&7[Giáp ma thuật]" }), Color.YELLOW);
  	public static ItemStack GLOWSTONE_CHESTPLATE = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&eÁo phát sáng", 0, new String[] { "", "&f[&7+&9Night Vision&f]", "", "&7[Giáp ma thuật]" }), Color.YELLOW);
  	public static ItemStack GLOWSTONE_LEGGINGS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&eQuần phát sáng", 0, new String[] { "", "&f[&7+&9Night Vision&f]", "", "&7[Giáp ma thuật]" }), Color.YELLOW);
  	public static ItemStack GLOWSTONE_BOOTS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&eỦng phát sáng", 0, new String[] { "", "&f[&7+&9Night Vision&f]", "", "&7[Giáp ma thuật]" }), Color.YELLOW);
  	public static ItemStack ENDER_HELMET = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&5Mũ Ender", 0, new String[] { "", "&7[Giáp ma thuật]" }), Color.fromRGB(28, 25, 112));
  	public static ItemStack ENDER_CHESTPLATE = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&5Áo Ender", 0, new String[] { "", "&7[Giáp ma thuật]" }), Color.fromRGB(28, 25, 112));
  	public static ItemStack ENDER_LEGGINGS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&5Quần Ender", 0, new String[] { "", "&7[Giáp ma thuật]" }), Color.fromRGB(28, 25, 112));
  	public static ItemStack ENDER_BOOTS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&5Ủng Ender", 0, new String[] { "", "&f[&9Sử dụng &eNgọc Ender&9 không chịu sát thương&f]", "", "&7[Giáp ma thuật]" }), Color.fromRGB(28, 25, 112));
  	public static ItemStack SLIME_HELMET = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&aMũ bóng nhờn", 0, new String[] { "", "&7[Giáp ma thuật]" }), Color.LIME);
  	public static ItemStack SLIME_CHESTPLATE = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&aÁo bóng nhờn", 0, new String[] { "", "&7[Giáp ma thuật]" }), Color.LIME);
  	public static ItemStack SLIME_LEGGINGS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&aQuần bóng nhờn", 0, new String[] { "", "&f[&7+&9Speed&f]", "", "&7[Giáp ma thuật]" }), Color.LIME);
  	public static ItemStack SLIME_BOOTS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&aỦng bóng nhờn", 0, new String[] { "", "&f[&7+&9Jump Boost&f]", "&f[&7+&9Miễn sát thương rơi&f]", "", "&7[Giáp ma thuật]" }), Color.LIME);
  	public static ItemStack CACTUS_HELMET = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&2Mũ xương rồng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "THORNS-3", "DURABILITY-5" }), Color.GREEN);
  	public static ItemStack CACTUS_CHESTPLATE = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2Áo xương rồng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "THORNS-3", "DURABILITY-5" }), Color.GREEN);
  	public static ItemStack CACTUS_LEGGINGS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&2Quần xương rồng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "THORNS-3", "DURABILITY-5" }), Color.GREEN);
  	public static ItemStack CACTUS_BOOTS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2Ủng xương rồng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "THORNS-3", "DURABILITY-5" }), Color.GREEN);
  	public static ItemStack DAMASCUS_STEEL_HELMET = new CustomItem(Material.IRON_HELMET, "&7Mũ thép Damscus", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4" });
  	public static ItemStack DAMASCUS_STEEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&7Áo thép Damscus", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4" });
  	public static ItemStack DAMASCUS_STEEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&7Quần thép Damscus", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4" });
  	public static ItemStack DAMASCUS_STEEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&7Ủng thép Damscus", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4" });
  	public static ItemStack REINFORCED_ALLOY_HELMET = new CustomItem(Material.IRON_HELMET, "&bMũ hợp kim", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9" });
  	public static ItemStack REINFORCED_ALLOY_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&bÁo hợp kim", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9" });
  	public static ItemStack REINFORCED_ALLOY_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&bQuần hợp kim", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9" });
  	public static ItemStack REINFORCED_ALLOY_BOOTS = new CustomItem(Material.IRON_BOOTS, "&bỦng hợp kim", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9" });
  	public static ItemStack SCUBA_HELMET = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&cMũ lặn", 0, new String[] { "", "&f[&7+&9Water Breathing&f]", "&fMột phần của đồ bảo hộ", "", "&7[Giáp thường]" }), Color.ORANGE);
  	public static ItemStack HAZMATSUIT_CHESTPLATE = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&cÁo bảo hộ", 0, new String[] { "", "&f[&7+&9Fire Resistance&f]", "&fMột phần của đồ bảo hộ", "", "&7[Giáp thường]" }), Color.ORANGE);
  	public static ItemStack HAZMATSUIT_LEGGINGS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&cQuần bảo hộ", 0, new String[] { "", "&fMột phần của đồ bảo hộ", "", "&7[Giáp thường]" }), Color.ORANGE);
  	public static ItemStack RUBBER_BOOTS = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&cGiày bảo hộ", 0, new String[] { "", "&fMột phần của đồ bảo hộ", "", "&7[Giáp thường]" }), Color.BLACK);
  	public static ItemStack GILDED_IRON_HELMET = new CustomItem(Material.GOLD_HELMET, "&6Mũ sắt mạ vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8" });
  	public static ItemStack GILDED_IRON_CHESTPLATE = new CustomItem(Material.GOLD_CHESTPLATE, "&6Áo sắt mạ vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8" });
  	public static ItemStack GILDED_IRON_LEGGINGS = new CustomItem(Material.GOLD_LEGGINGS, "&6Quần sắt mạ vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8" });
  	public static ItemStack GILDED_IRON_BOOTS = new CustomItem(Material.GOLD_BOOTS, "&6Ủng sắt mạ vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8" });
  	public static ItemStack GOLD_HELMET = new CustomItem(Material.GOLD_HELMET, "&6Mũ vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10" });
  	public static ItemStack GOLD_CHESTPLATE = new CustomItem(Material.GOLD_CHESTPLATE, "&6Áo vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10" });
  	public static ItemStack GOLD_LEGGINGS = new CustomItem(Material.GOLD_LEGGINGS, "&6Quần vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10" });
  	public static ItemStack GOLD_BOOTS = new CustomItem(Material.GOLD_BOOTS, "&6Ủng vàng", 0, new String[] { "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10" });
  	public static ItemStack SLIME_HELMET_STEEL = new CustomItem(Material.IRON_HELMET, "&aMũ bóng nhờn", 0, new String[] { "", "&f[&9Đã được gia cố&f]", "", "&7[Giáp ma thuật]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2" });
  	public static ItemStack SLIME_CHESTPLATE_STEEL = new CustomItem(Material.IRON_CHESTPLATE, "&aÁo bóng nhờn", 0, new String[] { "", "&f[&9Đã được gia cố&f]", "", "&7[Giáp ma thuật]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2" });
  	public static ItemStack SLIME_LEGGINGS_STEEL = new CustomItem(Material.IRON_LEGGINGS, "&aQuần bóng nhờn", 0, new String[] { "", "&f[&9Đã được gia cố&f]", "&f[&7+&9Speed&f]", "", "&7[Giáp ma thuật]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2" });
  	public static ItemStack SLIME_BOOTS_STEEL = new CustomItem(Material.IRON_BOOTS, "&aỦng bóng nhờn", 0, new String[] { "", "&f[&9Đã được gia cố&f]", "&f[&7+&9Jump Boost&f]", "&f[&7+&9Miễn sát thương rơi&f]", "", "&7[Giáp ma thuật]" }, new String[] { "DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2" });
  	public static ItemStack BOOTS_OF_THE_STOMPER = (ItemStack)new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&bỦng ma thuật", 0, new String[] { "", "&fSát thương rơi nhận được sẽ truyền cho", "&fmob hoặc người chơi gần đó", "", "&f[&7+&9Miễn sát thương rơi&f]", "", "&7[Giáp ma thuật]" }), Color.AQUA);
  	public static ItemStack HEAVY_METAL_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ siêu cường", 0, new String[] { "", "&f[&7+&9Strength&f]", "&f[&7+&9Slowness&f]", "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10" });
  	public static ItemStack HEAVY_METAL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo siêu cường", 0, new String[] { "", "&f[&7+&9Strength&f]", "&f[&7+&9Slowness&f]", "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10" });
  	public static ItemStack HEAVY_METAL_LEGGINGS = new CustomItem(Material.IRON_CHESTPLATE, "&cQuần siêu cường", 0, new String[] { "", "&f[&7+&9Strength&f]", "&f[&7+&9Slowness&f]", "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10" });
  	public static ItemStack HEAVY_METAL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cỦng siêu cường", 0, new String[] { "", "&f[&7+&9Strength&f]", "&f[&7+&9Slowness&f]", "", "&7[Giáp thường]" }, new String[] { "DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10" });
  	public static ItemStack CHAIN_HELMET = new CustomItem(Material.CHAINMAIL_HELMET, "&bMũ xích", 0, new String[] { "", "&7[Giáp thường]" });
  	public static ItemStack CHAIN_CHESTPLATE = new CustomItem(Material.CHAINMAIL_CHESTPLATE, "&bMũ xích", 0, new String[] { "", "&7[Giáp thường]" });
  	public static ItemStack CHAIN_LEGGINGS = new CustomItem(Material.CHAINMAIL_LEGGINGS, "&bMũ xích", 0, new String[] { "", "&7[Giáp thường]" });
  	public static ItemStack CHAIN_BOOTS = new CustomItem(Material.CHAINMAIL_BOOTS, "&bMũ xích", 0, new String[] { "", "&7[Giáp thường]" });
 
	/*		 Misc 		*/
  	public static ItemStack MAGIC_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&6Tinh thể Ma thuật", 0, new String[] { "", "&cCấp: I", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack MAGIC_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&6Tinh thể Ma thuật", 0, new String[] { "", "&cCấp: II", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack MAGIC_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&6Tinh thể Ma thuật", 0, new String[] { "", "&cCấp: III", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack ENDER_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&5Tinh thể Ender", 0, new String[] { "", "&cCấp: I", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack ENDER_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&5Tinh thể Ender", 0, new String[] { "", "&cCấp: II", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack ENDER_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&5Tinh thể Ender", 0, new String[] { "", "&cCấp: III", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack MAGICAL_BOOK_COVER = new CustomItem(Material.PAPER, "&6Thần chú pháp sư", 0, new String[] { "", "&cChứa những câu thần chú đặc biệt", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack MAGICAL_GLASS = new CustomItem(Material.THIN_GLASS, "&6Thủy tinh ma thuật", 0, new String[] { "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack BASIC_CIRCUIT_BOARD = new CustomItem(Material.ACTIVATOR_RAIL, "&bBảng mạch cơ bản", 0, new String[] { "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack ADVANCED_CIRCUIT_BOARD = new CustomItem(Material.POWERED_RAIL, "&bBảng mạch nâng cao", 0, new String[] { "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack WHEAT_FLOUR = new CustomItem(Material.SUGAR, "&rBột mì", 0, new String[] { "", "&7[Thực phẩm]" });
  	public static ItemStack STEEL_PLATE = new CustomItem(Material.PAPER, "&bTấm thép", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack COMPRESSED_CARBON = null;
  	public static ItemStack BATTERY = null;
  	public static ItemStack CARBON_CHUNK = null;
  	public static ItemStack STEEL_THRUSTER = new CustomItem(Material.BUCKET, "&7Động cơ đẩy", 0, new String[] { "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack POWER_CRYSTAL = null;
  	public static ItemStack CHAIN = new CustomItem(Material.STRING, "&bDây xích", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack HOOK = new CustomItem(Material.FLINT, "&bCái móc", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack SIFTED_ORE = new CustomItem(Material.SULPHUR, "&6Tạp chất", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack STONE_CHUNK = null;
  	public static ItemStack LAVA_CRYSTAL = null;
  	public static ItemStack SALT = new CustomItem(Material.SUGAR, "&rMuối", 0, new String[] { "", "&7[Thực phẩm]" });
  	public static ItemStack BUTTER = null;
  	public static ItemStack CHEESE = null;
  	public static ItemStack HEAVY_CREAM = new CustomItem(Material.SNOW_BALL, "&rKem tươi", 0, new String[] { "", "&7[Thực phẩm]" });
  	public static ItemStack CRUSHED_ORE = new CustomItem(Material.SULPHUR, "&6Hỗn hợp nghiền", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack PULVERIZED_ORE = new CustomItem(Material.SULPHUR, "&6Hỗn hợp mịn", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack PURE_ORE_CLUSTER = new CustomItem(Material.SULPHUR, "&6Hỗn hợp tinh khiết", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack TINY_URANIUM = null;
  	public static ItemStack SMALL_URANIUM = null;
  	public static ItemStack MAGNET = null;
  	public static ItemStack NECROTIC_SKULL = new CustomItem((new MaterialData(Material.SKULL_ITEM, (byte)1)).toItemStack(1), "&cSọ hắc ám", new String[] { "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack ESSENCE_OF_AFTERLIFE = new CustomItem(Material.SULPHUR, "&4Bụi tái sinh", 0, new String[] { "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack ELECTRO_MAGNET = null;
  	public static ItemStack HEATING_COIL = null;
  	public static ItemStack COOLING_UNIT = null;
  	public static ItemStack ELECTRIC_MOTOR = null;
  	public static ItemStack CARGO_MOTOR = null;
  	public static ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new CustomItem(Material.PAPER, "&6Giấy ma pháp", 0, new String[] { "", "&cĐiều khiển mọi thực thể phía trước", "&cKhiến chúng quay ra sau lưng (180⁰)", "", "&7[Tiện ích ma thuật]" });
  	public static ItemStack TOME_OF_KNOWLEDGE_SHARING = new CustomItem(Material.BOOK, "&6Sách kiến thức", 0, new String[] { "&fChủ: &bNone", "", "&7⇨&eChuột phải&7: sao chép kiến thức của bạn vào sách", "&7 Hoặc", "&7⇨&eChuột phải&7: tìm hiểu những gì có trong sách", "", "&7[Tiện ích ma thuật]" });
  	public static ItemStack HARDENED_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)8), "&7Kính cường lực", new String[] { "", "&rChịu được vụ nổ", "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack WITHER_PROOF_OBSIDIAN = new CustomItem(Material.OBSIDIAN, "&5Hắc diện thạch Wither", 0, new String[] { "", "&rChịu được vụ nổ", "&rChịu được Wither boss", "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack WITHER_PROOF_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)15), "&5Kính Wither", new String[] { "", "&rChịu được vụ nổ", "&rChịu được Wither boss", "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack REINFORCED_PLATE = new CustomItem(Material.PAPER, "&bTấm hợp kim gia cố", 0, new String[] { "", "&7[Linh tinh]" });
  	public static ItemStack ANCIENT_PEDESTAL = new CustomItem(Material.DISPENSER, "&dTrụ đỡ", 0, new String[] { "", "&5Một phần của bệ cổ ma thuật", "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack ANCIENT_ALTAR = new CustomItem(Material.ENCHANTMENT_TABLE, "&dBệ cổ ma thuật", 0, new String[] { "", "&5Thực hiện các nghi thức đặc biệt", "", "&7[Tiện ích ma thuật]" });
  	public static ItemStack DUCT_TAPE = null;
   
  	public static ItemStack RAINBOW_WOOL = new CustomItem(new MaterialData(Material.WOOL), "&5Len đa sắc", new String[] { "", "&7[Tiện ích ma thuật]" });
  	public static ItemStack RAINBOW_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5Kính đa sắc", new String[] { "", "&7[Tiện ích ma thuật]" });
  	public static ItemStack RAINBOW_CLAY = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5Đất sét đa sắc", new String[] { "", "&7[Tiện ích ma thuật]" });
  	public static ItemStack RAINBOW_GLASS_PANE = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5Tấm kính đa sắc", new String[] { "", "&7[Tiện ích ma thuật]" });
   
  	public static ItemStack RAINBOW_WOOL_XMAS = new CustomItem(new MaterialData(Material.WOOL), "&5Len đa sắc", new String[] { "", "&7[&aGiáng &csinh&7]" });
  	public static ItemStack RAINBOW_GLASS_XMAS = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5Kính đa sắc", new String[] { "", "&7[&aGiáng &csinh&7]" });
  	public static ItemStack RAINBOW_CLAY_XMAS = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5Đất sét đa sắc", new String[] { "", "&7[&aGiáng &csinh&7]" });
  	public static ItemStack RAINBOW_GLASS_PANE_XMAS = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5Tấm kính đa sắc", new String[] { "", "&7[&aGiáng &csinh&7]" });
   
  	public static ItemStack RAINBOW_WOOL_VALENTINE = new CustomItem(new MaterialData(Material.WOOL), "&5Len đa sắc", new String[] { "", "&7[&dLễ tình nhân7]" });
  	public static ItemStack RAINBOW_GLASS_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5Kính đa sắc", new String[] { "", "&7[&dLễ tình nhân7]" });
  	public static ItemStack RAINBOW_CLAY_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5Đất sét đa sắc", new String[] { "", "&7[&dLễ tình nhân7]" });
  	public static ItemStack RAINBOW_GLASS_PANE_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5Tấm kính đa sắc", new String[] { "", "&7[&dLễ tình nhân7]" });
 
    /**/  
  	public static ItemStack COPPER_INGOT = new CustomItem(Material.CLAY_BRICK, "&bCopper Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack COPPER_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bCopper&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_UNDEAD-2"});
  	public static ItemStack COPPER_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bCopper&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
  	public static ItemStack COPPER_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bCopper&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
  	public static ItemStack COPPER_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bCopper&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
  	public static ItemStack COPPER_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bCopper&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
    /**/
  	public static ItemStack TIN_INGOT = new CustomItem(Material.IRON_INGOT, "&bTin Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack TIN_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bTin&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-1"});
  	public static ItemStack TIN_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bTin&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
  	public static ItemStack TIN_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bTin&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
  	public static ItemStack TIN_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bTin&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
  	public static ItemStack TIN_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bTin&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2"});
  	/**/
  	public static ItemStack SILVER_INGOT = new CustomItem(Material.IRON_INGOT, "&bSilver Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack SILVER_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bSilver&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-2"});
  	public static ItemStack SILVER_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bSilver&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2"});
  	public static ItemStack SILVER_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bSilver&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2"});
  	public static ItemStack SILVER_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bSilver&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2"});
  	public static ItemStack SILVER_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bSilver&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2"});
  	/**/
  	public static ItemStack ALUMINUM_INGOT = new CustomItem(Material.IRON_INGOT, "&bAluminum Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack ALUMINUM_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bAluminum&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ARTHROPODS-3"});
  	public static ItemStack ALUMINUM_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bAluminum&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2", "DURABILITY-2"});
  	public static ItemStack ALUMINUM_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bAluminum&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2", "DURABILITY-2"});
  	public static ItemStack ALUMINUM_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bAluminum&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2", "DURABILITY-2"});
  	public static ItemStack ALUMINUM_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bAluminum&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_EXPLOSIONS-2", "DURABILITY-2"});
  	/**/
  	public static ItemStack LEAD_INGOT = new CustomItem(Material.IRON_INGOT, "&bLead Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack LEAD_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bLead&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-3", "DURABILITY-8"});
  	public static ItemStack LEAD_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bLead&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-8"});
  	public static ItemStack LEAD_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bLead&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-8"});
  	public static ItemStack LEAD_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bLead&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-8"});
  	public static ItemStack LEAD_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bLead&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-8"});
  	/**/
  	public static ItemStack ZINC_INGOT = new CustomItem(Material.IRON_INGOT, "&bZinc Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack ZINC_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bZinc&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-2"});
  	public static ItemStack ZINC_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bZinc&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3"});
  	public static ItemStack ZINC_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bZinc&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3"});
  	public static ItemStack ZINC_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bZinc&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3"});
  	public static ItemStack ZINC_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bZinc&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3"});
  	/**/
  	public static ItemStack MAGNESIUM_INGOT = new CustomItem(Material.IRON_INGOT, "&bMagnesium Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack MAGNESIUM_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bMagnesium&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-2", "DURABILITY-5"});
  	public static ItemStack MAGNESIUM_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bMagnesium&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2", "DURABILITY-5"});
  	public static ItemStack MAGNESIUM_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bMagnesium&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2", "DURABILITY-5"});
  	public static ItemStack MAGNESIUM_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bMagnesium&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2", "DURABILITY-5"});
  	public static ItemStack MAGNESIUM_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bLead&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-2", "DURABILITY-5"});
  	/**/
  	public static ItemStack STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&bSteel Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack STEEL_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bSteel&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-5", "DURABILITY-6"});
  	public static ItemStack STEEL_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bSteel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-4"});
  	public static ItemStack STEEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bSteel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-4"});
  	public static ItemStack STEEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bSteel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-4"});
  	public static ItemStack STEEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bSteel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-4"});
  	/**/
  	public static ItemStack BRONZE_INGOT = new CustomItem(Material.CLAY_BRICK, "&bBronze Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack BRONZE_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bBronze&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-3", "DURABILITY-6"});
  	/**/
  	public static ItemStack DURALUMIN_INGOT = new CustomItem(Material.IRON_INGOT, "&bDuralumin Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack DURALUMIN_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bDuralumin&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-3", "DURABILITY-6"});

  	/**/
  	public static ItemStack BILLON_INGOT = new CustomItem(Material.IRON_INGOT, "&bBillon Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack BILLON_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bBillon&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-4", "DURABILITY-5"});
	
  	/**/
  	public static ItemStack BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&bBrass Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack BRASS_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bBrass&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_UNDEAD-4", "DURABILITY-6"});
  	/**/
  	public static ItemStack ALUMINUM_BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&bAluminum Brass Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack ALUMINUM_BRASS_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bAluminum Brass&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ARTHROPODS-4", "DURABILITY-4"});
  	/**/
  	public static ItemStack ALUMINUM_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&bAluminum Bronze Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack ALUMINUM_BRONZE_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bAluminum Bronze&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ARTHROPODS-4", "DURABILITY-5"});
  	/**/
  	public static ItemStack CORINTHIAN_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&bCorinthian Bronze Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack CORINTHIAN_BRONZE_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bCorinthian Bronze&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-5", "DURABILITY-5"});
  	/**/
  	public static ItemStack SOLDER_INGOT = new CustomItem(Material.IRON_INGOT, "&bSolder Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack SOLDER_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bSolder&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-4", "DURABILITY-6"});
 	/**/
  	public static ItemStack DAMASCUS_STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&bDamascus Steel Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack DAMASCUS_STEEL_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bDamascus Steel&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-6", "DURABILITY-7"});
  	/**/
  	public static ItemStack HARDENED_METAL_INGOT = new CustomItem(Material.IRON_INGOT, "&bHardened Metal", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack HARDENED_METAL_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bHardened Metal&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-7", "DURABILITY-10"});
  	/**/
  	public static ItemStack REINFORCED_ALLOY_INGOT = new CustomItem(Material.IRON_INGOT, "&bReinforced Alloy Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack REINFORCED_ALLOY_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bReinforced Alloy&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-8", "DURABILITY-8"});
  	/**/
  	public static ItemStack FERROSILICON = new CustomItem(Material.IRON_INGOT, "&6Ferrosilicon", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack FERROSILICON_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&6Ferrosilicon&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-8", "DURABILITY-4"});
  	/**/
  	public static ItemStack GILDED_IRON = new CustomItem(Material.GOLD_INGOT, "&6Sắt mạ vàng", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GILDED_SWORD = new CustomItem(Material.GOLD_SWORD, "&cKiếm &7[&6Sắt mạ vàng&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ARTHROPODS-8", "DURABILITY-10"});
  	/**/
  	public static ItemStack NICKEL_INGOT = new CustomItem(Material.IRON_INGOT, "&bNickel Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack NICKEL_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&bNickel&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-6", "DURABILITY-5"});
  	public static ItemStack NICKEL_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&bNickel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-5", "DURABILITY-5"});
  	public static ItemStack NICKEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&bNickel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-5", "DURABILITY-5"});
  	public static ItemStack NICKEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&bNickel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-5", "DURABILITY-5"});
  	public static ItemStack NICKEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&bNickel&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-5", "DURABILITY-5"});
  	/**/
  	public static ItemStack COBALT_INGOT = new CustomItem(Material.IRON_INGOT, "&9Cobalt Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack COBALT_SWORD = new CustomItem(Material.IRON_SWORD, "&cKiếm &7[&9Cobalt&7]", 0, new String[] { "", "&7[Vũ khí II]" }, new String[] { "DAMAGE_ALL-7", "DURABILITY-7"});
  	public static ItemStack COBALT_HELMET = new CustomItem(Material.IRON_HELMET, "&cMũ &7[&9Cobalt&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-7", "DURABILITY-7"});
  	public static ItemStack COBALT_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&cÁo &7[&9Cobalt&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-7", "DURABILITY-7"});
  	public static ItemStack COBALT_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&cQuần &7[&9Cobalt&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-7", "DURABILITY-7"});
  	public static ItemStack COBALT_BOOTS = new CustomItem(Material.IRON_BOOTS, "&cGiày &7[&9Cobalt&7]", 0, new String[] { "", "&7[Giáp thường - II]" }, new String[] { "PROTECTION_ENVIRONMENTAL-7", "DURABILITY-7"});
  	
  	/**/
  	public static ItemStack REDSTONE_ALLOY = new CustomItem(Material.CLAY_BRICK, "&cRedstone Alloy Ingot", 0, new String[] { "", "&7[Tài nguyên]" });
  	/**/

  	/*  */ 
  	
  	public static ItemStack GOLD_4K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(4-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_6K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(6-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_8K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(8-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_10K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(10-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_12K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(12-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_14K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(14-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_16K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(16-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_18K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(18-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_20K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(20-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_22K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(22-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_24K = new CustomItem(Material.GOLD_INGOT, "&rThỏi vàng &7(24-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	/*  */ 
  	
  	public static ItemStack IRON_DUST = new CustomItem(Material.SULPHUR, "&6Iron Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack GOLD_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6Gold Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack TIN_DUST = new CustomItem(Material.SUGAR, "&6Tin Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack COPPER_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6Copper Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack SILVER_DUST = new CustomItem(Material.SUGAR, "&6Silver Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack ALUMINUM_DUST = new CustomItem(Material.SUGAR, "&6Aluminum Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack LEAD_DUST = new CustomItem(Material.SULPHUR, "&6Lead Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack SULFATE = new CustomItem(Material.GLOWSTONE_DUST, "&6Sulfate", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack ZINC_DUST = new CustomItem(Material.SUGAR, "&6Zinc Dust", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack MAGNESIUM_DUST = new CustomItem(Material.SUGAR, "&6Magnesium", 0, new String[] { "", "&7[Tài nguyên]" });

  	public static ItemStack CARBON = null;
  	public static ItemStack SILICON = null;
  	public static ItemStack GOLD_24K_BLOCK = new CustomItem(Material.GOLD_BLOCK, "&rKhối vàng &7(24-Carat)", 0, new String[] { "", "&7[Tài nguyên]" });
  	/*  */ 
  	
  	public static ItemStack SYNTHETIC_DIAMOND = new CustomItem(Material.DIAMOND, "&bKim cương tổng hợp", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack SYNTHETIC_SAPPHIRE = new CustomItem(new MaterialData(Material.INK_SACK, (byte)4), "&bLapis tổng hợp", new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack SYNTHETIC_EMERALD = new CustomItem(Material.EMERALD, "&bLục bảo tổng hợp", 0, new String[] { "", "&7[Tài nguyên]" });
  	public static ItemStack CARBONADO = null;
  	public static ItemStack RAW_CARBONADO = null;
  	public static ItemStack URANIUM = null;
  	public static ItemStack NEPTUNIUM = null;
  	public static ItemStack PLUTONIUM = null;
  	public static ItemStack BOOSTED_URANIUM = null;
  	/*  */ 
  	
  	public static ItemStack TALISMAN = new CustomItem(Material.EMERALD, "&6Ngọc hộ mệnh", 0, new String[] { "", "&7[Vật phẩm ma thuật]" });
  	public static ItemStack TALISMAN_ANVIL = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eAnvil&7]", 0, new String[] { "", "&rBảo vệ một công cụ khỏi bị vỡ", "&r(&bTiêu thụ 1 ngọc cho mỗi lần bảo vệ&f)", "", "&4⚠: &cKhông hoạt động với một số công cụ đặc biệt", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_MINER = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eMiner&7]", 0, new String[] { "", "&r20% gấp đôi vật phẩm drop khi &eKhai thác", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_HUNTER = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eHunter&7]", 0, new String[] { "", "&r20% gấp đôi vật phẩm drop khi &eGiết mob", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_LAVA = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eLava Walker&7]", 0, new String[] { "", "&fNhận được hiệu ứng: &9Kháng lửa", "&rkhi chạm vào Lava", "&r(&bTiêu thụ 1 ngọc cho mỗi lần nhận hiệu ứng&f)", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_WATER = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eWater Breather&7] ", 0, new String[] { "", "&fNhận được hiệu ứng: &9Thở dưới nước", "&fkhi hết hơi", "&r(&bTiêu thụ 1 cho ngọc mỗi lần nhận hiệu ứng&f)", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_ANGEL = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eAngel&7]", 0, new String[] { "", "&f75% Miễn nhiễm sát thương rơi", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_FIRE = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eFireFighter&7]", 0, new String[] { "", "&fNhận được hiệu ứng: &9Kháng lửa", "&rkhi bị cháy", "&r(&bTiêu thụ 1 ngọc cho mỗi lần nhận hiệu ứng&r)", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_MAGICIAN = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eMagician&7]", 0, new String[] { "", "&f80% Nhận được thêm một phù phép phụ khi enchant", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_TRAVELLER = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eTraveller&7]", 0, new String[] { "", "&f60% Nhận được hiệu ứng: &9Tốc độ", "&rkhi chạy nhanh", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_WARRIOR = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eWarrior&7]", 0, new String[] { "", "&fNhận được hiệu ứng: &9Sức mạnh", "&rkhi &ebị đánh", "&r(&bTiêu thụ 1 ngọc cho mỗi lần nhận hiệu ứng&f)", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_KNIGHT = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eKnight&7]", 0, new String[] { "", "&f30% Nhận được hiệu ứng: &9Hồi máu", "&rkhi &ebị đánh", "&r(&bTiêu thụ 1 ngọc cho mỗi lần nhận hiệu ứng&f)", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_WHIRLWIND = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eWhirlwind&7]", 0, new String[] { "", "&f50% Phản lại sát thương từ vật bắn", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_WIZARD = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eWizard&7]", 0, new String[] { "", "&fGiúp bạn có thể đạt được phù phép &eGia tài 4&f-&e5", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_CAVEMAN = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eCaveman&7]", 0, new String[] { "", "&f50% nhận được Haste khi đào quặng", "", "&7[Ngọc hộ mệnh]" });
  	public static ItemStack TALISMAN_WISE = new CustomItem(Material.EMERALD, "&aNgọc hộ mệnh &7[&eWise&7]", 0, new String[] { "", "&f20% gấp đôi số exp rơi ra", "&fkhi khai thác hoặc giết quái", "", "&7[Ngọc hộ mệnh]" });
 
  	public static ItemStack STAFF_ELEMENTAL = new CustomItem(Material.STICK, "&6Gậy nguyên tố", 0, new String[] { "", "&7[Tiện ích ma thuật]" });
  	public static ItemStack STAFF_WIND = new CustomItem(Material.STICK, "&6Gậy nguyên tố &7[&bGió&7]", 0, new String[] { "", "&bPhong kích:", "&7Triệu hồi cơn gió giúp hất người về phía trước", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Tiện ích ma thuật]" }, new String[] { "LUCK-1" });
  	public static ItemStack STAFF_FIRE = new CustomItem(Material.STICK, "&6Gậy nguyên tố &7[&cLửa&7]", 0, new String[] { "", "&7[Tiện ích ma thuật]" }, new String[] { "FIRE_ASPECT-5" });
  	public static ItemStack STAFF_WATER = new CustomItem(Material.STICK, "&6Gậy nguyên tố &7[&1Nước&7]", 0, new String[] { "", "&1Thủy hộ:", "&7Loại bỏ bất kì đám cháy nào có trên người", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Tiện ích ma thuật]" }, new String[] { "WATER_WORKER-1" });

  	public static ItemStack GRIND_STONE = new CustomItem(Material.DISPENSER, "&6Máy xay đá", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ARMOR_FORGE = new CustomItem(Material.ANVIL, "&6Máy làm giáp", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack SMELTERY = new CustomItem(Material.FURNACE, "&6Lò rèn", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack IGNITION_CHAMBER = new CustomItem(new ItemStack(Material.DROPPER), "&bMáy đánh lửa tự động", new String[] { "", "&rGiúp lửa của&6 Lò rèn&f không bị dập", "&rPhải đặt cạnh Dispenser của&6 Lò rèn&f và bỏ bật lửa vào trong", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ORE_CRUSHER = new CustomItem(Material.DISPENSER, "&6Máy nghiền", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack COMPRESSOR = new CustomItem(Material.PISTON_BASE, "&6Máy nén", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack PRESSURE_CHAMBER = new CustomItem(Material.GLASS, "&6Máy nén áp suất", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack MAGIC_WORKBENCH = new CustomItem(Material.WORKBENCH, "&6Bàn pháp sư", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ORE_WASHER = new CustomItem(Material.CAULDRON_ITEM, "&6Máy rửa quặng", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack SAW_MILL = new CustomItem(Material.IRON_FENCE, "&6Máy cưa gỗ", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack COMPOSTER = new CustomItem(Material.CAULDRON_ITEM, "&6Thùng ủ", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_CRAFTING_TABLE = new CustomItem(Material.WORKBENCH, "&6Bàn chế tạo cao cấp", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack CRUCIBLE = new CustomItem(Material.CAULDRON_ITEM, "&6Nồi nấu kim loại", 0, new String[] { "", "&7[Máy móc cơ bản]" });
  	public static ItemStack JUICER = new CustomItem(Material.GLASS_BOTTLE, "&6Máy ép trái cây", 0, new String[] { "", "&7[Máy móc cơ bản]" });
   
  	public static ItemStack SOLAR_PANEL = new CustomItem(Material.DAYLIGHT_DETECTOR, "&bBảng điều khiển năng lượng Mặt trời", 0, new String[] { "", "&aCó thể chuyển hóa ánh sáng Mặt trời thành điện", "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack SOLAR_ARRAY = new CustomItem(Material.DAYLIGHT_DETECTOR, "&bMảng năng lượng Mặt trời", 0, new String[] { "", "&aCó thể chuyển hóa ánh sáng Mặt trời thành điện", "", "&7[Linh kiện kĩ thuật]" });
  	public static ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&bMáy khai thác", 0, new String[] { "", "&aTự đào tất cả quặng trong phạm vi&e 4 x 4&a block" });
  	public static ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6Máy khai thác cao cấp", 0, new String[] { "", "&aTự đào tất cả quặng trong phạm vi&e 6 x 6&a block", "&aVà tự nghiền thành bột nếu có thể" });
  	public static ItemStack AUTOMATED_PANNING_MACHINE = new CustomItem(Material.BOWL, "&aMáy sàng", 0, new String[] { "", "&7[Máy móc cơ bản]" });
 
  	public static ItemStack HOLOGRAM_PROJECTOR = new CustomItem(new MaterialData(Material.STEP, (byte)7), "&bMáy chiếu ba chiều", new String[] { "", "&rChiếu các văn bản lơ lưng trên không", "", "&7[Thiết bị kĩ thuật]" });

  	public static ItemStack ENHANCED_FURNACE = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eI", 0, new String[] { "", "&7[&6Tốc độ: &e1x&7]", "&7[&cHiệu suất: &e1x&7]", "&7[&3May mắn: &e1x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_2 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eII", 0, new String[] { "", "&7[&6Tốc độ: &e2x&7]", "&7[&cHiệu suất: &e1x&7]", "&7[&3May mắn: &e1x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_3 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eIII", 0, new String[] { "", "&7[&6Tốc độ: &e2x&7]", "&7[&cHiệu suất: &e2x&7]", "&7[&3May mắn: &e1x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_4 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eIV", 0, new String[] { "", "&7[&6Tốc độ: &e3x&7]", "&7[&cHiệu suất: &e2x&7]", "&7[&3May mắn: &e1x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_5 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eV", 0, new String[] { "", "&7[&6Tốc độ: &e3x&7]", "&7[&cHiệu suất: &e2x&7]", "&7[&3May mắn: &e2x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_6 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eVI", 0, new String[] { "", "&7[&6Tốc độ: &e3x&7]", "&7[&cHiệu suất: &e3x&7]", "&7[&3May mắn: &e2x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_7 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eVII", 0, new String[] { "", "&7[&6Tốc độ: &e4x&7]", "&7[&cHiệu suất: &e3x&7]", "&7[&3May mắn: &e2x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_8 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eVIII", 0, new String[] { "", "&7[&6Tốc độ: &e4x&7]", "&7[&cHiệu suất: &e4x&7]", "&7[&3May mắn: &e2x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_9 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eIX", 0, new String[] { "", "&7[&6Tốc độ: &e5x&7]", "&7[&cHiệu suất: &e4x&7]", "&7[&3May mắn: &e2x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_10 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eX", 0, new String[] { "", "&7[&6Tốc độ: &e5x&7]", "&7[&cHiệu suất: &e5x&7]", "&7[&3May mắn: &e2x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack ENHANCED_FURNACE_11 = new CustomItem(Material.FURNACE, "&bLò nung cao cấp - &eXI", 0, new String[] { "", "&7[&6Tốc độ: &e5x&7]", "&7[&cHiệu suất: &e5x&7]", "&7[&3May mắn: &e3x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack REINFORCED_FURNACE = new CustomItem(Material.FURNACE, "&bLò nung được gia cố", 0, new String[] { "", "&7[&6Tốc độ: &e10x&7]", "&7[&cHiệu suất: &e10x&7]", "&7[&3May mắn: &e3x&7]", "", "&7[Máy móc cơ bản]" });
  	public static ItemStack CARBONADO_EDGED_FURNACE = new CustomItem(Material.FURNACE, "&bLò nung Carbonado", 0, new String[] { "", "&7[&6Tốc độ: &e20x", "&7[&cHiệu suất: &e10x&7]", "&7[&3May mắn: &e3x&7]", "", "&7[Máy móc cơ bản]" });

  	public static ItemStack BLOCK_PLACER = new CustomItem(Material.DISPENSER, "&aMáy đặt khối", 0, new String[] { "", "&rTự đặt các block được đặt bên trong", "&rKích hoạt bằng&C Đá đỏ", "", "&7[Máy móc cơ bản]" });

   
  	public static ItemStack SOULBOUND_SWORD = new CustomItem(Material.DIAMOND_SWORD, "&cKiếm linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Vũ khí]" });
  	public static ItemStack SOULBOUND_BOW = new CustomItem(Material.BOW, "&cCung linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Vũ khí]" });
 	public static ItemStack SOULBOUND_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&cCúp linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Công cụ]" });
 	public static ItemStack SOULBOUND_AXE = new CustomItem(Material.DIAMOND_AXE, "&cRìu linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Công cụ]" });
 	public static ItemStack SOULBOUND_SHOVEL = new CustomItem(Material.DIAMOND_SPADE, "&cXẻng linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Công cụ]" });
 	public static ItemStack SOULBOUND_HOE = new CustomItem(Material.DIAMOND_HOE, "&cCuốc linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Công cụ]" });
   
 	public static ItemStack SOULBOUND_HELMET = new CustomItem(Material.DIAMOND_HELMET, "&cMũ linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Giáp ma thuật]" });
 	public static ItemStack SOULBOUND_CHESTPLATE = new CustomItem(Material.DIAMOND_CHESTPLATE, "&cÁo linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Giáp ma thuật]" });
 	public static ItemStack SOULBOUND_LEGGINGS = new CustomItem(Material.DIAMOND_LEGGINGS, "&cQuần linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Giáp ma thuật]" });
 	public static ItemStack SOULBOUND_BOOTS = new CustomItem(Material.DIAMOND_BOOTS, "&cỦng linh hồn", 0, new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Giáp ma thuật]" });
 	

 	public static ItemStack TOTEM = new CustomItem(Material.TOTEM, "&6Vật tổ trường sinh", 0, new String[] { "", "&fCứu bạn khỏi cái chết", "", "&7[Tiện ích ma thuật]" });

 	public static ItemStack BLANK_RUNE = null;
 	public static ItemStack RUNE_AIR = null;
 	public static ItemStack RUNE_WATER = null;
 	public static ItemStack RUNE_FIRE = null;
 	public static ItemStack RUNE_EARTH = null;
 	public static ItemStack RUNE_ENDER = null;
 	public static ItemStack RUNE_RAINBOW = null;
	
	static {
		
		ItemStack itemB = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imB = (FireworkEffectMeta) itemB.getItemMeta();
		imB.setEffect(FireworkEffect.builder().with(Type.BURST).with(Type.BURST).withColor(Color.BLACK).build());
		imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8Ngọc nguyên tố"));
		imB.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Vật phẩm ma thuật]" }));
		imB.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemB.setItemMeta(imB);
		BLANK_RUNE = itemB;
		
		ItemStack itemA = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imA = (FireworkEffectMeta)itemA.getItemMeta();
		imA.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.AQUA).build());
		imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ngọc nguyên tố &8[&bGió&8]"));
		imA.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Vật phẩm ma thuật]" }));
		imA.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemA.setItemMeta((ItemMeta)imA);
		RUNE_AIR = itemA;
		
		ItemStack itemW = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imW = (FireworkEffectMeta)itemW.getItemMeta();
		imW.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.BLUE).build());
		imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ngọc nguyên tố &8[&1Nước&8]"));
		imW.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Vật phẩm ma thuật]" }));
		imW.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemW.setItemMeta((ItemMeta)imW);
		RUNE_WATER = itemW;
		
		ItemStack itemF = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imF = (FireworkEffectMeta)itemF.getItemMeta();
		imF.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.RED).build());
		imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ngọc nguyên tố &8[&4Lửa&8]"));
		imF.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Vật phẩm ma thuật]" }));
		imF.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemF.setItemMeta((ItemMeta)imF);
		RUNE_FIRE = itemF;
		
		ItemStack itemE = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imE = (FireworkEffectMeta)itemE.getItemMeta();
		imE.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.ORANGE).build());
		imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ngọc nguyên tố &8[&6Đất&8]"));
		imE.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Vật phẩm ma thuật]" }));
		imE.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemE.setItemMeta((ItemMeta)imE);
		RUNE_EARTH = itemE;
		
		ItemStack itemN = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imN = (FireworkEffectMeta)itemN.getItemMeta();
		imN.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.PURPLE).build());
		imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ngọc nguyên tố &8[&5Ender&8]"));
		imN.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Vật phẩm ma thuật]" }));
		imN.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemN.setItemMeta((ItemMeta)imN);
		RUNE_ENDER = itemN;
		
		ItemStack itemR = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imR = (FireworkEffectMeta)itemR.getItemMeta();
		imR.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.PURPLE).build());
		imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ngọc nguyên tố &8[&dĐa sắc&8]"));
		imR.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Vật phẩm ma thuật]" }));
		imR.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemR.setItemMeta((ItemMeta)imR);
		RUNE_RAINBOW = itemR;
		

		
		ItemStack itemS = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imS = (FireworkEffectMeta)itemR.getItemMeta();
		imS.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.GRAY).build());
		imS.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Silicon"));
		imS.setLore(Arrays.asList(new String[] { "", ChatColor.GRAY + "[Tài nguyên]" }));
		imS.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
		itemS.setItemMeta((ItemMeta)imS);
		SILICON = itemS;
	}
	
	public static ItemStack COPPER_WIRE = new CustomItem(new MaterialData(Material.STRING), "&6Dây đồng", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	public static ItemStack SOLAR_GENERATOR = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&bTấm pin năng lượng Mặt trời&7 - &fI", new String[] { "", "&eSản xuất điện từ ánh sáng Mặt trời", "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &70 J Buffer", "&8⇨ &e⚡ &74 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack SOLAR_GENERATOR_2 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&bTấm pin năng lượng Mặt trời&7 - &fII", new String[] { "", "&eSản xuất điện từ ánh sáng Mặt trời", "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &70 J Buffer", "&8⇨ &e⚡ &716 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack SOLAR_GENERATOR_3 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&bTấm pin năng lượng Mặt trời&7 - &fIII", new String[] { "", "&eSản xuất điện từ ánh sáng Mặt trời", "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &70 J Buffer", "&8⇨ &e⚡ &764 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack SOLAR_GENERATOR_4 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&bTấm pin năng lượng Mặt trời&7 - &fIV", new String[] { "", "&eSản xuất điện từ ánh sáng Mặt trời", "", "&9Có thể hoạt động vào ban đêm", "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &70 J Buffer", "&8⇨ &e⚡ &7256 J/s (Ngày)", "&8⇨ &e⚡ &7128 J/s (Đêm)", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack COAL_GENERATOR = null;
	public static ItemStack LAVA_GENERATOR = null;
	
	public static ItemStack ELECTRIC_FURNACE = new CustomItem(new ItemStack(Material.FURNACE), "&cLò điện &7- &fI", new String[] { "", "&eGiống lò thường nhưng sử dụng điện", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &74 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_FURNACE_2 = new CustomItem(new ItemStack(Material.FURNACE), "&cLò điện &7- &fII", new String[] { "", "&eGiống lò thường nhưng sử dụng điện", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 2x", "&8⇨ &e⚡ &76 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_FURNACE_3 = new CustomItem(new ItemStack(Material.FURNACE), "&c&cLò điện &7- &fIII", new String[] { "", "&eGiống lò thường nhưng sử dụng điện", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 4x", "&8⇨ &e⚡ &710 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack ELECTRIC_ORE_GRINDER = new CustomItem(new ItemStack(Material.FURNACE), "&cMáy xay đá tự động&7 - &fI", new String[] { "", "&rHoạt động như &bMáy ngiền&f và &bMáy xay đá", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &712 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_ORE_GRINDER_2 = new CustomItem(new ItemStack(Material.FURNACE), "&cMáy xay đá tự động&7 - &fII", new String[] { "", "&rHoạt động như &bMáy ngiền&f và &bMáy xay đá", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 4x", "&8⇨ &e⚡ &730 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_INGOT_PULVERIZER = new CustomItem(new ItemStack(Material.FURNACE), "&cMáy nghiền tự động", new String[] { "", "&rNghiền thỏi thành bột", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &714 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack AUTO_ENCHANTER = new CustomItem(new ItemStack(Material.ENCHANTMENT_TABLE), "&5Máy Enchant tự động", new String[] { "", "&eTự động Enchant", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &718 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack AUTO_DISENCHANTER = new CustomItem(new ItemStack(Material.ENCHANTMENT_TABLE), "&5Máy khử Enchant tự động", new String[] { "", "&eTự động khử Enchant", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &718 J/s", "", "&7[Điện và năng lượng]" });
 	public static ItemStack AUTO_ANVIL = new CustomItem(new ItemStack(Material.IRON_BLOCK), "&bMáy sửa chữa tự động&7 -&f I", new String[] { "", "&fSửa chữa công cụ bằng &8Băng dính", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Phục hồi độ bền: 10%", "&8⇨ &e⚡ &724 J/s", "", "&7[Điện và năng lượng]" });
 	public static ItemStack AUTO_ANVIL_2 = new CustomItem(new ItemStack(Material.IRON_BLOCK), "&bMáy sửa chữa tự động&7 -&f II", new String[] { "", "&fSửa chữa công cụ bằng &8Băng dính", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7hục hồi độ bền:  25%", "&8⇨ &e⚡ &732 J/s", "", "&7[Điện và năng lượng]" });
	
 	public static ItemStack BIO_REACTOR = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)5), "&2Lò phản ứng sinh học", new String[] { "", "&fSản xuất điện từ thực vật", "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &7128 J Buffer", "&8⇨ &e⚡ &78 J/s", "", "&7[Điện và năng lượng]" });
 	public static ItemStack MULTIMETER = new CustomItem(new MaterialData(Material.WATCH), "&eĐồng hồ năng lượng", new String[] { "", "&rĐo năng lượng lưu trữ trong khối", "", "&7[Điện và năng lượng]" });
 	public static ItemStack SMALL_CAPACITOR = null;
 	public static ItemStack MEDIUM_CAPACITOR = null;
 	public static ItemStack BIG_CAPACITOR = null;
 	public static ItemStack LARGE_CAPACITOR = null;
 	public static ItemStack CARBONADO_EDGED_CAPACITOR = null;
	/*     */ 
	
	public static ItemStack PROGRAMMABLE_ANDROID = null;
	public static ItemStack PROGRAMMABLE_ANDROID_MINER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_BUTCHER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_FARMER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_FISHERMAN = null;
	
	public static ItemStack PROGRAMMABLE_ANDROID_2 = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_FARMER = null;
	public static ItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = null;
	
	public static ItemStack PROGRAMMABLE_ANDROID_3 = null;
	public static ItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = null;
	public static ItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = null;
	/*     */ 
	
	public static ItemStack GPS_TRANSMITTER = null;
	public static ItemStack GPS_TRANSMITTER_2 = null;
	public static ItemStack GPS_TRANSMITTER_3 = null;
	public static ItemStack GPS_TRANSMITTER_4 = null;
	
	public static ItemStack GPS_CONTROL_PANEL = null;
	public static ItemStack GPS_MARKER_TOOL = new CustomItem(new MaterialData(Material.REDSTONE_TORCH_ON), "&bMáy đánh dấu GPS", new String[] { "", "&fCho phép đặt điểm tham chiếu", "", "&7[Thiết bị GPS]" });
	public static ItemStack GPS_EMERGENCY_TRANSMITTER = null;
	public static ItemStack GPS_GEO_SCANNER = null;
	
	public static ItemStack ANDROID_INTERFACE_FUEL = new CustomItem(new ItemStack(Material.DISPENSER), "&7Kho nhiên liệu Android", new String[] { "", "&rVật phẩm trong kho này", "&rCó thể dự trữ nhiêu liệu cho Android", "", "&7[Androids]" });
	public static ItemStack ANDROID_INTERFACE_ITEMS = new CustomItem(new ItemStack(Material.DISPENSER), "&7Kho vật phẩm Android", new String[] { "", "&rVật phẩm trong kho này", "&rCó thể lưu trữ vật phẩm từ Android", "", "&7[Androids]" });
	
	public static ItemStack BUCKET_OF_OIL = null;
	public static ItemStack BUCKET_OF_FUEL = null;
	public static ItemStack OIL_PUMP = null;
	
	public static ItemStack REFINERY = new CustomItem(new ItemStack(Material.PISTON_BASE), "&cMáy lọc dầu", new String[] { "", "&rLọc dầu để tạo ra nhiên liệu", "", "&7[&cMáy tiêu thụ điện&7]", "", "&7[Điện và năng lượng]" });
	public static ItemStack COMBUSTION_REACTOR = null;
	public static ItemStack ANDROID_MEMORY_CORE = null;
	
	public static ItemStack GPS_TELEPORTER_PYLON = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)10), "&5Bộ phận chuyển GPS", new String[] { "", "&7Thành phần của hệ thống dịch chuyển", "", "&7[Thiết bị GPS]" });
	public static ItemStack GPS_TELEPORTATION_MATRIX = new CustomItem(new MaterialData(Material.IRON_BLOCK), "&bMáy dịch chuyển GPS", new String[] { "", "&rCó thể dịch chuyển đến các điểm tham chiếu", "&rmà người chơi đặt", "", "&7[Thiết bị GPS]" });
	public static ItemStack GPS_ACTIVATION_DEVICE_SHARED = new CustomItem(new MaterialData(Material.STONE_PLATE), "&rThiết bị kích hoạt dịch chuyển GPS &3(Công cộng)", new String[] { "", "&rBộ phận quan trong nhất của hệ thống dịch chuyển", "&cTất cả người chơi &fđều có thể sử dụn", "", "&7[Thiết bị GPS]" });
	public static ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new CustomItem(new MaterialData(Material.STONE_PLATE), "&rThiết bị kích hoạt dịch chuyển GPS &a(Riêng tư)", new String[] { "", "&rBộ phận quan trong nhất của hệ thống dịch chuyển", "&cChỉ bạn &fmới có thể sử dụng", "", "&7[Thiết bị GPS]" });
	
	public static ItemStack ELEVATOR = new CustomItem(new MaterialData(Material.STONE_PLATE), "&bThang máy", new String[] { "", "&rĐặt chúng ở mỗi tầng và có thể dịch chuyển giữa chúng", "&f2 Thang máy phải đặt cùng tọa độ và khác độ cao", "", "&7⇨&eChuột phải&7 sau khi đặt để đặt tên", "", "&7[Thiết bị GPS]" });
	
	public static ItemStack INFUSED_HOPPER = new CustomItem(new MaterialData(Material.HOPPER), "&5Hopper đa năng", new String[] { "", "&rTự động hút vật phẩm", "&ftrong phạm vi&e 7 x 7 x 7", "", "&7[Tiện ích ma thuật]" });
	
	public static ItemStack PLASTIC_SHEET = new CustomItem(new MaterialData(Material.PAPER), "&rTấm nhựa", new String[] { "", "&7[Linh tinh]" });
	public static ItemStack HEATED_PRESSURE_CHAMBER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)8), "&cBuồng áp suất &7- &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &710 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack HEATED_PRESSURE_CHAMBER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)8), "&cBuồng áp suất &7- &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 5x", "&8⇨ &e⚡ &744 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack ELECTRIC_SMELTERY = new CustomItem(new MaterialData(Material.FURNACE), "&cLò rèn hợp kim &7- &fI", new String[] { "", "&4Chỉ rèn được hợp kim, không rèn ra thỏi thường", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &720 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_SMELTERY_2 = new CustomItem(new MaterialData(Material.FURNACE), "&cLò rèn hợp kim &7- &fII", new String[] { "", "&4Chỉ rèn được hợp kim, không rèn ra thỏi thường", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 3x", "&8⇨ &e⚡ &740 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack ELECTRIFIED_CRUCIBLE = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)14), "&cLò nóng chảy tự động &7- &fI", new String[] { "", "&eHoạt động như&6 Nồi nấu kim loại", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &748 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIFIED_CRUCIBLE_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)14), "&cLò nóng chảy tự động &7- &fII", new String[] { "", "&eHoạt động như&6 Nồi nấu kim loại", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 2x", "&8⇨ &e⚡ &780 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIFIED_CRUCIBLE_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)14), "&cLò nóng chảy tự động &7- &fIII", new String[] { "", "&eHoạt động như&6 Nồi nấu kim loại", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 4x", "&8⇨ &e⚡ &7120 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack CARBON_PRESS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)15), "&cMáy nén tự động &7- &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &720 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack CARBON_PRESS_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)15), "&cMáy nén tự động &7- &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 3x", "&8⇨ &e⚡ &750 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack CARBON_PRESS_3 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)15), "&cMáy nén tự động &7- &fIII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 15x", "&8⇨ &e⚡ &7180 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack BLISTERING_INGOT = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6Blistering Ingot &7(33%)", new String[] { "", "&a☢ &cMức phóng xạ: Cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	public static ItemStack BLISTERING_INGOT_2 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6Blistering Ingot &7(66%)", new String[] { "", "&a☢ &cMức phóng xạ: Cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	public static ItemStack BLISTERING_INGOT_3 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6Blistering Ingot", new String[] { "", "&a☢ &cMức phóng xạ: Cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	
	public static ItemStack ENERGY_REGULATOR = null;
	public static ItemStack DEBUG_FISH = new CustomItem(new MaterialData(Material.RAW_FISH), "&3How much is the Fish?", new String[] { "", "&eRight Click &rany Block to view it's BlockData", "&eLeft Click &rto break a Block", "&eShift + Left Click &rany Block to erase it's BlockData", "&eShift + Right Click &rto place a Placeholder Block" });
	/*     */ 
	
	public static ItemStack NETHER_ICE = null;
	public static ItemStack ENRICHED_NETHER_ICE = null;
	public static ItemStack NETHER_ICE_COOLANT_CELL = null;
	public static ItemStack NETHER_DRILL = new CustomItem(new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)14), "&4Máy khoan Nether", new String[] { "", "&rGiúp khai thác &ebăng Nether", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Speed: 1x", "&8⇨ &e⚡ &7102 J/s", "", "&c&l! &cChỉ sử dụng dưới Nether!", "&c&l! &cVà sử dụng máy quét GEO trước", "", "&7[Điện và năng lượng]" }));
	/*     */ 
	
	public static ItemStack CARGO_MANAGER = null;
	public static ItemStack CARGO_NODE = null;
	public static ItemStack CARGO_INPUT = null;
	public static ItemStack CARGO_OUTPUT = null;
	public static ItemStack CARGO_OUTPUT_ADVANCED = null;
	
	public static ItemStack AUTO_BREEDER = null;
	
	public static ItemStack ORGANIC_FOOD = null;
	public static ItemStack ORGANIC_FOOD2 = null;
	public static ItemStack ORGANIC_FOOD3 = null;
	public static ItemStack ORGANIC_FOOD4 = null;
	public static ItemStack ORGANIC_FOOD5 = null;
	public static ItemStack ORGANIC_FOOD6 = null;
	public static ItemStack ORGANIC_FOOD7 = null;
	public static ItemStack ORGANIC_FOOD8 = null;
	
	public static ItemStack FERTILIZER = null;
	public static ItemStack FERTILIZER2 = null;
	public static ItemStack FERTILIZER3 = null;
	public static ItemStack FERTILIZER4 = null;
	public static ItemStack FERTILIZER5 = null;
	public static ItemStack FERTILIZER6 = null;
	public static ItemStack FERTILIZER7 = null;
	public static ItemStack FERTILIZER8 = null;
	
	public static ItemStack ANIMAL_GROWTH_ACCELERATOR = null;
	public static ItemStack CROP_GROWTH_ACCELERATOR = null;
	public static ItemStack CROP_GROWTH_ACCELERATOR_2 = null;
	
	public static ItemStack FOOD_FABRICATOR = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)13), "&cMáy tạo thực phẩm hữu cơ &7- &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &7256 J Buffer", "&8⇨ &e⚡ &714 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack FOOD_FABRICATOR_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)13), "&cMáy tạo thực phẩm hữu cơ &7- &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 6x", "&8⇨ &e⚡ &7512 J Buffer", "&8⇨ &e⚡ &748 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack FOOD_COMPOSTER = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)13), "&cMáy tạo phân bón hữu cơ &7- &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &7256 J Buffer", "&8⇨ &e⚡ &716 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack FOOD_COMPOSTER_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)13), "&cMáy tạo phân bón hữu cơ &7- &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 10x", "&8⇨ &e⚡ &7512 J Buffer", "&8⇨ &e⚡ &752 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack XP_COLLECTOR = null;
	public static ItemStack REACTOR_COOLANT_CELL = null;
	
	public static ItemStack NUCLEAR_REACTOR = null;
	public static ItemStack NETHERSTAR_REACTOR = null;
	public static ItemStack REACTOR_ACCESS_PORT = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)9), "&2Cổng truy cập lò phản ứng", new String[] { "", "&rCho phép bạn tương tác với &2Lò phản ứng", "&rCó thể sử dụng cả Cargo", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &ePhải đặt cách&2 Lò phản ứng&e 3 block", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack FREEZER = null;
	public static ItemStack FREEZER_2 = null;
	
	public static ItemStack ELECTRIC_GOLD_PAN = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)12), "&6Máy sàng tự động &7- &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ 1x", "&8⇨ &e⚡ &72 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_GOLD_PAN_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)12), "&6Máy sàng tự động &7- &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 3x", "&8⇨ &e⚡ &74 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_GOLD_PAN_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)12), "&6Máy sàng tự động &7- &fIII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 10x", "&8⇨ &e⚡ &714 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack ELECTRIC_DUST_WASHER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)11), "&3Máy rửa quặng tự động &7- &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &76 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_DUST_WASHER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)11), "&3Máy rửa quặng tự động &7- &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 2x", "&8⇨ &e⚡ &710 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_DUST_WASHER_3 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)11), "&3Máy rửa quặng tự động &7- &fIII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 10x", "&8⇨ &e⚡ &730 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack ELECTRIC_INGOT_FACTORY = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)14), "&cLò rèn điện &7- &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &78 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_INGOT_FACTORY_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)14), "&cLò rèn điện &7- &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 2x", "&8⇨ &e⚡ &714 J/s", "", "&7[Điện và năng lượng]" });
	public static ItemStack ELECTRIC_INGOT_FACTORY_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)14), "&cLò rèn điện &7- &fIII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 8x", "&8⇨ &e⚡ &740 J/s", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack AUTOMATED_CRAFTING_CHAMBER = new CustomItem(new MaterialData(Material.WORKBENCH), "&6Máy chế tạo tự động", new String[] { "", "&6Áp dụng công thức của Bàn chế tạo cao cấp", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &710 J/Item", "", "&7[Điện và năng lượng]" });
	public static ItemStack FLUID_PUMP = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)11), "&9Máy bơm", new String[] { "", "&6Bơm nước hoặc lava phía dưới máy", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &732 J/Block", "", "&7[Điện và năng lượng]" });
	public static ItemStack CHARGING_BENCH = new CustomItem(new MaterialData(Material.WORKBENCH), "&6Bàn sạc điện", new String[] { "", "&rSạc điện các loại đồ phản lực", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &7128 J Buffer", "&8⇨ &e⚡ &7Năng lượng hao tổn: &c50%", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack WITHER_ASSEMBLER = new CustomItem(new MaterialData(Material.OBSIDIAN), "&5Máy triệu hồi Wither Boss", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Thời gian hồi: &b30 Giây", "&8⇨ &e⚡ &74096 J Buffer", "&8⇨ &e⚡ &74096 J/Wither", "", "&7[Điện và năng lượng]" });
	
	public static ItemStack TRASH_CAN = null;
	
	public static ItemStack ELYTRA = new CustomItem(new ItemStack(Material.ELYTRA), "&bCánh cứng", new String[] { "", "&7[Tiện ích ma thuật]" });
	public static ItemStack ELYTRA_SCALE = new CustomItem(new ItemStack(Material.FEATHER), "&bLông cánh cứng", new String[] { "", "&7[Tiện ích ma thuật]" });
	public static ItemStack INFUSED_ELYTRA = new CustomItem(new CustomItem(ELYTRA, "&5Cánh cứng ma thuật", new String[] { "", "&7[Tiện ích ma thuật]" }), new String[] { "MENDING-1" });
	public static ItemStack SOULBOUND_ELYTRA = new CustomItem(ELYTRA, "&cCánh cứng linh hồn", new String[] { "", "&fVật phẩm không bị rơi ra khi chết", "", "&7[Tiện ích ma thuật]" });
	/*     */ 
	/*     */ 
	
	public static ItemStack CHEST_TERMINAL = null;
	public static ItemStack CT_IMPORT_BUS = null;
	public static ItemStack CT_EXPORT_BUS = null;
	

  	public static ItemStack COPPER_LIQUID = null;
  	public static ItemStack ALUMINUM_LIQUID = null;
  	public static ItemStack SILVER_LIQUID = null;
  	public static ItemStack LEAD_LIQUID = null;
  	public static ItemStack ZINC_LIQUID = null;
  	public static ItemStack TIN_LIQUID = null;
  	public static ItemStack MAGNESIUM_LIQUID = null;
  	public static ItemStack IRON_LIQUID = null;
  	public static ItemStack GOLD_4K_LIQUID = null;
  	public static ItemStack GOLD_6K_LIQUID = null;
  	public static ItemStack GOLD_8K_LIQUID = null;
  	public static ItemStack GOLD_10K_LIQUID = null;
  	public static ItemStack GOLD_12K_LIQUID = null;
  	public static ItemStack GOLD_14K_LIQUID = null;
  	public static ItemStack GOLD_16K_LIQUID = null;
  	public static ItemStack GOLD_18K_LIQUID = null;
  	public static ItemStack GOLD_20K_LIQUID = null;
  	public static ItemStack GOLD_22K_LIQUID = null;
  	public static ItemStack GOLD_24K_LIQUID = null;
  	public static ItemStack IRON_ORE_LIQUID = null;
  	public static ItemStack GOLD_ORE_LIQUID = null;
  	public static ItemStack DIAMOND_LIQUID = null;
  	public static ItemStack DIAMOND_ORE_LIQUID = null;
	public static ItemStack EMERALD_LIQUID = null;
	public static ItemStack EMERALD_ORE_LIQUID = null;
  	public static ItemStack LAPIS_LIQUID = null;
  	public static ItemStack LAPIS_ORE_LIQUID = null;
 	public static ItemStack REDSTONE_LIQUID = null;
 	public static ItemStack REDSTONE_ORE_LIQUID = null;
 	public static ItemStack REDSTONE_ALLOY_LIQUID = null;
  	public static ItemStack MAGNET_LIQUID = null;
  	public static ItemStack CARBON_LIQUID = null;
  	public static ItemStack STEEL_LIQUID = null;
  	public static ItemStack DAMASCUS_STEEL_LIQUID = null;
 	public static ItemStack BRONZE_LIQUID = null;
  	public static ItemStack DURALUMIN_LIQUID = null;
  	public static ItemStack BILLON_LIQUID = null;
  	public static ItemStack BRASS_LIQUID = null;
  	public static ItemStack ALUMINUM_BRASS_LIQUID = null;
  	public static ItemStack ALUMINUM_BRONZE_LIQUID = null;
  	public static ItemStack CORINTHIAN_BRONZE_LIQUID = null;
  	public static ItemStack SOLDER_LIQUID = null;
  	public static ItemStack HARDENED_METAL_LIQUID = null;
  	public static ItemStack REINFORCED_ALLOY_LIQUID = null;
  	public static ItemStack NICKEL_LIQUID = null;
  	public static ItemStack COBALT_LIQUID = null;
	/*     */ 
		static {
	try {
	  	SLAG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&7Xỉ nóng chảy", new String[] {"", "&7[Luyện kim]" });
	  	IRON_ORE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bQuặng sắt &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_ORE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bQuặng vàng &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	DIAMOND_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bKim cương &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	DIAMOND_ORE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bQuặng kim cương &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
		EMERALD_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bLục bảo &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
		EMERALD_ORE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bQuặng lục bảo &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	LAPIS_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bLapis &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	LAPIS_ORE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bQuặng lapis &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	 	REDSTONE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bRedstone &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	 	REDSTONE_ORE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bQuặng redstone &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	 	REDSTONE_ALLOY_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bRedstone Alloy &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	COPPER_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bCopper &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	ALUMINUM_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bAluminum &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	SILVER_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bSilver &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	LEAD_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bLead &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	ZINC_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bZinc &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	TIN_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bTin &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	MAGNESIUM_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bMagnesium &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	IRON_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bIron &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_4K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(4-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_6K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(6-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_8K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(8-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_10K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(10-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_12K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(12-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_14K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(14-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_16K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(16-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_18K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(18-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_20K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(20-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_22K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(22-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	GOLD_24K_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bGold &7(24-Carat) &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	MAGNET_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bNam châm &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	CARBON_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bCarbon &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	STEEL_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bSteel &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	DAMASCUS_STEEL_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bDamascus Steel &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	 	BRONZE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bBronze &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	DURALUMIN_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bDuralumin &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	BILLON_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bBillon &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	BRASS_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bBrass &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	ALUMINUM_BRASS_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bAluminum Brass &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	ALUMINUM_BRONZE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bAluminum Bronze &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	CORINTHIAN_BRONZE_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bCorinthian Bronze &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	SOLDER_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bSolder &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	HARDENED_METAL_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bHardned Metal &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	REINFORCED_ALLOY_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bReinforced Alloy &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	NICKEL_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bNickel &cnóng chảy", new String[] { "", "&7[Luyện kim]" });
	  	COBALT_LIQUID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWMwOTVkM2RjZmQ4ZGZmYjY1Y2YzZTM1MDE2MmUxNjEyOTNkODY4N2QzZWViNGRiNzMzNGYyMDg3N2U1YTYwMiJ9fX0="), "&bCobalt &cnóng chảy", new String[] { "", "&7[Luyện kim]" });

	PORTABLE_CRAFTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmNkYzBmZWI3MDAxZTJjMTBmZDUwNjZlNTAxYjg3ZTNkNjQ3OTMwOTJiODVhNTBjODU2ZDk2MmY4YmU5MmM3OCJ9fX0="), "&6Bàn chế tạo di động", new String[] { "", "&fMở nhanh bàn chế tạo", "", "&7⇨ &eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	PORTABLE_DUSTBIN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&6Thùng rác di động", new String[] { "", "&fXóa mọi item bên trong khi đóng lại", "", "&7⇨ &eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	TRASH_CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&3Thùng rác", new String[] { "", "&rXóa mọi vật phẩm bên trong", "", "&7[Cargo]" });
	CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&rHộp trống", new String[] { "", "&7[Linh tinh]" });
	  
	STONE_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&6Mẫu đá cuội", new String[] { "", "&7[Linh tinh]" });
	  
	INFUSED_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&aNam châm ma thuật", new String[] { "", "&rHút tất cả vật phẩm xung quanh", "", "&7⇨&eẤn và giữ Shift&7 để sử dụng", "", "&7[Tiện ích ma thuật]" });
	MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&cNam châm", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	ELECTRO_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&cNam châm điện", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	ELECTRIC_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&cĐộng cơ điện", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	CARGO_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&3Động cơ Cargo", new String[] { "", "&7[Cargo]" });
	  
	BACKPACK_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eBa lô &7- &fI", new String[] { "", "&7Kích thước: &e9 &7Slot", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để mở", "", "&7[Vật phẩm thường]" });
	BACKPACK_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eBa lô &7- &fII", new String[] { "", "&7Kích thước: &e18 &7Slot", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để mở", "", "&7[Vật phẩm thường]" });
	BACKPACK_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eBa lô &7- &fIII", new String[] { "", "&7Kích thước: &e27 &7Slot", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để mở", "", "&7[Vật phẩm thường]" });
	WOVEN_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eBa lô &7- &fIV", new String[] { "", "&7Kích thước: &e36 &7Slot", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để mở", "", "&7[Vật phẩm thường]" });
	GILDED_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eBa lô &7- &fV", new String[] { "", "&7Kích thước: &e45 &7Slot", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để mở", "", "&7[Vật phẩm thường]" });
	DOUBLE_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&eBa lô &7- &fVI", new String[] { "", "&7Kích thước: &e54 &7Slot (Bằng rương lớn)", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để mở", "", "&7[Vật phẩm thường]" });
	BOUND_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&cBa lô linh hồn", new String[] { "", "&fVật phẩm không bị rơi ra khi bạn chết", "", "&7Kích thước: &e36", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để mở", "", "&7[Vật phẩm thường]" });
	COOLER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRjMTU3MjU4NGViNWRlMjI5ZGU5ZjVhNGY3NzlkMGFhY2JhZmZkMzNiY2IzM2ViNDUzNmE2YTJiYzZhMSJ9fX0="), "&bTủ lạnh di động", new String[] { "", "&rGiúp dự trữ nước ép hoặc sinh tố", "&rvà tự động tiêu thụ khi bạn đói", "", "&7Kích thước: &e27", "&7ID: <ID>", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	ENDER_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&6Rương Ender di động", new String[] { "", "&7Có thể mở ra &5rương Ender", "", "&7⇨&eChuột phải&7 để sử dụng", "", "&7[Vật phẩm thường]" });
	  
	VOIDBAG_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Small Void Bag", new String[] { "", "&7Size: &e9", "&7ID: <ID>", "", "&7&eLeft Click&7 to suck up nearby Items", "&7&eRight Click&7 to open" });
	VOIDBAG_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Void Bag", new String[] { "", "&7Size: &e18", "&7ID: <ID>", "", "&7&eLeft Click&7 to suck up nearby Items", "&7&eRight Click&7 to open" });
	VOIDBAG_BIG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Big Void Bag", new String[] { "", "&7Size: &e27", "&7ID: <ID>", "", "&7&eLeft Click&7 to suck up nearby Items", "&7&eRight Click&7 to open" });
	VOIDBAG_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Large Void Bag", new String[] { "", "&7Size: &e36", "&7ID: <ID>", "", "&7&eLeft Click&7 to suck up nearby Items", "&7&eRight Click&7 to open" });
	BOUND_VOIDBAG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4Soulbound Void Bag", new String[] { "", "&7Size: &e36", "&7ID: <ID>", "", "&7&eLeft Click&7 to suck up nearby Items", "&7&eRight Click&7 to open" });
	  
	COAL_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&cMáy tạo điện từ Than", new String[] { "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &764 J Buffer", "&8⇨ &e⚡ &716 J/s", "", "&7[Điện và năng lượng]" });
	LAVA_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&4Máy tạo điện từ Lava", new String[] { "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &7512 J Buffer", "&8⇨ &e⚡ &720 J/s", "", "&7[Điện và năng lượng]" });
	COMBUSTION_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&cMáy tạo điện từ Nhiên liệu", new String[] { "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &7256 J Buffer", "&8⇨ &e⚡ &724 J/s", "", "&7[Điện và năng lượng]" });
	  
	NUCLEAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&2Lò hạt nhân", new String[] { "", "&rYêu cầu phải được làm mát!", "&8⇨ &bPhải được bao quanh bởi nước", "&8⇨ &bCung cấp đủ Băng tản nhiệt", "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &716384 J Buffer", "&8⇨ &e⚡ &7500 J/s", "", "&7[Điện và năng lượng]" });
	NETHERSTAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&fLò hạt nhân Nether", new String[] { "", "&fChạy bằng sao Nether", "&8⇨ &bPhải được bao quanh bởi nước", "&8⇨ &bCung cấp đủ Băng tản nhiệt Nether", "", "&7[&cMáy phát điện&7]", "", "&8⇨ &e⚡ &732768 J Buffer", "&8⇨ &e⚡ &71024 J/s", "&8⇨ &4Khiến các Thực thể lân cận bị &8Khô héo", "", "&7[Điện và năng lượng]" });
	  
	SMALL_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aTụ điện &7- &fI", new String[] { "", "&8⇨ &eSức chứa &7128 J Mỗi tụ", "", "&7[Điện và năng lượng]" });
	MEDIUM_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aTụ điện &7- &fII", new String[] { "", "&8⇨ &eSức chứa &7512 J Mỗi tụ", "", "&7[Điện và năng lượng]" });
	BIG_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aTụ điện &7- &fIII", new String[] { "", "&8⇨ &eSức chứa &71024 J Mỗi tụ", "", "&7[Điện và năng lượng]" });
	LARGE_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aTụ điện &7- &fIV", new String[] { "", "&8⇨ &eSức chứa &78192 J Mỗi tụ", "", "&7[Điện và năng lượng]" });
	CARBONADO_EDGED_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&aTụ điện &7- &fV", new String[] { "", "&8⇨ &eSức chứa &765536 J Mỗi tụ", "", "&7[Điện và năng lượng]" });
	CHEESE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ=="), "&rPhô mai", new String[] { "", "&7[Thực phẩm]" });
	BUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0="), "&rBơ", new String[] { "", "&7[Thực phẩm]" });
	DUCT_TAPE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0="), "&8Băng dính", new String[] { "", "&rSử dụng trong &bMáy sửa chữa", "", "&7[Linh tinh]" });
	  
	URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&4Uranium", new String[] { "", "&a☢ &cMức phóng xạ: Cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	SMALL_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&cMẫu Uranium", new String[] { "", "&a☢ &cMức phóng xạ: Vừa", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	TINY_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&cVụn Uranium", new String[] { "", "&a☢ &cMức phóng xạ: Thấp", "&4Không cần cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	  
	NEPTUNIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVkZWE2YmZkMzdlNDlkZTQzZjE1NGZlNmZjYTYxN2Q0MTI5ZTYxYjk1NzU5YTNkNDlhMTU5MzVhMWMyZGNmMCJ9fX0="), "&aNeptunium", new String[] { "", "&a☢ &cMức phóng xạ: Cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	PLUTONIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVjZjkxYjczODg2NjVhNmQ3YzFiNjAyNmJkYjIzMjJjNmQyNzg5OTdhNDQ0Nzg2NzdjYmNjMTVmNzYxMjRmIn19fQ=="), "&7Plutonium", new String[] { "", "&a☢ &cMức phóng xạ: Cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	BOOSTED_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgzN2NhMTJmMjIyZjQ3ODcxOTZhMTdiOGFiNjU2OTg1Zjg0MDRjNTA3NjdhZGJjYjZlN2YxNDI1NGZlZSJ9fX0="), "&2Boosted Uranium", new String[] { "", "&a☢ &cMức phóng xạ: Cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	  
	PROGRAMMABLE_ANDROID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&cAndroid &7(Bình thường)", new String[] { "", "&8⇨ &7Chức năng: Không", "&8⇨ &7Hiệu suất nhiên liệu: 1.0x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&cAndroid &7(Nông dân)", new String[] { "", "&8⇨ &7Chức năng: Thu hoạch", "&8⇨ &7Hiệu suất nhiên liệu: 1.0x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_MINER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYzOGEyODU0MWFiM2FlMGE3MjNkNTU3ODczOGUwODc1ODM4OGVjNGMzMzI0N2JkNGNhMTM0ODJhZWYzMzQifX19"), "&cAndroid &7(Thợ mỏ)", new String[] { "", "&8⇨ &7Chức năng: Khai thác", "&8⇨ &7Hiệu suất nhiên liệu: 1.0x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_WOODCUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMyYTgxNDUxMDE0MjIwNTE2OWExYWQzMmYwYTc0NWYxOGU5Y2I2YzY2ZWU2NGVjYTJlNjViYWJkZWY5ZmYifX19"), "&cAndroid &7(Tiều phu)", new String[] { "", "&8⇨ &7Chức năng: Chặt gỗ", "&8⇨ &7Hiệu suất nhiên liệu: 1.0x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&cAndroid &7(Sát thủ)", new String[] { "", "&8⇨ &7Chức năng: Giết mổ", "&8⇨ &7Sát thương: 4", "&8⇨ &7Hiệu suất nhiên liệu: 1.0x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&cAndroid &7(Ngư dân)", new String[] { "", "&8⇨ &7Chức năng: Câu cá", "&8⇨ &7Tỉ lệ thành công: 10%", "&8⇨ &7Hiệu suất nhiên liệu: 1.0x", "", "&7[Androids]" });
	  
	PROGRAMMABLE_ANDROID_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&cAndroid Nâng cao &7(Bình thường)", new String[] { "", "&8⇨ &7Chức năng: Không", "&8⇨ &7Hiệu suất nhiên liệu: 1.5x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_2_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&cAndroid Nâng cao &7(Ngư dân)", new String[] { "", "&8⇨ &7Chức năng: Câu cá", "&8⇨ &7Tỉ lệ thành công: 20%", "&8⇨ &7Hiệu suất nhiên liệu: 1.5x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_2_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&cAndroid Nâng cao &7(Nông dân)", new String[] { "", "&8⇨ &7Chức năng: Thu hoạch", "&8⇨ &7Hiệu suất nhiên liệu: 1.5x", "&8⇨ &7Có thể thu hoạch cây trồng từ ExoticGarden", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_2_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&cAndroid Nâng cao &7(Sát thủ)", new String[] { "", "&8⇨ &7Chức năng: Giết mổ", "&8⇨ &7Sát thương: 8", "&8⇨ &7Hiệu suất nhiên liệu: 1.5x", "", "&7[Androids]" });
	  
	PROGRAMMABLE_ANDROID_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&eAndroid Cao cấp &7(Bình thường)", new String[] { "", "&8⇨ &7Chức năng: Không", "&8⇨ &7Hiệu suất nhiên liệu: 3.0x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_3_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&eAndroid Cao cấp &7(Ngư dân)", new String[] { "", "&8⇨ &7Chức năng: Câu cá", "&8⇨ &7Tỉ lệ thành công: 30%", "&8⇨ &7Hiệu suất nhiên liệu: 8.0x", "", "&7[Androids]" });
	PROGRAMMABLE_ANDROID_3_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&eAndroid Cao cấp &7(Sát thủ)", new String[] { "", "&8⇨ &7Chức năng: Giết mổ", "&8⇨ &7Sát thương: 20", "&8⇨ &7Hiệu suất nhiên liệu: 8.0x", "", "&7[Androids]" });
	  
	GPS_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bMáy phát GPS &7- &fI", new String[] { "", "&8⇨ &e⚡ &716 J Buffer", "&8⇨ &e⚡ &72 J/s", "", "&7[Thiết bị GPS]" });
	GPS_TRANSMITTER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bMáy phát GPS &7- &fII", new String[] { "", "&8⇨ &e⚡ &764 J Buffer", "&8⇨ &e⚡ &76 J/s", "", "&7[Thiết bị GPS]" });
	GPS_TRANSMITTER_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bMáy phát GPS &7- &fIII", new String[] { "", "&8⇨ &e⚡ &7256 J Buffer", "&8⇨ &e⚡ &722 J/s", "", "&7[Thiết bị GPS]" });
	GPS_TRANSMITTER_4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bMáy phát GPS &7- &fIV", new String[] { "", "&8⇨ &e⚡ &71024 J Buffer", "&8⇨ &e⚡ &792 J/s", "", "&7[Thiết bị GPS]" });
	  
	GPS_CONTROL_PANEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjZmJhNThmYWYxZjY0ODQ3ODg0MTExODIyYjY0YWZhMjFkN2ZjNjJkNDQ4MWYxNGYzZjNiY2I2MzMwIn19fQ=="), "&bBảng điều khiển GPS", new String[] { "", "&rGiúp theo dõi các Vệ tinh", "&rhoặc điểm tham chiếu", "", "&7[Thiết bị GPS]" });
	GPS_EMERGENCY_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&cMáy phát khẩn cấp GPS", new String[] { "", "&rNếu mang theo trong túi", "&rMáy sẽ tự đặt điểm tham chiếu", "&rtại nơi bạn chết", "", "&7[Thiết bị GPS]" });
	  
	GPS_GEO_SCANNER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFkOGNmZWIzODdhNTZlM2U1YmNmODUzNDVkNmE0MTdiMjQyMjkzODg3ZGIzY2UzYmE5MWZhNDA5YjI1NGI4NiJ9fX0="), "&bMáy quét GEO", new String[] { "", "&rQuét một chunk để tìm tài nguyên", "", "&7[Thiết bị GPS]" });
	OIL_PUMP = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZlMWEwNDBhNDI1ZTMxYTQ2ZDRmOWE5Yjk4MDZmYTJmMGM0N2VlODQ3MTFjYzE5MzJmZDhhYjMyYjJkMDM4In19fQ=="), "&rMáy bơm dầu", new String[] { "", "&7Bơm dầu lên và đổ vào xô", "", "&c&l! &cYêu cầu sử dụng máy quét GEO", "", "&7[Thiết bị GPS]" });
	BUCKET_OF_OIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlMDRiNDFkMTllYzc5MjdmOTgyYTYzYTk0YTNkNzlmNzhlY2VjMzMzNjMwNTFmZGUwODMxYmZhYmRiZCJ9fX0="), "&rXô dầu", new String[] { "", "&7[Tài nguyên]" });
	BUCKET_OF_FUEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg0ZGRjYTc2NjcyNWI4Yjk3NDEzZjI1OWMzZjc2NjgwNzBmNmFlNTU0ODNhOTBjOGU1NTI1Mzk0ZjljMDk5In19fQ=="), "&rXô nhiên liệu", new String[] { "", "&7[Tài nguyên]" });
	  
	NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NlMmRhZDliYWY3ZWFiYTdlODBkNGQwZjlmYWMwYWFiMDFhNzZiMTJmYjcxYzNkMmFmMmExNmZkZDRjNzM4MyJ9fX0="), "&eBăng Nether", new String[] { "", "&a☢ &cMức phóng xạ: Vừa", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	ENRICHED_NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MThhYTEzYWFiYzcyOTQ4MzhkMjFjYWFjMDU3ZTk3YmQ4Yzg5NjQxYTBjMGY4YTU1NDQyZmY0ZTI3In19fQ=="), "&eBăng phóng xạ Nether", new String[] { "", "&a☢ &cMức phóng xạ: Rất cao", "&4Yêu cầu mang đồ bảo hộ", "", "&7[Tài nguyên]" });
	  
	LAVA_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ=="), "&4Tinh thể Lava", new String[] { "", "&7[Vật phẩm ma thuật]" });
	ANDROID_MEMORY_CORE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&bLõi bộ nhớ Android", new String[] { "", "&7[Androids]" });
	  
	CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ=="), "&eCarbon", new String[] { "", "&7[Tài nguyên&7]" });
	COMPRESSED_CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&cCarbon nén", new String[] { "", "&7[Tài nguyên&7]" });
	CARBON_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&4Mẫu Carbon", new String[] { "", "&7[Tài nguyên&7]" });
	  
	CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJmNGIxNTc3ZjUxNjBjNjg5MzE3MjU3MWM0YTcxZDhiMzIxY2RjZWFhMDMyYzZlMGUzYjYwZTBiMzI4ZmEifX19"), "&bCarbonado", new String[] { "", "&7[Tài nguyên&7]" });
	RAW_CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0OWU2ZWMxMDc3MWU4OTkyMjVhZWE3M2NkOGNmMDM2ODRmNDExZDE0MTVjNzMyM2M5M2NiOTQ3NjIzMCJ9fX0="), "&bCarbonado thô", new String[] { "", "&7[Tài nguyên&7]" });
	  
	ENERGY_REGULATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&6Bộ quản lí năng lượng", new String[] { "", "&rCốt lỗi của hệ thống điện", "", "&7[Điện và năng lượng]" });
	  
	CARGO_MANAGER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&6Bộ quả lí Cargo", new String[] { "", "&rCốt lỗi của hệ thống Cargo", "", "&7[Cargo]" });
	CARGO_NODE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDdiN2VmNmZkNzg2NDg2NWMzMWMxZGM4N2JlZDI0YWI1OTczNTc5ZjVjNjYzOGZlY2I4ZGVkZWI0NDNmZjAifX19"), "&7Bộ kết nối Cargo", new String[] { "", "&rNối các Nút Cargo lại với nhau", "", "&7[Cargo]" });
	CARGO_INPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZkMWMxYTY5YTNkZTlmZWM5NjJhNzdiZjNiMmUzNzZkZDI1Yzg3M2EzZDhmMTRmMWRkMzQ1ZGFlNGM0In19fQ=="), "&7Nút Cargo &c(Đầu vào)", new String[] { "", "&7[Cargo]" });
	CARGO_OUTPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&7Nút Cargo &c(Đầu ra)", new String[] { "", "&7[Cargo]" });
	CARGO_OUTPUT_ADVANCED = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&6Nút Cargo nâng cao &c(Đầu ra)", new String[] { "", "&7[Cargo]" });
	  
	AUTO_BREEDER = new CustomItem(new MaterialData(Material.HAY_BLOCK), "&eMáy phối giống động vật", new String[] { "", "&rHoạt động bằng &aThực phẩm hữu cơ", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &71024 J Buffer", "&8⇨ &e⚡ &760 J/Animal", "", "&7[Điện và năng lượng]" });
	ANIMAL_GROWTH_ACCELERATOR = new CustomItem(new MaterialData(Material.HAY_BLOCK), "&bMáy thúc đẩy sinh trưởng động vật", new String[] { "", "&rHoạt động bằng &aThực phẩm hữu cơ", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &71024 J Buffer", "&8⇨ &e⚡ &728 J/s", "", "&7[Điện và năng lượng]" });
	CROP_GROWTH_ACCELERATOR = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)5), "&aMáy thúc đẩy sinh trưởng thực vật&7 - &fI", new String[] { "", "&rHoạt động bằng &aPhân bón hữu cơ", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Phạm vi: 7x7", "&8⇨ &7Tốc độ: &a3/time", "&8⇨ &e⚡ &71024 J Buffer", "&8⇨ &e⚡ &750 J/s", "", "&7[Điện và năng lượng]" });
	CROP_GROWTH_ACCELERATOR_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte)5), "&aMáy thúc đẩy sinh trưởng thực vật &7- &fII", new String[] { "", "&rHoạt động bằng &aPhân bón hữu cơ", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Phạm vi: 9x9", "&8⇨ &7Tốc độ: &a4/time", "&8⇨ &e⚡ &71024 J Buffer", "&8⇨ &e⚡ &760 J/s", "", "&7[Điện và năng lượng]" });
	XP_COLLECTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc2MmExNWIwNDY5MmEyZTRiM2ZiMzY2M2JkNGI3ODQzNGRjZTE3MzJiOGViMWM3YTlmN2MwZmJmNmYifX19"), "&aMáy dữ trữ exp", new String[] { "", "&rTự hút exp xung quanh và lưu trữ", "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &e⚡ &71024 J Buffer", "&8⇨ &e⚡ &720 J/s", "", "&7[Điện và năng lượng]" });
	  
	ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9X", "", "&7[Linh tinh]" });
	ORGANIC_FOOD2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Lúa", "", "&7[Linh tinh]" });
	ORGANIC_FOOD3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Cà rốt", "", "&7[Linh tinh]" });
	ORGANIC_FOOD4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Khoai tây", "", "&7[Linh tinh]" });
	ORGANIC_FOOD5 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Hạt giống", "", "&7[Linh tinh]" });
	ORGANIC_FOOD6 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Củ dền", "", "&7[Linh tinh]" });
	ORGANIC_FOOD7 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Dưa", "", "&7[Linh tinh]" });
	ORGANIC_FOOD8 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Táo", "", "&7[Linh tinh]" });
	  
	FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9X", "", "&7[Linh tinh]" });
	FERTILIZER2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Lúa", "", "&7[Linh tinh]" });
	FERTILIZER3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Cà rốt", "", "&7[Linh tinh]" });
	FERTILIZER4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Khoai tây", "", "&7[Linh tinh]" });
	FERTILIZER5 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Hạt giống", "", "&7[Linh tinh]" });
	FERTILIZER6 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Củ dền", "", "&7[Linh tinh]" });
	FERTILIZER7 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Dưa", "", "&7[Linh tinh]" });
	FERTILIZER8 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aThực phẩm hữu cơ", new String[] { "", "&7Loại: &9Táo", "", "&7[Linh tinh]" });
	  
	NETHER_ICE_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQzY2Q0MTI1NTVmODk3MDE2MjEzZTVkNmM3NDMxYjQ0OGI5ZTU2NDRlMWIxOWVjNTFiNTMxNmYzNTg0MGUwIn19fQ=="), "&6Băng tản nhiệt Nether", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	REACTOR_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU0MDczYmU0MGNiM2RlYjMxMGEwYmU5NTliNGNhYzY4ZTgyNTM3MjcyOGZhZmI2YzI5NzNlNGU3YzMzIn19fQ=="), "&bBăng tản nhiệt", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	  
	CHEST_TERMINAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0NGZmM2E1ZjQ5YzY5Y2FiNjc2YmFkOGQ5OGEwNjNmYTc4Y2ZhNjE5MTZmZGVmM2UyNjc1NTdmZWMxODI4MyJ9fX0="), "&3CT Access Terminal", new String[] { "&7If this Block is connected to a", "&7Cargo Network, it will allow you to remotely", "&7interact with any Items supplied by", "&7Nodes tuned into the ChestTerminal Channel" });
	CT_IMPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3CT Import Bus", new String[] { "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the Inventory it is attached to and place it", "&7into the CT Network Channel" });
	CT_EXPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3CT Export Bus", new String[] { "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the CT Network Channel and place these", "&7into the Inventory it is attached to" });
	  
	FREEZER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)3), "&bMáy đông lạnh&7 - &fI", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 1x", "&8⇨ &e⚡ &7256 J Buffer", "&8⇨ &e⚡ &718 J/s", "", "&7[Điện và năng lượng]" });
	FREEZER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte)3), "&bMáy đông lạnh&7 - &fII", new String[] { "", "&7[&cMáy tiêu thụ điện&7]", "", "&8⇨ &7Tốc độ: 2x", "&8⇨ &e⚡ &7256 J Buffer", "&8⇨ &e⚡ &730 J/s", "", "&7[Điện và năng lượng]" });
	  
	BATTERY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyZGRhNmVmNjE4NWQ0ZGQ2ZWE4Njg0ZTk3ZDM5YmE4YWIwMzdlMjVmNzVjZGVhNmJkMjlkZjhlYjM0ZWUifX19"), "&6Pin", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	  
	HEATING_COIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0="), "&cỐng xoắn gia nhiệt", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	COOLING_UNIT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzU0YmFkODZjOTlkZjc4MGM4ODlhMTA5OGY3NzY0OGVhZDczODVjYzFkZGIwOTNkYTVhN2Q4YzRjMmFlNTRkIn19fQ=="), "&bBộ làm mát", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	POWER_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0="), "&cTinh thể điện", new String[] { "", "&7[Linh kiện kĩ thuật]" });
	} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
