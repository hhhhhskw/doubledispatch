package com.hhhhhskw.doubledispatch;

import java.util.Random;

public class GameCoordinator {

	public void start(){
        Random r1 = new Random();
        Random r2 = new Random();
        int my = r1.nextInt(2);
        int opp = r2.nextInt(2);

        // 自分の手
        IGameObject myObj = GameObjectFactory.getInstance(my);
        System.out.println("自分の手 : " + myObj.toString());
        // 相手の手
        IGameObject oppObj = GameObjectFactory.getInstance(opp);
        System.out.println("相手の手 : " + oppObj.toString());

        // じゃんけん
        String result = myObj.beats(oppObj);
        System.out.println("勝敗 ： " + result);


	}

}
