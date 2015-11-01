package com.hhhhhskw.doubledispatch;

public class Stone extends AbstractGameObject {

	@Override
	public String beats(IGameObject obj) {

		int result = obj.beatsStone();
		// ���������ϊ�
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
		return "�O�[";
	}
}
