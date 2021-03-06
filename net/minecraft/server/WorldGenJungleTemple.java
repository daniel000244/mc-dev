package net.minecraft.server;

import java.util.Random;

public class WorldGenJungleTemple extends WorldGenScatteredPiece {

    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private static final StructurePieceTreasure[] l = new StructurePieceTreasure[] { new StructurePieceTreasure(Item.DIAMOND.id, 0, 1, 3, 3), new StructurePieceTreasure(Item.IRON_INGOT.id, 0, 1, 5, 10), new StructurePieceTreasure(Item.GOLD_INGOT.id, 0, 2, 7, 15), new StructurePieceTreasure(Item.EMERALD.id, 0, 1, 3, 2), new StructurePieceTreasure(Item.BONE.id, 0, 4, 6, 20), new StructurePieceTreasure(Item.ROTTEN_FLESH.id, 0, 3, 7, 16)};
    private static final StructurePieceTreasure[] m = new StructurePieceTreasure[] { new StructurePieceTreasure(Item.ARROW.id, 0, 2, 7, 30)};
    private static WorldGenJungleTemplePiece n = new WorldGenJungleTemplePiece((WorldGenJungleTempleUnknown) null);

    public WorldGenJungleTemple(Random random, int i, int j) {
        super(random, i, 64, j, 12, 10, 15);
    }

    public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
        if (!this.a(world, structureboundingbox, 0)) {
            return false;
        } else {
            int i = this.c(Block.COBBLESTONE_STAIRS.id, 3);
            int j = this.c(Block.COBBLESTONE_STAIRS.id, 2);
            int k = this.c(Block.COBBLESTONE_STAIRS.id, 0);
            int l = this.c(Block.COBBLESTONE_STAIRS.id, 1);

            this.a(world, structureboundingbox, 0, -4, 0, this.a - 1, 0, this.c - 1, false, random, n);
            this.a(world, structureboundingbox, 2, 1, 2, 9, 2, 2, false, random, n);
            this.a(world, structureboundingbox, 2, 1, 12, 9, 2, 12, false, random, n);
            this.a(world, structureboundingbox, 2, 1, 3, 2, 2, 11, false, random, n);
            this.a(world, structureboundingbox, 9, 1, 3, 9, 2, 11, false, random, n);
            this.a(world, structureboundingbox, 1, 3, 1, 10, 6, 1, false, random, n);
            this.a(world, structureboundingbox, 1, 3, 13, 10, 6, 13, false, random, n);
            this.a(world, structureboundingbox, 1, 3, 2, 1, 6, 12, false, random, n);
            this.a(world, structureboundingbox, 10, 3, 2, 10, 6, 12, false, random, n);
            this.a(world, structureboundingbox, 2, 3, 2, 9, 3, 12, false, random, n);
            this.a(world, structureboundingbox, 2, 6, 2, 9, 6, 12, false, random, n);
            this.a(world, structureboundingbox, 3, 7, 3, 8, 7, 11, false, random, n);
            this.a(world, structureboundingbox, 4, 8, 4, 7, 8, 10, false, random, n);
            this.a(world, structureboundingbox, 3, 1, 3, 8, 2, 11);
            this.a(world, structureboundingbox, 4, 3, 6, 7, 3, 9);
            this.a(world, structureboundingbox, 2, 4, 2, 9, 5, 12);
            this.a(world, structureboundingbox, 4, 6, 5, 7, 6, 9);
            this.a(world, structureboundingbox, 5, 7, 6, 6, 7, 8);
            this.a(world, structureboundingbox, 5, 1, 2, 6, 2, 2);
            this.a(world, structureboundingbox, 5, 2, 12, 6, 2, 12);
            this.a(world, structureboundingbox, 5, 5, 1, 6, 5, 1);
            this.a(world, structureboundingbox, 5, 5, 13, 6, 5, 13);
            this.a(world, 0, 0, 1, 5, 5, structureboundingbox);
            this.a(world, 0, 0, 10, 5, 5, structureboundingbox);
            this.a(world, 0, 0, 1, 5, 9, structureboundingbox);
            this.a(world, 0, 0, 10, 5, 9, structureboundingbox);

            int i1;

            for (i1 = 0; i1 <= 14; i1 += 14) {
                this.a(world, structureboundingbox, 2, 4, i1, 2, 5, i1, false, random, n);
                this.a(world, structureboundingbox, 4, 4, i1, 4, 5, i1, false, random, n);
                this.a(world, structureboundingbox, 7, 4, i1, 7, 5, i1, false, random, n);
                this.a(world, structureboundingbox, 9, 4, i1, 9, 5, i1, false, random, n);
            }

            this.a(world, structureboundingbox, 5, 6, 0, 6, 6, 0, false, random, n);

            for (i1 = 0; i1 <= 11; i1 += 11) {
                for (int j1 = 2; j1 <= 12; j1 += 2) {
                    this.a(world, structureboundingbox, i1, 4, j1, i1, 5, j1, false, random, n);
                }

                this.a(world, structureboundingbox, i1, 6, 5, i1, 6, 5, false, random, n);
                this.a(world, structureboundingbox, i1, 6, 9, i1, 6, 9, false, random, n);
            }

            this.a(world, structureboundingbox, 2, 7, 2, 2, 9, 2, false, random, n);
            this.a(world, structureboundingbox, 9, 7, 2, 9, 9, 2, false, random, n);
            this.a(world, structureboundingbox, 2, 7, 12, 2, 9, 12, false, random, n);
            this.a(world, structureboundingbox, 9, 7, 12, 9, 9, 12, false, random, n);
            this.a(world, structureboundingbox, 4, 9, 4, 4, 9, 4, false, random, n);
            this.a(world, structureboundingbox, 7, 9, 4, 7, 9, 4, false, random, n);
            this.a(world, structureboundingbox, 4, 9, 10, 4, 9, 10, false, random, n);
            this.a(world, structureboundingbox, 7, 9, 10, 7, 9, 10, false, random, n);
            this.a(world, structureboundingbox, 5, 9, 7, 6, 9, 7, false, random, n);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 5, 9, 6, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 6, 9, 6, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, j, 5, 9, 8, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, j, 6, 9, 8, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 4, 0, 0, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 5, 0, 0, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 6, 0, 0, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 7, 0, 0, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 4, 1, 8, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 4, 2, 9, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 4, 3, 10, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 7, 1, 8, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 7, 2, 9, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, i, 7, 3, 10, structureboundingbox);
            this.a(world, structureboundingbox, 4, 1, 9, 4, 1, 9, false, random, n);
            this.a(world, structureboundingbox, 7, 1, 9, 7, 1, 9, false, random, n);
            this.a(world, structureboundingbox, 4, 1, 10, 7, 2, 10, false, random, n);
            this.a(world, structureboundingbox, 5, 4, 5, 6, 4, 5, false, random, n);
            this.a(world, Block.COBBLESTONE_STAIRS.id, k, 4, 4, 5, structureboundingbox);
            this.a(world, Block.COBBLESTONE_STAIRS.id, l, 7, 4, 5, structureboundingbox);

            for (i1 = 0; i1 < 4; ++i1) {
                this.a(world, Block.COBBLESTONE_STAIRS.id, j, 5, 0 - i1, 6 + i1, structureboundingbox);
                this.a(world, Block.COBBLESTONE_STAIRS.id, j, 6, 0 - i1, 6 + i1, structureboundingbox);
                this.a(world, structureboundingbox, 5, 0 - i1, 7 + i1, 6, 0 - i1, 9 + i1);
            }

            this.a(world, structureboundingbox, 1, -3, 12, 10, -1, 13);
            this.a(world, structureboundingbox, 1, -3, 1, 3, -1, 13);
            this.a(world, structureboundingbox, 1, -3, 1, 9, -1, 5);

            for (i1 = 1; i1 <= 13; i1 += 2) {
                this.a(world, structureboundingbox, 1, -3, i1, 1, -2, i1, false, random, n);
            }

            for (i1 = 2; i1 <= 12; i1 += 2) {
                this.a(world, structureboundingbox, 1, -1, i1, 3, -1, i1, false, random, n);
            }

            this.a(world, structureboundingbox, 2, -2, 1, 5, -2, 1, false, random, n);
            this.a(world, structureboundingbox, 7, -2, 1, 9, -2, 1, false, random, n);
            this.a(world, structureboundingbox, 6, -3, 1, 6, -3, 1, false, random, n);
            this.a(world, structureboundingbox, 6, -1, 1, 6, -1, 1, false, random, n);
            this.a(world, Block.TRIPWIRE_SOURCE.id, this.c(Block.TRIPWIRE_SOURCE.id, 3) | 4, 1, -3, 8, structureboundingbox);
            this.a(world, Block.TRIPWIRE_SOURCE.id, this.c(Block.TRIPWIRE_SOURCE.id, 1) | 4, 4, -3, 8, structureboundingbox);
            this.a(world, Block.TRIPWIRE.id, 4, 2, -3, 8, structureboundingbox);
            this.a(world, Block.TRIPWIRE.id, 4, 3, -3, 8, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 5, -3, 7, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 5, -3, 6, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 5, -3, 5, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 5, -3, 4, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 5, -3, 3, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 5, -3, 2, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 5, -3, 1, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 4, -3, 1, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 3, -3, 1, structureboundingbox);
            if (!this.j) {
                this.j = this.a(world, structureboundingbox, random, 3, -2, 1, 2, m, 2);
            }

            this.a(world, Block.VINE.id, 15, 3, -2, 2, structureboundingbox);
            this.a(world, Block.TRIPWIRE_SOURCE.id, this.c(Block.TRIPWIRE_SOURCE.id, 2) | 4, 7, -3, 1, structureboundingbox);
            this.a(world, Block.TRIPWIRE_SOURCE.id, this.c(Block.TRIPWIRE_SOURCE.id, 0) | 4, 7, -3, 5, structureboundingbox);
            this.a(world, Block.TRIPWIRE.id, 4, 7, -3, 2, structureboundingbox);
            this.a(world, Block.TRIPWIRE.id, 4, 7, -3, 3, structureboundingbox);
            this.a(world, Block.TRIPWIRE.id, 4, 7, -3, 4, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 8, -3, 6, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 9, -3, 6, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 9, -3, 5, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 9, -3, 4, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 9, -2, 4, structureboundingbox);
            if (!this.k) {
                this.k = this.a(world, structureboundingbox, random, 9, -2, 3, 4, m, 2);
            }

            this.a(world, Block.VINE.id, 15, 8, -1, 3, structureboundingbox);
            this.a(world, Block.VINE.id, 15, 8, -2, 3, structureboundingbox);
            if (!this.h) {
                this.h = this.a(world, structureboundingbox, random, 8, -3, 3, StructurePieceTreasure.a(l, new StructurePieceTreasure[] { Item.ENCHANTED_BOOK.b(random)}), 2 + random.nextInt(5));
            }

            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 9, -3, 2, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 8, -3, 1, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 4, -3, 5, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 5, -2, 5, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 5, -1, 5, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 6, -3, 5, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 7, -2, 5, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 7, -1, 5, structureboundingbox);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 8, -3, 5, structureboundingbox);
            this.a(world, structureboundingbox, 9, -1, 1, 9, -1, 5, false, random, n);
            this.a(world, structureboundingbox, 8, -3, 8, 10, -1, 10);
            this.a(world, Block.SMOOTH_BRICK.id, 3, 8, -2, 11, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 3, 9, -2, 11, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 3, 10, -2, 11, structureboundingbox);
            this.a(world, Block.LEVER.id, BlockLever.e(this.c(Block.LEVER.id, 2)), 8, -2, 12, structureboundingbox);
            this.a(world, Block.LEVER.id, BlockLever.e(this.c(Block.LEVER.id, 2)), 9, -2, 12, structureboundingbox);
            this.a(world, Block.LEVER.id, BlockLever.e(this.c(Block.LEVER.id, 2)), 10, -2, 12, structureboundingbox);
            this.a(world, structureboundingbox, 8, -3, 8, 8, -3, 10, false, random, n);
            this.a(world, structureboundingbox, 10, -3, 8, 10, -3, 10, false, random, n);
            this.a(world, Block.MOSSY_COBBLESTONE.id, 0, 10, -2, 9, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 8, -2, 9, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 8, -2, 10, structureboundingbox);
            this.a(world, Block.REDSTONE_WIRE.id, 0, 10, -1, 9, structureboundingbox);
            this.a(world, Block.PISTON_STICKY.id, 1, 9, -2, 8, structureboundingbox);
            this.a(world, Block.PISTON_STICKY.id, this.c(Block.PISTON_STICKY.id, 4), 10, -2, 8, structureboundingbox);
            this.a(world, Block.PISTON_STICKY.id, this.c(Block.PISTON_STICKY.id, 4), 10, -1, 8, structureboundingbox);
            this.a(world, Block.DIODE_OFF.id, this.c(Block.DIODE_OFF.id, 2), 10, -2, 10, structureboundingbox);
            if (!this.i) {
                this.i = this.a(world, structureboundingbox, random, 9, -3, 10, StructurePieceTreasure.a(l, new StructurePieceTreasure[] { Item.ENCHANTED_BOOK.b(random)}), 2 + random.nextInt(5));
            }

            return true;
        }
    }
}
