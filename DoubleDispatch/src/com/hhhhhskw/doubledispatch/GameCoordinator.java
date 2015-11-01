package com.hhhhhskw.doubledispatch;

import java.util.Random;

public class GameCoordinator {

	public void start(){
        Random r1 = new Random();
        Random r2 = new Random();
        int my = r1.nextInt(2);
        int opp = r2.nextInt(2);

        // ©•ª‚Ìè
        IGameObject myObj = GameObjectFactory.getInstance(my);
        System.out.println("©•ª‚Ìè : " + myObj.toString());
        // ‘Šè‚Ìè
        IGameObject oppObj = GameObjectFactory.getInstance(opp);
        System.out.println("‘Šè‚Ìè : " + oppObj.toString());

        // ‚¶‚á‚ñ‚¯‚ñ
        String result = myObj.beats(oppObj);
        System.out.println("Ÿ”s F " + result);


	}

}
