package ��ļ̳�;

class Animal {
	String name;//����name����
	//���嶯��еķ���
	void shout() {
		System.out.println("���﷢��������");
	}
}
//����Dog��̳�Animal��
class Dog extends Animal {
	//����һ����ӡname�ķ���
	public void printName() {
		System.out.println("name=" + name);
	}
}
//���������
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();//����һ��Dog���ʵ������
		dog.name = "ɳƤ��";//ΪDog�ڵ�name���Ը�ֵ
		dog.printName();//����dog���getInfo()����
		dog.shout();//����dog��ļ̳�����shout()����
	}

}
