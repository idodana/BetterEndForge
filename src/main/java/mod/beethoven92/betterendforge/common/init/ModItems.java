package mod.beethoven92.betterendforge.common.init;

import mod.beethoven92.betterendforge.BetterEnd;
import mod.beethoven92.betterendforge.common.item.HammerItem;
import mod.beethoven92.betterendforge.common.item.ModArmorMaterial;
import mod.beethoven92.betterendforge.common.item.ModItemTier;
import mod.beethoven92.betterendforge.common.item.ModSpawnEggItem;
import mod.beethoven92.betterendforge.common.util.ModMathHelper;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.FishBucketItem;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterEnd.MOD_ID);
	
	// MATERIAL ITEMS
	public static final RegistryObject<Item> TERMINITE_INGOT = ITEMS.register("terminite_ingot", () -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public final static RegistryObject<Item> AETERNIUM_INGOT = ITEMS.register("aeternium_ingot",() -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public final static RegistryObject<Item> ENDER_DUST = ITEMS.register("ender_dust",() -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public final static RegistryObject<Item> END_LILY_LEAF = ITEMS.register("end_lily_leaf",() -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public final static RegistryObject<Item> END_LILY_LEAF_DRIED = ITEMS.register("end_lily_leaf_dried",() -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public final static RegistryObject<Item> CRYSTAL_SHARDS = ITEMS.register("crystal_shards",() -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public final static RegistryObject<Item> ETERNAL_CRYSTAL = ITEMS.register("eternal_crystal",() -> new Item(new Item.Properties().maxStackSize(16).group(ModCreativeTabs.CREATIVE_TAB)));
	public final static RegistryObject<Item> ENDER_SHARD = ITEMS.register("ender_shard", () -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	
	// ARMOR ITEMS
	public static final RegistryObject<Item> TERMINITE_HELMET = ITEMS.register("terminite_helmet", () -> new ArmorItem(ModArmorMaterial.TERMINITE, EquipmentSlotType.HEAD, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<Item> TERMINITE_CHESTPLATE = ITEMS.register("terminite_chestplate", () -> new ArmorItem(ModArmorMaterial.TERMINITE, EquipmentSlotType.CHEST, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<Item> TERMINITE_LEGGINGS = ITEMS.register("terminite_leggings", () -> new ArmorItem(ModArmorMaterial.TERMINITE, EquipmentSlotType.LEGS, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<Item> TERMINITE_BOOTS = ITEMS.register("terminite_boots", () -> new ArmorItem(ModArmorMaterial.TERMINITE, EquipmentSlotType.FEET, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<Item> AETERNIUM_HELMET = ITEMS.register("aeternium_helmet", () -> new ArmorItem(ModArmorMaterial.AETERNIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<Item> AETERNIUM_CHESTPLATE = ITEMS.register("aeternium_chestplate", () -> new ArmorItem(ModArmorMaterial.AETERNIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<Item> AETERNIUM_LEGGINGS = ITEMS.register("aeternium_leggings", () -> new ArmorItem(ModArmorMaterial.AETERNIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<Item> AETERNIUM_BOOTS = ITEMS.register("aeternium_boots", () -> new ArmorItem(ModArmorMaterial.AETERNIUM, EquipmentSlotType.FEET, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));

	// TOOL ITEMS
	public static final RegistryObject<SwordItem> TERMINITE_SWORD = ITEMS.register("terminite_sword", () -> new SwordItem(ModItemTier.TERMINITE, 3, -2.0F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> TERMINITE_SHOVEL = ITEMS.register("terminite_shovel", () -> new ShovelItem(ModItemTier.TERMINITE, 1.5F, -3.0F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> TERMINITE_PICKAXE = ITEMS.register("terminite_pickaxe", () -> new PickaxeItem(ModItemTier.TERMINITE, 1, -2.8F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> TERMINITE_AXE = ITEMS.register("terminite_axe", () -> new AxeItem(ModItemTier.TERMINITE, 6.0F, -3.0F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> TERMINITE_HOE = ITEMS.register("terminite_hoe", () -> new HoeItem(ModItemTier.TERMINITE, -3, 0.0F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<HammerItem> TERMINITE_HAMMER = ITEMS.register("terminite_hammer", () -> new HammerItem(ModItemTier.TERMINITE, 5.0F, -3.2F, 0.3D, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));	
	public static final RegistryObject<SwordItem> AETERNIUM_SWORD = ITEMS.register("aeternium_sword", () -> new SwordItem(ModItemTier.AETERNIUM, 3, -2.4F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> AETERNIUM_SHOVEL = ITEMS.register("aeternium_shovel", () -> new ShovelItem(ModItemTier.AETERNIUM, 1.5F, -3.0F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> AETERNIUM_PICKAXE = ITEMS.register("aeternium_pickaxe", () -> new PickaxeItem(ModItemTier.AETERNIUM, 1, -2.8F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> AETERNIUM_AXE = ITEMS.register("aeternium_axe", () -> new AxeItem(ModItemTier.AETERNIUM, 5.0F, -3.0F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ToolItem> AETERNIUM_HOE = ITEMS.register("aeternium_hoe", () -> new HoeItem(ModItemTier.AETERNIUM, -3, 0.0F, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<HammerItem> AETERNIUM_HAMMER = ITEMS.register("aeternium_hammer", () -> new HammerItem(ModItemTier.AETERNIUM, 6.0F, -3.0F, 0.3D, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<HammerItem> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new HammerItem(ItemTier.IRON, 5.0F, -3.2F, 0.2D, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<HammerItem> GOLDEN_HAMMER = ITEMS.register("golden_hammer", () -> new HammerItem(ItemTier.GOLD, 4.5F, -3.4F, 0.3D, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<HammerItem> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new HammerItem(ItemTier.DIAMOND, 5.5F, -3.1F, 0.2D, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<HammerItem> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new HammerItem(ItemTier.NETHERITE, 5.0F, -3.0F, 0.2D, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	
	// SPAWN EGGS
	// TODO: Figure out a way to fill SpawnEggItem.EGGS map with the correct spawn eggs, so that IForgeEntity.getPickedResult() works
	public static final RegistryObject<ModSpawnEggItem> DRAGONFLY_SPAWN_EGG = ITEMS.register("spawn_egg_dragonfly", () -> new ModSpawnEggItem(() -> ModEntityTypes.DRAGONFLY.get(), ModMathHelper.getColor(32, 42, 176), ModMathHelper.getColor(115, 225, 249), new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ModSpawnEggItem> END_FISH_SPAWN_EGG = ITEMS.register("spawn_egg_end_fish", () -> new ModSpawnEggItem(() -> ModEntityTypes.END_FISH.get(), ModMathHelper.getColor(3, 50, 76), ModMathHelper.getColor(120, 206, 255), new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ModSpawnEggItem> SHADOW_WALKER_SPAWN_EGG = ITEMS.register("spawn_egg_shadow_walker", () -> new ModSpawnEggItem(() -> ModEntityTypes.SHADOW_WALKER.get(), ModMathHelper.getColor(30, 30, 30), ModMathHelper.getColor(5, 5, 5), new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));
	public static final RegistryObject<ModSpawnEggItem> END_SLIME_SPAWN_EGG = ITEMS.register("spawn_egg_end_slime", () -> new ModSpawnEggItem(() -> ModEntityTypes.END_SLIME.get(), ModMathHelper.getColor(28, 28, 28), ModMathHelper.getColor(99, 11, 99), new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB)));

	// FOOD ITEMS
    public final static RegistryObject<Item> SHADOW_BERRY_RAW = ITEMS.register("shadow_berry_raw", () -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB).food(new Food.Builder().hunger(4).saturation(0.5F).build())));
	public final static RegistryObject<Item> SHADOW_BERRY_COOKED = ITEMS.register("shadow_berry_cooked", () -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
	public final static RegistryObject<Item> END_FISH_RAW = ITEMS.register("end_fish_raw", () -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB).food(Foods.SALMON)));
	public final static RegistryObject<Item> END_FISH_COOKED = ITEMS.register("end_fish_cooked", () -> new Item(new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB).food(Foods.COOKED_SALMON)));
	
	// MISC ITEMS
	public final static RegistryObject<Item> BUCKET_END_FISH = ITEMS.register("bucket_end_fish", () -> new FishBucketItem(() -> ModEntityTypes.END_FISH.get(), () -> Fluids.WATER, new Item.Properties().group(ModCreativeTabs.CREATIVE_TAB).maxStackSize(1)));
}
