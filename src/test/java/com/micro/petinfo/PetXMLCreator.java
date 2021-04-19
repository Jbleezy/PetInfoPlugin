package com.micro.petinfo;

import com.micro.petinfo.dataretrieval.Pet;
import com.micro.petinfo.dataretrieval.PetGroup;
import com.micro.petinfo.dataretrieval.SerializablePet;
import net.runelite.api.NpcID;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PetXMLCreator
{
	public static void main(String[] args) throws Exception
	{
		try {
			List<SerializablePet> testPets = new ArrayList<>();
			for(SerializablePet pet : getList())
			{
				testPets.add(pet);
			}
			serializeToXML(testPets);
		}
		catch (IOException e) {
			System.out.println("welp " + e);
		}
		System.out.println("and done");
	}

	private static void serializeToXML (List<SerializablePet> pets) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("pets.xml");
		XMLEncoder encoder = new XMLEncoder(fos);
		encoder.setExceptionListener(new ExceptionListener() {
			public void exceptionThrown(Exception e) {
				System.out.println("Exception! :"+e.toString());
			}
		});
		encoder.writeObject(pets);
		encoder.close();
		fos.close();
	}

	private static List<SerializablePet> getList() {
		List<SerializablePet> pets = new ArrayList<>();
		for(SerializablePet pet : pets1) {
			pets.add(pet);
		}
		return pets;
	}

	/*
	 * Pet Info Strings
	 */
	private static final String ABYSSAL_ORPHAN_INFO = "is obtained by placing an unsired on the Font of Consumption, at a rate of 5/128.";
	private static final String BABY_CHINCHOMPA_INFO = "is obtained while catching chinchompas.";
	private static final String BABY_MOLE_INFO = "is obtained by killing the Giant Mole, at a rate of 1/3000.";
	private static final String BEAVER_INFO = "is obtained while training Woodcutting.";
	private static final String BLOODHOUND_INFO = "is obtained by completing Master Clue Scrolls, at a rate of 1/1000.";
	private static final String CALLISTO_CUB_INFO = "is dropped by Callisto, at a rate of 1/2000.";
	private static final String CAT_INFO = "is obtained by letting a kitten grow for about 2 hours.";
	private static final String CHAOS_ELEMENTAL_JR_INFO = "is dropped by the Chaos Elemental, at a rate of 1/300; or the Chaos Fanatic, at 1/1000.";
	private static final String CHOMPY_CHICK_INFO = "is dropped by Chompy birds, at a rate of 1/500, after completing the elite Western Provinces Diary.";
	private static final String CLOCKWORK_CAT_INFO = "can be crafted in a POH with 84 Crafting and a Crafting table 4.";
	private static final String CORPOREAL_CRITTER_INFO = "is obtained by causing a pet Dark Core to metamorphosize.";
	private static final String CORRUPTED_YOUNGLLEF_INFO = "is obtained by causing a Youngllef to metamorphosize, this can only be done after completing the Corrupted Gauntlet.";
	private static final String DAGANNOTH_PRIME_JR_INFO = "is dropped by Dagannoth Prime, at a rate of 1/5000.";
	private static final String DAGANNOTH_REX_JR_INFO = "is dropped by Dagannoth Rex, at a rate of 1/5000.";
	private static final String DAGANNOTH_SUPREME_JR_INFO = "is dropped by Dagannoth Supreme, at a rate of 1/5000.";
	private static final String DARK_CORE_INFO = "is dropped by the Corporeal Beast, at a rate of 1/5000.";
	private static final String EEK_INFO = "was obtained during the 2018 Halloween event.";
	private static final String FISHBOWL_INFO = "can be caught in Harry's Fishing Shop";
	private static final String GENERAL_GRAARDOR_JR_INFO = "is dropped by General Graardor, at a rate of 1/5000";
	private static final String GIANT_SQUIRREL_INFO = "is obtained by training Agility.";
	private static final String HELLCAT_INFO = "is obtained by having a pet Cat hunt Hell-Rats.";
	private static final String HELLKITTEN_INFO = "is obtained by having a pet Kitten hunt Hell-Rats.";
	private static final String HELLPUPPY_INFO = "is dropped by Cerberus, at a rate of 1/3000.";
	private static final String HERBI_INFO = "is obtained by harvesting Herbiboars, at a rate of 1/6500.";
	private static final String HERON_INFO = "is obtained while training Fishing.";
	private static final String IKKLE_HYDRA_INFO = "is dropped by Alchemical Hydra, at a rate of 1/3000.";
	private static final String JALNIBREK_INFO = "is obtained by completing the inferno, at a rate of 1/100 (or 1/75 while on a TzKal-Zuk task).";
	private static final String JALREKJAD_INFO = "is obtained by causing a Tzrek-jad to metamorphosize, this can only be done after completing all six of TzHaar-Ket-Rak's Challenges (this requires having also completed the Inferno).";
	private static final String KALPHITE_PRINCESS_INFO = "is dropped by Kalphite Queen, at a rate of 1/3000.";
	private static final String KITTEN_INFO = "can be bought from Gertrude for 100gp, after completing the Gertrude's Cat quest.";
	private static final String KRAKEN_INFO ="is dropped by Kraken, at a rate of 1/3000.";
	private static final String KREEARRA_JR_INFO = "is dropped by Kree'arra, at a rate of 1/5000.";
	private static final String KRIL_TSUTSAROTH_JR_INFO = "is dropped by K'ril Tsutsaroth.";
	private static final String LAZY_CAT_INFO = "is obtained by letting a Wily Cat grow for about an hour.";
	private static final String LAZY_HELLCAT_INFO = "is obtained by letting a Wily Hellcat at grow for about an hour.";
	private static final String LIL_CREATOR_INFO = "is obtained by opening the Spoils of War, a reward from the Soul Wars minigame, at a rate of 1/400.";
	private static final String LIL_DESTRUCTOR_INFO = "is obtained by causing a pet Lil' creator to metamorphosize.";
	private static final String LIL_ZIK_INFO = "is obtained by completing the Theater of Blood, at a rate of 1/650 (with optimal performance).";
	private static final String LITTLE_NIGHTMARE_INFO = "is dropped by The Nightmare, at a rate of 1/4000 (or 1/3800 as MVP).";
	private static final String MAZ_INFO = "isn't a true pet, but you can get in her good graces by giving her an acorn.";
	private static final String MIDNIGHT_INFO = "is obtained by causing a pet Noon to metamorphosize.";
	private static final String NOON_INFO = "is dropped by the Grotesque Guardians, at a rate of 1/3000.";
	private static final String OLMLET_INFO = "is dropped by the Great Olm, at a rate of 1/53 per received broadcasted unique item.";
	private static final String OVERGROWN_CAT_INFO = "is obtained by letting a pet Cat grow for about 2-3 hours.";
	private static final String OVERGROWN_HELLCAT_INFO = "is obtained by letting a pet Hellcat grow for about 2-3 hours.";
	private static final String PET_ROCK_INFO = "can be received from Askeladden after The Fremennik Trials.";
	private static final String PENANCE_PET_INFO = "is received from High-level gambles in Barbarian Assault, at a rate of 1/1000.";
	private static final String PHOENIX_INFO = "is obtained by opening Supply crates from the Wintertodt, at a rate of 1/5000.";
	private static final String PRINCE_BLACK_DRAGON_INFO = "is dropped by the King Black Dragon, at a rate of 1/3000.";
	private static final String RIFT_GUARDIAN_INFO = "is obtained while training Runecraft.";
	private static final String ROCK_GOLEM_INFO = "is obtained while training Mining.";
	private static final String ROCKY_INFO = "is obtained while training Thieving.";
	private static final String SCORPIAS_OFFSPRING_INFO = "is dropped by Scorpia, at a rate of 1/2,015.75";
	private static final String SKOTOS_INFO = "is dropped by Skotizo, at a rate of 1/65.";
	private static final String SMOKE_DEVIL_INFO = "is dropped by the Thermonuclear smoke devil, at a rate of 1/3000.";
	private static final String SMOLCANO_INFO = "is dropped by Zalcano, at a rate of 1/2250.";
	private static final String SNAKELING_INFO = "is dropped by Zulrah, at a rate of 1/4000.";
	private static final String SRARACHA_INFO = "is dropped by Sarachnis, at a rate of 1/3000.";
	private static final String TANGLEROOT_INFO = "is obtained while training Farming.";
	private static final String TINY_TEMPOR_INFO = "is obtained from the Tempoross mini game.";	// TODO get drop rate
	private static final String TOY_DOLL_INFO = "can be crafted in a POH with 18 Crafting and a Crafting table 3.";
	private static final String TOY_MOUSE_INFO = "can be crafted in a POH with 33 Crafting and a Crafting table 4.";
	private static final String TOY_SOLDIER_INFO = "can be crafted in a POH with 13 Crafting and a Crafting table 3.";
	private static final String TZREKJAD_INFO = "is dropped by TzTok-Jad, at a rate of 1/200 (or 1/100 if on a slayer task).";
	private static final String TZREKZUK_IHFO = "is obtained by causing a pet Jal-nib-rek to metamorphosize.";
	private static final String VENENATIS_SPIDERLING_INFO = "is dropped by Venenatis at a rate of 1/2000.";
	private static final String VETION_JR_INFO = "is dropped by Vet'ion, at a rate of 1/2000.";
	private static final String VORKI_INFO = "is dropped by Vorkath, at a rate of 1/3000.";
	private static final String WILY_CAT_INFO = "is obtained by asking Felkrash to train an Overgrown Cat, after completing the Ratcatchers quest.";
	private static final String WILY_HELLCAT_INFO = "is obtained by asking Felkrash to train an Overgrown Hellcat, after completing the Ratcatchers quest.";
	private static final String YOUNGLLEF_INFO = "is obtained by completing The Gauntlet, at a rate of 1/2000 (or 1/800 for The Corrupted Gauntlet).";
	private static final String ZILYANA_JR_INFO = "is dropped by Commander Zilyana, at a rate of 1/5000.";

	/*
	 *	Variant text
	 */
	private static final String BABY_CHINCHOMPA_GOLD = " The gold variant is obtained by causing a Baby Chinchompa to metamorphosize, at a rate of 1/10000.";

	private static final String BABY_MOLE_RAT = " This is a variant of the Baby Mole, obtained by using a Mole Claw on the Baby Mole.";

	private static final String DARK_Giant_SQUIRREL = " This is a variant of the Giant Squirrel which is unlocked by using a Dark Acorn on a Giant Squirrel.";

	private static final String GREAT_BLUE_HERON_INFO = " This is a variant of the Heron, obtained by feeding the Heron 3,000 Spirit Flakes";

	private static final String ROCKY_RACCOON = " This is the Raccoon variant of Rocky, obtained by using Redberries on any variant of Rocky.";
	private static final String ROCKY_RED_PANDA = " This is the Red Panda variant of Rocky, obtained by using Redberries on any variant of Rocky.";
	private static final String ROCKY_TANUKI = " This is the Tanuki variant of Rocky, obtained by using Poison Ivy Berries on any variant of Rocky.";

	private static final String OLMLET_CM_VARIANTS = " This is a COX Challenge Mode variant of the Olmlet. Obtained by causing any variant of the Olmlet to metamorphosize, after having used metamorphic dust on the Olmlet.";

	private static SerializablePet[] pets1 = {
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.ABYSSAL_ORPHAN, ABYSSAL_ORPHAN_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.ABYSSAL_ORPHAN_5884, ABYSSAL_ORPHAN_INFO),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA, BABY_CHINCHOMPA_INFO),	// Red Variant
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA_6719, BABY_CHINCHOMPA_INFO),	// Grey Variant
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA_6720, BABY_CHINCHOMPA_INFO),	// Black Variant
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA_6721, BABY_CHINCHOMPA_INFO + " " + BABY_CHINCHOMPA_GOLD),	// Gold Variant
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA_6756, BABY_CHINCHOMPA_INFO),	// Red Variant
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA_6757, BABY_CHINCHOMPA_INFO),	// Grey Variant
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA_6758, BABY_CHINCHOMPA_INFO),	// Black Variant
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BABY_CHINCHOMPA_6759, BABY_CHINCHOMPA_INFO + " " + BABY_CHINCHOMPA_GOLD),	// Gold Variant

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.BABY_MOLE, BABY_MOLE_INFO),	// Pink/naked
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.BABY_MOLE_5781, BABY_MOLE_INFO),	// Pink slightly smaller?
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.BABY_MOLE_5782, BABY_MOLE_INFO),	// Pink even smaller
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.BABY_MOLE_6635, BABY_MOLE_INFO),	// Small Brown	// Seen
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.BABY_MOLE_6651, BABY_MOLE_INFO),	// Small Brown

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.BABY_MOLERAT, BABY_MOLE_INFO + BABY_MOLE_RAT),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.BABY_MOLERAT_10651, BABY_MOLE_INFO + BABY_MOLE_RAT),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BEAVER, BEAVER_INFO),
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.BEAVER_6724, BEAVER_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.BLOODHOUND, BLOODHOUND_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.BLOODHOUND_7232, BLOODHOUND_INFO),	// Seen in game, other players

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CALLISTO_CUB, CALLISTO_CUB_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CALLISTO_CUB_5558, CALLISTO_CUB_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT, CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_1619, CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_1620, CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_1621, CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_1622, CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_1623, CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_1624, CAT_INFO),	// Grey and blue checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_3831, CAT_INFO),	// Brown checkered, looks unkempt
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_3832, CAT_INFO),	// Black checkered, looks unkempt
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_6662, CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_6663, CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_6664, CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_6665, CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_6666, CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_6667, CAT_INFO),	// Grey and blue checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CAT_7380, CAT_INFO),	// Black with white feet

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CHAOS_ELEMENTAL_JR, CHAOS_ELEMENTAL_JR_INFO),	// Spotted in Game as other players
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CHAOS_ELEMENTAL_JR_5907, CHAOS_ELEMENTAL_JR_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CHOMPY_CHICK, CHOMPY_CHICK_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.CHOMPY_CHICK_4002, CHOMPY_CHICK_INFO),	// Slightly larger?

			new SerializablePet(PetGroup.TOY.toString(), NpcID.CLOCKWORK_CAT, CLOCKWORK_CAT_INFO),
			new SerializablePet(PetGroup.TOY.toString(), NpcID.CLOCKWORK_CAT_541, CLOCKWORK_CAT_INFO),
			new SerializablePet(PetGroup.TOY.toString(), NpcID.CLOCKWORK_CAT_2782, CLOCKWORK_CAT_INFO),
			new SerializablePet(PetGroup.TOY.toString(), NpcID.CLOCKWORK_CAT_6661, CLOCKWORK_CAT_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CORPOREAL_CRITTER, CORPOREAL_CRITTER_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CORPOREAL_CRITTER_8010, CORPOREAL_CRITTER_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CORRUPTED_YOUNGLLEF, CORRUPTED_YOUNGLLEF_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.CORRUPTED_YOUNGLLEF_8738, CORRUPTED_YOUNGLLEF_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DAGANNOTH_PRIME_JR, DAGANNOTH_PRIME_JR_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DAGANNOTH_PRIME_JR_6629, DAGANNOTH_PRIME_JR_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DAGANNOTH_REX_JR, DAGANNOTH_REX_JR_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DAGANNOTH_REX_JR_6641, DAGANNOTH_REX_JR_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DAGANNOTH_SUPREME_JR, DAGANNOTH_SUPREME_JR_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DAGANNOTH_SUPREME_JR_6628, DAGANNOTH_SUPREME_JR_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DARK_CORE, DARK_CORE_INFO),    // Not sure this is the pet dark core, but it looks right
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DARK_CORE_388, DARK_CORE_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DARK_SQUIRREL, GIANT_SQUIRREL_INFO + DARK_Giant_SQUIRREL),	// Thank you to Gamma91/Bram91 on gitHub for hte info
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.DARK_SQUIRREL_9638, GIANT_SQUIRREL_INFO + DARK_Giant_SQUIRREL),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.EEK, EEK_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.ENRAGED_TEKTINY, OLMLET_INFO + OLMLET_CM_VARIANTS),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.ENRAGED_TEKTINY_9513, OLMLET_INFO + OLMLET_CM_VARIANTS),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.FISHBOWL, FISHBOWL_INFO),	// Blue
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.FISHBOWL_6659, FISHBOWL_INFO),	// Green
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.FISHBOWL_6660, FISHBOWL_INFO),	// Gold

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.FLYING_VESPINA, OLMLET_INFO + OLMLET_CM_VARIANTS),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.FLYING_VESPINA_9514, OLMLET_INFO + OLMLET_CM_VARIANTS),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.GENERAL_GRAARDOR_JR, GENERAL_GRAARDOR_JR_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.GENERAL_GRAARDOR_JR_6644, GENERAL_GRAARDOR_JR_INFO),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.GIANT_SQUIRREL, GIANT_SQUIRREL_INFO),
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.GIANT_SQUIRREL_7351, GIANT_SQUIRREL_INFO),	// Seen in game as other players
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.GIANT_SQUIRREL_9666, GIANT_SQUIRREL_INFO), // There's usually an even number, so I'm not sure what's up

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.GREAT_BLUE_HERON, HERON_INFO + GREAT_BLUE_HERON_INFO),
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.GREAT_BLUE_HERON_10636, HERON_INFO + GREAT_BLUE_HERON_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.HELLCAT, HELLCAT_INFO),	// Spotted in Game as other players
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.HELLCAT_6668, HELLCAT_INFO),	// Spotted in Game as other players

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.HELLKITTEN, HELLKITTEN_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.HELLPUPPY, HELLPUPPY_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.HELLPUPPY_3099, HELLPUPPY_INFO),	// Seen in game as other players

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.HERBI, HERBI_INFO),
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.HERBI_7760, HERBI_INFO),	// Spotted in game as other players, slightly larger?

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.HERON, HERON_INFO),	// Spotted in Game as other players
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.HERON_6722, HERON_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA, IKKLE_HYDRA_INFO),	// Green Variant, other player
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA_8493, IKKLE_HYDRA_INFO),	// Blue Variant, other player
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA_8494, IKKLE_HYDRA_INFO),	// Red Variant, other player
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA_8495, IKKLE_HYDRA_INFO),	// Grey Variant, other player
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA_8517, IKKLE_HYDRA_INFO),	// Green
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA_8518, IKKLE_HYDRA_INFO),	// Blue
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA_8519, IKKLE_HYDRA_INFO),	// Red
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.IKKLE_HYDRA_8520, IKKLE_HYDRA_INFO),	// Grey

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.JALNIBREK, JALNIBREK_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.JALNIBREK_7675, JALNIBREK_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.JALREKJAD, JALREKJAD_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.JALREKJAD_10625, JALREKJAD_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KALPHITE_PRINCESS, KALPHITE_PRINCESS_INFO),	// Orange airborn
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KALPHITE_PRINCESS_6638, KALPHITE_PRINCESS_INFO),	// Green grounded	// Seen in game as other players
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KALPHITE_PRINCESS_6653, KALPHITE_PRINCESS_INFO),	// Green grounded
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KALPHITE_PRINCESS_6654, KALPHITE_PRINCESS_INFO),	// Green grounded

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.KITTEN, KITTEN_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.KITTEN_5591, KITTEN_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.KITTEN_5592, KITTEN_INFO),	// White	// Seen in game as other players, white kitten
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.KITTEN_5593, KITTEN_INFO),	// Checkered orange	// Seen in game as other players
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.KITTEN_5594, KITTEN_INFO),	// Black	// Seen in game as other players
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.KITTEN_5595, KITTEN_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.KITTEN_5596, KITTEN_INFO),	// Grey and blue checkered	// Seen in game as other players

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KRAKEN_6640, KRAKEN_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KRAKEN_6656, KRAKEN_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KREEARRA_JR, KREEARRA_JR_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KREEARRA_JR_6643, KREEARRA_JR_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KRIL_TSUTSAROTH_JR, KRIL_TSUTSAROTH_JR_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.KRIL_TSUTSAROTH_JR_6647, KRIL_TSUTSAROTH_JR_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT, LAZY_CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_1627, LAZY_CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_1628, LAZY_CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_1629, LAZY_CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_1630, LAZY_CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_1631, LAZY_CAT_INFO),	// Grey and blue checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_6683, LAZY_CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_6684, LAZY_CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_6685, LAZY_CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_6686, LAZY_CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_6687, LAZY_CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_CAT_6688, LAZY_CAT_INFO),	// Grey and blue checkered

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_HELLCAT, LAZY_HELLCAT_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LAZY_HELLCAT_6689, LAZY_HELLCAT_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LIL_CREATOR, LIL_CREATOR_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LIL_CREATOR_3566, LIL_CREATOR_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LIL_DESTRUCTOR, LIL_DESTRUCTOR_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.LIL_DESTRUCTOR_5008, LIL_DESTRUCTOR_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.LIL_ZIK, LIL_ZIK_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.LIL_ZIK_8337, LIL_ZIK_INFO),	// Seen in game other player

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.LITTLE_NIGHTMARE, LITTLE_NIGHTMARE_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.LITTLE_NIGHTMARE_9399, LITTLE_NIGHTMARE_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.MAZ, MAZ_INFO),	// Not a real pet, but close enough for me to want to add it

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.MIDNIGHT, MIDNIGHT_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.MIDNIGHT_7893, MIDNIGHT_INFO),	// Seen in game other player, morfed to NOON_7892

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.NOON, NOON_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.NOON_7892, NOON_INFO),	// Seen in game as other players, morfed to MIDNIGHT_7893

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.OLMLET, OLMLET_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.OLMLET_7520, OLMLET_INFO),	// Seen in game other player

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT, OVERGROWN_CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_5599, OVERGROWN_CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_5600, OVERGROWN_CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_5601, OVERGROWN_CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_5602, OVERGROWN_CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_5603, OVERGROWN_CAT_INFO),	// Grey and blue checkered	// Seen in game as other players
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_6676, OVERGROWN_CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_6677, OVERGROWN_CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_6678, OVERGROWN_CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_6679, OVERGROWN_CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_6680, OVERGROWN_CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_CAT_6681, OVERGROWN_CAT_INFO),	// Grey and blue checkered

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_HELLCAT, OVERGROWN_HELLCAT_INFO),	// Seen in game as other players
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.OVERGROWN_HELLCAT_6682, OVERGROWN_HELLCAT_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.PET_ROCK, PET_ROCK_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.PET_ROCK_6657, PET_ROCK_INFO),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.PENANCE_PET, PENANCE_PET_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.PENANCE_PET_6674, PENANCE_PET_INFO),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX, PHOENIX_INFO),	// Green
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_3078, PHOENIX_INFO),	// Blue
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_3079, PHOENIX_INFO),	// White
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_3080, PHOENIX_INFO),	// Purple
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_3081, PHOENIX_INFO),	// Green
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_3082, PHOENIX_INFO),	// Blue
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_3083, PHOENIX_INFO),	// White
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_3084, PHOENIX_INFO),	// Purple
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_7368, PHOENIX_INFO),	// Orange
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.PHOENIX_7370, PHOENIX_INFO),	// Orange

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.PRINCE_BLACK_DRAGON, PRINCE_BLACK_DRAGON_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.PRINCE_BLACK_DRAGON_6652, PRINCE_BLACK_DRAGON_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.PUPPADILE, OLMLET_INFO + OLMLET_CM_VARIANTS),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.PUPPADILE_8201, OLMLET_INFO + OLMLET_CM_VARIANTS),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RED, ROCKY_INFO + " " + ROCKY_RED_PANDA),
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RED_9852, ROCKY_INFO + " " + ROCKY_RED_PANDA),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN, RIFT_GUARDIAN_INFO + " This is the Fire variant."),	// Fire
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7338, RIFT_GUARDIAN_INFO + " This is the Air variant."),	// Air
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7339, RIFT_GUARDIAN_INFO + " This is the Mind variant."),	// Mind
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7340, RIFT_GUARDIAN_INFO + " This is the Water variant."),	// Water
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7341, RIFT_GUARDIAN_INFO + " This is the Earth variant."),	// Earth
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7342, RIFT_GUARDIAN_INFO + " This is the Body variant."),	// Body
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7343, RIFT_GUARDIAN_INFO + " This is the Cosmic variant."),	// Cosmic
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7344, RIFT_GUARDIAN_INFO + " This is the Chaos variant."),	// Chaos
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7345, RIFT_GUARDIAN_INFO + " This is the Nature variant."),	// Nature
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7346, RIFT_GUARDIAN_INFO + " This is the Law variant."),	// Law
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7347, RIFT_GUARDIAN_INFO + " This is the Death variant."),	// Death
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7348, RIFT_GUARDIAN_INFO + " This is the Soul variant."),	// Soul
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7349, RIFT_GUARDIAN_INFO + " This is the Astral variant."),	// Astral
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7350, RIFT_GUARDIAN_INFO + " This is the Blood variant."),	// Blood
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7354, RIFT_GUARDIAN_INFO + " This is the Wrath variant."),	// Wrath
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7355, RIFT_GUARDIAN_INFO + " This is the Air variant."),	// Air
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7356, RIFT_GUARDIAN_INFO + " This is the Mind variant."),	// Mind
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7357, RIFT_GUARDIAN_INFO + " This is the Water variant."),	// Water
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7358, RIFT_GUARDIAN_INFO + " This is the Earth variant."),	// Earth
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7359, RIFT_GUARDIAN_INFO + " This is the Body variant."),	// Body
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7360, RIFT_GUARDIAN_INFO + " This is the Cosmic variant."),	// Cosmic
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7361, RIFT_GUARDIAN_INFO + " This is the Chaos variant."),	// Chaos
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7362, RIFT_GUARDIAN_INFO + " This is the Nature variant."),	// Nature
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7363, RIFT_GUARDIAN_INFO + " This is the Law variant."),	// Law
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7364, RIFT_GUARDIAN_INFO + " This is the Death variant."),	// Death
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7365, RIFT_GUARDIAN_INFO + " This is the Soul variant."),	// Soul
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7366, RIFT_GUARDIAN_INFO + " This is the Astral variant."),	// Astral
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_7367, RIFT_GUARDIAN_INFO + " This is the Blood variant."),	// Blood
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_8024, RIFT_GUARDIAN_INFO + " This is the Wrath variant."),	// Wrath
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.RIFT_GUARDIAN_8028, RIFT_GUARDIAN_INFO + " This is the Wrath variant."),	// Wrath?

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM, ROCK_GOLEM_INFO + " This is the Amethyst variant."),	// Amethyst
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7439, ROCK_GOLEM_INFO + " This is the Rock variant."),	// Rock
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7440, ROCK_GOLEM_INFO + " This is the Tin variant."),	// Tin
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7441, ROCK_GOLEM_INFO + " This is the Copper variant."),	// Copper
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7442, ROCK_GOLEM_INFO + " This is the Iron variant."),	// Iron
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7443, ROCK_GOLEM_INFO + " This is the Blurite variant."),	// Blurite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7444, ROCK_GOLEM_INFO + " This is the Silver variant."),	// Silver
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7445, ROCK_GOLEM_INFO + " This is the Coal variant."),	// Coal
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7446, ROCK_GOLEM_INFO + " This is the Gold variant."),	// Gold
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7447, ROCK_GOLEM_INFO + " This is the Mithril variant."),	// Mithril
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7448, ROCK_GOLEM_INFO + " This is the Granite variant."),	// Granite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7449, ROCK_GOLEM_INFO + " This is the Adamantite variant."),	// Adamantite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7450, ROCK_GOLEM_INFO + " This is the Runite variant."),	// Runite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7451, ROCK_GOLEM_INFO + " This is the Rock variant."),	// Rock
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7452, ROCK_GOLEM_INFO + " This is the Tin variant."),	// Tin
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7453, ROCK_GOLEM_INFO + " This is the Copper variant."),	// Copper
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7454, ROCK_GOLEM_INFO + " This is the Iron variant."),	// Iron
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7455, ROCK_GOLEM_INFO + " This is the Blurite variant."),	// Blurite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7642, ROCK_GOLEM_INFO + " This is the Silver variant."),	// Silver
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7643, ROCK_GOLEM_INFO + " This is the Coal variant."),	// Coal
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7644, ROCK_GOLEM_INFO + " This is the Gold variant."),	// Gold
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7645, ROCK_GOLEM_INFO + " This is the Mithril variant."),	// Mithril
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7646, ROCK_GOLEM_INFO + " This is the Granite variant."),	// Granite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7647, ROCK_GOLEM_INFO + " This is Adamantite fire variant."),	// Adamantite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7648, ROCK_GOLEM_INFO + " This is the Runite variant."),	// Runite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7711, ROCK_GOLEM_INFO + " This is the Amethyst variant."),	// Amethyst
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7736, ROCK_GOLEM_INFO + " This is the Lovakite variant."),	// Lovakite
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7737, ROCK_GOLEM_INFO + " This is the Elemental variant."),	// Elemental
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7738, ROCK_GOLEM_INFO + " This is the Daeyalt variant."),	// Daeyalt
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7739, ROCK_GOLEM_INFO + " This is the Lovakite variant."),	// Lovakite variant, otherplayer
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7740, ROCK_GOLEM_INFO + " This is the Elemental variant."),	// Elemental variant, other player
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCK_GOLEM_7741, ROCK_GOLEM_INFO + " This is the Daeyalt variant."),	// Daeyalt

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCKY, ROCKY_INFO + " " + ROCKY_RACCOON),
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ROCKY_7353, ROCKY_INFO + " " + ROCKY_RACCOON),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SCORPIAS_OFFSPRING, SCORPIAS_OFFSPRING_INFO),		// Usually even, what's up with this?
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SCORPIAS_OFFSPRING_5561, SCORPIAS_OFFSPRING_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SCORPIAS_OFFSPRING_6616, SCORPIAS_OFFSPRING_INFO),	// This one is much smaller

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SKOTOS, SKOTOS_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SKOTOS_7671, SKOTOS_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SMOKE_DEVIL_6639, SMOKE_DEVIL_INFO),	// Yellow
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SMOKE_DEVIL_6655, SMOKE_DEVIL_INFO),	// Yellow
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SMOKE_DEVIL_8482, SMOKE_DEVIL_INFO),	// Blue
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SMOKE_DEVIL_8483, SMOKE_DEVIL_INFO),	// Blue

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SMOLCANO, SMOLCANO_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SMOLCANO_8739, SMOLCANO_INFO),

			// Not sure if there are more pet ids, or if the boss fight minions will appear
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SNAKELING_2127, SNAKELING_INFO),	// Green
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SNAKELING_2130, SNAKELING_INFO),	// Green variant, other player
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SNAKELING_2131, SNAKELING_INFO),	// Red variant, other player
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SNAKELING_2132, SNAKELING_INFO),	// Blue/Purple variant, other player

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SRARACHA, SRARACHA_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.SRARACHA_2144, SRARACHA_INFO),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT, TANGLEROOT_INFO),	// Acorn
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_7352, TANGLEROOT_INFO + " This is the Acorn variant."),	// Acorn
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9492, TANGLEROOT_INFO + " This is the Crystal variant."),	// Crystal
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9493, TANGLEROOT_INFO + " This is the Dragon Fruit variant."),	// Dragon
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9494, TANGLEROOT_INFO + " This is the Guam variant."),	// Guam
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9495, TANGLEROOT_INFO + " This is the White Lily variant."),	// White Lily
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9496, TANGLEROOT_INFO + " This is the Redwood variant."),	// Redwood
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9497, TANGLEROOT_INFO + " This is the Crystal variant."),	// Crystal
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9498, TANGLEROOT_INFO + " This is the Dragon Fruit variant."),	// Dragon Fruit Variant, other player
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9499, TANGLEROOT_INFO + " This is the Guam variant."),	// Guam Variant, other player
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9500, TANGLEROOT_INFO + " This is the White Lily variant."),	// White Lily Variant, other player
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.TANGLEROOT_9501, TANGLEROOT_INFO + " This is the Redwood variant."),	// Redwood Variant, other player

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.TEKTINY, OLMLET_INFO + OLMLET_CM_VARIANTS),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.TEKTINY_8202, OLMLET_INFO + OLMLET_CM_VARIANTS),

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.TINY_TEMPOR, TINY_TEMPOR_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.TINY_TEMPOR_10637, TINY_TEMPOR_INFO),

			new SerializablePet(PetGroup.TOY.toString(), NpcID.TOY_DOLL, TOY_DOLL_INFO),
			new SerializablePet(PetGroup.TOY.toString(), NpcID.TOY_DOLL_9253, TOY_DOLL_INFO),

			new SerializablePet(PetGroup.TOY.toString(), NpcID.TOY_MOUSE, TOY_MOUSE_INFO),
			new SerializablePet(PetGroup.TOY.toString(), NpcID.TOY_MOUSE_9255, TOY_MOUSE_INFO),

			new SerializablePet(PetGroup.TOY.toString(), NpcID.TOY_SOLDIER, TOY_SOLDIER_INFO),
			new SerializablePet(PetGroup.TOY.toString(), NpcID.TOY_SOLDIER_9251, TOY_SOLDIER_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.TZREKJAD, TZREKJAD_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.TZREKJAD_5893, TZREKJAD_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.TZREKZUK, TZREKZUK_IHFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.TZREKZUK_8011, TZREKZUK_IHFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VANGUARD_8198, OLMLET_INFO + OLMLET_CM_VARIANTS),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VANGUARD_8203, OLMLET_INFO + OLMLET_CM_VARIANTS),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VASA_MINIRIO, OLMLET_INFO + OLMLET_CM_VARIANTS),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VASA_MINIRIO_8204, OLMLET_INFO + OLMLET_CM_VARIANTS),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VENENATIS_SPIDERLING, VENENATIS_SPIDERLING_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VENENATIS_SPIDERLING_5557, VENENATIS_SPIDERLING_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VESPINA, OLMLET_INFO + OLMLET_CM_VARIANTS),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VESPINA_8205, OLMLET_INFO + OLMLET_CM_VARIANTS),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VETION_JR, VETION_JR_INFO),	// Purple
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VETION_JR_5537, VETION_JR_INFO),	// Orange
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VETION_JR_5559, VETION_JR_INFO),	// Purple
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VETION_JR_5560, VETION_JR_INFO),	// Orange

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VORKI, VORKI_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.VORKI_8029, VORKI_INFO),	// Seen in game, other player

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT, WILY_CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_5585, WILY_CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_5586, WILY_CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_5587, WILY_CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_5588, WILY_CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_5589, WILY_CAT_INFO),	// Grey and blue checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_6690, WILY_CAT_INFO),	// Black and grey checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_6691, WILY_CAT_INFO),	// White
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_6692, WILY_CAT_INFO),	// Checkered orange
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_6693, WILY_CAT_INFO),	// Black
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_6694, WILY_CAT_INFO),	// Grey and Brown checkered
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_CAT_6695, WILY_CAT_INFO),	// Black and grey checkered

			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_HELLCAT, WILY_HELLCAT_INFO),
			new SerializablePet(PetGroup.OTHER.toString(), NpcID.WILY_HELLCAT_6696, WILY_HELLCAT_INFO),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.YOUNGLLEF, YOUNGLLEF_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.YOUNGLLEF_8737, YOUNGLLEF_INFO),

			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ZIGGY, ROCKY_INFO + " " + ROCKY_TANUKI),
			new SerializablePet(PetGroup.SKILLING.toString(), NpcID.ZIGGY_9853, ROCKY_INFO + " " + ROCKY_TANUKI),

			new SerializablePet(PetGroup.BOSS.toString(), NpcID.ZILYANA_JR, ZILYANA_JR_INFO),
			new SerializablePet(PetGroup.BOSS.toString(), NpcID.ZILYANA_JR_6646, ZILYANA_JR_INFO)

	};
}
