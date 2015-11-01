package com.hhhhhskw.doubledispatch;

public abstract class AbstractGameObject implements IGameObject{

	public String convertResult(int result) {

		String strResult = "";
		// 勝ち負け変換ロジック
		switch(result){
		case 0:
			strResult = "負け";
			break;
		case 1:
			strResult = "勝ち";
			break;
		case 2:
			strResult = "あいこ";
	}
	return strResult;
	}
}
