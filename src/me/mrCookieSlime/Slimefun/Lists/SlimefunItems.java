package me.mrCookieSlime.Slimefun.Lists;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomPotion;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.Christmas;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

@SuppressWarnings("deprecation")
public class SlimefunItems {
	
	/*		 Items 		*/
	public static ItemStack PORTABLE_CRAFTER = new CustomItem(Material.BOOK, "&6便携式合成台", 0, new String[] {"&a随时随地合成物品", "", "&e右键&7 打开"});
	public static ItemStack PORTABLE_DUSTBIN = null;
	public static ItemStack ENDER_BACKPACK = null;
	public static ItemStack MAGIC_EYE_OF_ENDER = new CustomItem(Material.EYE_OF_ENDER, "&6&l魔法末影眼", 0, new String[] {"&c需要全套的&d末影护甲&c才能使用", "", "&7&e右键点击&7 可以发射一颗末影珍珠"});
	public static ItemStack BROKEN_SPAWNER = new CustomItem(new MaterialData(Material.MOB_SPAWNER), "&c破损的刷怪笼", "&7类型: &b<Type>", "", "&c已损坏, 必须使用远古祭坛修复后方可使用");
	public static ItemStack REPAIRED_SPAWNER = new CustomItem(Material.MOB_SPAWNER, "&b强化刷怪笼", 0, new String[] {"&7类型: &b<Type>"});
	public static ItemStack INFERNAL_BONEMEAL = new CustomItem(new MaterialData(Material.INK_SACK, (byte) 15), "&4地狱骨粉", "", "&c来自下界的骨粉", "&c可以用于催熟地狱疣");
	
	/*		 Gadgets 		*/
	public static ItemStack GOLD_PAN = new CustomItem(Material.BOWL, "&6淘洗盘", 0, new String[] {"&a可以将砂砾变废为宝...", "", "&7&e右键点击&7 砂砾对其进行淘洗"});
	public static ItemStack PARACHUTE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&r&l降落伞", 0, new String[] {"", "&7按住 &eShift&7 使用"}), Color.WHITE);
	public static ItemStack GRAPPLING_HOOK = new CustomItem(Material.LEASH, "&6抓钩", 0, new String[] {"", "&7&e右键点击&7 以使用"});
	public static ItemStack SOLAR_HELMET = new CustomItem(Material.IRON_HELMET, "&b太阳能头盔", 0, new String[] {"", "&a为你手持的耗电物品进行充电"});
	public static ItemStack CLOTH = new CustomItem(Material.PAPER, "&b布", 0);
	public static ItemStack CAN = null;
	public static ItemStack NIGHT_VISION_GOGGLES = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a夜视仪", 0, new String[] {"", "&9+ 夜视"}), Color.BLACK);
	public static ItemStack FARMER_SHOES = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e神农靴", 0, new String[] {"", "&6穿着它, 庄稼再也不会被踩坏"}), Color.YELLOW);
	public static ItemStack INFUSED_MAGNET = null;
	public static ItemStack FLASK_OF_KNOWLEDGE = new CustomItem(Material.GLASS_BOTTLE, "&c工匠弗拉斯克的神技", 0, new String[] {"", "&r魔法工匠大师弗拉斯克独创的技术", "&r让你你可以把经验存入瓶子", "&7消耗: &a1 级"});
	public static ItemStack RAG = new CustomItem(Material.PAPER, "&c布片", 0, new String[] {"", "&a等级 I - 医疗补给品", "", "&r恢复 2 ❤", "&r灭火", "", "&7&e右键点击&7 以使用"});
	public static ItemStack BANDAGE = new CustomItem(Material.PAPER, "&c绷带", 0, new String[] {"", "&a等级 II - 医疗补给品", "", "&r恢复 4 ❤", "&r灭火", "", "&7&e右键点击&7 以使用"});
	public static ItemStack SPLINT = new CustomItem(Material.STICK, "&c夹板", 0, new String[] {"", "&a等级 I - 医疗补给品", "", "&r恢复 2 ❤", "", "&7&e右键点击&7 以使用"});
	public static ItemStack VITAMINS = new CustomItem(Material.NETHER_STALK, "&c维他命", 0, new String[] {"", "&a等级 III - 医疗补给品", "", "&r恢复 4 ❤", "&r灭火", "&r可治疗 中毒/凋零/辐射", "", "&7&e右键点击&7 以使用"});
	public static ItemStack MEDICINE = new CustomItem(Material.POTION, "&c药片", 8229, new String[] {"", "&a等级 III - 医疗补给品", "", "&r恢复 4 ❤", "&r灭火", "&r可治疗 中毒/凋零/辐射", "", "&7&e右键点击&7 饮用"});
	
	/*		Backpacks		*/
	public static ItemStack BACKPACK_SMALL = null;
	public static ItemStack BACKPACK_MEDIUM = null;
	public static ItemStack BACKPACK_LARGE = null;
	public static ItemStack WOVEN_BACKPACK = null;
	public static ItemStack GILDED_BACKPACK = null;
	public static ItemStack BOUND_BACKPACK = null;
	public static ItemStack COOLER = null;
	
	public static ItemStack VOIDBAG_SMALL = null;
	public static ItemStack VOIDBAG_MEDIUM = null;
	public static ItemStack VOIDBAG_BIG = null;
	public static ItemStack VOIDBAG_LARGE = null;
	public static ItemStack BOUND_VOIDBAG = null;

	/*		 Jetpacks		*/
	public static ItemStack DURALUMIN_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &eI", "", "&8\u21E8 &7材质: &b硬铝", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7推进力: &c0.35", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack SOLDER_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &eII", "", "&8\u21E8 &7材质: &b焊材", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7推进力: &c0.4", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack BILLON_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &eIII", "", "&8\u21E8 &7材质: &b铜锡合金", "&c&o&8\u21E8 &e\u26A1 &70 / 45 J", "&8\u21E8 &7推进力: &c0.45", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &eIV", "", "&8\u21E8 &7材质: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "&8\u21E8 &7推进力: &c0.5", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &eV", "", "&8\u21E8 &7材质: &b水纹钢", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7推进力: &c0.55", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &eVI", "", "&8\u21E8 &7材质: &b强化合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7推进力: &c0.6", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack CARBONADO_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &eVII", "", "&8\u21E8 &7材质: &b黑钻", "&c&o&8\u21E8 &e\u26A1 &70 / 150 J", "&8\u21E8 &7推进力: &c0.7", "", "&7按住 &eShift&7 以使用"), Color.BLACK);
	public static ItemStack ARMORED_JETPACK = new CustomItem(new MaterialData(Material.IRON_CHESTPLATE), "&9防护型喷气背包", "&8\u21E8 &7材质: &b钢", "", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7推进力: &c0.45", "", "&7按住 &eShift&7 以使用");

	/*		 Jetboots		*/
	public static ItemStack DURALUMIN_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9喷气靴 &7- &eI", "", "&8\u21E8 &7材质: &b硬铝", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7速度: &a0.35", "&8\u21E8 &7精度: &c50%", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack SOLDER_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9喷气靴 &7- &eII", "", "&8\u21E8 &7材质: &b焊材", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7速度: &a0.4", "&8\u21E8 &7精度: &660%", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack BILLON_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9喷气靴 &7- &eIII", "", "&8\u21E8 &7材质: &b铜锡合金", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7精度: &665%", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9喷气靴 &7- &eIV", "", "&8\u21E8 &7材质: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.5", "&8\u21E8 &7精度: &e70%", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack DAMASCUS_STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9喷气靴 &7- &eV", "", "&8\u21E8 &7材质: &b水纹钢", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7速度: &a0.55", "&8\u21E8 &7精度: &a75%", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack REINFORCED_ALLOY_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9喷气靴 &7- &eVI", "", "&8\u21E8 &7材质: &b强化合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7速度: &a0.6", "&8\u21E8 &7精度: &c80%", "", "&7按住 &eShift&7 以使用"), Color.SILVER);
	public static ItemStack CARBONADO_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9喷气靴 &7- &eVII", "", "&8\u21E8 &7材质: &b黑钻", "&c&o&8\u21E8 &e\u26A1 &70 / 125 J", "&8\u21E8 &7速度: &a0.7", "&8\u21E8 &7精度: &c99.9%", "", "&7按住 &eShift&7 以使用"), Color.BLACK);
	public static ItemStack ARMORED_JETBOOTS = new CustomItem(new MaterialData(Material.IRON_BOOTS), "&9防护型喷气靴", "", "&8\u21E8 &7材质: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7精度: &e70%", "", "&7按住 &eShift&7 以使用");

	/*		 Multi Tools		*/
	public static ItemStack DURALUMIN_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具 &7- &eI", "", "&8\u21E8 &7材质: &b硬铝", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "", "&7&e右键点击&7 以使用", "&7按住 &eShift + 右键点击&7 以修改模式");
	public static ItemStack SOLDER_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具 &7- &eII", "", "&8\u21E8 &7材质: &b焊材", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "", "&7&e右键点击&7 以使用", "&7按住 &eShift + 右键点击&7 以修改模式");
	public static ItemStack BILLON_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具 &7- &eIII", "", "&8\u21E8 &7材质: &b铜锡合金", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "", "&7&e右键点击&7 以使用", "&7按住 &eShift + 右键点击&7 以修改模式");
	public static ItemStack STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具 &7- &eIV", "", "&8\u21E8 &7材质: &b钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "", "&7&e右键点击&7 以使用", "&7按住 &eShift + 右键点击&7 以修改模式");
	public static ItemStack DAMASCUS_STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具 &7- &eV", "", "&8\u21E8 &7材质: &b水纹钢", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "", "&7&e右键点击&7 以使用", "&7按住 &eShift + 右键点击&7 以修改模式");
	public static ItemStack REINFORCED_ALLOY_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具 &7- &eVI", "", "&8\u21E8 &7材质: &b强化合金", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "", "&7&e右键点击&7 以使用", "&7按住 &eShift + 右键点击&7 以修改模式");
	public static ItemStack CARBONADO_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多功能工具 &7- &eVII", "", "&8\u21E8 &7材质: &b黑钻", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "", "&7&e右键点击&7 以使用", "&7按住 &eShift + 右键点击&7 以修改模式");

	/*		 Food 		*/
	public static ItemStack FORTUNE_COOKIE = new CustomItem(Material.COOKIE, "&6幸运曲奇", 0, new String[] {"", "&a幸运?亦或是霉运? :o"});
	public static ItemStack BEEF_JERKY = new CustomItem(Material.COOKED_BEEF, "&6牛肉干", 0, new String[] {"", "&a肉厚满足"});
	public static ItemStack MAGIC_SUGAR = new CustomItem(Material.SUGAR, "&6魔法糖", 0, new String[] {"", "&a你感到浑身充满了力量!"});
	public static ItemStack MONSTER_JERKY = new CustomItem(Material.ROTTEN_FLESH, "&6怪物肉干", 0, new String[] {"", "&a再也不会挨饿了"});
	public static ItemStack APPLE_JUICE = new CustomPotion("&c苹果汁", 8197, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack MELON_JUICE = new CustomPotion("&c西瓜汁", 8197, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack CARROT_JUICE = new CustomPotion("&6胡萝卜汁", 8195, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack PUMPKIN_JUICE = new CustomPotion("&6南瓜汁", 8195, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
	public static ItemStack GOLDEN_APPLE_JUICE = new CustomPotion("&b金苹果汁", 8195, new String[0], new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0));

	/*		Christmas		*/
	public static ItemStack CHRISTMAS_MILK = new CustomPotion("&6瓶装牛奶", 8194, new String[0], new PotionEffect(PotionEffectType.SATURATION, 5, 0));
	public static ItemStack CHRISTMAS_CHOCOLATE_MILK = new CustomPotion("&6巧克力奶", 8201, new String[0], new PotionEffect(PotionEffectType.SATURATION, 12, 0));
	public static ItemStack CHRISTMAS_EGG_NOG = new CustomPotion("&a蛋奶酒", 8194, new String[0], new PotionEffect(PotionEffectType.SATURATION, 7, 0));
	public static ItemStack CHRISTMAS_APPLE_CIDER = new CustomPotion("&c苹果酒", 8197, new String[0], new PotionEffect(PotionEffectType.SATURATION, 14, 0));
	public static ItemStack CHRISTMAS_COOKIE = new CustomItem(Material.COOKIE, Christmas.color("圣诞曲奇"), 0);
	public static ItemStack CHRISTMAS_FRUIT_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("水果蛋糕"), 0);
	public static ItemStack CHRISTMAS_APPLE_PIE = new CustomItem(Material.PUMPKIN_PIE, "&r苹果派", 0);
	public static ItemStack CHRISTMAS_HOT_CHOCOLATE = new CustomPotion("&6热巧克力", 8201, new String[0], new PotionEffect(PotionEffectType.SATURATION, 14, 0));
	public static ItemStack CHRISTMAS_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("圣诞蛋糕"), 0);
	public static ItemStack CHRISTMAS_CARAMEL = new CustomItem(Material.CLAY_BRICK, "&6焦糖", 0);
	public static ItemStack CHRISTMAS_CARAMEL_APPLE = new CustomItem(Material.APPLE, "&6焦糖苹果", 0);
	public static ItemStack CHRISTMAS_CHOCOLATE_APPLE = new CustomItem(Material.APPLE, "&6巧克力苹果", 0);
	public static ItemStack CHRISTMAS_PRESENT = new CustomItem(Material.CHEST, Christmas.color("圣诞礼物"), 0, new String[] {"&7来自: &emrCookieSlime", "&7给: &e你", "", "&e右键点击&7 以打开"});

	/*		Easter			*/
	public static ItemStack EASTER_EGG = new CustomItem(Material.EGG, "&r复活节彩蛋", 0, new String[] {"&b惊喜! 惊喜!"});
	public static ItemStack EASTER_CARROT_PIE = new CustomItem(Material.PUMPKIN_PIE, "&6胡萝卜派", 0);

	/*		 Weapons 		*/
	public static ItemStack GRANDMAS_WALKING_STICK = new CustomItem(Material.STICK, "&7祖母的手杖", 0, new String[0], new String[] {"KNOCKBACK-2"});
	public static ItemStack GRANDPAS_WALKING_STICK = new CustomItem(Material.STICK, "&7祖父的手杖", 0, new String[0], new String[] {"KNOCKBACK-5"});
	public static ItemStack SWORD_OF_BEHEADING = new CustomItem(Material.IRON_SWORD, "&6斩首剑", 0, new String[] {"&7斩首 II", "", "&r有机会斩下怪物头颅", "&r(也会提高砍下凋零头颅的几率)"});
	public static ItemStack BLADE_OF_VAMPIRES = new CustomItem(Material.GOLD_SWORD, "&c暗裔之剑", 0, new String[] {"&7生命偷取 I", "", "&r传说是德古拉一族使用的武器", "&r攻击时有45%几率", "&r偷取 1❤"}, new String[] {"FIRE_ASPECT-2", "DURABILITY-4", "DAMAGE_ALL-2"});
	public static ItemStack SEISMIC_AXE = new CustomItem(Material.IRON_AXE, "&a地震斧", 0, new String[] {"", "&7随时随地震飞敌人...", "", "&7&e右键点击&7 以使用"});

	/*		Bows		*/
	public static ItemStack EXPLOSIVE_BOW = new CustomItem(Material.BOW, "&c爆炸弓", 0, new String[] {"&r用这把弓射出的箭", "&r都会把敌人给炸上天"});
	public static ItemStack ICY_BOW = new CustomItem(Material.BOW, "&b寒霜弓", 0, new String[] {"&r用这把弓射出的箭", "&r都会将敌人", "&r冻结2秒"});

	/*		 Tools		*/
	public static ItemStack AUTO_SMELT_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&6冶炼之镐", 0, new String[] {"&c&l自动烧炼挖到的矿物", "", "&9免去了使用熔炉烧炼的麻烦"});
	public static ItemStack LUMBER_AXE = new CustomItem(Material.DIAMOND_AXE, "&6伐木斧", 0, new String[] {"&a一斧子就能砍倒整棵树..."});
	public static ItemStack PICKAXE_OF_CONTAINMENT = new CustomItem(Material.IRON_PICKAXE, "&c精确之镐", 0, new String[] {"", "&9能够挖下刷怪笼"});
	public static ItemStack HERCULES_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9赫拉克勒斯的镐", 0, new String[] {"", "&r它是如此强力", "&r以至于可以在挖掘任何矿物时", "&r直接将其变为粉末..."}, new String[] {"DURABILITY-2", "DIG_SPEED-4"});
	public static ItemStack EXPLOSIVE_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&e爆炸镐", 0, new String[] {"", "&r可以极大提升你的挖掘速度", "&r一次可以挖掘多个方块...", "", "&9Works with Fortune"});
	public static ItemStack PICKAXE_OF_THE_SEEKER = new CustomItem(Material.DIAMOND_PICKAXE, "&a寻找者之镐", 0, new String[] {"&r使用它可以使你转向在你附近的矿物的方向", "&r但这有几率会造成镐子损坏", "", "&7&e右键点击&7 使用"});
	public static ItemStack COBALT_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9钴镐", 0, new String[] {}, new String[] {"DURABILITY-3", "DIG_SPEED-6"});
	public static ItemStack PICKAXE_OF_VEIN_MINING = new CustomItem(Material.DIAMOND_PICKAXE, "&e矿脉镐", 0, new String[] {"", "&r矿脉镐可以一次挖下整块矿脉", "&r提升你的挖矿效率..."});

	/*		 Armor 		*/
	public static ItemStack GLOWSTONE_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&e&l萤石头盔", 0, new String[] {"", "&a使你能如太阳般闪耀!", "", "&9+ 夜视"}), Color.YELLOW);
	public static ItemStack GLOWSTONE_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&e&l萤石胸甲", 0, new String[] {"", "&a使你能如太阳般闪耀!", "", "&9+ 夜视"}), Color.YELLOW);
	public static ItemStack GLOWSTONE_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&e&l萤石护腿", 0, new String[] {"", "&a使你能如太阳般闪耀!", "", "&9+ 夜视"}), Color.YELLOW);
	public static ItemStack GLOWSTONE_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e&l萤石靴子", 0, new String[] {"", "&a使你能如太阳般闪耀!", "", "&9+ 夜视"}), Color.YELLOW);
	public static ItemStack ENDER_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&5&l末影头盔", 0, new String[] {"", "&a让你如幻影般移动!"}), Color.fromRGB(28, 25, 112));
	public static ItemStack ENDER_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&5&l末影胸甲", 0, new String[] {"", "&a让你如幻影般移动!"}), Color.fromRGB(28, 25, 112));
	public static ItemStack ENDER_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&5&l末影护腿", 0, new String[] {"", "&a让你如幻影般移动!"}), Color.fromRGB(28, 25, 112));
	public static ItemStack ENDER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&5&l末影靴子", 0, new String[] {"", "&a让你如幻影般移动!", "" , "&9+ 无传送伤害"}), Color.fromRGB(28, 25, 112));
	public static ItemStack SLIME_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a&l史莱姆头盔", 0, new String[] {"", "&a感觉..弹弹的.."}), Color.LIME);
	public static ItemStack SLIME_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&a&l史莱姆胸甲", 0, new String[] {"", "&a感觉..弹弹的.."}), Color.LIME);
	public static ItemStack SLIME_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&a&l史莱姆护腿", 0, new String[] {"", "&a感觉..弹弹的..", "", "&9+ 速度"}), Color.LIME);
	public static ItemStack SLIME_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&a&l史莱姆靴子", 0, new String[] {"", "&a感觉..弹弹的..", "", "&9+ 弹跳", "&9- 掉落伤害"}), Color.LIME);
	public static ItemStack CACTUS_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&2仙人掌头盔", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack CACTUS_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2仙人掌胸甲", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack CACTUS_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&2仙人掌护腿", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack CACTUS_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2仙人掌靴子", 0, new String[0], new String[] {"THORNS-3", "DURABILITY-5"}), Color.GREEN);
	public static ItemStack DAMASCUS_STEEL_HELMET = new CustomItem(Material.IRON_HELMET, "&7水纹钢头盔", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&7水纹钢胸甲", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&7水纹钢护腿", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack DAMASCUS_STEEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&7水纹钢靴子", new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
	public static ItemStack REINFORCED_ALLOY_HELMET = new CustomItem(Material.IRON_HELMET, "&b强化头盔", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&b强化胸甲", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&b强化护腿", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack REINFORCED_ALLOY_BOOTS = new CustomItem(Material.IRON_BOOTS, "&b强化靴子", new String[] {"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
	public static ItemStack SCUBA_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&c潜水头盔", 0, new String[] {"", "&bAllows you to breathe Underwater", "&4防护服套装的部分"}), Color.ORANGE);
	public static ItemStack HAZMATSUIT_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&c防护服", 0, new String[] {"", "&b避免你被火焰烧伤", "&4防护服套装的部分"}), Color.ORANGE);
	public static ItemStack HAZMATSUIT_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&c防护裤", 0, new String[] {"", "&4防护服套装的部分"}), Color.ORANGE);
	public static ItemStack RUBBER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&c橡胶靴", 0, new String[] {"", "&4防护服套装的部分"}), Color.BLACK);
	public static ItemStack GILDED_IRON_HELMET = new CustomItem(Material.GOLD_HELMET, "&6镀金铁盔", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_CHESTPLATE = new CustomItem(Material.GOLD_CHESTPLATE, "&6镀金铁铠", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_LEGGINGS = new CustomItem(Material.GOLD_LEGGINGS, "&6镀金铁护腿", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GILDED_IRON_BOOTS = new CustomItem(Material.GOLD_BOOTS, "&6镀金铁靴", new String[] {"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
	public static ItemStack GOLD_HELMET = new CustomItem(Material.GOLD_HELMET, "&6金质头盔", 0, new String[] {"&912-K"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_CHESTPLATE = new CustomItem(Material.GOLD_CHESTPLATE, "&6金质胸甲", 0, new String[] {"&912-K"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_LEGGINGS = new CustomItem(Material.GOLD_LEGGINGS, "&6金质护腿", 0, new String[] {"&912-K"}, new String[] {"DURABILITY-10"});
	public static ItemStack GOLD_BOOTS = new CustomItem(Material.GOLD_BOOTS, "&6金质靴子", 0, new String[] {"&912-K"}, new String[] {"DURABILITY-10"});
	public static ItemStack SLIME_HELMET_STEEL = new CustomItem(Material.IRON_HELMET, "&a&l史莱姆头盔", 0, new String[] {"&7已强化", "", "&a感觉..弹弹的.."}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_CHESTPLATE_STEEL = new CustomItem(Material.IRON_CHESTPLATE, "&a&l史莱姆胸甲", 0, new String[] {"&7已强化", "", "&a感觉..弹弹的.."}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_LEGGINGS_STEEL = new CustomItem(Material.IRON_LEGGINGS, "&a&l史莱姆护腿", 0, new String[] {"&7已强化", "", "&a感觉..弹弹的..", "", "&9+ 速度"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack SLIME_BOOTS_STEEL = new CustomItem(Material.IRON_BOOTS, "&a&l史莱姆靴子", 0, new String[] {"&7已强化", "", "&a感觉..弹弹的..", "", "&9+ 跳跃", "&9- 掉落伤害"}, new String[] {"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
	public static ItemStack BOOTS_OF_THE_STOMPER = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&b震地靴", 0, new String[] {"", "&9你所受到的掉落伤害", "&9会同时给予你附近的怪物/玩家", "", "&9- 掉落伤害"}), Color.AQUA);
	public static ItemStack HEAVY_METAL_HELMET = new CustomItem(Material.IRON_HELMET, "&c重型头盔", 0, new String[] {"", "&9+ 力量", "&9- 速度"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&c重型胸甲", 0, new String[] {"", "&9+ 力量", "&9- 速度"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&c重型护腿", 0, new String[] {"", "&9+ 力量", "&9- 速度"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
	public static ItemStack HEAVY_METAL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&c重型靴子", 0, new String[] {"", "&9+ 力量", "&9- 速度"}, new String[] {"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});

	/*		 Misc 		*/
	public static ItemStack MAGIC_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&6魔法结晶 &7- &eI", 0, new String[] {"", "&c品级: I"});
	public static ItemStack MAGIC_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&6魔法结晶 &7- &eII", 0, new String[] {"", "&c品级: II"});
	public static ItemStack MAGIC_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&6魔法结晶 &7- &eIII", 0, new String[] {"", "&c品级: III"});
	public static ItemStack ENDER_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&5末影结晶 &7- &eI", 0, new String[] {"", "&c品级: I"});
	public static ItemStack ENDER_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&5末影结晶 &7- &eII", 0, new String[] {"", "&c品级: II"});
	public static ItemStack ENDER_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&5末影结晶 &7- &eIII", 0, new String[] {"", "&c品级: III"});
	public static ItemStack MAGICAL_BOOK_COVER = new CustomItem(Material.PAPER, "&6魔法书的封面", 0, new String[] {"", "&a用于包装各种魔法书"});
	public static ItemStack BASIC_CIRCUIT_BOARD = new CustomItem(Material.ACTIVATOR_RAIL, "&b基础电路板", 0);
	public static ItemStack ADVANCED_CIRCUIT_BOARD = new CustomItem(Material.POWERED_RAIL, "&b高级电路板", 0);
	public static ItemStack WHEAT_FLOUR = new CustomItem(Material.SUGAR, "&r小麦粉", 0);
	public static ItemStack STEEL_PLATE = new CustomItem(Material.PAPER, "&7&l钢板", 0);
	public static ItemStack COMPRESSED_CARBON = null;
	public static ItemStack BATTERY = null;
	public static ItemStack CARBON_CHUNK = null;
	public static ItemStack STEEL_THRUSTER = new CustomItem(Material.BUCKET, "&7&l钢制推进器", 0);
	public static ItemStack POWER_CRYSTAL = null;
	public static ItemStack CHAIN = new CustomItem(Material.STRING, "&b链", 0);
	public static ItemStack HOOK = new CustomItem(Material.FLINT, "&b钩", 0);
	public static ItemStack SIFTED_ORE = new CustomItem(Material.SULPHUR, "&6筛选矿", 0);
	public static ItemStack STONE_CHUNK = null;
	public static ItemStack LAVA_CRYSTAL = null;
	public static ItemStack SALT = new CustomItem(Material.SUGAR, "&r盐", 0);
	public static ItemStack BUTTER = null;
	public static ItemStack CHEESE = null;
	public static ItemStack HEAVY_CREAM = new CustomItem(Material.SNOW_BALL, "&r重奶油", 0);
	public static ItemStack CRUSHED_ORE = new CustomItem(Material.SULPHUR, "&6碎矿", 0);
	public static ItemStack PULVERIZED_ORE = new CustomItem(Material.SULPHUR, "&6粉状矿", 0);
	public static ItemStack PURE_ORE_CLUSTER = new CustomItem(Material.SULPHUR, "&6纯矿群", 0);
	public static ItemStack TINY_URANIUM = null;
	public static ItemStack SMALL_URANIUM = null;
	public static ItemStack MAGNET = null;
	public static ItemStack NECROTIC_SKULL = new CustomItem(new MaterialData(Material.SKULL_ITEM, (byte) 1).toItemStack(1), "&c坏死的颅骨");
	public static ItemStack ESSENCE_OF_AFTERLIFE = new CustomItem(Material.SULPHUR, "&4基础再生材料", 0);
	public static ItemStack ELECTRO_MAGNET = null;
	public static ItemStack HEATING_COIL = null;
	public static ItemStack COOLING_UNIT = null;
	public static ItemStack ELECTRIC_MOTOR = null;
	public static ItemStack CARGO_MOTOR = null;
	public static ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new CustomItem(Material.PAPER, "&6坐标传送卷轴", 0, new String[] {"", "&c这个卷轴可以创造", "&c一个临时的传送门", "&c并将其附近的实体", "&c全部传送到另一个传送门出口", "&c并且所有被传送的实体都会反向", "", "&r换句话说: 所有实体都会转180度"});
	public static ItemStack TOME_OF_KNOWLEDGE_SHARING = new CustomItem(Material.BOOK, "&6知识共享之书", 0, new String[] {"&7所有人: &bNone", "", "&e右键点击&7 将这本书绑定到你自己身上", "", "", "&e右键点击&7 获取所有", "&7来自所有人的所有研究"});
	public static ItemStack HARDENED_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 8), "&7硬化玻璃", "", "&r可以抵御爆炸");
	public static ItemStack WITHER_PROOF_OBSIDIAN = new CustomItem(Material.OBSIDIAN, "&5强化黑曜石", 0, new String[] {"", "&r可以抵抗爆炸", "&r防御凋零的破坏"});
	public static ItemStack WITHER_PROOF_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&5抗凋零玻璃", "", "&r可以抵抗爆炸", "&r防御凋零的破坏");
	public static ItemStack REINFORCED_PLATE = new CustomItem(Material.PAPER, "&7强化板", 0);
	public static ItemStack ANCIENT_PEDESTAL = new CustomItem(Material.DISPENSER, "&d远古基座", 0, new String[] {"", "&5远古祭坛的组件"});
	public static ItemStack ANCIENT_ALTAR = new CustomItem(Material.ENCHANTMENT_TABLE, "&d远古祭坛", 0, new String[] {"", "&5搭建祭坛后", "&5可以执行仪式制造魔法物品"});
	public static ItemStack DUCT_TAPE = null;

	public static ItemStack RAINBOW_WOOL = new CustomItem(new MaterialData(Material.WOOL), "&5彩虹羊毛", "", "&d如彩虹般多彩的羊毛!");
	public static ItemStack RAINBOW_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5彩虹玻璃", "", "&d如彩虹般多彩的玻璃!");
	public static ItemStack RAINBOW_CLAY = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5彩虹粘土", "", "&d如彩虹般多彩的粘土!");
	public static ItemStack RAINBOW_GLASS_PANE = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5彩虹玻璃板", "", "&d如彩虹般多彩的玻璃板!");

	public static ItemStack RAINBOW_WOOL_XMAS = new CustomItem(new MaterialData(Material.WOOL), "&5彩虹羊毛 &7(圣诞版)", "", Christmas.color("< Christmas Edition >"));
	public static ItemStack RAINBOW_GLASS_XMAS = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5彩虹玻璃 &7(圣诞版)", "", Christmas.color("< Christmas Edition >"));
	public static ItemStack RAINBOW_CLAY_XMAS = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5彩虹粘土 &7(圣诞版)", "", Christmas.color("< Christmas Edition >"));
	public static ItemStack RAINBOW_GLASS_PANE_XMAS = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5彩虹玻璃板 &7(圣诞版)", "", Christmas.color("< Christmas Edition >"));

	public static ItemStack RAINBOW_WOOL_VALENTINE = new CustomItem(new MaterialData(Material.WOOL), "&5彩虹羊毛 &7(情人节版)", "", "&d< Valentine's Day Edition >");
	public static ItemStack RAINBOW_GLASS_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5彩虹玻璃 &7(情人节版)", "", "&d< Valentine's Day Edition >");
	public static ItemStack RAINBOW_CLAY_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5彩虹粘土 &7(情人节版)", "", "&d< Valentine's Day Edition >");
	public static ItemStack RAINBOW_GLASS_PANE_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5彩虹玻璃板 &7(情人节版)", "", "&d< Valentine's Day Edition >");

	/*		 Ingots 		*/
	public static ItemStack COPPER_INGOT = new CustomItem(Material.CLAY_BRICK, "&b铜锭", 0, new String[0]);
	public static ItemStack TIN_INGOT = new CustomItem(Material.IRON_INGOT, "&b锡锭", 0, new String[0]);
	public static ItemStack SILVER_INGOT = new CustomItem(Material.IRON_INGOT, "&b银锭", 0, new String[0]);
	public static ItemStack ALUMINUM_INGOT = new CustomItem(Material.IRON_INGOT, "&b铝锭", 0, new String[0]);
	public static ItemStack LEAD_INGOT = new CustomItem(Material.IRON_INGOT, "&b铅锭", 0, new String[0]);
	public static ItemStack ZINC_INGOT = new CustomItem(Material.IRON_INGOT, "&b锌锭", 0, new String[0]);
	public static ItemStack MAGNESIUM_INGOT = new CustomItem(Material.IRON_INGOT, "&b镁锭", 0, new String[0]);

	/*		Alloy (Carbon + Iron)	*/
	public static ItemStack STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b钢锭", 0, new String[0]);
	/*		Alloy (Copper + Tin)	*/
	public static ItemStack BRONZE_INGOT = new CustomItem(Material.CLAY_BRICK, "&b青铜锭", 0, new String[0]);
	/*		Alloy (Copper + Aluminum)	*/
	public static ItemStack DURALUMIN_INGOT = new CustomItem(Material.IRON_INGOT, "&b硬铝锭", 0, new String[0]);
	/*		Alloy (Copper + Silver)	*/
	public static ItemStack BILLON_INGOT = new CustomItem(Material.IRON_INGOT, "&b铜锡合金锭", 0, new String[0]);
	/*		Alloy (Copper + Zinc)	*/
	public static ItemStack BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&b黄铜锭", 0, new String[0]);
	/*		Alloy (Aluminum + Brass)	*/
	public static ItemStack ALUMINUM_BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&b铝黄铜锭", 0, new String[0]);
	/*		Alloy (Aluminum + Bronze)	*/
	public static ItemStack ALUMINUM_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&b铝青铜锭", 0, new String[0]);
	/*		Alloy (Gold + Silver + Copper)	*/
	public static ItemStack CORINTHIAN_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&b科林斯青铜锭", 0, new String[0]);
	/*		Alloy (Lead + Tin)	*/
	public static ItemStack SOLDER_INGOT = new CustomItem(Material.IRON_INGOT, "&b焊材锭", 0, new String[0]);
	/*		Alloy (Steel + Iron + Carbon)	*/
	public static ItemStack DAMASCUS_STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b水纹钢锭", 0, new String[0]);
	/*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
	public static ItemStack HARDENED_METAL_INGOT = new CustomItem(Material.IRON_INGOT, "&b&l坚硬的金属", 0);
	/*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
	public static ItemStack REINFORCED_ALLOY_INGOT = new CustomItem(Material.IRON_INGOT, "&b&l强化合金锭", 0);
	/*		Alloy (Iron + Silicon)		*/
	public static ItemStack FERROSILICON = new CustomItem(Material.IRON_INGOT, "&b含硅铁" , 0);
	/*		Alloy (Iron + Gold)			*/
	public static ItemStack GILDED_IRON = new CustomItem(Material.GOLD_INGOT, "&6&l镀金铁", 0);
	/*		Alloy (Redston + Ferrosilicon)	*/
	public static ItemStack REDSTONE_ALLOY = new CustomItem(Material.CLAY_BRICK, "&c红石合金锭", 0);
	/*		Alloy (Iron + Copper)		*/
	public static ItemStack NICKEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b镍锭" , 0);
	/*		Alloy (Nickel + Iron + Copper)		*/
	public static ItemStack COBALT_INGOT = new CustomItem(Material.IRON_INGOT, "&9钴锭" , 0);

	/*		Gold		*/
	public static ItemStack GOLD_4K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(4-K)", 0);
	public static ItemStack GOLD_6K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(6-K)", 0);
	public static ItemStack GOLD_8K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(8-K)", 0);
	public static ItemStack GOLD_10K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(10-K)", 0);
	public static ItemStack GOLD_12K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(12-K)", 0);
	public static ItemStack GOLD_14K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(14-K)", 0);
	public static ItemStack GOLD_16K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(16-K)", 0);
	public static ItemStack GOLD_18K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(18-K)", 0);
	public static ItemStack GOLD_20K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(20-K)", 0);
	public static ItemStack GOLD_22K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(22-K)", 0);
	public static ItemStack GOLD_24K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(24-K)", 0);

	/*		 Dusts 		*/
	public static ItemStack IRON_DUST = new CustomItem(Material.SULPHUR, "&6铁粉", 0);
	public static ItemStack GOLD_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6金粉", 0);
	public static ItemStack TIN_DUST = new CustomItem(Material.SUGAR, "&6锡粉", 0);
	public static ItemStack COPPER_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6铜粉", 0);
	public static ItemStack SILVER_DUST = new CustomItem(Material.SUGAR, "&6银粉", 0);
	public static ItemStack ALUMINUM_DUST = new CustomItem(Material.SUGAR, "&6铝粉", 0);
	public static ItemStack LEAD_DUST = new CustomItem(Material.SULPHUR, "&6铅粉", 0);
	public static ItemStack SULFATE = new CustomItem(Material.GLOWSTONE_DUST, "&6硫粉", 0);
	public static ItemStack ZINC_DUST = new CustomItem(Material.SUGAR, "&6锌粉", 0);
	public static ItemStack MAGNESIUM_DUST = new CustomItem(Material.SUGAR, "&6镁", 0);
	public static ItemStack CARBON = null;
	public static ItemStack SILICON = new CustomItem(Material.FIREWORK_CHARGE, "&6硅", 0);
	public static ItemStack GOLD_24K_BLOCK = new CustomItem(Material.GOLD_BLOCK, "&r金块 &7(24-K)", 0);

	/*		 Gems 		*/
	public static ItemStack SYNTHETIC_DIAMOND = new CustomItem(Material.DIAMOND, "&b人造钻石", 0);
	public static ItemStack SYNTHETIC_SAPPHIRE = new CustomItem(new MaterialData(Material.INK_SACK, (byte) 4), "&b人造刚玉");
	public static ItemStack SYNTHETIC_EMERALD = new CustomItem(Material.EMERALD, "&b人造翡翠", 0);
	public static ItemStack CARBONADO = null;
	public static ItemStack RAW_CARBONADO = null;
	public static ItemStack URANIUM = null;
	public static ItemStack NEPTUNIUM = null;
	public static ItemStack PLUTONIUM = null;
	public static ItemStack BOOSTED_URANIUM = null;

	/*		Talisman		*/
	public static ItemStack TALISMAN = new CustomItem(Material.EMERALD, "&6普通的护身符", 0);
	public static ItemStack TALISMAN_ANVIL = new CustomItem(Material.EMERALD, "&a铁砧护身符", 0, new String[] {"", "&r铁匠打造的护身符", "&r1能保护工具不会损毁, 但生效之后", "&r护身符会被消耗", "", "&4&l警告:", "&4这个护身符对于", "&4强大的工具无效", "&4因为他们过于复杂了"});
	public static ItemStack TALISMAN_MINER = new CustomItem(Material.EMERALD, "&a矿工护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有几率获得", "&r20%额外的", "&r你所挖取到的矿物"});
	public static ItemStack TALISMAN_HUNTER = new CustomItem(Material.EMERALD, "&a猎手护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有几率获得", "&r20%额外的", "&r你所杀死怪物的掉落物"});
	public static ItemStack TALISMAN_LAVA = new CustomItem(Material.EMERALD, "&a岩浆行走者护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将获得抗火能力", "&r当你落入岩浆时", "&r你会立即获得抗火效果", "&r但护身符会被立即消耗"});
	public static ItemStack TALISMAN_WATER = new CustomItem(Material.EMERALD, "&a潜水护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有几率获得", "&r在水下呼吸的能力", "&r当你在水中即将溺水时", "&r你会获得水下呼吸", "&r但护身符会被消耗"});
	public static ItemStack TALISMAN_ANGEL = new CustomItem(Material.EMERALD, "&a天使护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有几率获得", "&r75%几率保护你", "&r免受掉落伤害"});
	public static ItemStack TALISMAN_FIRE = new CustomItem(Material.EMERALD, "&a火神护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有几率获得", "&r抵抗火焰的能力", "&r当你着火时", "&r护身符也会被消耗"});
	public static ItemStack TALISMAN_MAGICIAN = new CustomItem(Material.EMERALD, "&a魔术师护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有", "&r80%额外几率获得额外的附魔", "&r有时甚至能获得额外的附魔"});
	public static ItemStack TALISMAN_TRAVELLER = new CustomItem(Material.EMERALD, "&a旅行者护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有", "&r60%的几率在奔跑时", "&r获得额外的加速效果"});
	public static ItemStack TALISMAN_WARRIOR = new CustomItem(Material.EMERALD, "&a战士护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将会在", "&r受到攻击时获得力量3", "&r但护身符会被消耗"});
	public static ItemStack TALISMAN_KNIGHT = new CustomItem(Material.EMERALD, "&a骑士护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将会在", "&r受到攻击时", "&r有30%的几率获得5秒生命恢复", "&r但护身符会被消耗"});
	public static ItemStack TALISMAN_WHIRLWIND = new CustomItem(Material.EMERALD, "&a风之护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你将有", "&r60%几率免受弓箭伤害"});
	public static ItemStack TALISMAN_WIZARD = new CustomItem(Material.EMERALD, "&a魔法师护身符", 0, new String[] {"", "&r当你背包中拥有这个护身符时", "&r你会获得增强的时运效果", "&r但需要注意的是", "&r护身符也会降低", "&r你物品上其他的附魔等级"});

	/*		Staves		*/
	public static ItemStack STAFF_ELEMENTAL = new CustomItem(Material.STICK, "&6元素之杖", 0);
	public static ItemStack STAFF_WIND = new CustomItem(Material.STICK, "&6元素之杖 &7- &b风", 0, new String[] {"", "&7属性: &b风", "", "&7&e右键点击&7 将你吹向天际"}, new String[] {"LUCK-1"});
	public static ItemStack STAFF_FIRE = new CustomItem(Material.STICK, "&6元素之杖 &7- &c火", 0, new String[] {"", "&7属性: &c火"}, new String[] {"FIRE_ASPECT-5"});
	public static ItemStack STAFF_WATER = new CustomItem(Material.STICK, "&6元素之杖 &7- &1水", 0, new String[] {"", "&7属性: &1水", "", "&7&e右键点击&7 熄灭你身上的火焰"}, new String[] {"WATER_WORKER-1"});

	/*		 Machines 		*/
	public static ItemStack GRIND_STONE = new CustomItem(Material.DISPENSER, "&b磨石", 0, new String[] {"", "&a磨碎物品以便加工使用"});
	public static ItemStack ARMOR_FORGE = new CustomItem(Material.ANVIL, "&6铠甲铸造台", 0, new String[] {"", "&a现在你可以制作更为强大的铠甲了"});
	public static ItemStack SMELTERY = new CustomItem(Material.FURNACE, "&6冶炼厂", 0, new String[] {"", "&a熔炼金属的高温熔炉"});
	public static ItemStack IGNITION_CHAMBER = new CustomItem(new ItemStack(Material.HOPPER), "&4自动点火器", "&r自动为冶炼厂点火.", "&r需要打火石", "&r必须放置在冶炼厂附近");
	public static ItemStack ORE_CRUSHER = new CustomItem(Material.DISPENSER, "&b碎矿机", 0, new String[] {"", "&a加工处理矿石, 能获得双倍矿物"});
	public static ItemStack COMPRESSOR = new CustomItem(Material.PISTON_BASE, "&b压缩机", 0, new String[] {"", "&a压缩物品"});
	public static ItemStack PRESSURE_CHAMBER = new CustomItem(Material.GLASS, "&b加压室", 0, new String[] {"", "&a高度压缩物品"});
	public static ItemStack MAGIC_WORKBENCH = new CustomItem(Material.WORKBENCH, "&6魔法合成台", 0, new String[] {"&a向物品中注入&d魔法能量"});
	public static ItemStack ORE_WASHER = new CustomItem(Material.CAULDRON_ITEM, "&6洗矿机", 0, new String[] {"", "&a清洗加工过的矿产", "&a并给你些小石块"});
	public static ItemStack SAW_MILL = new CustomItem(Material.IRON_FENCE, "&6锯木机", 0, new String[] {"", "&a高效的锯木机使你获得双倍的木板"});
	public static ItemStack COMPOSTER = new CustomItem(Material.CAULDRON_ITEM, "&a堆肥机", 0, new String[] {"", "&a可以将各种原料转化为其他物品..."});
	public static ItemStack ENHANCED_CRAFTING_TABLE = new CustomItem(Material.WORKBENCH, "&e强化合成台", 0, new String[] {"", "&a普通的合成台", "&a无法承受强化合成台制作时产生的巨大能量..."});
	public static ItemStack CRUCIBLE = new CustomItem(Material.CAULDRON_ITEM, "&c坩埚", 0, new String[] {"", "&a可以将物品制成流体"});
	public static ItemStack JUICER = new CustomItem(Material.GLASS_BOTTLE, "&a榨汁机", 0, new String[] {"", "&a有事没事, 来几杯果汁如何?"});

	public static ItemStack SOLAR_PANEL = new CustomItem(Material.DAYLIGHT_DETECTOR, "&b太阳能板", 0, new String[] {"", "&a将日光转化为能量"});
	public static ItemStack SOLAR_ARRAY = new CustomItem(Material.DAYLIGHT_DETECTOR, "&b太阳能电池", 0, new String[] {"", "&a将日光转化为能量"});
	public static ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&b采矿机", 0, new String[] {"", "&a采矿从未如此简单!"});
	public static ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6高级采矿机", 0, new String[] {"", "&a采矿从未如此简单", "&a现在连碎矿都不用自己动手了!"});
	public static ItemStack AUTOMATED_PANNING_MACHINE = new CustomItem(Material.BOWL, "&a自动筛选机", 0, new String[] {"", "&a自动淘洗放入的矿物"});

	public static ItemStack HOLOGRAM_PROJECTOR = new CustomItem(new MaterialData(Material.STEP, (byte) 7), "&b全息显示器", "", "&r显示一个可修改的全息文字");
	
	/*		 Enhanced Furnaces 		*/
	public static ItemStack ENHANCED_FURNACE = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eI", 0, new String[] {"", "&7熔炼速度: &e1x", "&7燃烧效率: &e1x", "&7产出倍数: &e1x"});
	public static ItemStack ENHANCED_FURNACE_2 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eII", 0, new String[] {"", "&7熔炼速度: &e2x", "&7燃烧效率: &e1x", "&7产出倍数: &e1x"});
	public static ItemStack ENHANCED_FURNACE_3 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eIII", 0, new String[] {"", "&7熔炼速度: &e2x", "&7燃烧效率: &e2x", "&7产出倍数: &e1x"});
	public static ItemStack ENHANCED_FURNACE_4 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eIV", 0, new String[] {"", "&7熔炼速度: &e3x", "&7燃烧效率: &e2x", "&7产出倍数: &e1x"});
	public static ItemStack ENHANCED_FURNACE_5 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eV", 0, new String[] {"", "&7熔炼速度: &e3x", "&7燃烧效率: &e2x", "&7产出倍数: &e2x"});
	public static ItemStack ENHANCED_FURNACE_6 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eVI", 0, new String[] {"", "&7熔炼速度: &e3x", "&7燃烧效率: &e3x", "&7产出倍数: &e2x"});
	public static ItemStack ENHANCED_FURNACE_7 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eVII", 0, new String[] {"", "&7熔炼速度: &e4x", "&7燃烧效率: &e3x", "&7产出倍数: &e2x"});
	public static ItemStack ENHANCED_FURNACE_8 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eVIII", 0, new String[] {"", "&7熔炼速度: &e4x", "&7燃烧效率: &e4x", "&7产出倍数: &e2x"});
	public static ItemStack ENHANCED_FURNACE_9 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eIX", 0, new String[] {"", "&7熔炼速度: &e5x", "&7燃烧效率: &e4x", "&7产出倍数: &e2x"});
	public static ItemStack ENHANCED_FURNACE_10 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eX", 0, new String[] {"", "&7熔炼速度: &e5x", "&7燃烧效率: &e5x", "&7产出倍数: &e2x"});
	public static ItemStack ENHANCED_FURNACE_11 = new CustomItem(Material.FURNACE, "&7强化熔炉 - &eXI", 0, new String[] {"", "&7熔炼速度: &e5x", "&7燃烧效率: &e5x", "&7产出倍数: &e3x"});
	public static ItemStack REINFORCED_FURNACE = new CustomItem(Material.FURNACE, "&7高级强化熔炉", 0, new String[] {"", "&7熔炼速度: &e10x", "&7燃烧效率: &e10x", "&7产出倍数: &e3x"});
	public static ItemStack CARBONADO_EDGED_FURNACE = new CustomItem(Material.FURNACE, "&7黑钻炉", 0, new String[] {"", "&7熔炼速度: &e20x", "&7燃烧效率: &e10x", "&7产出倍数: &e3x"});

	public static ItemStack BLOCK_PLACER = new CustomItem(Material.DISPENSER, "&a方块放置器", 0, new String[] {"", "&r所有在此发射器机器内的方块", "&r都会被自动放置"});

	/*		Soulbound Items		*/
	public static ItemStack SOULBOUND_SWORD = new CustomItem(Material.DIAMOND_SWORD, "&c灵魂绑定剑", 0);
	public static ItemStack SOULBOUND_BOW = new CustomItem(Material.BOW, "&c灵魂绑定弓", 0);
	public static ItemStack SOULBOUND_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&c灵魂绑定镐", 0);
	public static ItemStack SOULBOUND_AXE = new CustomItem(Material.DIAMOND_AXE, "&c灵魂绑定斧", 0);
	public static ItemStack SOULBOUND_SHOVEL = new CustomItem(Material.DIAMOND_SPADE, "&c灵魂绑定铲", 0);
	public static ItemStack SOULBOUND_HOE = new CustomItem(Material.DIAMOND_HOE, "&c灵魂绑定锄", 0);

	public static ItemStack SOULBOUND_HELMET = new CustomItem(Material.DIAMOND_HELMET, "&c灵魂绑定头盔", 0);
	public static ItemStack SOULBOUND_CHESTPLATE = new CustomItem(Material.DIAMOND_CHESTPLATE, "&c灵魂绑定胸甲", 0);
	public static ItemStack SOULBOUND_LEGGINGS = new CustomItem(Material.DIAMOND_LEGGINGS, "&c灵魂绑定护腿", 0);
	public static ItemStack SOULBOUND_BOOTS = new CustomItem(Material.DIAMOND_BOOTS, "&c灵魂绑定靴", 0);
	
	/*		Runes				*/
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
		imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8空白符文"));
		itemB.setItemMeta(imB);
		BLANK_RUNE = itemB;
		
		ItemStack itemA = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imA = (FireworkEffectMeta) itemA.getItemMeta();
		imA.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.AQUA).build());
		imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8&l[&b&l空气&8&l]"));
		itemA.setItemMeta(imA);
		RUNE_AIR = itemA;
		
		ItemStack itemW = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imW = (FireworkEffectMeta) itemW.getItemMeta();
		imW.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.BLUE).build());
		imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8&l[&1&l水&8&l]"));
		itemW.setItemMeta(imW);
		RUNE_WATER = itemW;
		
		ItemStack itemF = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imF = (FireworkEffectMeta) itemF.getItemMeta();
		imF.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.RED).build());
		imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8&l[&4&l火&8&l]"));
		itemF.setItemMeta(imF);
		RUNE_FIRE = itemF;
		
		ItemStack itemE = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imE = (FireworkEffectMeta) itemE.getItemMeta();
		imE.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.ORANGE).build());
		imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8&l[&c&l地&8&l]"));
		itemE.setItemMeta(imE);
		RUNE_EARTH = itemE;
		
		ItemStack itemN = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imN = (FireworkEffectMeta) itemN.getItemMeta();
		imN.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8&l[&5&l末影&8&l]"));
		itemN.setItemMeta(imN);
		RUNE_ENDER = itemN;
		
		ItemStack itemR = new ItemStack(Material.FIREWORK_CHARGE);
		FireworkEffectMeta imR = (FireworkEffectMeta) itemR.getItemMeta();
		imR.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8&l[&d&l彩虹&8&l]"));
		itemR.setItemMeta(imR);
		RUNE_RAINBOW = itemR;
	}

	/*		Electricity			*/
	public static ItemStack SOLAR_GENERATOR = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&b太阳能发电机", "", "&e基础发电机", "&8\u21E8 &e\u26A1 &70 J 缓存", "&8\u21E8 &e\u26A1 &74 J/s");
	public static ItemStack SOLAR_GENERATOR_2 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&c高级太阳能发电机", "", "&a中级发电机", "&8\u21E8 &e\u26A1 &70 J 缓存", "&8\u21E8 &e\u26A1 &716 J/s");
	public static ItemStack SOLAR_GENERATOR_3 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&4黑钻太阳能发电机", "", "&4终极发电机", "&8\u21E8 &e\u26A1 &70 J 缓存", "&8\u21E8 &e\u26A1 &764 J/s");
	public static ItemStack SOLAR_GENERATOR_4 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&e电辅型太阳能发电机", "", "&9可在夜晚发电", "", "&4终极发电机", "&8\u21E8 &e\u26A1 &70 J 缓存", "&8\u21E8 &e\u26A1 &7256 J/s (白天)", "&8\u21E8 &e\u26A1 &7128 J/s (夜晚)");
	
	public static ItemStack COAL_GENERATOR = null;
	public static ItemStack LAVA_GENERATOR = null;

	public static ItemStack ELECTRIC_FURNACE = new CustomItem(new ItemStack(Material.FURNACE), "&c电力熔炉", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &74 J/s");
	public static ItemStack ELECTRIC_FURNACE_2 = new CustomItem(new ItemStack(Material.FURNACE), "&c电力熔炉 &7- &eII", "", "&a中级机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &76 J/s");
	public static ItemStack ELECTRIC_FURNACE_3 = new CustomItem(new ItemStack(Material.FURNACE), "&c电力熔炉 &7- &eIII", "", "&a中级机器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &710 J/s");

	public static ItemStack ELECTRIC_ORE_GRINDER = new CustomItem(new ItemStack(Material.DROPPER), "&c电力碎矿机", "","&r使用电力实现矿石粉碎和磨石粉碎的功能", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &712 J/s");
	public static ItemStack ELECTRIC_ORE_GRINDER_2 = new CustomItem(new ItemStack(Material.DROPPER), "&c电力碎矿机 &7(&eII&7)", "","&r使用电力实现矿石粉碎和磨石粉碎的功能", "", "&4终极机器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &730 J/s");
	public static ItemStack ELECTRIC_INGOT_PULVERIZER = new CustomItem(new ItemStack(Material.DROPPER), "&c电力金属锭粉碎机", "", "&r将金属锭粉碎成金属粉", "", "&a中级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &714 J/s");
	public static ItemStack AUTO_ENCHANTER = new CustomItem(new ItemStack(Material.ENCHANTMENT_TABLE), "&5自动附魔机", "", "&a中级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
	public static ItemStack AUTO_DISENCHANTER = new CustomItem(new ItemStack(Material.ENCHANTMENT_TABLE), "&5自动去附魔机", "", "&a中级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
	public static ItemStack AUTO_ANVIL = new CustomItem(new ItemStack(Material.IRON_BLOCK), "&7自动型铁砧", "", "&6高级机器", "&8\u21E8 &77修复率: 10%", "&8\u21E8 &e\u26A1 &724 J/s");
	public static ItemStack AUTO_ANVIL_2 = new CustomItem(new ItemStack(Material.IRON_BLOCK), "&7自动型铁砧 Mk.II", "", "&4终极机器", "&8\u21E8 &7修复率: 25%", "&8\u21E8 &e\u26A1 &732 J/s");

	public static ItemStack BIO_REACTOR = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 5), "&2生化反应器", "", "&6发电机组", "&8\u21E8 &e\u26A1 &7128 J 缓存", "&8\u21E8 &e\u26A1 &78 J/s");
	public static ItemStack MULTIMETER = new CustomItem(new MaterialData(Material.WATCH), "&e万用电表", "", "&r用于检测机器的电气信息", "&r右键机器使用");
	public static ItemStack SMALL_CAPACITOR = null, MEDIUM_CAPACITOR = null, BIG_CAPACITOR = null, LARGE_CAPACITOR = null, CARBONADO_EDGED_CAPACITOR = null;
	
	/*		Robots				*/
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
	
	/*		GPS					*/
	public static ItemStack GPS_TRANSMITTER = null;
	public static ItemStack GPS_TRANSMITTER_2 = null;
	public static ItemStack GPS_TRANSMITTER_3 = null;
	public static ItemStack GPS_TRANSMITTER_4 = null;
	
	public static ItemStack GPS_CONTROL_PANEL = null;
	public static ItemStack GPS_MARKER_TOOL = new CustomItem(new MaterialData(Material.REDSTONE_TORCH_ON), "&bGPS 标记工具", "", "&r在你放置标记工具的位置", "&r设置一个路径点");
	public static ItemStack GPS_EMERGENCY_TRANSMITTER = null;
	public static ItemStack GPS_GEO_SCANNER = null;

	public static ItemStack ANDROID_INTERFACE_FUEL = new CustomItem(new ItemStack(Material.DISPENSER), "&7机器人接口 &c(燃料)", "", "&r存储在此接口中的物品", "&r会在机器人脚本发出指令时", "&r被机器人自动抽取到燃料槽中");
	public static ItemStack ANDROID_INTERFACE_ITEMS = new CustomItem(new ItemStack(Material.DISPENSER), "&7机器人接口 &9(物品)", "", "&r存储在机器人中的物品", "&r会在机器人脚本发出指令时", "&r被机器人输入这个接口");

	public static ItemStack BUCKET_OF_OIL = null;
	public static ItemStack BUCKET_OF_FUEL = null;
	public static ItemStack OIL_PUMP = null;

	public static ItemStack REFINERY = new CustomItem(new ItemStack(Material.PISTON_BASE), "&c石油精炼器", "", "&r精炼石油生产液体燃料");
	public static ItemStack COMBUSTION_REACTOR = null;
	public static ItemStack ANDROID_MEMORY_CORE = null;

	public static ItemStack GPS_TELEPORTER_PYLON = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 10), "&5GPS 传送塔", "", "&7传送器组件");
	public static ItemStack GPS_TELEPORTATION_MATRIX = new CustomItem(new MaterialData(Material.IRON_BLOCK), "&bGPS 传送矩阵", "", "&r这是传送器的主要组件", "&r通过使用传送矩阵", "&r你可以选择任意你自己已设置的GPS路径点", "&r进行传送.");
	public static ItemStack GPS_ACTIVATION_DEVICE_SHARED = new CustomItem(new MaterialData(Material.STONE_PLATE), "&rGPS 激活装置 &3(分享型)", "", "&r将此装置放在传送矩阵之上", "&r站在此激活装置之上即可", "&r激活传送阵列");
	public static ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new CustomItem(new MaterialData(Material.STONE_PLATE), "&rGPS 激活装置 &a(个人型)", "", "&r将此装置放在传送矩阵之上", "&r站在此激活装置之上即可", "&r激活传送阵列", "", "&r个人型仅供", "&r放置其的人使用");

	public static ItemStack ELEVATOR = new CustomItem(new MaterialData(Material.STONE_PLATE), "&b电梯板", "", "&r将电梯板放置在每一楼层", "&r然后你就可以利用电梯板在他们之间快速移动了.", "", "&e右键点击这个方块 &7来命名它");

	public static ItemStack INFUSED_HOPPER = new CustomItem(new MaterialData(Material.HOPPER), "&5吸力漏斗", "", "&r以其放置的位置为中心", "&r吸力漏斗会自动吸取 7x7x7 范围内的掉落物.");

	public static ItemStack PLASTIC_SHEET = new CustomItem(new MaterialData(Material.PAPER), "&r塑料板");
	public static ItemStack HEATED_PRESSURE_CHAMBER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 8), "&c热压力室", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &710 J/s");
	public static ItemStack HEATED_PRESSURE_CHAMBER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 8), "&c热压力室 &7- &eII", "", "&4终极机器", "&8\u21E8 &7速度: 5x", "&8\u21E8 &e\u26A1 &744 J/s");

	public static ItemStack ELECTRIC_SMELTERY = new CustomItem(new MaterialData(Material.DROPPER), "&c电力熔炼厂", "", "&4只能用于烧制强化锭, 不能将普通矿物粉制成锭", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
	public static ItemStack ELECTRIC_SMELTERY_2 = new CustomItem(new MaterialData(Material.DROPPER), "&c电力熔炼厂 &7- &eII", "", "&4只能用于烧制强化锭, 不能将普通矿物粉制成锭", "", "&4终极机器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &740 J/s");

	public static ItemStack ELECTRIFIED_CRUCIBLE = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电力坩埚", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &748 J/s");
	public static ItemStack ELECTRIFIED_CRUCIBLE_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电力坩埚 &7- &eII", "", "&4终极机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &780 J/s");
	public static ItemStack ELECTRIFIED_CRUCIBLE_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电力坩埚 &7- &eIII", "", "&4终极机器", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &7120 J/s");

	public static ItemStack CARBON_PRESS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&c碳压缩机", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
	public static ItemStack CARBON_PRESS_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&c碳压缩机 &7- &eII", "", "&4终极机器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &750 J/s");
	public static ItemStack CARBON_PRESS_3 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&c碳压缩机 &7- &eIII", "", "&4终极机器", "&8\u21E8 &7速度: 15x", "&8\u21E8 &e\u26A1 &7180 J/s");

	public static ItemStack BLISTERING_INGOT = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6发泡锭 &7(33%)", "", "&2辐射等级: 高", "&4需要穿着防护服使用");
	public static ItemStack BLISTERING_INGOT_2 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6发泡锭 &7(66%)", "", "&2辐射等级: 高", "&4需要穿着防护服使用");
	public static ItemStack BLISTERING_INGOT_3 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6发泡锭", "", "&2辐射等级: 高", "&4需要穿着防护服使用");

	public static ItemStack ENERGY_REGULATOR = null;
	public static ItemStack DEBUG_FISH = new CustomItem(new MaterialData(Material.RAW_FISH), "&3这鱼多少一斤?", "", "&e右键点击 &r查看任意方块数据信息", "&e左键点击 &r破坏这个方块", "&eShift + 左键点击 &r消除任意方块数据信息", "&eShift + 右键点击 &r放置一个 Placeholder 方块");


	public static ItemStack NETHER_ICE = null;
	public static ItemStack ENRICHED_NETHER_ICE = null;
	public static ItemStack NETHER_ICE_COOLANT_CELL = null;
	public static ItemStack NETHER_DRILL = new CustomItem(new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&4下界矿钻", "", "&r用于挖掘下界玄冰", "", "&4终极机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7102 J/s", "", "&c&l! &c仅能在地狱使用!", "&c&l! &c使用前请先扫描想使用的区块"));
	
	// Cargo
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

	public static ItemStack FOOD_FABRICATOR = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 13), "&c食品加工机", "", "&r生产 &a有机食品", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 缓存", "&8\u21E8 &e\u26A1 &714 J/s");
	public static ItemStack FOOD_FABRICATOR_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 13), "&c食品加工机 &7(&eII&7)", "", "&r生产 &a有机食品", "", "&4终极机器", "&8\u21E8 &7速度: 6x", "&8\u21E8 &e\u26A1 &7512 J 缓存", "&8\u21E8 &e\u26A1 &748 J/s");

	public static ItemStack FOOD_COMPOSTER = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 13), "&c食品堆肥机", "", "&r生产 &a有机肥料", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 缓存", "&8\u21E8 &e\u26A1 &716 J/s");
	public static ItemStack FOOD_COMPOSTER_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 13), "&c食品堆肥机 &7(&eII&7)", "", "&r生产 &a有机肥料", "", "&4终极机器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &7512 J 缓存", "&8\u21E8 &e\u26A1 &752 J/s");

	public static ItemStack XP_COLLECTOR = null;
	public static ItemStack REACTOR_COOLANT_CELL = null;

	public static ItemStack NUCLEAR_REACTOR = null;
	public static ItemStack NETHERSTAR_REACTOR = null;
	public static ItemStack REACTOR_ACCESS_PORT = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 9), "&2反应堆交互接口", "", "&r允许你直接或使用运输系统", "&r与反应堆进行交互", "&r具有缓存功能", "", "&8\u21E8 &e反应堆上 &a必须放置 &e3个方块");
	
	public static ItemStack FREEZER = null;
	public static ItemStack FREEZER_2 = null;

	public static ItemStack ELECTRIC_GOLD_PAN = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 12), "&6电力淘洗机", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &72 J/s");
	public static ItemStack ELECTRIC_GOLD_PAN_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 12), "&6电力淘洗机 &7(&eII&7)", "", "&e基础机器", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &74 J/s");
	public static ItemStack ELECTRIC_GOLD_PAN_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 12), "&6电力淘洗机 &7(&eIII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &714 J/s");

	public static ItemStack ELECTRIC_DUST_WASHER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 11), "&6电力洗粉机", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &76 J/s");
	public static ItemStack ELECTRIC_DUST_WASHER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 11), "&6电力洗粉机 &7(&eII&7)", "", "&e基础机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &710 J/s");
	public static ItemStack ELECTRIC_DUST_WASHER_3 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 11), "&6电力洗粉机 &7(&eIII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &730 J/s");

	public static ItemStack ELECTRIC_INGOT_FACTORY = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&6电力制锭机", "", "&e基础机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &78 J/s");
	public static ItemStack ELECTRIC_INGOT_FACTORY_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&6电力制锭机 &7(&eII&7)", "", "&e基础机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &714 J/s");
	public static ItemStack ELECTRIC_INGOT_FACTORY_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&6电力制锭机 &7(&eIII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 8x", "&8\u21E8 &e\u26A1 &740 J/s");

	public static ItemStack AUTOMATED_CRAFTING_CHAMBER = new CustomItem(new MaterialData(Material.WORKBENCH), "&6自动合成机", "", "&6高级机器", "&8\u21E8 &e\u26A1 &710 J/物品");
	public static ItemStack FLUID_PUMP = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 11), "&9流体泵", "", "&6高级机器", "&8\u21E8 &e\u26A1 &732 J/Block");
	public static ItemStack CHARGING_BENCH = new CustomItem(new MaterialData(Material.DROPPER), "&6充电架", "", "&r可以为耗电物品充电", "", "&e基础机器", "&8\u21E8 &e\u26A1 &7128 J 缓存", "&8\u21E8 &e\u26A1 &7能量损耗: &c50%");

	public static ItemStack WITHER_ASSEMBLER = new CustomItem(new MaterialData(Material.OBSIDIAN), "&5凋零组装机", "", "&4终极机器", "&8\u21E8 &7冷却: &b30 秒", "&8\u21E8 &e\u26A1 &74096 J 缓存", "&8\u21E8 &e\u26A1 &74096 J/凋零");
	
	public static ItemStack TRASH_CAN = null;
	
	public static ItemStack ELYTRA = new ItemStack(Material.ELYTRA);
	public static ItemStack ELYTRA_SCALE = new CustomItem(new ItemStack(Material.FEATHER), "&b鞘翅鳞片");
	public static ItemStack INFUSED_ELYTRA = new CustomItem(new CustomItem(ELYTRA, "&5自我修复型鞘翅"), new String[] {"MENDING-1"});
	public static ItemStack SOULBOUND_ELYTRA = new CustomItem(ELYTRA, "&c灵魂绑定鞘翅");
	
	// ChestTerminal Addon
	
	public static ItemStack CHEST_TERMINAL = null;
	public static ItemStack CT_IMPORT_BUS = null;
	public static ItemStack CT_EXPORT_BUS = null;

	static {
		try {
			PORTABLE_DUSTBIN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "便携式垃圾箱", "&r你的便携式物品销毁机", "", "&e右键点击&7 以打开");
			TRASH_CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&3垃圾桶", "", "&r任何放入的物品都会被摧毁");
			CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&r锡罐");

			STONE_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&6石块");

			INFUSED_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&a注磁铁" , "", "&r被注入了强力磁性的磁铁", "&r能够将你附近的物品", "&r全部吸入你的背包", "", "", "&7按住 &eShift&7 使用注磁铁");
			MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&c磁铁");
			ELECTRO_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&c电磁铁");
			ELECTRIC_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&c电动马达");
			CARGO_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&3运输马达");

			BACKPACK_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e小背包", new String[] {"", "&7容量: &e9", "&7ID: <ID>", "", "&7&e右键点击&7 以打开"});
			BACKPACK_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e背包", new String[] {"", "&7容量: &e18", "&7ID: <ID>", "", "&7&e右键点击&7 以打开"});
			BACKPACK_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e大背包", new String[] {"", "&7容量: &e27", "&7ID: <ID>", "", "&7&e右键点击&7 以打开"});
			WOVEN_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e编织包", new String[] {"", "&7容量: &e36", "&7ID: <ID>", "", "&7&e右键点击&7 以打开"});
			GILDED_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&e镀金背包", new String[] {"", "&7容量: &e45", "&7ID: <ID>", "", "&7&e右键点击&7 以打开"});
			BOUND_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&c灵魂绑定背包", new String[] {"", "&7容量: &e36", "&7ID: <ID>", "", "&7&e右键点击&7 以打开"});
			COOLER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRjMTU3MjU4NGViNWRlMjI5ZGU5ZjVhNGY3NzlkMGFhY2JhZmZkMzNiY2IzM2ViNDUzNmE2YTJiYzZhMSJ9fX0="), "&b冰箱", new String[] {"&r所有存入冰箱的 果汁/冰沙", "&r都会在你饥饿时", "&r自动消耗补充你的饥饿值", "", "&7容量: &e27", "&7ID: <ID>", "", "&7&e右键点击&7 以打开"});
			ENDER_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&6末影背包", new String[] {"&a便携式末影箱", "", "&e右键点击&7 以打开"});

			VOIDBAG_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4小型虚空包", new String[] {"", "&7容量: &e9", "&7ID: <ID>", "", "&7&e左键点击&7 将附近的物品吸入背包", "&7&e右键点击&7 以打开"});
			VOIDBAG_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4虚空包", new String[] {"", "&7容量: &e18", "&7ID: <ID>", "", "&7&e左键点击&7 将附近的物品吸入背包", "&7&e右键点击&7 以打开"});
			VOIDBAG_BIG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4中型虚空包", new String[] {"", "&7容量: &e27", "&7ID: <ID>", "", "&7&e左键点击&7 将附近的物品吸入背包", "&7&e右键点击&7 以打开"});
			VOIDBAG_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4大型虚空包", new String[] {"", "&7容量: &e36", "&7ID: <ID>", "", "&7&e左键点击&7 将附近的物品吸入背包", "&7&e右键点击&7 以打开"});
			BOUND_VOIDBAG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&4灵魂绑定虚空包", new String[] {"", "&7容量: &e36", "&7ID: <ID>", "", "&7&e左键点击&7 将附近的物品吸入背包", "&7&e右键点击&7 以打开"});

			COAL_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c煤炭发电机", "", "&6发电机组", "&8\u21E8 &e\u26A1 &764 J 缓存", "&8\u21E8 &e\u26A1 &716 J/s");
			LAVA_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&4岩浆发电机", "", "&6发电机组", "&8\u21E8 &e\u26A1 &7512 J 缓存", "&8\u21E8 &e\u26A1 &720 J/s");
			COMBUSTION_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c燃烧反应器", "", "&6高级发电机", "&8\u21E8 &e\u26A1 &7256 J 缓存", "&8\u21E8 &e\u26A1 &724 J/s");

			NUCLEAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&2核能反应器", "", "&r需要冷却!", "&8\u21E8 &b必须完全浸入水中", "&8\u21E8 &b必须配备反应器冷却单元", "", "&4终极发电机", "&8\u21E8 &e\u26A1 &716384 J 缓存", "&8\u21E8 &e\u26A1 &7500 J/s");
			NETHERSTAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&f下界之星反应器", "", "&f依赖下界之星运作", "&8\u21E8 &b必须完全浸入水中", "&8\u21E8 &b必须配备下界玄冰冷却单元", "", "&4终极发电机", "&8\u21E8 &e\u26A1 &732768 J 缓存", "&8\u21E8 &e\u26A1 &71024 J/s", "&8\u21E8 &4会使周围生物遭受凋零伤害");

			SMALL_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a小型电容器", "", "&e基础电容", "&8\u21E8 &e\u26A1 &7128 J 容量");
			MEDIUM_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a中型电容器", "", "&6中型电容", "&8\u21E8 &e\u26A1 &7512 J 容量");
			BIG_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a大型电容器", "", "&a大型电容", "&8\u21E8 &e\u26A1 &71024 J 容量");
			LARGE_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a超级电容器", "", "&2超级电容", "&8\u21E8 &e\u26A1 &78192 J 容量");
			CARBONADO_EDGED_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&a黑钻电容器", "", "&4终极电容器", "&8\u21E8 &e\u26A1 &765536 J 容量");
			CHEESE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ=="), "&r芝士");
			BUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0="), "&r黄油");
			DUCT_TAPE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0="), "&8胶带", "", "&r修复物品需要用到这个", "&r需要将其放入自动铁砧");

			URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&4铀", "", "&2辐射等级: 高", "&4需要穿着防护服使用");
			SMALL_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&c小块铀", "", "&e辐射等级: 中", "&4需要穿着防护服使用");
			TINY_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&c小撮铀", "", "&c辐射等级: 低", "&4无需防护服");

			NEPTUNIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVkZWE2YmZkMzdlNDlkZTQzZjE1NGZlNmZjYTYxN2Q0MTI5ZTYxYjk1NzU5YTNkNDlhMTU5MzVhMWMyZGNmMCJ9fX0="), "&a镎", "", "&2辐射等级: 高", "&4需要穿着防护服使用");
			PLUTONIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVjZjkxYjczODg2NjVhNmQ3YzFiNjAyNmJkYjIzMjJjNmQyNzg5OTdhNDQ0Nzg2NzdjYmNjMTVmNzYxMjRmIn19fQ=="), "&7钚", "", "&2辐射等级: 高", "&4需要穿着防护服使用");
			BOOSTED_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgzN2NhMTJmMjIyZjQ3ODcxOTZhMTdiOGFiNjU2OTg1Zjg0MDRjNTA3NjdhZGJjYjZlN2YxNDI1NGZlZSJ9fX0="), "&2提纯铀", "", "&2辐射等级: 高", "&4需要穿着防护服使用");

			PROGRAMMABLE_ANDROID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&c可编程机器人 &7(标准版)", "", "&8\u21E8 &7功能: 无", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&c可编程机器人 &7(农耕版)", "", "&8\u21E8 &7功能: 农耕", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_MINER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYzOGEyODU0MWFiM2FlMGE3MjNkNTU3ODczOGUwODc1ODM4OGVjNGMzMzI0N2JkNGNhMTM0ODJhZWYzMzQifX19"), "&c可编程机器人 &7(挖矿版)", "", "&8\u21E8 &7功能: 挖矿", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_WOODCUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMyYTgxNDUxMDE0MjIwNTE2OWExYWQzMmYwYTc0NWYxOGU5Y2I2YzY2ZWU2NGVjYTJlNjViYWJkZWY5ZmYifX19"), "&c可编程机器人 &7(伐木版)", "", "&8\u21E8 &7功能: 伐木", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&c可编程机器人 &7(攻击版)", "", "&8\u21E8 &7功能: 杀死生物", "&8\u21E8 &7伤害: 4", "&8\u21E8 &7燃料效率: 1.0x");
			PROGRAMMABLE_ANDROID_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&c可编程机器人 &7(捕鱼版)", "", "&8\u21E8 &7功能: 捕鱼", "&8\u21E8 &7成功率: 10%", "&8\u21E8 &7燃料效率: 1.0x");

			PROGRAMMABLE_ANDROID_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&c高级可编程机器人 &7(标准版)", "", "&8\u21E8 &7功能: 无", "&8\u21E8 &7燃料效率: 1.5x");
			PROGRAMMABLE_ANDROID_2_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&c高级可编程机器人 &7(捕鱼版)", "", "&8\u21E8 &7功能: 捕鱼", "&8\u21E8 &7成功率: 20%", "&8\u21E8 &7燃料效率: 1.5x");
			PROGRAMMABLE_ANDROID_2_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&c高级可编程机器人 &7(农耕版)", "", "&8\u21E8 &7功能: 农耕", "&8\u21E8 &7燃料效率: 1.5x", "&8\u21E8 &7能收获果树");
			PROGRAMMABLE_ANDROID_2_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&c高级可编程机器人 &7(攻击版)", "", "&8\u21E8 &7功能: 杀死生物", "&8\u21E8 &7伤害: 8", "&8\u21E8 &7燃料效率: 1.5x");

			PROGRAMMABLE_ANDROID_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&e自走型可编程机器人 &7(标准版)", "", "&8\u21E8 &7功能: 无", "&8\u21E8 &7燃料效率: 3.0x");
			PROGRAMMABLE_ANDROID_3_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&e自走型可编程机器人 &7(捕鱼版)", "", "&8\u21E8 &7功能: 捕鱼", "&8\u21E8 &7成功率: 30%", "&8\u21E8 &7燃料效率: 8.0x");
			PROGRAMMABLE_ANDROID_3_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&e自走型可编程机器人 &7(攻击版)", "", "&8\u21E8 &7功能: 杀死生物", "&8\u21E8 &7伤害: 20", "&8\u21E8 &7燃料效率: 8.0x");

			GPS_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&bGPS信号发射器", "", "&8\u21E8 &e\u26A1 &716 J 缓存", "&8\u21E8 &e\u26A1 &72 J/s");
			GPS_TRANSMITTER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&c高级GPS信号发射器", "", "&8\u21E8 &e\u26A1 &764 J 缓存", "&8\u21E8 &e\u26A1 &76 J/s");
			GPS_TRANSMITTER_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&4黑钻GPS信号发射器", "", "&8\u21E8 &e\u26A1 &7256 J 缓存", "&8\u21E8 &e\u26A1 &722 J/s");
			GPS_TRANSMITTER_4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&e电力GPS信号发射器", "", "&8\u21E8 &e\u26A1 &71024 J 缓存", "&8\u21E8 &e\u26A1 &792 J/s");

			GPS_CONTROL_PANEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjZmJhNThmYWYxZjY0ODQ3ODg0MTExODIyYjY0YWZhMjFkN2ZjNjJkNDQ4MWYxNGYzZjNiY2I2MzMwIn19fQ=="), "&bGPS控制面板", "", "&r允许你控制你的卫星", "&r和管理你的路径点");
			GPS_EMERGENCY_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&cGPS紧急信号发射器", "", "&r当你死亡时", "&r紧急信号发射器将会自动发射", "&r并在你死亡的地点设置一个路径点.");

			GPS_GEO_SCANNER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFkOGNmZWIzODdhNTZlM2U1YmNmODUzNDVkNmE0MTdiMjQyMjkzODg3ZGIzY2UzYmE5MWZhNDA5YjI1NGI4NiJ9fX0="), "&bGPS 全球扫描器", "", "&r扫描一个区块中的天然资源", "&r比如 &8石油");
			OIL_PUMP = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZlMWEwNDBhNDI1ZTMxYTQ2ZDRmOWE5Yjk4MDZmYTJmMGM0N2VlODQ3MTFjYzE5MzJmZDhhYjMyYjJkMDM4In19fQ=="), "&r石油泵", "", "&7泵出石油并将其收集进桶中", "", "&c&l! &c请在使用前确认你已经对区块进行过扫描");
			BUCKET_OF_OIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlMDRiNDFkMTllYzc5MjdmOTgyYTYzYTk0YTNkNzlmNzhlY2VjMzMzNjMwNTFmZGUwODMxYmZhYmRiZCJ9fX0="), "&r桶装石油");
			BUCKET_OF_FUEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg0ZGRjYTc2NjcyNWI4Yjk3NDEzZjI1OWMzZjc2NjgwNzBmNmFlNTU0ODNhOTBjOGU1NTI1Mzk0ZjljMDk5In19fQ=="), "&r桶装液体燃料");

			NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY5NjVlNmE1ODY4NGMyNzdkMTg3MTdjZWM5NTlmMjgzM2E3MmRmYTk1NjYxMDE5ZGJjZGYzZGJmNjZiMDQ4In19fQ=="), "&e下界玄冰", "", "&e辐射等级: 中", "&4需要穿着防护服使用");
			//下界玄冰原材质：eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NlMmRhZDliYWY3ZWFiYTdlODBkNGQwZjlmYWMwYWFiMDFhNzZiMTJmYjcxYzNkMmFmMmExNmZkZDRjNzM4MyJ9fX0=
			ENRICHED_NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MThhYTEzYWFiYzcyOTQ4MzhkMjFjYWFjMDU3ZTk3YmQ4Yzg5NjQxYTBjMGY4YTU1NDQyZmY0ZTI3In19fQ=="), "&e浓缩下界玄冰", "", "&2辐射等级: 极高", "&4需要穿着防护服使用");

			LAVA_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ=="), "&4熔岩水晶");
			ANDROID_MEMORY_CORE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&b机器人记忆核心");

			CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ=="), "&e碳");
			COMPRESSED_CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&c压缩碳");
			CARBON_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&4碳块");

			CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJmNGIxNTc3ZjUxNjBjNjg5MzE3MjU3MWM0YTcxZDhiMzIxY2RjZWFhMDMyYzZlMGUzYjYwZTBiMzI4ZmEifX19"), "&b&l黑钻", "", "&7\"黑色的钻石\"");
			RAW_CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0OWU2ZWMxMDc3MWU4OTkyMjVhZWE3M2NkOGNmMDM2ODRmNDExZDE0MTVjNzMyM2M5M2NiOTQ3NjIzMCJ9fX0="), "&b生黑钻");

			ENERGY_REGULATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&6能量调度器", "", "&r能源网络的核心组件");

			CARGO_MANAGER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&6运输调度器", "", "&r运输网络的核心组件");
			CARGO_NODE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDdiN2VmNmZkNzg2NDg2NWMzMWMxZGM4N2JlZDI0YWI1OTczNTc5ZjVjNjYzOGZlY2I4ZGVkZWI0NDNmZjAifX19"), "&7运输接口 &c(连接)", "", "&r运输连接管道");
			CARGO_INPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZkMWMxYTY5YTNkZTlmZWM5NjJhNzdiZjNiMmUzNzZkZDI1Yzg3M2EzZDhmMTRmMWRkMzQ1ZGFlNGM0In19fQ=="), "&7运输接口 &c(输入)", "", "&r运输输入管道");
			CARGO_OUTPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&7运输接口 &c(输出)", "", "&r运输输出管道");
			CARGO_OUTPUT_ADVANCED = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&6高级运输接口 &c(输出)", "", "&r运输输出管道");

			AUTO_BREEDER = new CustomItem(new MaterialData(Material.HAY_BLOCK), "&e自动喂养器", "", "&r依靠 &a有机食物 &r运作", "", "&4终极机器", "&8\u21E8 &e\u26A1 &71024 J 缓存", "&8\u21E8 &e\u26A1 &760 J/动物");
			ANIMAL_GROWTH_ACCELERATOR = new CustomItem(new MaterialData(Material.HAY_BLOCK), "&b动物生长催化机", "", "&r依靠 &a有机食物 &r运作", "", "&4终极机器", "&8\u21E8 &e\u26A1 &71024 J 缓存", "&8\u21E8 &e\u26A1 &728 J/s");
			CROP_GROWTH_ACCELERATOR = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 5), "&a作物生长催化机", "", "&r依靠 &a有机肥料 &r运作", "", "&4终极机器", "&8\u21E8 &7半径: 7x7", "&8\u21E8 &7速度: &a3/次", "&8\u21E8 &e\u26A1 &71024 J 缓存", "&8\u21E8 &e\u26A1 &750 J/s");
			CROP_GROWTH_ACCELERATOR_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 5), "&a作物生长催化机 &7(&eII&7)", "", "&r依靠 &a有机肥料 &r运作", "", "&4终极机器", "&8\u21E8 &7半径: 9x9", "&8\u21E8 &7速度: &a4/次", "&8\u21E8 &e\u26A1 &71024 J 缓存", "&8\u21E8 &e\u26A1 &760 J/s");
			XP_COLLECTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc2MmExNWIwNDY5MmEyZTRiM2ZiMzY2M2JkNGI3ODQzNGRjZTE3MzJiOGViMWM3YTlmN2MwZmJmNmYifX19"), "&a经验收集器", "", "&r自动吸取附近的经验球并保存", "", "&4终极机器", "&8\u21E8 &e\u26A1 &71024 J 缓存", "&8\u21E8 &e\u26A1 &720 J/s");

			ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9X");
			ORGANIC_FOOD2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9小麦");
			ORGANIC_FOOD3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9胡萝卜");
			ORGANIC_FOOD4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9土豆");
			ORGANIC_FOOD5 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9种子");
			ORGANIC_FOOD6 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9甜菜根");
			ORGANIC_FOOD7 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9西瓜");
			ORGANIC_FOOD8 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机食物", "&7内容物: &9苹果");

			FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9X");
			FERTILIZER2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9小麦");
			FERTILIZER3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9胡萝卜");
			FERTILIZER4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9土豆");
			FERTILIZER5 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9种子");
			FERTILIZER6 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9甜菜根");
			FERTILIZER7 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9西瓜");
			FERTILIZER8 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&a有机肥料", "&7内容物: &9苹果");

			NETHER_ICE_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQzY2Q0MTI1NTVmODk3MDE2MjEzZTVkNmM3NDMxYjQ0OGI5ZTU2NDRlMWIxOWVjNTFiNTMxNmYzNTg0MGUwIn19fQ=="), "&e下界玄冰冷却单元");
			REACTOR_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU0MDczYmU0MGNiM2RlYjMxMGEwYmU5NTliNGNhYzY4ZTgyNTM3MjcyOGZhZmI2YzI5NzNlNGU3YzMzIn19fQ=="), "&b反应器冷却单元");

			CHEST_TERMINAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0NGZmM2E1ZjQ5YzY5Y2FiNjc2YmFkOGQ5OGEwNjNmYTc4Y2ZhNjE5MTZmZGVmM2UyNjc1NTdmZWMxODI4MyJ9fX0="), "&3CT 接入终端", "&7如果这个方块与运输网络设备相连", "&7那么它将允许你", "&7与任何接口提供的物品进行交互", "&7并可以将其转入箱子终端");
			CT_IMPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3CT 导入总线", "&7如果这个方块与运输网络设备相连", "&7那么它将拉取", "&7与其相连容器中的物品", "&7到运输网络中");
			CT_EXPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3CT 导出总线", "&7如果这个方块与运输网络设备相连", "&7那么它将拉取", "&7运输网络中的物品", "&7并导出到与其相连的容器中");

			FREEZER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 3), "&b制冷机", "", "&6高级机器", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J 缓存", "&8\u21E8 &e\u26A1 &718 J/s");
			FREEZER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 3), "&b制冷机 &7(&eII&7)", "", "&4终极机器", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &7256 J 缓存", "&8\u21E8 &e\u26A1 &730 J/s");

			BATTERY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyZGRhNmVmNjE4NWQ0ZGQ2ZWE4Njg0ZTk3ZDM5YmE4YWIwMzdlMjVmNzVjZGVhNmJkMjlkZjhlYjM0ZWUifX19"), "&6电池");

			HEATING_COIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0="), "&c加热线圈");
			COOLING_UNIT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzU0YmFkODZjOTlkZjc4MGM4ODlhMTA5OGY3NzY0OGVhZDczODVjYzFkZGIwOTNkYTVhN2Q4YzRjMmFlNTRkIn19fQ=="), "&b冷却单元");
			POWER_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0="), "&c&l能量水晶");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
