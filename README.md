# Instant Breeding

Breed your animals again right away, without waiting five minutes between rounds.

Instant Breeding removes the breeding cooldown of animals. As soon as two animals have bred, both parents can be fed again and bred once more. A baby that you grow up with food can be bred the moment it becomes an adult.

The mod runs on the server only. Players join with a plain vanilla client and still see everything.

Available for NeoForge, Forge and Fabric.

## Features

- **No cooldown for parents.** After breeding, both parents can be fed their breeding food again straight away instead of waiting five minutes.
- **Grown-up babies breed at once.** A baby animal that grows up, naturally or with food, can be bred as soon as it is an adult. Any leftover waiting time stored on the animal is discarded.
- **Every animal.** Works for all animals that breed the vanilla way, including foxes, turtles, frogs, sniffers, horses, llamas, camels and bees.
- **Villagers stay vanilla.** Villager breeding and its cooldown are not touched.

There is no config file.

## How it works

What changes:

- When two animals breed, vanilla gives both parents a five-minute cooldown before they can fall in love again. With the mod, they can be fed again right after breeding.
- When a baby animal grows up, naturally or with food, it can be bred right away. Any leftover waiting time stored on the animal is discarded.

What stays vanilla:

- **Villagers.** Their breeding, their cooldown and everything else about them.
- **Growing up.** A baby still takes the vanilla time to grow up, and food speeds it up by the vanilla amount.
- **Love mode.** Each round still needs its breeding food, and the hearts last as long as in vanilla.
- **Breeding foods.** Every animal still wants the same food as in vanilla.
- **Eggs and young.** A turtle carrying an egg cannot breed until it has laid it, a pregnant frog still lays one frogspawn, and sniffers still drop one egg per breeding.
- **Rewards.** Experience orbs, statistics and advancements work as in vanilla, once per breeding.

## Requirements

| | Forge / NeoForge | Fabric |
|---|---|---|
| Minecraft | 1.20.1 | 1.20 or 1.20.1 |
| Loader | Forge 47.1.0 or newer, or NeoForge 1.20.1 (47.1.x) | Fabric Loader 0.14.21 or newer |
| Jar | `instantbreeding-forge-1.20.1-<version>.jar` | `instantbreeding-fabric-1.20-1.20.1-<version>.jar` |

On Minecraft 1.20.1, NeoForge still runs Forge mods, so the Forge jar is used for both.

The Fabric version does not need Fabric API.

### Client and server

Install the mod on the server only, on every loader. It adds no items, blocks, entities, sounds, network messages or registries, so the server has nothing a client needs to know about:

- **Forge and NeoForge:** vanilla clients and Forge or NeoForge clients without the mod can join. The mod is marked as server-only, so a client without it still shows the server as compatible in the server list.
- **Fabric:** vanilla clients and Fabric clients without the mod can join.

Players without the mod see the hearts, the babies and the experience orbs like everyone else. Installing it on a client as well does no harm.

In singleplayer, install it in your own game; the built-in server runs it.

## Removing the mod

The world opens normally. The mod saves nothing of its own. Animals keep their current age, and the next time they breed they get the vanilla cooldown again.

## Compatibility

- Animals added by other mods are covered when they breed through the vanilla breeding code. Animals with their own breeding code keep whatever cooldown that code gives them.
- Mods that cancel a breeding through the loader's baby spawn event (`BabyEntitySpawnEvent` on NeoForge and Forge) keep the vanilla cooldown for that cancelled breeding.
- Automatic farms and feeders can breed animals much faster than in vanilla. The vanilla entity cramming limit still applies.
- Mods that show the breeding cooldown, such as BreedTimer, show it as 0 after breeding.

## Building from source

```
./gradlew build
```

The jars are written to `forge/build/libs/` and `fabric/build/libs/`.

## License

MIT.
