package ��ļ̳�;

class Animal {
	String name = "����";
	//���嶯��еķ���
	void shout() {
		System.out.println("���﷢��������");
	}
}
//����Dog��̳�Animal��
class Dog extends Animal {
	String name = "Ȯ��";
	//��д����shout()�ķ���
	void shout() {
		super.shout();  //���ø���ĳ�Ա����
	}
	void printName() {
		System.out.println("name=" + super.name);
	}
}
//���������
public class super�ؼ���  {

	public static void main(String[] args) {
		Dog dog = new Dog();//����һ��Dog���ʵ������
		dog.printName();//����dog���getInfo()����
		dog.shout();//����dog��ļ̳�����shout()����
	}

}