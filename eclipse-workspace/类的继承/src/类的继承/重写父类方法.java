package ��ļ̳�;
//����animal��
class Animal {
	//���嶯��Ľз�
	void shout() {
		System.out.println("���﷢������");
	}
}
//����Dog�ڵļ̳ж�����
class Dog extends Animal {
	//���幷�еķ���
	void shout() {
		System.out.println("������.....");
	}
}
//���������
public class ��д���෽�� {

	public static void main(String[] args) {
		Dog dog = new Dog();//����dog���ʵ������
		dog.shout();//����dog��д��shout()����
	}

}
