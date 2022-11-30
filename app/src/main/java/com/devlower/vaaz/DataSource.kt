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

            Plant(
                "Aluminum Plant",
                "Pilea cadierei",
                "With the aliminum plants easy going nature and lack of any real growing problems, it will bush out from its container in leaves of silver and green for up to four years before it dies. The leaves are normally squat and broad, measuring up to 12 inches (30 cm) long and up to 8 inches (21 cm) wide.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/aluminum_plant.jpg",
                19.00,
                0.45
            ),

            Plant(
                "Areca Palm",
                "Dypsis lutescens",
                "The areca is known as a cane type palm because of the bamboo cane looking stems once it’s matured. They’re also very similar to the feather types (especially the kentia palm) that display similar leaflets (leaves) and grows up to about the same height indoors.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/areca_palm22.jpg",
                20.00,
                0.45
            ),

            Plant(
                "Arrowhead Plant",
                "Syngonium podophyllum",
                "Native to South America, this species of plant has various cultivars with different amounts of variegation, from entirely green to near white. They can be sold under the the name Nephthytis podophyllum.",
                "https://gardenerspath.com/wp-content/uploads/2022/01/How-to-Grow-Arrowhead-Vine-Cover.jpg",
                22.00,
                0.45
            ),

            Plant(
                "Birds Nest Fern",
                "Asplenium nidus",
                "Asplenium nidus is an epiphytic species of fern in the family Aspleniaceae, native to tropical southeastern Asia, eastern Australia, Hawaii, Polynesia, Christmas Island, India, and eastern Africa. It is known by the common names bird's-nest fern or simply nest fern.",
                "https://www.ourhouseplants.com/imgs-content/Birds-nest-fern-houseplant.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Boston Fern",
                "Nephrolepis exaltata",
                "Nephrolepis exaltata, known as the sword fern or Boston fern, is a species of fern in the family Lomariopsidaceae. It is native to the Americas. This evergreen plant can reach as high as 40–90 centimetres, and in extreme cases up to 1.5 metres.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/boston_ferns_in_hanging_baskets_1.jpg",
                20.00,
                0.50
            ),

            Plant(
                "Broadleaf Lady Palm",
                "Rhapis excelsa",
                "Native to regions of China and Taiwan, the Broadleaf Lady Palm is a multi-stemmed palm plant that has become increasingly popular around the world. The plant has proven successful in removing airborne toxins within the home, including ammonia, formaldehyde, xylene, and carbon dioxide. Unlike other plants, who simply make oxygen, Rhapis excelsa will actually make the air in your home cleaner and safer to breathe.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/broadleaf_lady_palm1.jpg",
                16.00,
                0.45
            ),

            Plant(
                "Canary Island Date Palm",
                "Phoenix canariensis",
                "The Canary date palm is a popular ornamental plant grown outdoors in tropical, sub-tropical and in some warmer temperate regions. While it grows up to 20 metres in it’s native Mediterranean habitat the indoor variety can be kept at a more manageable height, of 6ft tall.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/canary.jpg",
                16.00,
                0.45
            ),

            Plant(
                "Cast Iron Plant",
                "Aspidistra elatior",
                "A native to Japan and Taiwan the Aspidistra elatior is a hardy garden plant and very easy to grow ornamental plant for indoors. It has been known to bloom tiny flowers near the base of the foliage, although this seems to be a very rare occasion for growers – so its mainly grown for its foliage.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/Aspidistra_Elatior.jpg",
                20.00,
                0.45
            ),

            Plant(
                "Chinese Evergreen Plant",
                "Aglaonema commutatum",
                "There are many hybrid varieties of the Chinese evergreen available which have been cultivated over the last century. This is because of their increasing popularity for indoor growers to use them as ornamental plants for room decoration.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/aglaonema.png",
                23.00,
                0.65
            ),

            Plant(
                "Coral Bead Plant",
                "Nertera granadensis",
                "A native of the Pacific Ocean areas, Nertera granadensis can be found on any non-arctic continent that borders the vast ocean. Known by many names around the world, this plant is popular in outdoor areas but has been known to be a picky customer in the indoor setting.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/08/coral-bead-plant.jpg",
                16.00,
                0.65
            ),

            Plant(
                "Dracaena Corn Plant",
                "Dracaena fragrans",
                "If your a grower needing a plant for a center piece in a room or a focal point, this is one of those types of species which looks the part. Once it begins to mature and grows over 4 feet in height it makes an ideal office or hotel plant and looks the business in large living rooms and hallways.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/dracaena_fragrans.jpg",
                20.00,
                0.45
            ),

            Plant(
                "Creeping Fig",
                "Ficus pumila",
                "The creeping fig is an evergreen climbing species which you might have seen crawling up the walls of large mansions or a quaint house in the country. Indoors creeping fig best grown in a hanging basket, or given something to attach to and climb.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/ficus_pumila.jpg",
                19.00,
                0.45
            ),

            Plant(
                "Cretan Brake Fern",
                "Pteris cretica",
                "The variety of Pteris cretica ferns that are cultivated display different shaped and colored fronds, but share very similar characteristics and care requirements. The P.cretica albolineata also called the variegated table fern is one of the most common that has broad green leaflets and a pale center. The P.cretica has slimmer green leaflets with serrated edges.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/cretan_brake.jpg",
                21.00,
                0.45
            ),

            Plant(
                "Croton",
                "Codiaeum variegatum",
                "Grown in it’s natural habitat and outdoors this evergreen shrub can grow up to 3 metres tall, so in gardens they look great planted around borders like bushes or hedges. Indoors if your able to provide the correct temperatures and humidity levels they’re an interesting container plant that adds a touch of color to a room. The room will need to be bright and have sunlight, though.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/croton1.jpg",
                23.00,
                0.70
            ),

            Plant(
                "Dumb Cane Plant",
                "Dieffenbachia amoena",
                "Dieffenbachia amoena is a very popular house plant due to its easy going nature. Plants that receive too little light or too little water will simply not grow as quickly as plants that are given proper care.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/elephants_ear_plant.jpg",
                21.00,
                0.45
            ),

            Plant(
                "Amazon Elephant’s Ear",
                "Alocasia polly",
                "The elephant’s ear is a hybrid that has become a fairly popular ornamental house plant, and is one of the easiest to find and buy from the Alocasia genus. Different shades of green and yellow appear through the leaves when sun light hits the leaves which is an attractive sight.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/dumb_cane_plant.jpg",
                21.00,
                0.60
            ),

            Plant(
                "European Fan Palm",
                "Chamaerops humilis",
                "Once the European fan matures it sits well as a centerpiece within a large room or conservatory. Because it grows with a wide spread be prepared to have enough space, unless you plan to move it outdoors.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/chamaerops-humilis.jpg",
                21.00,
                0.45
            ),

            Plant(
                "Fiddle Leaf Fig",
                "Ficus lyrata",
                "This indoor tree type plant grows over 15 metres tall in it’s natural habitat and up to 3 metres indoors, although they can be topped to prevent them growing taller. When these plants mature in age and size they make a great focal point within living rooms, hallways, offices or hotels.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/ficus_lyrata2.png",
                20.00,
                0.45
            ),

            Plant(
                "Golden Pothos Plant",
                "Epipremnum aureum",
                "This plant is a native of Australia, Indonesia, China, Japan and India. Despite its already wide natural range, it has been imported to locations all over the globe. Although it does wonderfully as a house plant, growing it outdoors is illegal in some states, as it has been declared an invasive species.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/Devils_Ivy.jpg",
                22.00,
                0.50
            ),

            Plant(
                "Green Velvet Alocasia",
                "Alocasia micholitziana",
                "Alocasia micholitziana, commonly known as the green velvet taro or green velvet alocasia, is a plant in the family Araceae. It is endemic to the island of Luzon in the Philippines. It is commonly grown as an ornamental plant worldwide.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/alocasia_micholitziana_frydek1.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Hawaiian Ti Plant",
                "Cordyline fruticosa",
                "There are three main varieties which are the tricolor (green with red, pink and cream), red edge (green with red streaks), and plain green. The most popular grown indoors is the red edged type , because it’s so colorful. There are also dwarf types which are cultivated and sold.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/green_leafed_cordiline_fruticosa1.jpg",
                23.00,
                0.55
            ),

            Plant(
                "Heart Of Jesus Plant",
                "Caladium bicolor",
                "The plant genus (caladium) is not short of varieties, which consists of over 1000. Most are hybrids from the C. bicolor and sold with by the name of C. x hortulanum (hybrids). Many other common names are used for these hybrids including the rosebud, frieda hemple, lord derby and a fair few others.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/caladium_1.jpg",
                18.00,
                0.45
            ),

            Plant(
                "Heart leaf Philodendron",
                "Philodendron scandens",
                "The Philodendron scandens is native to Mexico, Brazil and the West Indies and is one of the most common and popular species of Philodendron sold today. It is part of the Aracae family and is known as a vine and climber due to its ability to grow to huge heights given the right conditions. These plants are naturally found in humid tropical rainforests but they are also found in swamps and river banks.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/philodendron_with_other_plants.jpg",
                20.00,
                0.45
            ),

            Plant(
                "Kentia Palm Plant",
                "Howea forsteriana",
                "Where they are cultivated: The K.palm is native to Lord Howe Island (Australia) and cultivated there. The seeds are also sent to and cultivated in other countries including, the Hawaiian Islands. It is said to be a vulnerable species, according to the International Union for Conservation of Nature (IUCN) and can be found on their red list for it’s vulnerability.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/kentia44.jpg",
                20.00,
                0.70
            ),

            Plant(
                "Lucky Bamboo Plant",
                "Dracaena braunii",
                "The lucky bamboo grown in it’s native country (West Africa) can grow up to 5ft tall (or much more), and as a house plant up to approximately 2 or 3 feet. There are various cultivars of this plant and some of the most interesting are the twisted stalk types which are trained by specialist growers.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/lucky-bamboo-plant.jpg",
                25.00,
                0.45
            ),

            Plant(
                "Madagascar Dragon Tree",
                "Dracaena marginata",
                "The Dracaena marginata is a species from a large plant genus (Dracaena) that has many variations in leaf sizes, leaf colors and different trunk types. The marginata is one of the most popular seen indoors that grows into an attractive plant and becomes a great focal point of a room, once it has matured enough.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/Dracaena-marginata.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Delta Maidenhair Fern",
                "Adiantum raddianum",
                "This delicate species is in need of a consistent supply of moisture, from the atmosphere and it’s soil. You’ll find these growing near a water feature in some large buildings and thriving due to it being content with the amount of moisture it’s getting and shade.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/maidenhair_fern.jpg",
                21.00,
                0.70
            ),

            Plant(
                "Mexican Fortune",
                "Pachira aquatica",
                "In South America and other warm climates the pachira is grown for it’s edible nuts, in east Asia for good fortune, and in Europe and the US for their attractiveness as an indoor tree species. Grown braided as a house plant edible nuts will not fruit.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/pachira_money_tree.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Parlor Palm",
                "Chamaedorea elegans",
                "Parlor palm tree’s are quite an easy plant to grow and care for, which makes them suitable for those new to growing indoors. They tolerate low light and colder conditions pretty well. They also don’t need a great amount of feeding or watering.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/parlor-palm.jpg",
                14.00,
                0.45
            ),

            Plant(
                "Peacock Plant",
                "Calathea or maranta makoyana",
                "With its somewhat tropical origins, The Peacock Plant is a tall, slender plant that with the right care can become a colorful house plant for your collection.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/calathea_makoyana.jpg",
                20.00,
                0.50
            ),

            Plant(
                "Pin-Stripe Calathea",
                "Calathea ornata",
                "Calathea Ornata is a plant that is native to South America and seen in many tropical climates such as Thailand. There are several members of the same family and they are all known for their large leaves, all of which have patterns that are extremely noticeable whilst their colors are stunning.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/calathea_ornata.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Pygmy Date Palm",
                "Phoenix roebelenii",
                "The Pygmy palm has very slim feather type leaflets that arch over. The only other palm I know of that has slimmer leaves is the dwarf coconut type, while others are much wider and can look more attractive indoors.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/08/Phoenix-roebelenii-plant.jpg",
                20.00,
                0.50
            ),

            Plant(
                "Rabbit’s Foot Fern",
                "Davallia fejeensis",
                "The Davallia fejeensis belongs to a genus of 40 plants that are epiphytic in nature, which means they grow on trees or within rock crevices taking moisture and nutrients from other sources “not soil” such as air, rain, trees and other debris.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/rabbits_foot_fern.jpg",
                20.00,
                0.50
            ),

            Plant(
                "Rabbit’s Foot Fern",
                "Davallia fejeensis",
                "The Davallia fejeensis belongs to a genus of 40 plants that are epiphytic in nature, which means they grow on trees or within rock crevices taking moisture and nutrients from other sources “not soil” such as air, rain, trees and other debris.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/rabbits_foot_fern.jpg",
                20.00,
                0.50
            ),

            Plant(
                "Rattlesnake Plant",
                "Goeppertia insignis",
                "Goeppertia insignis, the rattlesnake plant, is a species of flowering plant in the Marantaceae family, native to Rio de Janeiro state in Brazil. It is an evergreen perennial, growing to 60–75 cm, with slender pale green leaves to 45 cm, heavily marked above with dark blotches, purple below.",
                "https://cdn.shopify.com/s/files/1/0662/5489/products/Calathea_lancifolia_-_rattlesnake_plant_-_pistils_nursery_1050x1359.jpg?v=1609194468",
                21.00,
                0.60
            ),

            Plant(
                "Rose Painted Calathea",
                "Calathea roseopicta",
                "\n" +
                        "The Rose painted calathea, with it’s clump forming habit is a species that’s more than happy growing and being displayed indoors showing off it’s striking leaves and suits growers requiring an undemanding plant. They also make an attractive choice of plant displayed on balconies and patios when temperatures are warm enough.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/rose_painted_calatheae.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Rubber Plant",
                "Ficus elastica",
                "There are a number of Ficus elastica varieties grown successfully indoors which includes, “the most common one” F.elastica decora (has shiny leather type leaves which grow to a foot long), F.elastica robusta (has larger leaves than decora), F.elastica black prince or burgundy (has near black reddish leaves) and a selection of variegated types",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/rubber_plant.jpg",
                20.00,
                0.45
            ),

            Plant(
                "Sago Palm",
                "Cycas revoluta",
                "Sago palms are slow growing plants that take a fair few years (5 or more) to reach their maximum height of appoximatly 2ft, when grown indoors. A plant may only produce one leaf per year, so don’t expect lot’s of new foliage to appear during it’s growing period.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/cycas_revoluta.jpg",
                20.00,
                0.60
            ),

            Plant(
                "Sentry Palm",
                "Howea belmoreana",
                "\n" +
                        "The sentry palm plant is a similar tree when comparing it with the kentia. The scientific name is Howea Belmoreana and it’s also known as the curly palm.\n" +
                        "\n" +
                        "There are some difference’s and similarities between this plant and the kentia. The fronds arch over more on the H.belmoreana (similar wide leaflets though) and grows slower.\n",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/sentrypalm-plant.jpg",
                20.00,
                0.65
            ),

            Plant(
                "Dracaena Song Of India",
                "Dracaena reflexa",
                "The song of India plant is a species from the dracaena genus (dracaena reflexa) that has become a popular house plant.\n" +
                        "\n" +
                        "This tree like plant is fairly easy to grow and maintain like others from this genus, although it does require high humidity levels.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/song_of_india_plant1.jpg",
                21.00,
                0.55
            ),

            Plant(
                "Spider Plant",
                "Chlorophytum comosum",
                "This plant can survive with minimal care/attention and can manage low temperatures. However, they will start to look very unattractive and create mess (leaves falling and browning) without enough water and light or too much of either. When they’re taken care of properly they look great.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/chlorophytum-vittatum.jpg",
                20.00,
                0.45
            ),

            Plant(
                "Swiss Cheese Plant",
                "Monstera deliciosa",
                "The Swiss cheese plant displays the most interesting looking leaves and needs a grower to be prepared to provide some extra space within a home (it grows fairly tall when it matures).",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/Monstera_Deliciosa.jpg",
                23.00,
                0.65
            ),

            Plant(
                "Umbrella Plant",
                "Schefflera arboricolum",
                "The umbrella plant is a multi trunk tree that can grows over 15 metres tall outdoors and has to be pruned and topped at some point to keep its size manageable within a home. Its close relative () Schefflera Actinophylla) has to carefully planted because of its invasive nature and is seen as a weed in certain places.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/umbrella_plant.jpg",
                20.00,
                0.60
            ),

            Plant(
                "Wandering Jew Plant",
                "Tradescantia zebrina",
                "There’s a number of tradescantia varieties very similar in looks, how they’re grown and their growth habit, including the T. zebrina (has dark green leaves with silver bands), the T. fluminensis variegata with cream stripes and quicksilver which has white stripes. Then there’s the T. pallida from the same genus which is sometimes named wandering jew plant, but looks very different from the T. fluminensis and zebrina.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/08/wandering_jew2.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Weeping Fig Plant",
                "Ficus benjamina",
                "The weeping figs natural habitat is within rain forests. There’s the green leaf type and variegated, also miniature sized trees (indoor bonsai), which may only grow up to 3ft tall. A fair few other cultivars exist that have various leaf colors and patterns.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/weeping-fig-tree-indoors.jpg",
                21.00,
                0.50
            ),

            Plant(
                "Zebra Plant",
                "Aphelandra squarrosa",
                "The zebra plant grows well indoors when given the correct care and conditions. However, it is quite a temperamental species and can easily lose it’s leaves and becomes leggy – without the proper care it needs.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/close_up_zebra_plant_1-683x1024-jpg.webp",
                19.00,
                0.65
            ),

            Plant(
                "Zebra Plant",
                "Calathea zebrina",
                "The Zebra plant (scientific name – Calathea zebrina) is a perennial foliage plant that displays fairly large ovate leaves at the tips of it’s long stalks, growing up to 1 metre tall.\n" +
                        "\n" +
                        "This species is fairly undemanding and suitable for growing indoors if enough light and humidity is provided, and the correct temperature conditions given.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/zebrina.jpg",
                21.00,
                0.55
            ),

            Plant(
                "ZZ House Plant",
                "Zamioculcas zamiifolia",
                "The Zamioculcas Zamiifolia plant is an easy to grow and care for indoor plant that displays small glossy leaves on stems which can grow up to 3 ft long indoors.",
                "https://www.houseplantsexpert.com/wp-content/uploads/2022/09/zz_plant-300x273.png",
                20.00,
                0.60
            )

        ).sortedBy { it.name }

        val allProducts: List<Product> = listOf(
            Product("Product_01", 00.00, "description of the product"),
            Product("Product_02", 00.00, "description of the product"),
            Product("Product_03", 00.00, "description of the product"),
            Product("Product_04", 00.00, "description of the product"),
            Product("Product_05", 00.00, "description of the product"),
            Product("Product_06", 00.00, "description of the product"),
            Product("Product_07", 00.00, "description of the product"),
            Product("Product_08", 00.00, "description of the product"),
            Product("Product_09", 00.00, "description of the product"),
            Product("Product_10", 00.00, "description of the product"),
            Product("Product_11", 00.00, "description of the product"),
            Product("Product_12", 00.00, "description of the product"),
            Product("Product_13", 00.00, "description of the product")
        )

        var allNotifications: List<Notification> = arrayListOf()
        var plants: List<Plant?> = arrayListOf()
        const val CAMERA = 2

        fun allPlantsToArray(): Array<String> {
            var tmp: Array<String> = arrayOf()

            allPlants.forEach {
                tmp += it.name
            }

            return tmp
        }
    }
}