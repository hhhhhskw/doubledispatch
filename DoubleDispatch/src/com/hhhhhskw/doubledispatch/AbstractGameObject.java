package com.hhhhhskw.doubledispatch;

public abstract class AbstractGameObject implements IGameObject{

	public String convertResult(int result) {

		String strResult = "";
		// ���������ϊ����W�b�N
		switch(result){
		case 0:
			strResult = "����";
			break;
		case 1:
			strResult = "����";
			break;
		case 2:
			strResult = "������";
	}
	return strResult;
	}
}
