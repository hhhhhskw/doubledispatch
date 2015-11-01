package com.hhhhhskw.doubledispatch;

import java.util.Random;

public class GameCoordinator {

	public void start(){
        Random r1 = new Random();
        Random r2 = new Random();
        int my = r1.nextInt(2);
        int opp = r2.nextInt(2);

        // �����̎�
        IGameObject myObj = GameObjectFactory.getInstance(my);
        System.out.println("�����̎� : " + myObj.toString());
        // ����̎�
        IGameObject oppObj = GameObjectFactory.getInstance(opp);
        System.out.println("����̎� : " + oppObj.toString());

        // ����񂯂�
        String result = myObj.beats(oppObj);
        System.out.println("���s �F " + result);


	}

}
