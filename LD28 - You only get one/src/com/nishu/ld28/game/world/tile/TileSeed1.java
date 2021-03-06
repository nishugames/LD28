package com.nishu.ld28.game.world.tile;

import com.nishu.ld28.utilities.Spritesheet;

public class TileSeed1 extends Tile{

	@Override
	public float[] getTexCoords() {
		return new float[]{0 + (3 * Spritesheet.tiles.uniformSize()), 0};
	}

	@Override
	public boolean canWalk() {
		return true;
	}

	@Override
	public byte getID() {
		return 3;
	}
}
