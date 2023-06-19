import { FastifyInstance } from 'fastify'
import { z } from 'zod'
import { prisma } from "./prisma"

export async function appRoutes(app: FastifyInstance) {
    app.get('/all_plants', async () => {
        const plants = await prisma.plant.findMany({
            orderBy: {
                name: 'asc'
            }
        })
        return plants
    }) 

    app.post('/create_plant', async (request) => {
        const createPlantBody = z.object({
            name: z.string(),
            description: z.string(),
            humidityLevel: z.number(),
            idealTemperature: z.number(),
            photoUrl: z.string()
        })

        const { name, description, humidityLevel, idealTemperature, photoUrl } = createPlantBody.parse(request.body)

        await prisma.plant.create({
            data: {
                name,
                description,
                humidityLevel,
                idealTemperature,
                photoUrl
            }
        })
    })
}

 