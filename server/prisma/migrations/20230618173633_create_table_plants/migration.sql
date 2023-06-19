-- CreateTable
CREATE TABLE "plants" (
    "id" TEXT NOT NULL PRIMARY KEY,
    "name" TEXT NOT NULL,
    "description" TEXT NOT NULL,
    "humidityLevel" REAL NOT NULL,
    "idealTemperature" REAL NOT NULL,
    "photoUrl" TEXT NOT NULL
);
