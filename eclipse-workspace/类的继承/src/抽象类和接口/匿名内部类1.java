package ������ͽӿ�;
//���嶯����ӿ�
interface Animal {	//���嶯����ӿ�
	void shout();	//���巽��shout()
}
public class �����ڲ���1 {

	public static void main(String[] args) {
		// ���������ڲ�����Ϊ�������ݸ�animalShout()����
		animalShout(new Animal(){
			//ʵ��shout()����
			public void shout() {
				System.out.println("������������");
			}
		});
	}
		//���徲̬����animalShout()
		public static void animalShout(Animal an) {
			an.shout(); //���ô������an��shout()����
			}
}
