package com.hhhhhskw.doubledispatch;

public class GameObjectFactory {

	public static IGameObject getInstance(int i) {

		IGameObject obj = null;
		// ‚±‚±‚ÍğŒ•ªŠò‚·‚é
		switch(i){
			case 0:
				obj = new Scissors();
				break;
			case 1:
				obj = new Paper();
				break;
			case 2:
				obj = new Stone();
				break;
		}
		return obj;
	}

}
