package ���췽��;
class Outer{
	private static int num=4;//�����Ա����
	//����Ĵ��붨����һ����Ա�����������а����ڲ���
	public void test() {
		Inner inner = new Inner();
		Inner.show();
	}
	//����Ĵ��붨����һ����Ա�ڲ���
	static class Inner{
		static void show() {
			//�ڳ�Ա�ڲ��ķ����ַ����ⲿ��ĳ�Ա����
			System.out.println("num =" + num);
		}
	}
}
public class ��Ա�ڲ��� {

	public static void main(String[] args) {
		Outer outer = new Outer();//�����ⲿ�����
		outer.test();//����test()����
	}

}
