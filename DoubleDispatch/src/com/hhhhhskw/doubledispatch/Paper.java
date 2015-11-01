package com.hhhhhskw.doubledispatch;

public class Paper extends AbstractGameObject {

	@Override
	public String beats(IGameObject obj) {

		int result = obj.beatsPaper();
		// Ÿ‚¿•‰‚¯•ÏŠ·
		return convertResult(result);
	}
	@Override
	public int beatsScissors() {
		return 1;
	}

	@Override
	public int beatsPaper() {
		return 2;
	}

	@Override
	public int beatsStone() {
		return 0;
	}

	@Override
	public String toString() {
		return "ƒp[";
	}

}
