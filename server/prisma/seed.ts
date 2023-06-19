import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

async function main() {
    await prisma.plant.deleteMany()
    
    await Promise.all([
        prisma.plant.create({
          data: {
            name: "Snake Plant",
            description: "Snake Plant is a hardy indoor plant with long, sword-shaped leaves.",
            humidityLevel: 40.0,
            idealTemperature: 18.0,
            photoUrl: "https://example.com/snake_plant.jpg"
          }
        }),
        prisma.plant.create({
          data: {
            name: "Aloe Vera",
            description: "Aloe Vera is a succulent plant with thick, fleshy leaves containing a gel-like substance.",
            humidityLevel: 50.0,
            idealTemperature: 20.0,
            photoUrl: "https://example.com/aloe_vera.jpg"
          }
        }),
        prisma.plant.create({
            data: {
              name: "Golden Pothos",
              description: "Golden Pothos, also known as Epipremnum aureum, is a trailing vine with heart-shaped leaves. It is a low-maintenance plant and is often used in hanging baskets or as a tabletop decoration.",
              humidityLevel: 50.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/golden_pothos.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "ZZ Plant",
              description: "ZZ Plant, or Zamioculcas zamiifolia, is a tropical plant with glossy, dark green leaves. It is known for its tolerance of low light conditions and is a popular choice for offices and homes.",
              humidityLevel: 40.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/zz_plant.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Peace Lily",
              description: "Peace Lily, also known as Spathiphyllum, is a popular houseplant with dark green leaves and elegant white flowers. It thrives in low to medium light conditions and helps improve indoor air quality.",
              humidityLevel: 60.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/peace_lily.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Spider Plant",
              description: "Spider Plant, or Chlorophytum comosum, is a versatile indoor plant with arching green and white striped leaves. It is known for its air-purifying qualities and is easy to care for.",
              humidityLevel: 40.0,
              idealTemperature: 18.0,
              photoUrl: "https://example.com/spider_plant.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Monstera Deliciosa",
              description: "Monstera Deliciosa, also known as the Swiss Cheese Plant, is a popular indoor plant with large, glossy leaves that develop unique holes as they mature. It is a tropical plant that thrives in warm and humid environments.",
              humidityLevel: 60.0,
              idealTemperature: 25.0,
              photoUrl: "https://example.com/monstera_deliciosa.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Rubber Plant",
              description: "Rubber Plant, or Ficus elastica, is a sturdy indoor plant with glossy, dark green leaves. It is known for its ability to tolerate low light conditions and can grow into a tall, tree-like form over time.",
              humidityLevel: 50.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/rubber_plant.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Bird's Nest Fern",
              description: "Bird's Nest Fern, or Asplenium nidus, is a tropical fern with broad, wavy leaves that resemble a bird's nest. It prefers high humidity and indirect light.",
              humidityLevel: 70.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/birds_nest_fern.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Parlor Palm",
              description: "Parlor Palm, or Chamaedorea elegans, is a small palm tree with delicate, feathery fronds. It is a popular choice for adding a touch of greenery to indoor spaces.",
              humidityLevel: 50.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/parlor_palm.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "String of Pearls",
              description: "String of Pearls, or Senecio rowleyanus, is a trailing succulent with round, bead-like leaves. It makes an eye-catching addition to hanging baskets and shelves.",
              humidityLevel: 40.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/string_of_pearls.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Calathea",
              description: "Calathea is a genus of tropical plants known for their vibrant and patterned leaves. They are popular for adding a splash of color and texture to indoor spaces.",
              humidityLevel: 60.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/calathea.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "English Ivy",
              description: "English Ivy, or Hedera helix, is a climbing vine with dark green leaves. It is often used as a ground cover or grown in hanging baskets.",
              humidityLevel: 50.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/english_ivy.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Pilea Peperomioides",
              description: "Pilea Peperomioides, also known as the Chinese Money Plant, is a unique indoor plant with round, coin-shaped leaves on long stems. It is known for its easy care and propagation.",
              humidityLevel: 50.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/pilea_peperomioides.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Rattlesnake Plant",
              description: "Rattlesnake Plant, or Calathea lancifolia, is a tropical plant with elongated leaves patterned with dark green and purple markings. It adds a touch of exotic beauty to indoor spaces.",
              humidityLevel: 60.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/rattlesnake_plant.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Fiddle Leaf Fig",
              description: "Fiddle Leaf Fig, or Ficus lyrata, is a popular indoor tree with large, violin-shaped leaves. It is prized for its dramatic foliage and makes a stunning statement piece.",
              humidityLevel: 40.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/fiddle_leaf_fig.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Bird of Paradise",
              description: "Bird of Paradise, or Strelitzia reginae, is a tropical plant known for its striking orange and blue flowers that resemble the plumage of a bird. It requires bright light and warmth to thrive.",
              humidityLevel: 60.0,
              idealTemperature: 26.0,
              photoUrl: "https://example.com/bird_of_paradise.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Pothos",
              description: "Pothos, or Epipremnum aureum, is a versatile vine with heart-shaped leaves that come in various shades of green. It is highly adaptable and can tolerate low light conditions.",
              humidityLevel: 50.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/pothos.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Croton",
              description: "Croton, or Codiaeum variegatum, is a colorful tropical plant with vibrant, variegated leaves. It thrives in bright light and adds a pop of color to any indoor space.",
              humidityLevel: 60.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/croton.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Jade Plant",
              description: "Jade Plant, or Crassula ovata, is a succulent with thick, fleshy leaves and a tree-like growth habit. It is believed to bring good luck and prosperity.",
              humidityLevel: 40.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/jade_plant.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "African Violet",
              description: "African Violet, or Saintpaulia, is a compact flowering plant with velvety leaves and clusters of colorful flowers. It is a popular choice for indoor gardens and adds a touch of elegance.",
              humidityLevel: 50.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/african_violet.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "String of Hearts",
              description: "String of Hearts, or Ceropegia woodii, is a trailing succulent with heart-shaped leaves. It cascades gracefully from hanging baskets or shelves and is an excellent choice for plant enthusiasts.",
              humidityLevel: 40.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/string_of_hearts.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Maidenhair Fern",
              description: "Maidenhair Fern, or Adiantum, is a delicate fern with delicate fronds that are light green and fan-shaped. It prefers high humidity and indirect light.",
              humidityLevel: 70.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/maidenhair_fern.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Hoya Carnosa",
              description: "Hoya Carnosa, also known as the Wax Plant, is a succulent vine with thick, waxy leaves and clusters of fragrant star-shaped flowers. It is a low-maintenance plant that can tolerate different light conditions.",
              humidityLevel: 50.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/hoya_carnosa.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Boston Fern",
              description: "Boston Fern, or Nephrolepis exaltata, is a popular fern with feathery, arching fronds. It thrives in high humidity and indirect light, making it a great choice for bathrooms or kitchens.",
              humidityLevel: 70.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/boston_fern.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Snake's Tongue",
              description: "Snake's Tongue, or Sansevieria cylindrica, is a succulent plant with cylindrical leaves that resemble tongues. It is a unique and eye-catching plant that requires minimal care.",
              humidityLevel: 40.0,
              idealTemperature: 18.0,
              photoUrl: "https://example.com/snakes_tongue.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Rex Begonia",
              description: "Rex Begonia, or Begonia rex-cultorum, is a tropical plant known for its colorful and patterned leaves. It prefers bright, indirect light and moderate humidity.",
              humidityLevel: 60.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/rex_begonia.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Swiss Cheese Vine",
              description: "Swiss Cheese Vine, or Monstera adansonii, is a trailing vine with small, heart-shaped leaves that develop unique holes as they mature. It is a great choice for hanging baskets or trellises.",
              humidityLevel: 60.0,
              idealTemperature: 25.0,
              photoUrl: "https://example.com/swiss_cheese_vine.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Lucky Bamboo",
              description: "Lucky Bamboo, or Dracaena sanderiana, is a popular plant associated with good luck and prosperity. It has long, slender stems with clusters of small leaves and can be grown in water or soil.",
              humidityLevel: 50.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/lucky_bamboo.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Alocasia Polly",
              description: "Alocasia Polly, or Alocasia amazonica, is a compact plant with glossy, arrowhead-shaped leaves that have prominent veins. It requires bright, indirect light and high humidity.",
              humidityLevel: 70.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/alocasia_polly.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Chinese Evergreen",
              description: "Chinese Evergreen, or Aglaonema, is a low-maintenance plant with attractive foliage. It comes in various shades of green and can tolerate low light conditions.",
              humidityLevel: 50.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/chinese_evergreen.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Purple Heart Plant",
              description: "Purple Heart Plant, or Tradescantia pallida, is a trailing plant with vibrant purple leaves. It is a resilient plant that can tolerate different light conditions.",
              humidityLevel: 40.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/purple_heart_plant.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Orchid",
              description: "Orchids are a diverse family of flowering plants known for their exquisite and often fragrant flowers. They require specific care, including proper light, humidity, and watering.",
              humidityLevel: 60.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/orchid.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Cactus",
              description: "Cactus is a desert plant known for its spiky appearance and water-storing capabilities. It comes in various shapes and sizes, adding a unique touch to any indoor space.",
              humidityLevel: 30.0,
              idealTemperature: 25.0,
              photoUrl: "https://example.com/cactus.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Devil's Ivy",
              description: "Devil's Ivy, also known as Pothos, is a trailing vine with heart-shaped leaves. It is highly adaptable and can thrive in different light conditions, making it a popular choice for indoor gardens.",
              humidityLevel: 40.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/devils_ivy.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Succulent",
              description: "Succulents are a group of plants known for their fleshy, water-storing leaves. They come in various shapes and colors, making them a versatile choice for indoor gardens and arrangements.",
              humidityLevel: 30.0,
              idealTemperature: 20.0,
              photoUrl: "https://example.com/succulent.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Boston Fern",
              description: "Boston Fern, or Nephrolepis exaltata, is a popular fern with feathery, arching fronds. It thrives in high humidity and indirect light, making it a great choice for bathrooms or kitchens.",
              humidityLevel: 70.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/boston_fern.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Jasmine",
              description: "Jasmine is a fragrant flowering plant known for its beautiful white flowers and sweet scent. It requires bright light and moderate humidity to thrive indoors.",
              humidityLevel: 50.0,
              idealTemperature: 22.0,
              photoUrl: "https://example.com/jasmine.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Bamboo Palm",
              description: "Bamboo Palm, or Chamaedorea seifrizii, is a small palm tree with lush, feathery fronds. It is an excellent choice for adding a tropical touch to indoor spaces.",
              humidityLevel: 60.0,
              idealTemperature: 24.0,
              photoUrl: "https://example.com/bamboo_palm.jpg"
            }
          }),
          prisma.plant.create({
            data: {
              name: "Lavender",
              description: "Lavender is a fragrant herb with purple flowers and aromatic leaves. It is often used for its calming properties and can be grown indoors with proper light and care.",
              humidityLevel: 40.0,
              idealTemperature: 18.0,
              photoUrl: "https://example.com/lavender.jpg"
            }
          }),
    ])
}

main()
  .then(async () => {
    await prisma.$disconnect()
  })
  .catch(async (e) => {
    console.error(e)
    await prisma.$disconnect()
    process.exit(1)
  })