package ������ͽӿ�;

public class usb�ӿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		//�����������ꡤ��˷硤�����豸
		c.add(new Mouse());
		c.add(new Mic());
		c.add(new KeyBoard());
		c.powerOn();//�رռ����
		System.out.println();
		c.powerOff();//�رռ����
	}

}
