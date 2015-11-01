package com.hhhhhskw.doubledispatch;

public class Scissors extends AbstractGameObject {

	@Override
	public String beats(IGameObject obj) {

		int result = obj.beatsScissors();
		// ���������ϊ�
		return convertResult(result);
	}

	@Override
	public int beatsScissors() {
		return 2;
	}

	@Override
	public int beatsPaper() {
		return 0;
	}

	@Override
	public int beatsStone() {
		return 1;
	}

	@Override
	public String toString() {
		return "�`���L";
	}

}
