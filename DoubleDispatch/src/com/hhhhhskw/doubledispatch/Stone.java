package com.hhhhhskw.doubledispatch;

public class Stone extends AbstractGameObject {

	@Override
	public String beats(IGameObject obj) {

		int result = obj.beatsStone();
		// 勝ち負け変換
		return convertResult(result);
	}

	@Override
	public int beatsScissors() {
		return 0;
	}

	@Override
	public int beatsPaper() {
		return 1;
	}

	@Override
	public int beatsStone() {
		return 2;
	}

	@Override
	public String toString() {
		return "グー";
	}
}
