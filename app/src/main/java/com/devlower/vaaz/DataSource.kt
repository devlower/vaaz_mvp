package com.devlower.vaaz

class DataSource {
    companion object {

        val allPlants: List<Plant> = listOf(
            Plant(
                "Amaryllis",
                "Hippeastrum",
                "The amaryllis are actually hippeastrum bulbous plants. Amaryllis is the common name for these plants, however, it is also the genus for another type of bulb from the same family (Amaryllidaceae) native to South Africa.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/hippeastrum-plant.jpg",
                23.00,
                0.45
            ),
            Plant(
                "African Violet",
                "Saintpaulia",
                "Saintpaulia is a genus comprising of approximately 20 species and subspecies, and many varietes. There are a fair few types including standard, trailers, miniatures, and chimeras (a basic way to put them into a category). Various species includes different sizes, flower colors and foliage types.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/av-light-purple-1.jpg",
                20.00,
                0.60
            ),
            Plant(
                "Angel Wing Begonia",
                "Begonia coccinea",
                "Native to South America, these perennial flowering plants (Begonia) grow in sub-tropical and tropical climates, although this species is a hybrid. Fortunately they deal the climate differences and grow in cooler conditions within temperate regions very well.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/08/angel_wing_begonia1.jpg",
                18.50,
                0.50
            ),
            Plant(
                "Barberton Daisy",
                "Gerbera jamesonii",
                "Native to South Africa this species is a perennial in warmer climates but in cooler countries (temperate regions) it’s grown as an annual and flowering pot plant. There are many varieties and hybrids sold that are more compact in growth than the basic type. The basic type has stalks which grow up to 2ft tall that can become quite lanky and unattractive.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/08/gerbera_jamesonii_1.jpg",
                18.50,
                0.25
            ),
            Plant(
                "Beach Spider Lily",
                "Hymenocallis littoralis",
                "This amazing bulb based plant “beach spider lily” enjoys environments that are downright aquatic and easy to maintain.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/beach_spider_lily_img.jpg",
                18.00,
                0.45
            ),
            Plant(
                "Belladonna Lily",
                "Amaryllis belladonna",
                "The main characteristics when looking for the differences between these is this species has no leaves at flowering time, solid stems, and produces 6 -12 flowers, while the hippeastrum (amaryllis used for the common name) has leaves shortly after flowering, hollow stems and blooms 3 – 6 flowers.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/amaryllis-belladonna.jpg",
                21.00,
                0.45
            ),
            Plant(
                "Bird Of Paradise",
                "Strelitzia reginae",
                "Strelitzia reginae is a native to the eastern coastlines of southern Africa, where it grows wild in patches that are sometimes miles across. It is sometimes referred to as the Crane plant due to the flowers looking like the feathers on the head of a crane.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/Strelitzia_Reginae_Flower_img1.jpg",
                26.50,
                0.45
            ),
            Plant(
                "Blushing Bromeliad",
                "Neoregelia carolinae",
                "\n" +
                        "This native to Brazil bromeliad “from the neoreglia genus” is one of the most commonly grown species indoors from this genus, with the most popular variety being the tricolor. These are also grown outdoors in USDA hardiness zones 10 – 11.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/blushing_bromeliad1.jpg",
                22.50,
                0.60
            ),
            Plant(
                "Flaming Sword",
                "Vriesea splendens",
                "The flaming sword bromeliad is a flowering plant which belongs to the vriesea genus and bromeliaceae family. Like other bromeliads this species has a rosette of leaves and a cup or vase in the center which has to be filled with water regularly.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/flaming-sword-plant.jpg",
                21.00,
                0.45
            ),
            Plant(
                "Busy Lizzie",
                "Impatiens walleriana",
                "Many lizzies which are sold in garden centers are hybrids that has enabled this species to become more compact in it’s growth and display attractive flower varieties. These delightful flowering plants brighten up patios or conservatories and have become one of the most popular bedding and hanging basket plants.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/impatiens-walleriana-lilac.jpg",
                21.00,
                0.45
            ),
            Plant(
                "Calla Lily",
                "Zantedeschia aethiopica",
                "Growing from a single rhizome, or bulb, this plant requires wet growing conditions in order to remain healthy. These oddly shaped flowers bloom in June and July outdoors, but from spring into fall if kept at the proper temperatures indoors. Otherwise, these plants provide beautiful leaves for the rest of the year.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/calla-lily-plant.jpg",
                15.00,
                0.45
            ),
            Plant(
                "Coral Berry",
                "Ardisia crenata",
                "The coral berry is a shrub that grows with a single stem or possibly multiple stems – displaying branches of leathery oval shaped leaves, which can be grown outdoors or indoors with the correct conditions.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/ardisia_crenata1.jpg",
                19.50,
                0.45
            ),
            Plant(
                "Corsage Orchid",
                "Cattleya orchid",
                "This attractive species is native to Central and South America. It likes warm temperatures and medium light. At home it will be best kept on a windowsill on either southern, eastern or western side.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/08/yellow_cattleya_orchid.jpg",
                22.50,
                0.55
            ),
            Plant(
                "Cyclamen Persicum",
                "C. cyclamen",
                "Cyclaman is the common name used for this plant and the name of the genus the persicum variety belongs to. In it’s natural habitat you’ll find this plant growing within rocky areas, among many shrub vegetation areas and over 1000m above sea levels. It is a tender plant which does not like frost, however, they’re grown outdoors (temperate climates) but struggle to survive in winter temperatures.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/cyclamen_persicum_variety.jpg",
                14.00,
                0.65
            ),
            Plant(
                "Eternal Flame",
                "Calathea crocata",
                "This species loves heat and humidity, but dislikes direct sunlight. Keeping it in your garden in temperate regions is not a good idea and it will require less work if kept indoors.\n" +
                        "\n" +
                        "The plant is also known for letting their owners know when to go to bed – its leaves close up in the evening. Even without its flowers Calathea Crocata looks spectacular.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/calathea_crocata.jpg",
                21.00,
                0.70
            ),
            Plant(
                "False Shamrock",
                "Oxalis regnellii",
                "The false shamrock native to Brazil has picked up it’s common name from the Irish shamrock symbol which refers to a triangular three leaved plant or the clover. These are often sold and bought as gift pot plants, especially just before St Patrick’s day.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/false_shamrock_leaf.jpg",
                18.00,
                0.45
            ),
            Plant(
                "Flamingo Flower Plant",
                "Anthurium scherzerianum",
                "The A scherzerianum is one of many species from the Anthurium genus (there are many more). Some people are mistaken when they state the A andreanum is the Flamingo flower (it’s the oilcloth flower) – which is important to know, because they have differences. The main differences between the flamingo and oilcloth is in size (flamingo is smaller) the leaves are a different shape and the spadix grows straight or slightly bent with the A andreanum (oilcoth). There are also many hybrids available.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/anthrium_andreanum_baby_boomer.jpg",
                21.00,
                0.50
            ),

            ).sortedBy { it.name }

        fun allPlantsToArray(): Array<String> {
            var tmp: Array<String> = arrayOf()

            allPlants.forEach {
                tmp += it.name
            }

            return tmp
        }
    }
}