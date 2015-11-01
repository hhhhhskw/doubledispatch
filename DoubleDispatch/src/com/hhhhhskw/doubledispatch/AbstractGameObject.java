package com.hhhhhskw.doubledispatch;

public abstract class AbstractGameObject implements IGameObject{

	public String convertResult(int result) {

		String strResult = "";
		// Ÿ‚¿•‰‚¯•ÏŠ·ƒƒWƒbƒN
		switch(result){
		case 0:
			strResult = "•‰‚¯";
			break;
		case 1:
			strResult = "Ÿ‚¿";
			break;
		case 2:
			strResult = "‚ ‚¢‚±";
	}
	return strResult;
	}
}
