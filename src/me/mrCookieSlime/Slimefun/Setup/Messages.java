package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Localization;

public class Messages {
	
	public static Localization local;
	
	public static void setup() {
		local.setPrefix("&aSlimefun &7> ");
		local.setDefault("messages.not-researched", "&4Bạn chưa mở khóa vật phẩm này");
		local.setDefault("messages.not-enough-xp", "&4Không đủ exp");
		local.setDefault("messages.unlocked", "&bBạn đã mở khóa &7\"%research%\"");
		local.setDefault("messages.fortune-cookie", new String[] {"&bMột trong những lời kì lạ là cái bánh này chẳng có gì kì lạ hết"});
		local.setDefault("commands.help", "Hiện danh sách lệnh");
		local.setDefault("commands.cheat", "Lấy vật phẩm Slimefun");
		local.setDefault("commands.give", "Cho người chơi vài vật phẩm Slimefun");
		local.setDefault("commands.research.desc", "Mở khóa vật phẩm cho người chơi");
		local.setDefault("commands.guide", "Lấy sách hướng dẫn Slimefun");
		local.setDefault("commands.timings", "Thông tin về Server");
		local.setDefault("commands.teleporter", "Xem các điểm tham chiếu của người chơi");
		local.setDefault("commands.versions", "Danh sách các Addon đã tải");
		local.setDefault("commands.open_guide", "Mở giao diện Slimefun mà không cần sách");
		
		local.setDefault("messages.only-players", "&4Câu lệnh chỉ dành cho người chơi");
		local.setDefault("messages.no-permission", "&4Bạn không có quyền để thực hiện");
		local.setDefault("messages.usage", "&4Sử dụng: &c%usage%");
		local.setDefault("messages.not-online", "&4%player% &ckhông trực tuyến!");
		local.setDefault("messages.not-valid-item", "&4%item% &ckhông phải là vật phẩm hợp lệ!");
		local.setDefault("messages.not-valid-amount", "&4%amount% &clà số không hợp lệ!");
		local.setDefault("messages.given-item", "&bBạn đã nhận được &a%amount% &7\"%item%&7\"");
		local.setDefault("messages.give-item", "&bBạn đã tặng %player% &a%amount% &7\"%item%&7\"");
		local.setDefault("messages.not-valid-research", "&4%research% &ckhông hợp lệ!");
		local.setDefault("messages.give-research", "&bBạn đã giúp %player% mở khóa &7\"%research%&7\"");
		local.setDefault("messages.battery.add", "&2+ &7%charge% J &8(%machine%)");
		local.setDefault("messages.battery.remove", "&4- &7%charge% J &8(%machine%)");
		local.setDefault("messages.hungry", "&cBạn không đủ độ đói!");
		local.setDefault("messages.mode-change", "&bĐã chuyển sang: &9%mode%");
		local.setDefault("messages.disabled-in-world", "&4&lVật phẩm bị vô hiệu hóa trong thế giới này");
		local.setDefault("messages.talisman.anvil", "&a&oBùa hộ mệnh đã bảo vệ vật phẩm của bạn khỏi bị vở");
		local.setDefault("messages.talisman.caveman", "&aBạn đã nhận được hiệu ứng Haste từ bùa hộ mệnh");
		local.setDefault("messages.talisman.wise", "&aBùa hộ mệnh đã gấp đôi kinh nghiệm cho bạn");
		local.setDefault("messages.talisman.miner", "&a&oBùa hộ mệnh gấp đôi vật phẩm rơi ra");
		local.setDefault("messages.talisman.hunter", "&a&oBùa hộ mệnh gấp đôi vật phẩm rơi ra");
		local.setDefault("messages.talisman.lava", "&a&oBùa hộ mệnh đã cứu bạn khỏi bị cháy");
		local.setDefault("messages.talisman.water", "&a&oBùa hộ mệnh đã cứu bạn khỏi chết đuối");
		local.setDefault("messages.talisman.angel", "&a&oBùa hộ mệnh đã cứu bạn khỏi té chết");
		local.setDefault("messages.talisman.fire", "&a&oBùa hộ mệnh đã cứu bạn khỏi bị cháy");
		local.setDefault("messages.talisman.magician", "&a&oBùa hộ mệnh đã thêm phù phép vào vật phẩm");
		local.setDefault("messages.talisman.traveller", "&a&oBùa hộ mệnh đã cho bạn tốc độ");
		local.setDefault("messages.talisman.warrior", "&a&oBùa hộ mệnh đã cho bạn sức mạnh");
		local.setDefault("messages.talisman.knight", "&a&oBùa hộ mệnh đã cho bạn khả năng hồi máu trong 5 giây");
		local.setDefault("messages.talisman.whirlwind", "&a&oBùa hộ mệnh đã phản sát thương từ vật bắn");
		local.setDefault("messages.talisman.wizard", "&a&o&a&oBùa hộ mệnh đã cho bạn cấp độ Gia tài cao hơn nhưng sẽ hạ cấp các phù phép khác");
		local.setDefault("messages.broken-leg", "&c&oSeems like you broke your Leg, maybe a Splint could help?");
		local.setDefault("messages.fixed-leg", "&a&oThe Splint helps. It feels better now.");
		local.setDefault("messages.start-bleeding", "&c&oYou started to bleed. Maybe a Bandage could help?");
		local.setDefault("messages.stop-bleeding", "&a&oThe Bandage helps. The Bleeding has stopped!");
		local.setDefault("messages.disabled-item", "&4&lVật phẩm này đã bị vô hiệu hóa");
		local.setDefault("messages.research.start", "&7Các vị thần cổ đại đang thì thầm những lời kì lạ vào tai bạn!");
		local.setDefault("messages.research.progress", "&7Bạn đang giải quyết các thắc mắc về &b%research% &e(%progress%)");
		local.setDefault("commands.stats", "Xem tiến trình người chơi");
		local.setDefault("messages.fire-extinguish", "&7Đã dập lửa");
		local.setDefault("machines.pattern-not-found", "&eSai công thức");
		local.setDefault("machines.unknown-material", "&eKhông thể nhận ra vật phẩm bên trong Dispenser");
		local.setDefault("machines.wrong-item", "&eKhông thể nhận ra vật phẩm trên tay");
		local.setDefault("machines.full-inventory", "&eDispener đã đầy");
		local.setDefault("miner.no-ores", "&eKhông tìm thấy quặng nào ở gần!");
		local.setDefault("backpack.already-open", "&cBa lô này được mở ở nơi nào đó!");
		local.setDefault("backpack.no-stack", "&cKhông thể gộp Ba lô");
		local.setDefault("workbench.not-enhanced", "&4Không thể sử dụng vật phẩm này trên Bàn chế tạo bình thường");
		local.setDefault("anvil.not-working", "&4Không thể sử dụng vật phẩm này trên Đe");
		local.setDefault("commands.research.reset", "&cĐã reset kiến thức của %player%");
		local.setDefault("commands.research.reset-target", "&cKiến thức Slimefun của bạn đã bị reset");
		local.setDefault("machines.in-use", "&cGiao diện của Khối này hiện đang được mở bởi một Người chơi khác.");
		local.setDefault("machines.ignition-chamber-no-flint", "&bMáy đánh lửa tự động&c đã hết bật lửa, hãy cung cấp thêm");
    		local.setDefault("messages.cannot-place" ,"&cKhông thể đặt block ở đây!");
		
		local.setDefault("gps.waypoint.new", "&eNhập tên tham chiếu vào khung chat. &7(Hỗ trợ mã màu!)");
		local.setDefault("gps.waypoint.added", "&aĐã thêm 1 điểm tham chiếu thành công");
		local.setDefault("gps.waypoint.max", "&4Số điểm tham chiếu đã đạt tối đa");
		local.setDefault("gps.insufficient-complexity", "&4Mạng GPS không đủ phức tạp: &c%complexity%", "&4a) Bạn chưa thiết lập Mạng GPS", "&4b) Độ phức tạp Mạng GPS của bạn chưa đủ");
		local.setDefault("gps.geo.scan-required", "&4Hãy sử dụng máy quyets GEO trước");
		
		local.setDefault("robot.started", "&7Robot của bạn tiếp tục chạy tập lệnh của nó");
		local.setDefault("robot.stopped", "&7Robot của bạn đã tạp dừng tập lệnh");
		local.setDefault("inventory.no-access", "&4Bạn không có quyền truy cập khối này");
		
		local.setDefault("machines.ANCIENT_ALTAR.not-enough-pedestals", "&dBệ cổ ma thuật&4 không được bao quanh bởi các &dTrụ đỡ &c(%pedestals% / 8)");
		local.setDefault("machines.ANCIENT_ALTAR.unknown-catalyst", "&4Không rõ chất xúc tác!");
		local.setDefault("machines.ANCIENT_ALTAR.unknown-recipe", "&4Không rõ công thức!");
		local.setDefault("machines.ANCIENT_PEDESTAL.obstructed", "&dTrụ đỡ &4bị cản trở, hãy loại bỏ các block ở trên nó!");
		local.setDefault("machines.HOLOGRAM_PROJECTOR.enter-text", "&7Nhập văn bản muốn chiếu vào khung chat. &r(Hỗ trợ mã màu!)");
		local.setDefault("machines.ELEVATOR.no-destinations", "&4Không tìm thấy điểm đến");
		local.setDefault("machines.CARGO_NODES.must-be-placed", "&4Phải đặt lên rương hoặc máy");

		local.setDefault("android.scripts.already-uploaded", "&4Tập lệnh đã được tải lên.");
		local.setDefault("android.scripts.enter-name", "", "&eNhập tên cho tập lệnh", "");
		local.setDefault("android.scripts.uploaded", "&bĐang tải lên...", "&aThành công!");
		local.setDefault("android.scripts.rating.own", "&4Không thể bình chọn cho tập lệnh của chính bạn!");
		local.setDefault("android.scripts.rating.already", "&4Bạn đã để lại 1 bình chọn về tập lệnh này!");
		
		local.save();
	}

}
