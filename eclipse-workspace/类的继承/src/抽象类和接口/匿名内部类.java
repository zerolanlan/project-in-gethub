package ������ͽӿ�;
//����animal�ӿ�
interface Animal{
	void shout(); 	//������󷽷�shout()
}
//���������
public class �����ڲ��� {

	public static void main(String[] args) {
		// ����һ���ڲ���catʵ��Animal�ӿ�
	class Cat implements Animal {
		//ʵ��shout����
		public void shout() {
			System.out.println("����....");
		}
		
	}
		animalShout(new Cat());  //����animalShout()����������Cat����	
	}
	//���徲̬����animalShout����
	public static void animalShout(Animal an) {
		an.shout();//���ô������an��shout()����
	}

}
