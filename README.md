# Instant Breeding

Breed your animals again right away, without waiting five minutes between rounds.

Instant Breeding removes the breeding cooldown of animals. As soon as two animals have bred, both parents can be fed again and bred once more. A baby that you grow up with food can be bred the moment it becomes an adult.

The mod runs on the server only. Players join with a plain vanilla client and still see everything.

Available for NeoForge, Forge and Fabric.

## Features

- **No cooldown for parents.** After breeding, both parents can be fed their breeding food again straight away instead of waiting five minutes.
- **Grown-up babies breed at once.** A baby animal that you fed to speed up its growth can be bred as soon as it is an adult, without the extra wait vanilla can add for babies grown up with food.
- **Every animal.** Works for all animals that breed the vanilla way, including foxes, turtles, frogs, sniffers, armadillos, horses, llamas, camels and bees.
- **Villagers stay vanilla.** Villager breeding and its cooldown are not touched.

There is no config file.

## How it works

What changes:

- When two animals breed, vanilla gives both parents a five-minute cooldown before they can fall in love again. With the mod, they can be fed again right after breeding.
- When you feed a baby animal to speed up its growth, vanilla can make the new adult wait as long as the growing time the food skipped before it can breed, for example a lamb fed wheat that finishes growing by eating grass. With the mod, it can be bred right away. A baby that grows up naturally can be bred right away, as in vanilla.

What stays vanilla:

- **Villagers.** Their breeding, their cooldown and everything else about them.
- **Growing up.** A baby still takes the vanilla time to grow up, and food speeds it up by the vanilla amount.
- **Love mode.** Each round still needs its breeding food, and the hearts last as long as in vanilla.
- **Breeding foods.** Every animal still wants the same food as in vanilla.
- **Eggs and young.** A turtle carrying an egg cannot breed until it has laid it, a pregnant frog still lays one frogspawn, and sniffers still drop one egg per breeding.
- **Rewards.** Experience orbs, statistics and advancements work as in vanilla, once per breeding.

## Requirements

| | NeoForge | Forge | Fabric |
|---|---|---|---|
| Minecraft | 26.3 | 26.3 | 26.3 |
| Loader | NeoForge 26.3.0.0-beta or newer | Forge 66.0.0 or newer | Fabric Loader 0.18.2 or newer |
| Jar | `instantbreeding-neoforge-26.3-<version>.jar` | `instantbreeding-forge-26.3-<version>.jar` | `instantbreeding-fabric-26.3-<version>.jar` |

On Minecraft 26.3, NeoForge and Forge are separate loaders that do not run each other's mods, so each has its own jar. Pick the jar that matches your server's loader.

The Fabric version does not need Fabric API.

### Client and server

Install the mod on the server only, on every loader. It adds no items, blocks, entities, sounds, network messages or registries, so the server has nothing a client needs to know about:

- **NeoForge:** vanilla clients and NeoForge clients without the mod can join.
- **Forge:** vanilla clients and Forge clients without the mod can join. The mod is marked as server-only, so a Forge client without it still shows the server as compatible in the server list.
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

The jars are written to `neoforge/build/libs/`, `forge/build/libs/` and `fabric/build/libs/`.

## License

MIT.
